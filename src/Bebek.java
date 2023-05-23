

public class Bebek extends Hewan {
    private int hasilTelur;

    public Bebek(int jumlahHewan, int hargaBeli, int hasilProduksi, int hargaProduksi, int hasilTelur) {
        super("Bebek", jumlahHewan, hargaBeli, hasilProduksi, hargaProduksi);
        this.hasilTelur = hasilTelur;
    }

    public int getHasilTelur() {
        return hasilTelur;
    }
//
    @Override
    public int hitungProfit() {
        int pendapatan = hasilTelur * hasilProduksi;
        int biayaPerawatan = jumlahHewan * hargaProduksi;
        return pendapatan - biayaPerawatan;
    }
}