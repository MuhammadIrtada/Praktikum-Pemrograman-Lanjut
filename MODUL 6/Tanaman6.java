package com;

public class Tanaman6 {
    private String Jenis;
    private int Jumlah;


    public Tanaman6(String Jenis, int Jumlah) {
        this.Jenis = Jenis;
        this.Jumlah = Jumlah;
    }
    
    public String getJenis() {
        return Jenis;
    }


    public void setJenis(String jenis) {
        Jenis = jenis;
    }
    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        Jumlah += jumlah;
    }
}
