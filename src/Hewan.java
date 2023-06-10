package praktikum_modul_06;

public class Hewan {
	protected int banyakEkor;
	protected int banyakProduk;
	protected int hargaEkor;
	protected int hargaProduk;
	protected int hargaRawat;
	public Hewan(int banyakEkor, int banyakProduk, int hargaEkor, int hargaProduk, int hargaRawat) {
		this.banyakEkor = banyakEkor;
		this.banyakProduk = banyakProduk;
		this.hargaEkor = hargaEkor;
		this.hargaProduk = hargaProduk;
		this.hargaRawat = hargaRawat;
	}
	public int getTotalProduk() {
		return banyakEkor*banyakProduk;
	}
	public int getProfit() {
		return getTotalProduk() * hargaProduk;
	}
	public int getTotalBiaya(int jumlah) {
		return hargaEkor * jumlah;
	}
	public int getHargaRawat() {
		return hargaRawat * banyakEkor;
	}
	public void tambarEkor(int tambahan) {
		banyakEkor += tambahan;
	}
	public void getData() {
		System.out.printf("Jenis\t\t: %s\n", this.getClass().getSimpleName());
		System.out.printf("Jumlah\t\t: %d Ekor\n", banyakEkor);
		System.out.printf("Produk/Ekor\t: %d Unit\n", banyakProduk);
		System.out.printf("Total Produk/Hari: %,d Unit\n", getTotalProduk());
		System.out.printf("Harga Produk/Unit: Rp. %,d\n", hargaProduk);
		System.out.printf("Profit/hari\t: %,d\n", getProfit());
	}
	public String getHargaHewan() {
		return String.format("Ternak %s (Rp. %,d/ekor)\n", this.getClass().getSimpleName(), hargaEkor);
	}
	public String transaksiHewan(int jumlah) {
		return String.format("-".repeat(25) + "\nDeskripsi\t\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp.%,d\nTotal Biaya\t: Rp. %,d\n", 
				this.getClass().getSimpleName(), jumlah, hargaEkor, getTotalBiaya(jumlah));
	}
}
