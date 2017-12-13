package com.google.android.gms.samples.vision.barcodereader;

import com.google.android.gms.samples.vision.barcodereader.information.Information;

/**
 * Created by nira on 12/13/2017.
 */

class ResultFactory extends AbstractFactory {
    @Override
    public Information getInformation(int resId, String topic, String description) {
        return null;
    }

    @Override
    public Result getResult(int resId, String topic, String description) {
        return new Result(resId,topic,description);
    }
}
