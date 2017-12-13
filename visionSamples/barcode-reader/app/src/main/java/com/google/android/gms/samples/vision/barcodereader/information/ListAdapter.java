package com.google.android.gms.samples.vision.barcodereader.information;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.samples.vision.barcodereader.R;


public class ListAdapter extends BaseAdapter {
    Context context;

    InformationImpl informationImpl;
    ListAdapter(Context context, InformationImpl informationImpl) {
        this.context = context;
        this.informationImpl = informationImpl;
    }

    @Override
    public int getCount() {
        if (informationImpl == null)
            return 0;
        if (informationImpl.getInformation() == null)
            return 0;

        return informationImpl.getInformation().size();
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


        if (informationImpl != null && informationImpl.getInformation() != null){
            textView.setText(informationImpl.getInformation().get(position).getTopic());
            imageView.setImageResource(informationImpl.getInformation().get(position).getResId());
            textDesc.setText(informationImpl.getInformation().get(position).getDescription());
        }

        return view;


    }
}
