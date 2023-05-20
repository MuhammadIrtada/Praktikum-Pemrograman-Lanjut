package MODUL_6;

import java.text.NumberFormat;
import java.util.Locale;

public class Bebek extends Hewan {
    public Bebek() {
        jenis = "Bebek";
        jumlah = 15;
        hasil = 2;
        hargaHasil = 2000;
        biayaPerawatan = 3000;
    }

    public void tampilkan() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);
        System.out.println("Jenis                : " + jenis);
        System.out.println("Jumlah               : " + jumlah + " ekor");
        System.out.println("Telur/Ekor           : " + hasil + " Butir");
        System.out.println("Total Telur/Hari     : " + totalHasil() + " Butir");
        System.out.println("Harga Telur/Butir    : Rp. " + format.format(hargaHasil));
        System.out.println("Profit/Hari          : Rp. " + format.format(profit()));
    }
}
