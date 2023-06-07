package Modul6;

public class Transaksi {
    private String deskripsi;
    private int jumlahUnit;
    private int harga;
    private int totalBiaya;

    public Transaksi(String deskripsi, int jumlahUnit, int harga) {
        this.deskripsi = deskripsi;
        this.jumlahUnit = jumlahUnit;
        this.harga = harga;
        this.totalBiaya = jumlahUnit * harga;
    }

    @Override
    public String toString() {
        return "Deskripsi: " + deskripsi + "\n" +
                "Jumlah unit: " + jumlahUnit + "\n" +
                "Harga: " + "Rp. "+ harga + "\n" +
                "Total Biaya: " + "Rp. " + totalBiaya;
    }
}

