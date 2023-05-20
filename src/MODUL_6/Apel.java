package MODUL_6;

import java.text.NumberFormat;
import java.util.Locale;

public class Apel extends Tanaman {
    public Apel() {
        jenis = "Apel";
        luas = 5;
        hasil = 40;
        hargaHasil = 25000;
        biayaPerawatan = 900000;
    }

    public void tampilkan() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);
        System.out.println("Jenis                : " + jenis);
        System.out.println("Luas                 : " + luas + " Hektar");
        System.out.println("Buah/Hektar          : " + hasil + " Kg");
        System.out.println("Total Buah/Hari      : " + totalHasil() + " Kg");
        System.out.println("Harga Buah/Kg        : Rp. " + format.format(hargaHasil));
        System.out.println("Profit/Hari          : Rp. " + format.format(profit()));
    }
}
