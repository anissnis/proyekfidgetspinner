package com.example.lightning.proyekfigetspinner;

/**
 * Created by lightning on 04/01/2018.
 */

import android.app.Application;
import android.content.res.Configuration;

import com.example.lightning.proyekfigetspinner.utils.TypeFaceUtil;
import com.example.lightning.proyekfigetspinner.utils.TypefaceHelper;


/**
 * Created by @GeekNat on 4/17/17.
 */

public class Spinify extends Application {

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceHelper.initialize(this);
        TypeFaceUtil.overrideFont(getApplicationContext(), "SERIF", getString(R.string.custom_font));
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}
