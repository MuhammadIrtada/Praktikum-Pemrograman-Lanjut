public abstract class Tanaman {
    protected int jumlahHektar;
	    protected double hasilProduksi;
	    protected double hargaJual;
	    protected double biayaPerawatan;

	    public Tanaman(int jumlahHektar, double hasilProduksi, double hargaJual, double biayaPerawatan) {
	        this.jumlahHektar = jumlahHektar;
	        this.hasilProduksi = hasilProduksi;
	        this.hargaJual = hargaJual;
	        this.biayaPerawatan = biayaPerawatan;
	    }

	    public abstract double hitungPendapatan();

	    public abstract double hitungBiayaPerawatan();

}
