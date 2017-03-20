package com.git.priyavidhi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Priya on 2/8/2017.
 */

class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    //    String [] name={"Androidwarriors","Stackoverflow","Developer Android","AndroidHive",
//            "Slidenerd","TheNewBoston","Truiton","HmkCode","JavaTpoint","Javapeper"};
    Context context;
    LayoutInflater inflater;

    List<Data> data= Collections.emptyList();

    public RecyclerAdapter(Context context , List<Data> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data= data;
    }



    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_item, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {


        RecyclerViewHolder myHolder= (RecyclerViewHolder) holder;
        Data current=data.get(position);
        myHolder.cDate.setText(current.cDate);
        myHolder.cTitle.setText(current.cTitle);

    }



    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://sites.google.com/a/git.org.in/it/"));
            context.startActivity(intent);



//            int position = vholder.getPosition();

//            switch (position) {


//
//                case 0:
//                    final Intent intent = new Intent(context, Jazba.class);
//                    context.startActivity(intent);
//                    break;
//
//
//
//
//                case 1:
//                    final Intent intent1 = new Intent(context, RatriB4Navratri.class);
//                    context.startActivity(intent1);
//                    break;
//
//
//                case 2:
//                    final Intent intent2 = new Intent(context, RatriB4Navratri.class);
//                    context.startActivity(intent2);
//                    break;
//
//
//                case 3:
//                    final Intent intent3 = new Intent(context, AnnualSports.class);
//                    context.startActivity(intent3);
//                    break;


            }

    };




    @Override
    public int getItemCount() {

        return data.size();

    }

    class RecycleViewHolder extends RecyclerView.ViewHolder{

        TextView cDate,cTitle,cUrl;


        // create constructor to get widget reference
        public RecycleViewHolder(View itemView) {
            super(itemView);
            cDate= (TextView) itemView.findViewById(R.id.cDate);
            cTitle= (TextView) itemView.findViewById(R.id.cTitle);
//            cUrl=(TextView) itemView.findViewById(R.id.cUrl);

        }

    }


}
