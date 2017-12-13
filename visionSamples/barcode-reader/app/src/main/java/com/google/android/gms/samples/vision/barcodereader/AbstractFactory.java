package com.google.android.gms.samples.vision.barcodereader;

import com.google.android.gms.samples.vision.barcodereader.information.Information;

/**
 * Created by nira on 12/13/2017.
 */

public abstract class AbstractFactory {
    public abstract Information getInformation(int resId, String topic, String description);
    public abstract Result getResult(int resId, String topic, String description);
}
