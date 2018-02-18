package com.example.anandika.anandikanuriman_1202150112_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Menu_Utama extends AppCompatActivity {
    RadioGroup ragr; //pendkalrasian variable//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__utama);
        ragr = findViewById(R.id.radiobuttongroup); //mengambil data dari xml yang di ibaratkan untuk mengganti id//
    }

    //command dibawah merupakan class dari button yang hanya bisa menjalankan satu dari dua pilihan dan menggunakan metode switch//
    public void masuk_menu(View view) {
        int id = ragr.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilih = rb.getText().toString();
        switch (pilih) {
            case "Take Away":
                startActivity(new Intent(Menu_Utama.this, Take_Away.class));
                Toast.makeText(Menu_Utama.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;
            case "Dine In":
                startActivity(new Intent(Menu_Utama.this, Dine_In.class));
                Toast.makeText(Menu_Utama.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
