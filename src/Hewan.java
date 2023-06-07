class Hewan {
    protected int jumlah;
    protected int hargaJual;
    protected int biayaPerawatan;

    public Hewan(int jumlah, int hargaJual, int biayaPerawatan) {
        this.jumlah = jumlah;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public int hitungPendapatan() {
        return jumlah * hargaJual * 30;
    }

    public int hitungBiayaPerawatan() {
        return jumlah * biayaPerawatan * 30;
    }
}