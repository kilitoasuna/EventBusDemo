package com.example.songxh.bean;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int id;
    private String str;

    public String getStr() {
        return str;
    }

    public Item(int id, String str) {
        this.id = id;
        this.str = str;
    }

    public static List<Item> list = new ArrayList<Item>();
    static {
        list.add(new Item(1,"Item 1"));
        list.add(new Item(2,"Item 2"));
        list.add(new Item(3,"Item 3"));
        list.add(new Item(4,"Item 4"));
        list.add(new Item(5,"Item 5"));
    }
}
