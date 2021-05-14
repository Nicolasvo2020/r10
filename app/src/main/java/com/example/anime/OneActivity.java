package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneActivity extends AppCompatActivity {
    Button btnVideoOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        btnVideoOne=(Button)findViewById(R.id.btnVideoOne);

        btnVideoOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent. ACTION_VIEW,
                        Uri.parse ("https://es.wikipedia.org/wiki/Ronaldinho"));
                startActivity(intent);
            }
        });
    }
}