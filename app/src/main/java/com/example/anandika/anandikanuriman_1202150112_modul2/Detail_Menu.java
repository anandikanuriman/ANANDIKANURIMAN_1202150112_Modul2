package com.example.anandika.anandikanuriman_1202150112_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Menu extends AppCompatActivity {
    ImageView foto;
    TextView nama, harga, komposisi;    //mendeklarasikan variable//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__menu);
        setTitle("Detail Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //untuk mengambil data dari xml untuk mengganti id//
        foto = findViewById(R.id.gambar);
        nama = findViewById(R.id.nama_makanan);
        harga = findViewById(R.id.harga_makanan);
        komposisi = findViewById(R.id.komposisi_makanan);

        //mengambil activity dan nilai lain dari yang telah didefinisikan//
        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
        nama.setText(getIntent().getStringExtra("nama"));
        foto.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));

    }
}
