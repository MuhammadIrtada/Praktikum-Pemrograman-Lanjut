class Bebek extends Hewan {
    private static final int JUMLAH_TELUR_HARIAN = 2;

    public Bebek(int jumlah, int hargaJual, int biayaPerawatan) {
        super(jumlah, hargaJual, biayaPerawatan);
    }

    @Override
    public int hitungPendapatan() {
        return super.hitungPendapatan() * JUMLAH_TELUR_HARIAN;
    }
}