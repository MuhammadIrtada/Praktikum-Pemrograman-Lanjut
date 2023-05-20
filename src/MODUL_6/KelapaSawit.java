package MODUL_6;

import java.text.NumberFormat;
import java.util.Locale;

public class KelapaSawit extends Tanaman {
    public KelapaSawit() {
        jenis = "Kelapa Sawit";
        luas = 6;
        hasil = 500;
        hargaHasil = 18000;
        biayaPerawatan = 8500000;
    }

    public void tampilkan() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);
        System.out.println("Jenis                : " + jenis);
        System.out.println("Luas                 : " + luas + " Hektar");
        System.out.println("Minyak/Hektar        : " + hasil + " Kg");
        System.out.println("Total Minyak/Hari    : " + totalHasil() + " Kg");
        System.out.println("Harga Minyak/Kg      : Rp. " + format.format(hargaHasil));
        System.out.println("Profit/Hari          : Rp. " + format.format(profit()));
    }
}
