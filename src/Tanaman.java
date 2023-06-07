class Tanaman {
    protected int hektar;
    protected int hasilHarian;
    protected int hargaJual;
    protected int biayaPerawatan;

    public Tanaman(int hektar, int hasilHarian, int hargaJual, int biayaPerawatan) {
        this.hektar = hektar;
        this.hasilHarian = hasilHarian;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public int hitungPendapatan() {
        return hektar * hasilHarian * hargaJual * 30;
    }

    public int hitungBiayaPerawatan() {
        return hektar * biayaPerawatan * 30;
    }
}