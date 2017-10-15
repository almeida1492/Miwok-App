package com.example.android.miwok;

import static java.sql.Types.NULL;

/**
 * Created by henriquedealmeida on 07/02/17.
 */

public class Word {
    //State
    private String englishTrans, miwokTrans;
    private int imageResourceId = NULL;

    public Word(String inputEnglishTrans, String inputMiwokTrans){
        englishTrans = inputEnglishTrans;
        miwokTrans = inputMiwokTrans;
    }

    public Word(String inputEnglishTrans, String inputMiwokTrans, int inputImageResourceId){
        englishTrans = inputEnglishTrans;
        miwokTrans = inputMiwokTrans;
        imageResourceId = inputImageResourceId;
    }

    //Behavior
    public String getEnglishTrans(){
        return englishTrans;
    }

    public String getMiwokTrans(){
        return miwokTrans;
    }

    public int getimageResourceId() { return imageResourceId; }

    public boolean isThereImage() {
        if(imageResourceId != NULL){
            return true;
        }
        else{
            return false;
        }
    }
}
