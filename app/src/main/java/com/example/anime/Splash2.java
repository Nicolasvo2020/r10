package com.example.anime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Splash2 extends AppCompatActivity {
    ImageButton ibDragon, ibNaruto, ibSlam, ibDemon, ibOne, ibSalir, btnFacebook, btnYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        btnFacebook=findViewById(R.id.btnFacebook);
        btnYoutube=findViewById(R.id.btnYoutube);
        ibDragon=(ImageButton)findViewById(R.id.ibDragon);
        ibNaruto=(ImageButton)findViewById(R.id.ibNaruto);
        ibSlam=(ImageButton)findViewById(R.id.ibSlam);
        ibDemon=(ImageButton)findViewById(R.id.ibDemon);
        ibOne=(ImageButton)findViewById(R.id.ibOne);
        ibSalir=(ImageButton)findViewById(R.id.ibSalir);

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Uri google = Uri.parse("http://www.youtube.com");
                    Intent intent = new Intent(Intent.ACTION_VIEW,google);
                    startActivity(intent);
                }
                catch (Exception e){System.out.println("Error "+e);}
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Uri google = Uri.parse("http://www.facebook.com");
                    Intent intent = new Intent(Intent.ACTION_VIEW,google);
                    startActivity(intent);
                }
                catch (Exception e){System.out.println("Error "+e);}
                }

        });

        ibDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formdragon = new Intent(Splash2.this,DragonActivity.class);
                startActivity(formdragon);
            }
        });

        ibNaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formnaruto = new Intent(Splash2.this,NarutoActivity.class);
                startActivity(formnaruto);
            }
        });
        ibSlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formslam = new Intent(Splash2.this,SlamActivity.class);
                startActivity(formslam);
            }
        });
        ibDemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formdemon = new Intent(Splash2.this,DemonActivity.class);
                startActivity(formdemon);
            }
        });
        ibOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formone = new Intent(Splash2.this,OneActivity.class);
                startActivity(formone);
            }
        });
        ibSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void onBackPressed(){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setMessage("Seguro de Salir de Ronaldhiño app?");
        builder.setTitle("Click Salir");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}