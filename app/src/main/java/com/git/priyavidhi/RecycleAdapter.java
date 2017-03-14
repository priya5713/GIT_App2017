package com.git.priyavidhi;

import android.content.Context;
import android.provider.ContactsContract;
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
        this.data=data;

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


    @Override
    public int getItemCount() {

        return data.size();

    }

    class RecycleViewHolder extends RecyclerView.ViewHolder{

        TextView cDate,cTitle;


        // create constructor to get widget reference
        public RecycleViewHolder(View itemView) {
            super(itemView);
            cDate= (TextView) itemView.findViewById(R.id.cDate);
            cTitle= (TextView) itemView.findViewById(R.id.cTitle);

        }

    }


}
