package com.example.android.colors.android_custom_listview_with_image_and_text;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListRowAdapter extends BaseAdapter {

    String[] color_names;
    Integer[] image_id;
    Context context;


    private LayoutInflater layoutInflater;

    public ListRowAdapter(Activity context, Integer[] image_id, String[] text) {
        this.color_names = text;
        this.image_id = image_id;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return color_names.length;
    }

    @Override
    public String getItem(int position) {
        return color_names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_row, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews(position, (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(int position, ViewHolder holder) {

        holder.textView.setText(color_names[position]);
        holder.imageView.setImageResource(image_id[position]);
        //TODO implement
    }

    protected class ViewHolder {
        private ImageView imageView;
    private TextView textView;

        public ViewHolder(View view) {
            imageView = (ImageView) view.findViewById(R.id.imageView);
            textView = (TextView) view.findViewById(R.id.textView);
        }
    }
}