public abstract class Tanaman {
    protected String jenisTanaman;
    protected int jumlahTanaman;
    protected int hargaBeli;
    protected int hasilProduksi;
    protected int hargaProduksi;

    public Tanaman(String jenisTanaman, int jumlahTanaman, int hargaBeli, int hasilProduksi, int hargaProduksi) {
        this.jenisTanaman = jenisTanaman;
        this.jumlahTanaman = jumlahTanaman;
        this.hargaBeli = hargaBeli;
        this.hasilProduksi = hasilProduksi;
        this.hargaProduksi = hargaProduksi;
    }

    public String getJenisTanaman() {
        return jenisTanaman;
    }

    public int getJumlahTanaman() {
        return jumlahTanaman;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public int getHasilProduksi() {
        return hasilProduksi;
    }

    public int getHargaProduksi() {
        return hargaProduksi;
    }

    public abstract int hitungProfit();
}