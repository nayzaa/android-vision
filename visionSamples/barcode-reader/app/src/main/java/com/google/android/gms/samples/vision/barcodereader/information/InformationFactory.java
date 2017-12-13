package com.google.android.gms.samples.vision.barcodereader.information;

import com.google.android.gms.samples.vision.barcodereader.AbstractFactory;
import com.google.android.gms.samples.vision.barcodereader.Result;

/**
 * Created by nira on 12/13/2017.
 */

public class InformationFactory extends AbstractFactory {
    @Override
    public Information getInformation(int resId, String topic, String description) {
        return new InformationImpl(resId,topic,description);
    }

    @Override
    public Result getResult(int resId, String topic, String description) {
        return null;
    }
}
