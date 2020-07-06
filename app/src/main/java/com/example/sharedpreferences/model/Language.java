package com.example.sharedpreferences.model;

public class Language {
    private int mId;
    private String  mName;
    private String mCode;

    public Language(int mId, String mName, String mCode) {
        this.mId = mId;
        this.mName = mName;
        this.mCode = mCode;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmCode() {
        return mCode;
    }


}
