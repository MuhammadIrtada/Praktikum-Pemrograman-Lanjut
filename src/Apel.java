
 public class Apel extends Tanaman {
    private int hasilApel;

    public Apel (int jumlahTanaman, int hargaBeli, int hasilProduksi, int hargaProduksi, int hasilApel) {
        super("Apel", jumlahTanaman, hargaBeli, hasilProduksi, hargaProduksi);
        this.hasilApel = hasilApel;
    }
    public int getHasilApel() {
        return hasilApel;
    }

    public int hitungProfit() {
        int pendapatan = hasilApel * hasilProduksi;
        int biayaPerawatan = jumlahTanaman * hargaProduksi;
        return pendapatan - biayaPerawatan;
    }
}