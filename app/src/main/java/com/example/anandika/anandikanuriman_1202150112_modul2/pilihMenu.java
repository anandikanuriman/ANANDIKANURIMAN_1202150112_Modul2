package com.example.anandika.anandikanuriman_1202150112_modul2;

/**
 * Created by Anandika on 18/02/2018.
 */

public class pilihMenu {
    int foto;
    String nama;        //mendeklarasikan variable yang akan digunakan//
    int harga;
    String komposisi;

    //untuk mengambil nilai yang telah di deklarasikan sebelumnya//
    public pilihMenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    //memberikan identifier untuk masing-masing variable//
    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}
