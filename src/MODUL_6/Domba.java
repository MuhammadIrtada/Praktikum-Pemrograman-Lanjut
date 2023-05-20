package MODUL_6;

import java.text.NumberFormat;
import java.util.Locale;

public class Domba extends Hewan {
    public Domba() {
        jenis = "Domba";
        jumlah = 4;
        hasil = 4;
        hargaHasil = 15000;
        biayaPerawatan = 45000;
    }

    public void tampilkan() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);
        System.out.println("Jenis                : " + jenis);
        System.out.println("Jumlah               : " + jumlah + " ekor");
        System.out.println("Bulu/Ekor            : " + hasil + " Kg");
        System.out.println("Total Bulu/Hari      : " + totalHasil() + " Kg");
        System.out.println("Harga Bulu/Kg        : Rp. " + format.format(hargaHasil));
        System.out.println("Profit/Hari          : Rp. " + format.format(profit()));
    }
}
