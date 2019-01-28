package com.vrikshatech.www.gridviews;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//creating recycler view adapter

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mcontext;
    private List<Book> mdata;

    public RecyclerViewAdapter(Context mcontext, List<Book> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater=LayoutInflater.from(mcontext);
        view=mInflater.inflate(R.layout.card_viewitems,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.textView1.setText(mdata.get(position).getTitle());
        holder.imageView1.setImageResource(mdata.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //parsing data to the activity_main2

                Intent intent=new Intent(mcontext,Main2Activity.class);
                intent.putExtra("Title",mdata.get(position).getDescription());
                intent.putExtra("Description",mdata.get(position).getDescription());
                intent.putExtra("Thumbnail",mdata.get(position).getDescription());

                //start the activity

                mcontext.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView1;
        ImageView imageView1;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);
            textView1= (TextView) itemView.findViewById(R.id.text1);
            imageView1= (ImageView) itemView.findViewById(R.id.image1);
            cardView=(CardView) itemView.findViewById(R.id.card);
        }
    }
}
