package com.fasttech.thenewsbox;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 7/11/2017.
 */

public class CountryAdapter extends ArrayAdapter<Country> {
    Context context;
    int resource;
    ArrayList<Country> objects;

    public CountryAdapter( Context context,  int resource,  ArrayList<Country> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        view = LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView imageView = view.findViewById(R.id.countryimageview);
        TextView textView = view.findViewById(R.id.countrytextName);

        Country country = objects.get(position);
        imageView.setBackgroundResource(country.getIcon());
        textView.setText(country.getName());

        return view;
    }
}
