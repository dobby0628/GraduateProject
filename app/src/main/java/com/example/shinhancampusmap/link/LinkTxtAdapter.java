package com.example.shinhancampusmap.link;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.shinhancampusmap.R;

class MyAdapter extends ArrayAdapter<String> {

    Context context;
    String rTitle[];
    int rImgs[];

    MyAdapter(Context c, String title[]) {
        super(c, R.layout.customlist_link, R.id.link_custom_linkName, title);
        this.context = c;
        this.rTitle = title;

    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.customlist_link, parent, false);
        TextView myTitle = row.findViewById(R.id.link_custom_linkName);

        // now set our resources on views
        myTitle.setText(rTitle[position]);

        return row;
    }
}
