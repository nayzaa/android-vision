package com.google.android.gms.samples.vision.barcodereader;

/**
 * Created by nira on 11/16/2017.
 */

public class Result {

    int resId[] = {
            R.drawable.pic01,
            R.drawable.pic02,
            R.drawable.pic03,
            R.drawable.pic04,
            R.drawable.pic05,
            R.drawable.pic06,
            R.drawable.pic07,
            R.drawable.pic08
    };

    String topic[] = {"All tunnel with number tag",
            "Pattern of painting in tunnel number three",
            "Pattern of painting in tunnel number two",
            "Pattern of painting in tunnel number one",
            "Male Peacock pattern on painting in tunnel number one",
            "Parrot pattern on painting in tunnel number one",
            "Herons pattern on painting in tunnel number one",
            "Chinese Phoenix pattern on painting in tunnel number one"
    };

    String detail[] ={"There are 6 tunnels, but the only found parts of mural paintings in tunnel number 1, 2 and 3.",
            "Line Drawing showing Lotuses and Specific Patterns",
            "",
            "",
            "",
            "",
            "",
            "",
    };



    public int getResId(int i) {
        return resId[i];
    }

    public String getDetail(int i) {
        return detail[i];
    }

    public String getTopic(int i) {
        return topic[i];
    }
}
