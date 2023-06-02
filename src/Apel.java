public class Apel extends Tanaman {
    private static final int JUMLAH_HARI = 30;

    public Apel(int jumlahHektar) {
        super(jumlahHektar, 40, 25000, 900000);
    }

    @Override
    public double hitungPendapatan() {
        return jumlahHektar * hasilProduksi * JUMLAH_HARI * hargaJual;
    }

    @Override
    public double hitungBiayaPerawatan() {
        return jumlahHektar * JUMLAH_HARI * biayaPerawatan;
    }
}
