
// public class Domba {

// }
public class Domba extends Hewan {
    private int hasilBulu;

public Domba(int jumlahHewan, int hargaBeli, int hasilProduksi, int hargaProduksi, int hasilBulu) {
        super("Domba", jumlahHewan, hargaBeli, hasilProduksi, hargaProduksi);
        this.hasilBulu = hasilBulu;
    }

    public int getHasilBulu() {
        return hasilBulu;
    }

    @Override
    public int hitungProfit() {
        int pendapatan = hasilBulu * hasilProduksi;
        int biayaPerawatan = jumlahHewan * hargaProduksi;
        return pendapatan - biayaPerawatan;
    }
}
