package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.miwok.Fragments.ColorsFragment;
import com.example.android.miwok.Fragments.NumbersFragment;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ColorsFragment())
                .commit();
    }
}