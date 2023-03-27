package com;

public class TernakRara {
    private String jenisHewan;
    private int jumlahHewan;
    private double dosisObat;
    
    public TernakRara(String jenisHewan, int jumlahHewan) {
        this.jenisHewan = jenisHewan;
        this.jumlahHewan = jumlahHewan;
    }
    
    public TernakRara(String jenisHewan, int jumlahHewan, double dosisObat) {
        this(jenisHewan, jumlahHewan);
        this.dosisObat = dosisObat;
    }
    
    public String getJenisHewan() {
        return jenisHewan;
    }
    
    public int getJumlahHewan() {
        return jumlahHewan;
    }
    
    public double getDosisObat() {
        return dosisObat;
    }
    
    public void setDosisObat(double dosisObat) {
        this.dosisObat = dosisObat;
    }
    
    public void tampilkanInfo() {
        System.out.println("Jenis: " + jenisHewan);
        System.out.println("-------------------------------------");
        System.out.println("Jumlah hewan: " + jumlahHewan);
        System.out.println("Dosis obat per ekor per hari: " + dosisObat + " mL");
        System.out.println("Dosis obat per hari untuk ras " + jenisHewan + ": " + (jumlahHewan * dosisObat) + " mL");        
        System.out.println("-------------------------------------\n\n");

    }
    
    public static void main(String[] args) {
        TernakRara bebekBiasa = new TernakRara("Bebek ras telur biasa", 15, 5);
        bebekBiasa.tampilkanInfo();
        
        TernakRara bebekAsin = new TernakRara("Bebek ras telur asin", 10, 8);
        bebekAsin.tampilkanInfo();
        
        TernakRara untaPutih = new TernakRara("Unta ras susu putih", 3, 10);
        untaPutih.tampilkanInfo();
        
        TernakRara untaCoklat = new TernakRara("Unta ras susu coklat", 4, 15);
        untaCoklat.tampilkanInfo();
        
        TernakRara dombaHitam = new TernakRara("Domba ras bulu hitam", 4, 9);
        dombaHitam.tampilkanInfo();
        
        TernakRara dombaPutih = new TernakRara("Domba ras bulu putih", 6, 14);
        dombaPutih.tampilkanInfo();
    }
}
