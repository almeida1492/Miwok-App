package com.example.android.miwok;

import static java.sql.Types.NULL;

/**
 * Created by henriquedealmeida on 07/02/17.
 */

public class Word {
    //State
    private String englishTrans, miwokTrans;
    private int imageResourceId = NULL;
    private int soundResourceId;

    public Word(String inputEnglishTrans, String inputMiwokTrans, int inputSoundResourceId) {
        englishTrans = inputEnglishTrans;
        miwokTrans = inputMiwokTrans;
        soundResourceId = inputSoundResourceId;
    }

    public Word(String inputEnglishTrans, String inputMiwokTrans, int inputImageResourceId, int inputSoundResourceId) {
        englishTrans = inputEnglishTrans;
        miwokTrans = inputMiwokTrans;
        soundResourceId = inputSoundResourceId;
        imageResourceId = inputImageResourceId;
    }

    //Behavior
    public String getEnglishTrans() {
        return englishTrans;
    }

    public String getMiwokTrans() {
        return miwokTrans;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    public boolean isThereImage() {
        if (imageResourceId != NULL) {
            return true;
        } else {
            return false;
        }
    }
}
