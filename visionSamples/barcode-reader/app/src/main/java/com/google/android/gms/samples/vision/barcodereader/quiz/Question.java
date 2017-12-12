package com.google.android.gms.samples.vision.barcodereader.quiz;

import android.app.Activity;

/**
 * Created by Workspace on 10/29/2017.
 */

public class Question  extends Activity{


    private int ID;
    private String QUESTION;
    private String OPTA;
    private String OPTB;
    private String OPTC;
    private String OPTD;

    private String ANSWER;

    public Question() {
        ID = 0;
        QUESTION = "";
        OPTA = "";
        OPTB = "";
        OPTC = "";
        OPTD = "";

        ANSWER = "";

    }

    public Question(QuestionBuilder questionBuilder) {
        QUESTION = questionBuilder.QUESTION;
        OPTA = questionBuilder.OPTA;
        OPTB = questionBuilder.OPTB;
        OPTC = questionBuilder.OPTC;
        OPTD = questionBuilder.OPTD;
        ANSWER = questionBuilder.ANSWER;

    }

    public int getID() {
        return ID;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public String getOPTA() {
        return OPTA;
    }

    public String getOPTB() {
        return OPTB;
    }

    public String getOPTC() {
        return OPTC;
    }

    public String getOPTD() {
        return OPTD;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setID(int id) {
        ID = id;
    }

    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }

    public void setOPTA(String oPTA) {
        OPTA = oPTA;
    }

    public void setOPTB(String oPTB) {
        OPTB = oPTB;
    }

    public void setOPTC(String oPTC) {
        OPTC = oPTC;
    }

    public void setOPTD(String oPTD) {
        OPTD = oPTD;
    }

    public void setANSWER(String aNSWER) {
        ANSWER = aNSWER;
    }

    public static class QuestionBuilder{

        private String QUESTION;
        private String OPTA;
        private String OPTB;
        private String OPTC;
        private String OPTD;
        private String ANSWER;

        public QuestionBuilder(){}

        public QuestionBuilder setQUESTION(String QUESTION) {
            this.QUESTION = QUESTION;
            return this;
        }

        public QuestionBuilder setOPTA(String OPTA) {
            this.OPTA = OPTA;
            return this;
        }

        public QuestionBuilder setOPTB(String OPTB) {
            this.OPTB = OPTB;
            return this;
        }

        public QuestionBuilder setOPTC(String OPTC) {
            this.OPTC = OPTC;
            return this;
        }

        public QuestionBuilder setOPTD(String OPTD) {
            this.OPTD = OPTD;
            return this;
        }

        public QuestionBuilder setANSWER(String ANSWER) {
            this.ANSWER = ANSWER;
            return this;
        }

        public Question build(){
            return new Question(this);
        }
    }
}
