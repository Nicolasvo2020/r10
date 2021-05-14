package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DragonActivity extends AppCompatActivity {
    Button btnVideoDragon /*btnRegresar*/;
    TextView txtTexto;
    ImageView ivbaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon);

        btnVideoDragon=(Button)findViewById(R.id.btnVideoDragon);
        //btnRegresar=(Button)findViewById(R.id.btnRegresar);
        btnVideoDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formvideodragon = new Intent(DragonActivity.this,Dragonvideo.class);
                startActivity(formvideodragon);
            }
        });
         /*btnRegresar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent formvideodragon = new Intent(DragonActivity.this,Splash2.class);
                 startActivity(formvideodragon);
             }
         });*/

    }
}