package com.geektech.homework36;

public class PlayList {

    private String musicName;
    private String singerName;
    private Integer count;
    private String lasting;

    public PlayList(String musicName, String singerName, Integer count, String lasting) {
        this.musicName = musicName;
        this.singerName = singerName;
        this.count = count;
        this.lasting = lasting;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLasting() {
        return lasting;
    }

    public void setLasting(String lasting) {
        this.lasting = lasting;
    }
}
