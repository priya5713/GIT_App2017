package com.git.priyavidhi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Priya on 2/9/2017.
 */

class RecyclerViewHolder1 extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolder1(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.list_title);
        tv2= (TextView) itemView.findViewById(R.id.list_desc);
        imageView= (ImageView) itemView.findViewById(R.id.list_avatar);

    }
}
