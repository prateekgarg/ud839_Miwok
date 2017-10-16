package com.example.android.miwok;

/**
 * Created by Prateek Garg on 10/15/2017.
 */

public class Word {
    private String mDefaultTraslation, mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTraslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTraslation(){
        return mDefaultTraslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
