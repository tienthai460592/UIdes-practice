package com.example.uides;

import java.util.ArrayList;

public class DataProvider {

    public static ArrayList<Item> items;

    public DataProvider(){
        this.items= new ArrayList<Item>();

    }
    static {
        items = new ArrayList<>();

        items.add(new Item("ww","sss","ss"));
        items.add(new Item("ww1","sss","ss"));
        items.add(new Item("ww","sss","ss"));
        items.add(new Item("ww2","sss","ss"));
        items.add(new Item("ww3","sss","ss"));
    }

}
