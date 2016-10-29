package com.project.kelfleur;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.M) {
            Toast.makeText(this, "Permission checking", Toast.LENGTH_SHORT).show();
            checkPermission();
        }

        // Listener pour bouton photo
        OnClickListener listener_btn_photo = new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TakePhoto.class);
                startActivity(intent);
            }
        };
        Button btn_photo = (Button) findViewById(R.id.btn_photo);
        btn_photo.setOnClickListener(listener_btn_photo);

        // Listener pour bouton pokeFleur
        OnClickListener listener_btn_pokefleur = new OnClickListener() {
            public void onClick(View view) {

                // .............................
                // .............................

            }
        };
        Button btn_pokefleur = (Button) findViewById(R.id.btn_pokefleur);
        btn_pokefleur.setOnClickListener(listener_btn_pokefleur);

    }

    private void checkPermission() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {//Can add more as per requirement

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 123);

        } else {

        }
    }
}
