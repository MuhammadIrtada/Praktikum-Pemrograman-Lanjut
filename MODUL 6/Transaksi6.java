package com;
import java.text.DecimalFormat;

public class Transaksi6 {
    private String Deskripsi;
    private int ke;
    private int Jumlah;
    private int Harga;
    private int Total;
    // konstruktor 
    public Transaksi6(String d, int j, int h, int t, int k){
        this.Deskripsi = d;
        this.ke = k;
        this.Jumlah = j; 
        this.Harga = h;
        this.Total = t;

    }
    
    // method
    public void tampilkanTransaksi(){
        System.out.println("==================================================");
        System.out.println("Transaksi " + ke);
        System.out.println("==================================================");
        System.out.println("Deskripsi\t\t: " + Deskripsi);
        System.out.println("Jumlah Unit\t\t: " + Jumlah);
        System.out.println("Harga\t\t\t: " + Harga);
        System.out.println("Total Biaya\t\t: " + Total);
    }
    
}
