package com.vrikshatech.www.gridviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView title,description,category;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        title=findViewById(R.id.text2);
        description=findViewById(R.id.text3);
        category=findViewById(R.id.text4);
        imageView=findViewById(R.id.main2);

        //Receiving the data

        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String Description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");

        //setting values

        title.setText(Title);
        description.setText(Description);
        imageView.setImageResource(image);


    }
}
