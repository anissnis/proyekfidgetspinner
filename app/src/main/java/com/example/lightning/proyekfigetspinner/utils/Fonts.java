package com.example.lightning.proyekfigetspinner.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;


public class Fonts {

    public static void applyCustomFont(Context context, TextView textView, String customFont){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), customFont);
        textView.setTypeface(typeface);
    }
}

