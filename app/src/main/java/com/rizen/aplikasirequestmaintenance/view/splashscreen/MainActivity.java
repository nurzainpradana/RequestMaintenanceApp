package com.rizen.aplikasirequestmaintenance.view.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.rizen.aplikasirequestmaintenance.R;
import com.rizen.aplikasirequestmaintenance.view.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    Animation appSplash, btt;
    ImageView ivIconApp;
    TextView tvCreatedBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appSplash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        ivIconApp = findViewById(R.id.iv_icon_app);
        tvCreatedBy = findViewById(R.id.tv_created_by);

        runAnimation();

        moveToNextActivity();
    }

    private void moveToNextActivity() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //merubah activity ke activity lain
                Intent gogethome = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(gogethome);
                finish();
            }
        }, 2000); //1000 milis = 1 detik
    }

    private void runAnimation() {
        ivIconApp.setAnimation(appSplash);
        tvCreatedBy.setAnimation(btt);
    }

}