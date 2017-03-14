package com.git.priyavidhi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Priya on 2/8/2017.
 */

class RecyclerViewHolder1 extends RecyclerView.ViewHolder {

    TextView nDate,nTitle;
    ImageView imageView;

    public RecyclerViewHolder1(View itemView) {
        super(itemView);

        nDate= (TextView) itemView.findViewById(R.id.nDate);
        nTitle= (TextView) itemView.findViewById(R.id.nTitle);
        imageView= (ImageView) itemView.findViewById(R.id.info);

    }
}
