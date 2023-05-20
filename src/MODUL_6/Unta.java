package MODUL_6;

import java.text.NumberFormat;
import java.util.Locale;

public class Unta extends Hewan {
    public Unta() {
        jenis = "Unta";
        jumlah = 3;
        hasil = 5;
        hargaHasil = 60000;
        biayaPerawatan = 200000;
    }

    public void tampilkan() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);
        System.out.println("Jenis                : " + jenis);
        System.out.println("Jumlah               : " + jumlah + " ekor");
        System.out.println("Susu/Ekor            : " + hasil + " Liter");
        System.out.println("Total Susu/Hari      : " + totalHasil() + " Liter");
        System.out.println("Harga Susu/Liter     : Rp. " + format.format(hargaHasil));
        System.out.println("Profit/Hari          : Rp. " + format.format(profit()));
    }
}
