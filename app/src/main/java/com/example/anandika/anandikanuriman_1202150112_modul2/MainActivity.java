package com.example.anandika.anandikanuriman_1202150112_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static  int splashInterval = 4000; //mengatur interval waktu splash muncul//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //untuk membuat aplikasi agar menjadi fullscreen//
        setContentView(R.layout.activity_main);

        //command dibawah berfungsi untuk melanjutkan ke activity selanjutnya//
        //kemudian untuk menampilkan pop up berupa toast yang isinya tulisan yang kita inginkan//
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(MainActivity.this, Menu_Utama.class);
            startActivity(intent);

            Toast.makeText(MainActivity.this, "AnandikaNurIman_1202150112", Toast.LENGTH_LONG).show();
            this.finish();
        }

        private void finish() {
        }
    }, splashInterval);
    }
}
