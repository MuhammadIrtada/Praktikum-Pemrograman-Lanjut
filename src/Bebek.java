public class Bebek extends Hewan {
    private static final int JUMLAH_HARI = 30;

	    public Bebek(int jumlah) {
	        super(jumlah, 2000, 3000);
	    }

	    @Override
	    public double hitungPendapatan() {
	        return jumlah * 2 * JUMLAH_HARI * hargaJual;
	    }

	    @Override
	    public double hitungBiayaPerawatan() {
	        return jumlah * JUMLAH_HARI * biayaPerawatan;
	    }
}
