package com.example.anandika.anandikanuriman_1202150112_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Daftar_Menu extends AppCompatActivity {
    RecyclerView rv;
    menuAdapter adapter;        //mendeklarasikan variable yang akan digunakan//
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar__menu);
        setTitle("Menu");//memberikan title pada laman yang terbuka//

        //untuk melakukan INIT recycle view dan adapter//
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.daftarMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    //mengambil data yang akan dihubungkan oleh adapter//
    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.download, "Cheesecake", 125000, "Keju, strawberry, gula"));
        listmenu.add(new pilihMenu(R.drawable.milkshake, "Milk Shake", 18000, "Susu dengan rasa yang dapat dipilih dan anda suka"));
        listmenu.add(new pilihMenu(R.drawable.pizza, "Pepperoni Pizza", 60000, "Pepperoni, keju, sayuran, daging"));
        listmenu.add(new pilihMenu(R.drawable.thaitea, "Thai tea", 20000, "Teh thailand dengan berbagai macam rasa"));
        listmenu.add(new pilihMenu(R.drawable.wingz, "Chicken Wings", 35000, "Wings ayam dengan bumbu yang bisa anda pilih sesuai keinginan"));
        adapter = new menuAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }

    }

