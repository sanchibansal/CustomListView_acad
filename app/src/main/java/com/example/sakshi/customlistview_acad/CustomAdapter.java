package com.example.sakshi.customlistview_acad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sakshi on 25-06-2017.
 */

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Data> mArrayList;
    LayoutInflater mInflator;
    //parameterized constructor
    public CustomAdapter (Context context, ArrayList<Data> list){
        mContext = context;
        mArrayList = list;
        mInflator = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //getting custom layout from row XML file
        convertView = mInflator.inflate(R.layout.row,parent,false);
        TextView name = (TextView)convertView.findViewById(R.id.name);
        TextView numbers = (TextView)convertView.findViewById(R.id.phonenumber);
       // setting the name and number textView as initialized in mainActivity
        name.setText(mArrayList.get(position).getName());
        numbers.setText(mArrayList.get(position).getNumber());
        //returning view
        return convertView;
    }
}
