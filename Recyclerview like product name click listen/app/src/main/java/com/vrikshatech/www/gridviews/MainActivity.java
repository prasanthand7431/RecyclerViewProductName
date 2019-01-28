package com.vrikshatech.www.gridviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating a list of book

        list=new ArrayList<>();
        list.add(new Book("The Veg","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The App","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Man","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Men","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Card","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The View","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Vegi","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Vowels","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Womens","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Hen","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Rings","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Wolley","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Carding","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Views","category Book","Description Book",R.mipmap.fruits1));
        list.add(new Book("The Videos","category Book","Description Book",R.mipmap.fruits1));


        // Instantiate the recyclerview

        RecyclerView bike= (RecyclerView) findViewById(R.id.recycleview1);
        RecyclerViewAdapter MyAdapter=new RecyclerViewAdapter(this,list);
        bike.setLayoutManager(new GridLayoutManager(this,3));
        bike.setAdapter(MyAdapter);


    }
}
