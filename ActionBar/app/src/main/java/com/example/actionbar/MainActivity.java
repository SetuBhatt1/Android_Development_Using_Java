package com.example.actionbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar a = getSupportActionBar();
        a.setIcon(R.drawable.person_foreground);
        a.setDisplayUseLogoEnabled(true);
        a.setDisplayShowHomeEnabled(true);
        a.setTitle("Title");
        a.setSubtitle("This is subtitle");
    }
}