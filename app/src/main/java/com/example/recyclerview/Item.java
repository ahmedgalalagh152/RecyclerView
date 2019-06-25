package com.example.recyclerview;

public class Item {
    private String title;
    private  String desc;

    public Item(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getTitle() {
        return title;
    }
}
