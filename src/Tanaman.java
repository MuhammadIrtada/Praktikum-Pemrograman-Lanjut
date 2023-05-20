public class Tanaman {
    protected String jenisTanaman;
    protected int hasilProduksi;
    protected int hargaJual;
    protected int biayaPerawatan;

    public Tanaman(String jenisTanaman, int hasilProduksi, int hargaJual, int biayaPerawatan) {
        this.jenisTanaman = jenisTanaman;
        this.hasilProduksi = hasilProduksi;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public String getJenisTanaman() {
        return jenisTanaman;
    }

    public int getHasilProduksi() {
        return hasilProduksi;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getBiayaPerawatan() {
        return biayaPerawatan;
    }

    public int hitungProfit() {
        return (hasilProduksi * hargaJual) - biayaPerawatan;
    }
}
