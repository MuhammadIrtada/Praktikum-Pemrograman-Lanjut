public class Tanaman {
    private int jumlahHektar;
	    private int hargaBeli;
	    private int hasilPerHari;
	    private int hargaJual;
	    private int biayaPerawatan;

	    public Tanaman(int jumlahHektar, int hargaBeli, int hasilPerHari, int hargaJual, int biayaPerawatan) {
	        this.jumlahHektar = jumlahHektar;
	        this.hargaBeli = hargaBeli;
	        this.hasilPerHari = hasilPerHari;
	        this.hargaJual = hargaJual;
	        this.biayaPerawatan = biayaPerawatan;
	    }

	    public int getJumlahHektar() {
	        return jumlahHektar;
	    }

	    public int getHargaBeli() {
	        return hargaBeli;
	    }

	    public int getHasilPerHari() {
	        return hasilPerHari;
	    }

	    public int getHargaJual() {
	        return hargaJual;
	    }

	    public int getBiayaPerawatan() {
	        return biayaPerawatan;
	    }

	    public int hitungProfit() {
	        return (hasilPerHari * hargaJual) - biayaPerawatan;
	    }
}
