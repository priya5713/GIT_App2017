package com.git.priyavidhi;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPage extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    int[] flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        int v1=getIntent().getIntExtra("pos",0);

        flag = new int[] {  R.drawable.vidhi,R.drawable.priya,R.drawable.niki,R.drawable.vidhi,R.drawable.priya,
                R.drawable.niki,R.drawable.vidhi,R.drawable.priya,R.drawable.niki,R.drawable.vidhi };

        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPageAdapter(ViewPage.this,  flag);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(v1);
    }
}
