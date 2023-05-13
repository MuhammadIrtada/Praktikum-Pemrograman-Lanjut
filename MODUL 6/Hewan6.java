package com;


public class Hewan6 {
    
    private String Jenis;
    private int Jumlah;


    public Hewan6(String Jenis, int Jumlah) {
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
