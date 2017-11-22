package com.google.android.gms.samples.vision.barcodereader.information;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.samples.vision.barcodereader.R;

public class ShowDetailActivity extends Activity {
    private int resId;
    private String topic;
    private String description;
    private ImageView imageView;
    private TextView tvDescription;
    private TextView tvTopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        initInstances();
    }

    private void initInstances() {

        resId = getIntent().getIntExtra("resId",0);
        topic = getIntent().getStringExtra("topic");
        description = getIntent().getStringExtra("desc");

        tvDescription = (TextView) findViewById(R.id.desc);
        tvTopic = (TextView) findViewById(R.id.title);
        imageView = (ImageView) findViewById(R.id.image);

        tvDescription.setText(description);
        tvTopic.setText(topic);
        imageView.setImageResource(resId);
    }
}
