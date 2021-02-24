package com.example.arz;

public class GridItem {

    private String itemTitle;
    private int itemImage;


    public GridItem(String itemTitle, int itemImage) {
        this.itemTitle = itemTitle;
        this.itemImage = itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }


}
