package com.experiences.projects.booktable;


import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;


public class SplashScreenActivity extends BaseActivity {

    private LinearLayout llSplashScreen;

    @Override
    public void createActivity() {
        llSplashScreen = (LinearLayout) layoutInflater.inflate(R.layout.activity_splash_screen, null);
        llContent.addView(llSplashScreen, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        llHeader.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                finish();
                startActivity(new Intent(SplashScreenActivity.this,HotelList.class));
            }
        },2000);
    }
}
