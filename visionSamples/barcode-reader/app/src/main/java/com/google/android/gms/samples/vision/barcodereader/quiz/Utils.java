package com.google.android.gms.samples.vision.barcodereader.quiz;

/**
 * Created by Workspace on 11/1/2017.
 */

import android.content.res.Resources;

public class Utils {
    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return  dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp){
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }
}