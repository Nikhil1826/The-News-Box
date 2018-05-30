package com.fasttech.thenewsbox;

/**
 * Created by dell on 7/11/2017.
 */

class Country {
    int icon;
    String name;

    public Country(){

    }

    public Country(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
