package com.example.arz;

import android.media.Image;

public class RecyclerItem {

    private int image;
    private String title;
    private String status;
    private int price;

    public RecyclerItem(int image, String title, String status, int price) {
        this.image = image;
        this.title = title;
        this.status = status;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
