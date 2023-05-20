public class Hewan {
    protected String jenisHewan;
    protected int hasilProduksi;
    protected int hargaJual;
    protected int biayaPerawatan;

    public Hewan(String jenisHewan, int hasilProduksi, int hargaJual, int biayaPerawatan) {
        this.jenisHewan = jenisHewan;
        this.hasilProduksi = hasilProduksi;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public String getJenisHewan() {
        return jenisHewan;
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
