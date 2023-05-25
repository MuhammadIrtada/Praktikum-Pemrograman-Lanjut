public class Hewan {
    protected int jumlah;
    protected int biayaPerawatan;
    protected int hasil;
    protected int hargaJual;

    public Hewan(int jumlah, int biayaPerawatan, int hasil, int hargaJual) {
        this.jumlah = jumlah;
        this.biayaPerawatan = biayaPerawatan;
        this.hasil = hasil;
        this.hargaJual = hargaJual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getBiayaPerawatan() {
        return biayaPerawatan;
    }

    public int getHasil() {
        return hasil;
    }

    public int getHargaJual() {
        return hargaJual;
    }
}
