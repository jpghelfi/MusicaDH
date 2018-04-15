package com.example.jp.musicadh;

public class MusicDTO {

    private String name;
    private String imageURL;

    public MusicDTO(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }
}
