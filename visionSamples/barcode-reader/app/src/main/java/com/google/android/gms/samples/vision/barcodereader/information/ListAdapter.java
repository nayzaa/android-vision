package com.google.android.gms.samples.vision.barcodereader.information;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.samples.vision.barcodereader.R;

import java.util.ArrayList;
import java.util.List;



public class ListAdapter extends BaseAdapter {
    Context context;

    Information information;
    ListAdapter(Context context, Information information) {
        this.context = context;
        this.information = information;
    }

    @Override
    public int getCount() {
        if (information == null)
            return 0;
        if (information.getInformation() == null)
            return 0;

        return information.getInformation().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        LayoutInflater mInflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = mInflater.inflate(R.layout.list_item, parent, false);


        TextView textView = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textDesc = (TextView) view.findViewById(R.id.desc);


        if (information != null && information.getInformation() != null){
            textView.setText(information.getInformation().get(position).getTopic());
            imageView.setImageResource(information.getInformation().get(position).getResId());
            textDesc.setText(information.getInformation().get(position).getDescription());
        }

        return view;


    }
}
