package com.example.tugas_uts_genap_2023_akb_if3_10120113;

/*
 * NIM   : 10120113
 * Nama  : Deri Tri Oktiana
 * Kelas : IF3
 * */

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivitySplashScreen extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), ActivityWelcomeDialog.class));
            finish();
        }, 2000L); // membuat delay selama 2 detik
    }

}
