package com.example.nhdangdh.callbackpractice;

/**
 * Created by nhdangdh on 7/6/2017.
 */

public class Items {

    private int image;
    private String name;
    private String info;

    public Items(int image, String name, String info) {
        this.image = image;
        this.name = name;
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
