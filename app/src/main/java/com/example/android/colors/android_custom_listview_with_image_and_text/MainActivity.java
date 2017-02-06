package com.example.android.colors.android_custom_listview_with_image_and_text;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    String color_names[] = {"red", "green", "blue", "yellow", "pink", "brown"};
    Integer image_id[] = {R.drawable.banana, R.drawable.blackberry, R.drawable.barcolli, R.drawable.cabbeg,R.drawable.banana, R.drawable.blackberry};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Customlistadapter adapter = new Customlistadapter(this, image_id, color_names);

        ListRowAdapter listRowAdapter=new ListRowAdapter(this, image_id, color_names);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(listRowAdapter);

    }



}