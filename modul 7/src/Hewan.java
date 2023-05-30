abstract class Hewan {
    private int jumlahHewan;
    private int hasilProduksi;
    private int hargaProduksi;
    private int biayaPerawatan;

    public Hewan(int jumlahHewan, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        this.jumlahHewan = jumlahHewan;
        this.hasilProduksi = hasilProduksi;
        this.hargaProduksi = hargaProduksi;
        this.biayaPerawatan = biayaPerawatan;
    }

    public abstract String getJenisHewan();

    public int hitungPendapatan() {
        return jumlahHewan * hasilProduksi * hargaProduksi * 30;
    }

    public int hitungBiayaPerawatan() {
        return jumlahHewan * biayaPerawatan * 30;
    }
}