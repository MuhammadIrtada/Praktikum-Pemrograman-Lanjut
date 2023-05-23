
// 
public class Unta extends Hewan {
    private int hasilSusu;

    public Unta(int jumlahHewan, int hargaBeli, int hasilProduksi, int hargaProduksi, int hasilSusu) {
        super("Unta", jumlahHewan, hargaBeli, hasilProduksi, hargaProduksi);
        this.hasilSusu = hasilSusu;
    }
    public int getHasilSusu() {
        return hasilSusu;
    }

    @Override
    public int hitungProfit() {
        int pendapatan = hasilSusu * hasilProduksi;
        int biayaPerawatan = jumlahHewan * hargaProduksi;
        return pendapatan - biayaPerawatan;
    }
} 
