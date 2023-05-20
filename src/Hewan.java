public class Hewan {
    private int jumlah;
	    private int hargaBeli;
	    private int hasilPerHari;
	    private int hargaJual;
	    private int biayaPerawatan;

	    public Hewan(int jumlah, int hargaBeli, int hasilPerHari, int hargaJual, int biayaPerawatan) {
	        this.jumlah = jumlah;
	        this.hargaBeli = hargaBeli;
	        this.hasilPerHari = hasilPerHari;
	        this.hargaJual = hargaJual;
	        this.biayaPerawatan = biayaPerawatan;
	    }

	    public int getJumlah() {
	        return jumlah;
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
