package com.geektech.homework36;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.geektech.homework36.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements ClickListener{

    private FragmentSecondBinding binding;
    private ArrayList<PlayList> list1;
    public static final String BUNDLE_KEY = "bundle.key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        loadData();
        MusicAdapter adapter = new MusicAdapter(list1,this::onClick);
        binding.recycler.setAdapter(adapter);
    }

    private void loadData() {
        list1 = new ArrayList<>();
        list1.add(new PlayList("Blank Space","Taylor Swift",1,"3:22"));
        list1.add(new PlayList("Watch Me","Silento",2,"5:36"));
        list1.add(new PlayList("Earned Id","The Weekend",3,"4:51"));
        list1.add(new PlayList("The Hills","The Weekend",4,"3:41"));
        list1.add(new PlayList("Сурдотпочу","Мирбек Атабеков",5,"3:10"));
        list1.add(new PlayList("911","Jah Khalib",6,"3:17"));
        list1.add(new PlayList("Азиатская эстетика","Ulukmanapo",7,"3:05"));
        list1.add(new PlayList("Cheap Thrills","Sia",8,"3:33"));
        list1.add(new PlayList("Let Her Go","Passenger",9,"4:12"));
        list1.add(new PlayList("The Monster","Eminem, Rihanna",10,"4:10"));
    }

    @Override
    public void onClick(PlayList playList) {

        Intent intent = new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra(BUNDLE_KEY,playList.getMusicName());
        startActivity(intent);
    }
}