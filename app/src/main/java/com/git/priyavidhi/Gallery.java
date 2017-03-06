package com.git.priyavidhi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.comman.CustomTypefaceSpan;

import java.util.ArrayList;

import static com.git.priyavidhi.R.styleable.NavigationView;

public class Gallery extends AppCompatActivity {

    private String responseString, userName, emailId, phoneNo;
    SharedPreferences myPrefs;
    EditText edtName, edtDisc;
    ImageView ivDone;
    private DrawerLayout mDrawerLayout;
    NavigationView navigationView;
    private View headerLayout;
    private TextView UserName;
    private Menu menu;

    private final String android_version_names[] = {
            "Jazba",
            "TX",
            "Ratri B4 Navratri",
            "Annual Sports",
            "Kite Festival",

    };

    private final int[] android_image_urls = {
            R.drawable.folder,R.drawable.folder,R.drawable.folder,R.drawable.folder,R.drawable.folder};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        initViews();

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_action_navigation_menu);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("Gallery");


        Spannable text2 = new SpannableString(ab.getTitle());
        text2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.white)), 0, text2.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        ab.setTitle(text2);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        menu = navigationView.getMenu();

        headerLayout =
                navigationView.inflateHeaderView(R.layout.nav_header);


        Menu m = navigationView.getMenu();
        for (int i=0;i<m.size();i++) {
            MenuItem mi = m.getItem(i);

            //for aapplying a font to subMenu ...
            SubMenu subMenu = mi.getSubMenu();
            if (subMenu!=null && subMenu.size() >0 ) {
                for (int j=0; j <subMenu.size();j++) {
                    MenuItem subMenuItem = subMenu.getItem(j);
                    applyFontToMenuItem(subMenuItem);
                }
            }

            //the method we have create in activity
            applyFontToMenuItem(mi);
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        Intent i1 = new Intent(Gallery.this, HomeActivity.class);
                        startActivity(i1);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;


                    case R.id.nav_aboutGit:
                        Intent i2 = new Intent(Gallery.this, AboutGit.class);
                        startActivity(i2);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;

                    case R.id.nav_department:
                        Intent i3 = new Intent(Gallery.this, Department.class);
                        startActivity(i3);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;


                    case R.id.nav_circular:
                        Intent i4 = new Intent(Gallery.this, Circular.class);
                        startActivity(i4);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;

                    case R.id.nav_newsFeed:
                        Intent i5 = new Intent(Gallery.this, NewsFeed.class);
                        startActivity(i5);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;

                    case R.id.nav_event:
                        Intent i6 = new Intent(Gallery.this, Events.class);
                        startActivity(i6);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;

                    case R.id.nav_gallery:
                        Intent i7 = new Intent(Gallery.this, Gallery.class);
                        startActivity(i7);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;


                    case R.id.nav_contactus:
                        Intent i8 = new Intent(Gallery.this, ConatctusActivity.class);
                        startActivity(i8);
                        finish();

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                        break;



                    case R.id.nav_Share:
                        try {
                            Intent i = new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT, "Garagewala");
                            String sAux = "\nLet me recommend you this application\n\n";
                            sAux = sAux + "https://play.google.com/store/apps/details?id=com.androidappbazzar.garagefinder \n\n";
                            i.putExtra(Intent.EXTRA_TEXT, sAux);
                            startActivity(Intent.createChooser(i, "choose one"));
                        } catch (Exception e) { //e.toString();
                        }
                        break;


                }
                mDrawerLayout.closeDrawer(navigationView);
                return true;
            }
        });
    }

    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);

    }
    private ArrayList<AndroidVersion> prepareData(){

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
    private void applyFontToMenuItem(MenuItem mi) {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/proximanova-semibold-webfont.ttf");
        SpannableString mNewTitle = new SpannableString(mi.getTitle());
        mNewTitle.setSpan(new CustomTypefaceSpan("" , font), 0 , mNewTitle.length(),  Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mi.setTitle(mNewTitle);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item != null && item.getItemId() == android.R.id.home) {
            if (mDrawerLayout.isDrawerOpen(navigationView)) {
                mDrawerLayout.closeDrawer(navigationView);
                mDrawerLayout.closeDrawer(navigationView);
            } else {
                mDrawerLayout.openDrawer(navigationView);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
