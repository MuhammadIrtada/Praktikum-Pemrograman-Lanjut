abstract class Tanaman {
    private int luasTanaman;
    private int hasilProduksi;
    private int hargaProduksi;
    private int biayaPerawatan;

    public Tanaman(int luasTanaman, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        this.luasTanaman = luasTanaman;
        this.hasilProduksi = hasilProduksi;
        this.hargaProduksi = hargaProduksi;
        this.biayaPerawatan = biayaPerawatan;
    }

    public abstract String getJenisTanaman();

    public int hitungPendapatan() {
        return luasTanaman * hasilProduksi * hargaProduksi * 30;
    }

    public int hitungBiayaPerawatan() {
        return luasTanaman * biayaPerawatan * 30;
    }
}