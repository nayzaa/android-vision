package com.google.android.gms.samples.vision.barcodereader.information;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.samples.vision.barcodereader.R;

import java.util.ArrayList;
import java.util.List;
public class MainList extends Activity {

    private ListView listView;
    List<Information> information = new ArrayList<>();
    int dataSize;
    public Information listInformation = new Information();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        initInstances();

    }

    private void initInstances() {

        prepareData();

        ListAdapter adapter = new ListAdapter(MainList.this, listInformation);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int resId[] = {R.drawable.img01,R.drawable.img02,R.drawable.img03,R.drawable.img04,
                R.drawable.img05,R.drawable.img06,R.drawable.img07,R.drawable.img08,
                R.drawable.img09,R.drawable.img10,R.drawable.img11};

        String topic[] = {"The History of Wat Umong","About Wat Umong",
                "What is Unique about Wat Umong","Which tunnels has a painting",
                "Which kinds of painting are appear in Wat Umong", "Chemical Study",
                "What is XRD","What is SEM/EDS","Color that used for painting",
                "Measurement and Orientation ofTunnels",
                "The benefits of mathematical research on the study of Thai art and architecture."};

        String description[] = {getString(R.string.main_des),getString(R.string.second_des),getString(R.string.third_des),getString(R.string.fourth_des),getString(R.string.fifth_des),getString(R.string.six_des),getString(R.string.seven_des),getString(R.string.eight_des),getString(R.string.nine_des),getString(R.string.ten_des),getString(R.string.eleven_des)};

        dataSize = resId.length;


//        Log.d("khem", "dataSize " + resId.length);
//        Log.d("khem", "Topic " + resId.length);
//        Log.d("khem", "description " + resId.length);



        for (int i = 0; i < dataSize; i++) {
//            Log.d("khem", " " + i);
            Information information1 = new Information(resId[i], topic[i], description[i]);
            information.add(information1);
        }


        listInformation.setInformations(information);

    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Toast.makeText(MainActivity.this, "POSITION:= " + position,
//                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainList.this,ShowDetailActivity.class);
            intent.putExtra("resId",listInformation.getInformation().get(position).getResId());
            intent.putExtra("topic",listInformation.getInformation().get(position).getTopic());
            intent.putExtra("desc",listInformation.getInformation().get(position).getDescription());

            startActivity(intent);
        }
    };

}
