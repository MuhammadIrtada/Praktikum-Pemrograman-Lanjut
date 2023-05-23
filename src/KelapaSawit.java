
// public class KelapaSawit {

// }
public abstract class KelapaSawit extends Tanaman {
    private int hasilMinyak;

    public KelapaSawit(int jumlahTanaman, int hargaBeli, int hasilMinyak, int biayaPerawatan, int hargaJual) {
        super("Kelapa Sawit", jumlahTanaman, hargaBeli, biayaPerawatan, hargaJual);
        this.hasilMinyak = hasilMinyak;
    }

    public int getHasilMinyak() {
        return hasilMinyak;
    }

    public void setHasilMinyak(int hasilMinyak) {
        this.hasilMinyak = hasilMinyak;
    }
// @Override
    @Override
    public int hitungProfit() {
        int pendapatan = hasilMinyak * hasilProduksi;
        int biayaPerawatan = jumlahTanaman * hargaProduksi;
        return pendapatan - biayaPerawatan;
    }
}
