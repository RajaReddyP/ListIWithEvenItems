package com.polamr.listiwithevenitems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rajareddy on 16/12/15.
 */
public class MyAdapter extends ArrayAdapter<String> {

    private List<String> data;
    public MyAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        data=objects;
    }

    @Override
    public int getCount() {
        return data.size()/2 + data.size()%2;
    }

    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.row, parent, false);
        }

        TextView Tview = (TextView) view.findViewById(R.id.textView3);
        Tview.setText(getItem(position*2));

        return view;
    }
}
