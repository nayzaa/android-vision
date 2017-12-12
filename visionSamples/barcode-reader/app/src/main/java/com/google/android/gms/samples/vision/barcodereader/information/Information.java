package com.google.android.gms.samples.vision.barcodereader.information;

import java.util.ArrayList;
import java.util.List;

public class Information {
    private int resId;
    private String topic;
    private String description;

    List<Information> informations = new ArrayList<>();

    Information() {

    }

    Information(int resId, String topic, String description) {
        this.resId = resId;
        this.topic = topic;
        this.description = description;
    }

    Information(int resId, String topic) {
        this.resId = resId;
        this.topic = topic;
    }


    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Information> getInformation() {
        return informations;
    }

    public void setInformations(List<Information> informations) {
        this.informations = informations;
    }
}
