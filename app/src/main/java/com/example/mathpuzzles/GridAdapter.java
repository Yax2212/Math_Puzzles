package com.example.mathpuzzles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
public class GridAdapter extends BaseAdapter {
    Puzzles_Activity puzzlesActivity;
    int pos;
    int tick;
    int border;
    int nnn;
    int[] level;

    public GridAdapter(Puzzles_Activity puzzlesActivity, int pos, int tick, int border, int[] level, int nnn) {
        this.puzzlesActivity=puzzlesActivity;
        this.pos=pos;
        this.tick=tick;
        this.border=border;
        this.level=level;
        this.nnn=nnn;
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
        LinearLayout ll=view1.findViewById(R.id.llitemgridborder);
        TextView tt=view1.findViewById(R.id.lock);

        int index=nnn+position+1;

                tt.setText(""+index);
                int Nullable = 0;
                tt.setBackgroundResource(Nullable);
                tt.setBackgroundResource(tick);
                ll.setBackgroundResource(border);



        return view1;
    }
}
