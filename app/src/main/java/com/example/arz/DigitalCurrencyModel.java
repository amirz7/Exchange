package com.example.arz;

public class DigitalCurrencyModel {

    private int image;
    private String title;
    private String price;
    private String difference;

    public DigitalCurrencyModel(int image, String title, String price, String difference) {
        this.image = image;
        this.title = title;
        this.price = price;
        this.difference = difference;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }
}
