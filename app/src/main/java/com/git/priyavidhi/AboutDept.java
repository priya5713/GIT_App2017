package com.git.priyavidhi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;

public class AboutDept extends AppCompatActivity {

    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(
                R.anim.anim_slide_in_right,
                R.anim.anim_slide_out_right);
    }
    WebView aboutDept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dept);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        android.support.v7.widget.Toolbar toolbar1 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);


        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_action_navigation_arrow_back);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("About");
        aboutDept= (WebView) findViewById(R.id.aboutDept);

        String text = "<html><body>" + "<p align=\"justify\">" + "<b>" + "Jazba (Annual Cultural Festival)" + "</b>" + "</p>" + "<p align=\"justify\">" + "Gandhinagar Institute of Technology, managed by Platinum Foundation, celebrates its grand gala annual cultural festival JAZBA. It showcases more than fifteen events including Antakshari, Quiz, Rangoli, Debate, T-shirt Painting, Singing, Dancing, Skit, Mr & Miss GIT, Face Painting, Cooking, Sand Art, Bhookhad, Laggy Cricket and many more. The day events are followed by musical evening program in which multi-talented students from various branches perform in various events like Skit, Solo & Duet Singing, Solo & Group Dance etc. Actress from movie and television industry are invited to inspire the students for culture and co-curricular activities. Ms. Sonal Chauhan (Jannat Movie Actreess), Mr. Ranvijay Singh (Actor and MTV Roadies Host), Hard Kaur (Singer, Rapper and Musician), Mr. Rajdeep Chatrerjee(Indion Idol Fame Singer) and many more become a part of this grand event.\n" +
                "\n" + "</p>" + "</body></html>";

        aboutDept.loadData(text, "text/html", "utf-8");
    }

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
