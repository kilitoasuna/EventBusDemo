package com.example.songxh.bean;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String str;
    private List<Item> list;
    private List<String> content = new ArrayList<String>();

    /**
     * 初始化数据
     * @param list
     */
    public Event(List<Item> list) {
        this.list = list;
    }

    /**
     *
     * @return
     */
    public Event(String str){
        this.str = str;
    }


    public List<String> getItems(){
        for(Item a : list){
           content.add(a.getStr());
        }
        return content;
    }

    public String getStr() {
        return str;
    }
}
