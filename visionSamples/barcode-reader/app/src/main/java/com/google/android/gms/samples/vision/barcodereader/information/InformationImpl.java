package com.google.android.gms.samples.vision.barcodereader.information;

import java.util.ArrayList;
import java.util.List;

public class InformationImpl implements Information{
    private int resId;
    private String topic;
    private String description;

    List<InformationImpl> informationImpls = new ArrayList<>();

    InformationImpl() {
    }

    InformationImpl(int resId, String topic, String description) {
        this.resId = resId;
        this.topic = topic;
        this.description = description;
    }

    InformationImpl(int resId, String topic) {
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

    public List<InformationImpl> getInformation() {
        return informationImpls;
    }

    public void setInformationImpls(List<Information> informationImpls) {
        this.informationImpls = informationImpls;
    }
}
