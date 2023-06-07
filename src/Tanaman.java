abstract class Tanaman{
    protected double area;
    protected double hasilProduksi;
    protected double hargaJual;
    protected double biayaPerawatan;

    public Tanaman(double area, double hasilProduksi, double hargaJual, double biayaPerawatan) {
        this.area = area;
        this.hasilProduksi= hasilProduksi;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }
    public abstract double hitungTotalProduksi();
    public abstract double hitungTotalBiayaPerawatan();
    public abstract double hitungTotalPendapatan();
}