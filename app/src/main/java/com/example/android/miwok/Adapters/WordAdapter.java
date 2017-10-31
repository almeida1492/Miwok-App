package com.example.android.miwok.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;

import java.util.ArrayList;

import static android.view.View.GONE;

/**
 * Created by henriquedealmeida on 07/02/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mbackgroundColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor){
        super(context, 0, words);
        mbackgroundColor = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        listItemView.setBackgroundColor(mbackgroundColor);

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_item);

        nameTextView.setText(currentWord.getMiwokTrans());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_item);

        numberTextView.setText(currentWord.getEnglishTrans());

        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.isThereImage()){
            wordImage.setImageResource((currentWord.getImageResourceId()));
        }
        else{
            wordImage.setVisibility(GONE);
        }

        return listItemView;
    }

}
