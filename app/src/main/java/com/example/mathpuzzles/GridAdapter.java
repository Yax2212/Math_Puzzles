package com.example.mathpuzzles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {
    Puzzles_Activity puzzlesActivity;
    public GridAdapter(Puzzles_Activity puzzlesActivity) {
        this.puzzlesActivity=puzzlesActivity;
    }

    @Override
    public int getCount() {
        return 24;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view1= LayoutInflater.from(puzzlesActivity).inflate(R.layout.grid_level,parent,false);
        return view1;
    }
}
