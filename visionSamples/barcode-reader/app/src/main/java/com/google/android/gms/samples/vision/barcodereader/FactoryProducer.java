package com.google.android.gms.samples.vision.barcodereader;

import com.google.android.gms.samples.vision.barcodereader.information.InformationFactory;

/**
 * Created by nira on 12/13/2017.
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if (type.equalsIgnoreCase("information")){
            return new InformationFactory();
        }else if(type.equalsIgnoreCase("result")){
            return new ResultFactory();
        }
        return null;
    }
}
