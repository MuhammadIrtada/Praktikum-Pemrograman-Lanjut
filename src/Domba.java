class Domba extends Hewan {
    private static final int JUMLAH_HARI = 30;

    public Domba(int jumlah) {
        super(jumlah, 15000, 45000);
    }

    @Override
    public double hitungPendapatan() {
        return jumlah * 4 * JUMLAH_HARI * hargaJual;
    }

    @Override
    public double hitungBiayaPerawatan() {
        return jumlah * JUMLAH_HARI * biayaPerawatan;
    }
}
