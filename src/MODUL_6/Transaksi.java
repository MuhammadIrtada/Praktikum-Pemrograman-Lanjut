package MODUL_6;

import java.text.NumberFormat;
import java.util.Locale;

public class Transaksi {
    String deskripsi;
    int unit;
    int harga;

    public Transaksi(String deskripsi, int unit, int harga) {
        this.deskripsi = deskripsi;
        this.unit = unit;
        this.harga = harga;
    }

    public void tampilkan() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);
        System.out.println("Deskripsi       : " + deskripsi);
        System.out.println("Jumlah Unit     : " + unit);
        System.out.println("Harga           : Rp. " + format.format(harga));
        System.out.println("Total Biaya     : Rp. " + format.format(harga * unit));
    }
}
