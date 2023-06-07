abstract class Hewan {
    protected int jumlahHewan;
    protected double hasilProduksi;
    protected double hargaJual;
    protected double biayaPerawatan;
public Hewan(int jumlahHewan, double hasilProduksi, double hargaJual, double biayaPerawatan) {
        this.jumlahHewan = jumlahHewan;
        this.hasilProduksi = hasilProduksi;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public abstract double hitungTotalProduksi();
    public abstract double hitungTotalBiayaPerawatan();
    public abstract double hitungTotalPendapatan();
}