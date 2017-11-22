package com.google.android.gms.samples.vision.barcodereader;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nira on 11/16/2017.
 */

public class ShowResult extends Activity {

    Result result;
    TextView topic,detail;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_qr_result);

        result = new Result();

        int index = getIntent().getIntExtra("index",0);

        topic = (TextView) findViewById(R.id.topic);
        topic.setText(result.getTopic(index));

        detail = (TextView) findViewById(R.id.detail);
        detail.setText(result.getDetail(index));

        pic = (ImageView) findViewById(R.id.imageView);
        pic.setImageResource(result.getResId(index));
    }


}
