package com.example.tanushree.displayjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String KEY_JOKE = "joke";

    TextView mDisplayJokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mDisplayJokeTv = findViewById(R.id.tvDisplayJoke);

        Intent intent = getIntent();

        if (intent!=null)
        {
            if(intent.hasExtra(KEY_JOKE))
            {
                mDisplayJokeTv.setText(intent.getStringExtra(KEY_JOKE));
            }
        }
    }
}
