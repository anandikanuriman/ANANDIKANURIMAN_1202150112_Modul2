package com.example.anandika.anandikanuriman_1202150112_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Take_Away extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take__away);
    }

    //digunakan untuk meneruskan ke activity selanjutnya//
    public void daftarmenu(View view) {
        startActivity(new Intent(Take_Away.this, Daftar_Menu.class));
        finish();
    }
}
