package com;

public class Modul5 {
    private String Jenis;
    private String Ras;
    private int Jumlah;
    private int Ekor;
    private int Total;
    private int Harga;

    public Modul5(String Jenis, String Ras, int Jumlah, int Ekor, int Total, int Harga) {
        this.Jenis = Jenis;
        this.Ras = Ras;
        this.Jumlah = Jumlah;
        this.Ekor = Ekor;
        this.Total = Total;
        this.Harga = Harga;
    }

    public Modul5(String Jenis, String Ras, int Jumlah) {
        this.Jenis = Jenis;
        this.Ras = Ras;
        this.Jumlah = Jumlah;

    }

    public Modul5(String Jenis, String Ras) {
        this.Jenis = Jenis;
        this.Ras = Ras;

    }

    public Modul5() {

    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setRas(String Ras) {
        this.Ras = Ras;
    }

    public String getRas() {
        return Ras;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getTotal() {
        return Total;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getHarga() {
        return Harga;
    }

    public void tampilkanTernak() {
        if (Jenis.equals("Bebek")) {
            System.out.println("============================================");
            System.out.println("Jenis\t\t\t: " + Jenis);
            System.out.println("Ras\t\t\t: " + Ras);
            System.out.println("Jumlah\t\t\t: " + Jumlah + " ekor");
            System.out.println("Telur/Ekor\t\t: " + Ekor + " Butir");
            System.out.println("Total Telur/Hari\t: " + Total + " Butir");
            System.out.println("Harga Telur/Butir\t: " + Harga);
        } else if (Jenis.equals("Domba")) {
            System.out.println("============================================");
            System.out.println("Jenis\t\t\t: " + Jenis);
            System.out.println("Ras\t\t\t: " + Ras);
            System.out.println("Jumlah\t\t\t: " + Jumlah + " ekor");
            System.out.println("Bulu/Ekor\t\t: " + Ekor + " Kg");
            System.out.println("Total Bulu/Hari\t\t: " + Total + " Kg");
            System.out.println("Harga Bulu/Kg\t\t: " + Harga);
        } else if (Jenis.equals("Unta")) {
            System.out.println("============================================");
            System.out.println("Jenis\t\t\t: " + Jenis);
            System.out.println("Ras\t\t\t: " + Ras);
            System.out.println("Jumlah\t\t\t: " + Jumlah + " ekor");
            System.out.println("Susu/Ekor\t\t: " + Ekor + " liter");
            System.out.println("Total Susu/Hari\t\t: " + Total + " liter");
            System.out.println("Harga Susu/Kg\t\t: " + Harga);
        }
    }

    public void tampilkanPemasukkan() {
        System.out.println("Jenis\t\t\t: " + Jenis + " | " + Ras);
        System.out.println("Pemasukkan\t\t: " + Harga * Total);
        System.out.println("--------------------------------------------");
    }

    public void tampilkanPPN(int PPN) {
        System.out.println("Jenis\t\t\t: " + Jenis + " | " + Ras);
        System.out.println("Pemasukkan:\t\t: " + ((Harga * Total) + (Harga*Total/PPN)));
        System.out.println("--------------------------------------------");
    }

}
