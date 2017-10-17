package com.example.android.miwok;

/**
 * Created by Prateek Garg on 10/15/2017.
 */

public class Word {
    private String mDefaultTraslation, mMiwokTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTraslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTraslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTraslation(){
        return mDefaultTraslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
