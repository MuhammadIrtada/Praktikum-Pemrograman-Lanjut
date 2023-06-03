public class KelapaSawit extends Tanaman {
    private static final int JUMLAH_HARI = 30;

    public KelapaSawit(int jumlahHektar) {
        super(jumlahHektar, 500, 18000, 8500000);
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
