class Unta extends Hewan {
    private static final int JUMLAH_HARI = 30;

    public Unta(int jumlah) {
        super(jumlah, 60000, 200000);
    }

    @Override
    public double hitungPendapatan() {
        return jumlah * 5 * JUMLAH_HARI * hargaJual;
    }

    @Override
    public double hitungBiayaPerawatan() {
        return jumlah * JUMLAH_HARI * biayaPerawatan;
    }
}
