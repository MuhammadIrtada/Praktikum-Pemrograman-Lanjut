class Unta extends Hewan {
    private static final int JUMLAH_SUSU_HARIAN = 5;

    public Unta(int jumlah, int hargaJual, int biayaPerawatan) {
        super(jumlah, hargaJual, biayaPerawatan);
    }

    @Override
    public int hitungPendapatan() {
        return super.hitungPendapatan() * JUMLAH_SUSU_HARIAN;
    }
}