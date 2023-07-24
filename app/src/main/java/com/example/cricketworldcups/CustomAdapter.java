package com.example.cricketworldcups;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Country> {
    private ArrayList<Country>arrayList;

    Context context;
    public CustomAdapter(ArrayList<Country>arrayList,Context context){
        super(context,R.layout.listviewview,arrayList);
        this.context=context;
        this.arrayList=arrayList;
    }
    private static class ViewHolder{
        private TextView name;
        private TextView win;
        private ImageView flag;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Country country=getItem(position);
        ViewHolder viewHolder;
        View viewGenerated;
        if(convertView==null){
            viewHolder=new ViewHolder();
            LayoutInflater layoutInflater=LayoutInflater.from(getContext());
            convertView=layoutInflater.inflate(R.layout.listviewview,parent,false);

            viewHolder.name=(TextView) convertView.findViewById(R.id.nameTextView);
            viewHolder.win=(TextView) convertView.findViewById(R.id.winTextView);
            viewHolder.flag=(ImageView) convertView.findViewById(R.id.flagImageView);

            viewGenerated=convertView;
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(country.getCountryName());
        viewHolder.win.setText(String.valueOf(country.getNumberOfWorldCups()));
        viewHolder.flag.setImageResource(country.getImgAddress());
        return convertView;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
