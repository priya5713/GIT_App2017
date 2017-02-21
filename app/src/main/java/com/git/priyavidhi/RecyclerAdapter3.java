package com.git.priyavidhi;

/**
 * Created by Priya on 2/9/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RecyclerAdapter3 extends  RecyclerView.Adapter<RecyclerViewHolder1> {

    String [] name={"Jazba","Tech-Xtream","Ratri-B4-Navratri","Annual-Sports"};
    Context context;
    LayoutInflater inflater;
    public RecyclerAdapter3(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_event, parent, false);

        RecyclerViewHolder1 viewHolder=new RecyclerViewHolder1(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder1 holder, int position) {

        holder.tv1.setText(name[position]);
        holder.itemView.setOnClickListener(clickListener);
        holder.itemView.setTag(holder);
    }

    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder1 vholder = (RecyclerViewHolder1) v.getTag();



            int position = vholder.getPosition();

            switch (position) {



                case 0:
                    final Intent intent = new Intent(context, Jazba.class);
                    context.startActivity(intent);
                    break;




                case 1:
                    final Intent intent1 = new Intent(context, Tx.class);
                    context.startActivity(intent1);
                    break;


                case 2:
                    final Intent intent2 = new Intent(context, RatriB4Navratri.class);
                    context.startActivity(intent2);
                    break;


                case 3:
                    final Intent intent3 = new Intent(context, AnnualSports.class);
                    context.startActivity(intent3);
                    break;


                case 4:
                    final Intent intent4 = new Intent(context, Test.class);
                    context.startActivity(intent4);
                    break;

                case 5:
                    final Intent intent5 = new Intent(context, Test.class);
                    context.startActivity(intent5);
                    break;

            }

        }
    };


    @Override
    public int getItemCount() {
        return name.length;
    }
}

