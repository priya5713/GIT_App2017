package com.git.priyavidhi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Priya on 2/8/2017.
 */

class RecyclerViewHolder1 extends RecyclerView.ViewHolder {

    TextView nDate,nTitle,tv1;
    ImageView imageView;

    public RecyclerViewHolder1(View itemView) {
        super(itemView);

        nDate= (TextView) itemView.findViewById(R.id.nDate);
        nTitle= (TextView) itemView.findViewById(R.id.nTitle);
        tv1=(TextView)itemView.findViewById(R.id.list_title);
        imageView= (ImageView) itemView.findViewById(R.id.info);

    }
}
