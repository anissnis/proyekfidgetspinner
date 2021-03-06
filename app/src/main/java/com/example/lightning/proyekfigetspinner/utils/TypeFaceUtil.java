package com.example.lightning.proyekfigetspinner.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.lang.reflect.Field;


public class TypeFaceUtil {

    public static void overrideFont(Context context, String defaultFont, String customFontFileName) {
        try {
            final Typeface customFontTypeFace = Typeface.createFromAsset(context.getAssets(), customFontFileName);
            final Field defaultFontTypeFace = Typeface.class.getDeclaredField(defaultFont);
            defaultFontTypeFace.setAccessible(true);
            defaultFontTypeFace.set(null, customFontTypeFace);
        } catch (Exception e) {
            Log.d("Font", e.getMessage());
        }
    }
}
