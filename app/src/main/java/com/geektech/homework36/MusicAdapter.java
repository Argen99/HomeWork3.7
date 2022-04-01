package com.geektech.homework36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.homework36.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private ArrayList<PlayList> data;
    private ClickListener listener;

    public MusicAdapter(ArrayList<PlayList> data, ClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
         holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MusicViewHolder extends RecyclerView.ViewHolder {

        private ItemMusicBinding viewBinding;

        public MusicViewHolder(ItemMusicBinding binding) {
            super(binding.getRoot());
            viewBinding = binding;
        }

        public void bind(PlayList playList) {
            viewBinding.singerName.setText(playList.getSingerName());
            viewBinding.musicName.setText(playList.getMusicName());
            viewBinding.number.setText(String.valueOf(playList.getCount()));
            viewBinding.lasting.setText(playList.getLasting());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(data.get(getLayoutPosition()));
                }
            });

        }
    }
}
