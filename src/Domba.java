class Domba extends Hewan {
    private static final int JUMLAH_BULU_HARIAN = 4;

    public Domba(int jumlah, int hargaJual, int biayaPerawatan) {
        super(jumlah, hargaJual, biayaPerawatan);
    }

    @Override
    public int hitungPendapatan() {
        return super.hitungPendapatan() * JUMLAH_BULU_HARIAN;
    }
}