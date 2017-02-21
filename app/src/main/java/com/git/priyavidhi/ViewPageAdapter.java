package com.git.priyavidhi;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by vidhi on 2/9/2017.
 */

public class ViewPageAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;
    int v;
    LayoutInflater inflater;

    public ViewPageAdapter(Context context,int[] flag) {
        this.context = context;
        this.rank = rank;
        this.country = country;
        this.population = population;
        this.flag = flag;
    }

    @Override
    public int getCount() {
        return flag.length;
//        return 1;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.view_pager, container,
                false);


        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.img_android);
        // Capture position and set to the ImageView
        imgflag.setImageResource(flag[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int v, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}

