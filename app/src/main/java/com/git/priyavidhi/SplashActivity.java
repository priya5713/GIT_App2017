package com.git.priyavidhi;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;

public class SplashActivity extends Activity {

    CTimer refresh_timer;
    String walkthrought;
    boolean login_flag, skip;
    SharedPreferences preferances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        refresh_timer = new CTimer(1000, 1000);
        refresh_timer.start();

        preferances = PreferenceManager
                .getDefaultSharedPreferences(SplashActivity.this);
        walkthrought = preferances.getString("walkthrought", "0");
        login_flag = preferances.getBoolean("login_flag", false);
        skip = preferances.getBoolean("skip", false);
    }

    public class CTimer extends CountDownTimer {
        // Note: Your consumer key and secret should be obfuscated in your
        // source code before shipping.


        public CTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onFinish() {
            // TODO Auto-generated method stub
            if (walkthrought.equals("1")) {
                if (login_flag) {
                    finish();
                    startActivity(new Intent(SplashActivity.this,
                            HomeActivity.class));

                    overridePendingTransition(
                            R.anim.anim_slide_in_left,
                            R.anim.anim_slide_out_left);
                } else {
                    if (skip) {
                        finish();
                        startActivity(new Intent(SplashActivity.this,
                                HomeActivity.class));

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                    }else{
                        finish();
                        startActivity(new Intent(SplashActivity.this,
                                HomeActivity.class));

                        overridePendingTransition(
                                R.anim.anim_slide_in_left,
                                R.anim.anim_slide_out_left);
                    }
                }

            } else {
                finish();
                startActivity(new Intent(SplashActivity.this,
                        WalkThrought1Activity.class));
                overridePendingTransition(
                        R.anim.anim_slide_in_left,
                        R.anim.anim_slide_out_left);
            }
        }

        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub

        }
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();

        try {
            refresh_timer.cancel();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();

        try {
            refresh_timer.cancel();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
