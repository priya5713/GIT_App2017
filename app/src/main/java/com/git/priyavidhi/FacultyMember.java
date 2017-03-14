package com.git.priyavidhi;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class FacultyMember extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(
                R.anim.anim_slide_in_right,
                R.anim.anim_slide_out_right);
    }

    RecyclerView recyclerView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_member);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_action_navigation_arrow_back);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("Faculty Members");


        android.support.v7.widget.Toolbar toolbar1 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);



        recyclerView = (RecyclerView) findViewById(R.id.rFaculty);

        RecyclerAdapter4 adapter = new RecyclerAdapter4(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item != null && item.getItemId() == android.R.id.home) {
            finish();

            overridePendingTransition(
                    R.anim.anim_slide_in_right,
                    R.anim.anim_slide_out_right);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
