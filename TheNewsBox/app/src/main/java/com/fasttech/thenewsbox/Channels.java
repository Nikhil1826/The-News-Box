package com.fasttech.thenewsbox;

/**
 * Created by dell on 7/12/2017.
 */

public class Channels {
    int icon;
    String name;
    String url;

    public Channels(){

    }

    public Channels(int icon, String name, String url) {
        this.icon = icon;
        this.name = name;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
