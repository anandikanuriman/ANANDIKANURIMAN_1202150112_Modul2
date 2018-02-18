package com.example.anandika.anandikanuriman_1202150112_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class Dine_In extends AppCompatActivity {
    Spinner no_meja; //mendeklarasikan spinner yang ada pada xml//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine__in);
        setTitle("Dine In"); //memberikan nama title pada laman yang terbuka//
        no_meja = findViewById(R.id.no_meja);//mengambil spinner dengan nama no_meja//
    }

    //digunakan untuk menampilkan pop up dan melanjutkan ke activity selanjutnya//
    public void daftarmenu2(View view) {
        Toast.makeText(Dine_In.this, no_meja.getSelectedItem().toString() + " dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Dine_In.this, Daftar_Menu.class));
        finish();
    }
}
