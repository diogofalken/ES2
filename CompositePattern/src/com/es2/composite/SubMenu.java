package com.es2.composite;


import java.util.ArrayList;

public class SubMenu extends Menu {
    private ArrayList<Menu> menu = new ArrayList<>();

    public void addChild(Menu child) {
        if(!this.menu.contains(child)) {
            this.menu.add(child);
        }
    }

    public void removeChild(Menu child) {
        if(this.menu.contains(child)) {
            this.menu.remove(child);
        }
    }

    @Override
    public void showOptions() {
        System.out.println(this.label);
        for(Menu cur : this.menu) {
            cur.showOptions();
        }
    }
}
