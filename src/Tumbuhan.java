package praktikum_modul_06;

public class Tumbuhan {
	protected int luasKebun;
	protected int banyakProduk;
	protected int hargaKebun;
	protected int hargaProduk;
	protected int hargaRawat;
	public Tumbuhan(int luasKebun, int banyakProduk, int hargaKebun, int hargaProduk, int hargaRawat) {
		this.luasKebun = luasKebun;
		this.banyakProduk = banyakProduk;
		this.hargaKebun = hargaKebun;
		this.hargaProduk = hargaProduk;
		this.hargaRawat = hargaRawat;
	}
	public int getTotalProduk() {
		return luasKebun*banyakProduk;
	}
	public int getProfit() {
		return getTotalProduk() * hargaProduk;
	}
	public int getHargaKebun() {
		return hargaKebun;
	}
	public int getHargaRawat() {
		return hargaRawat*luasKebun;
	}
	public int getTotalBiaya(int jumlah) {
		return hargaKebun * jumlah;
	}
	public void tambahLuas(int tambahan) {
		luasKebun += tambahan;
	}
	public void getData() {
		System.out.printf("Jenis\t\t: %s\n", this.getClass().getSimpleName());
		System.out.printf("Luas\t\t: %d Hektar\n", luasKebun);
		System.out.printf("Produk/Hektar\t: %d Unit\n", banyakProduk);
		System.out.printf("Total Buah/Hari: %,d Unit\n", getTotalProduk());
		System.out.printf("Harga Buah/kg: Rp. %,d\n", hargaProduk);
		System.out.printf("Profit/hari\t: %,d\n", getProfit());
	}
	public String getHargaTumbuhan() {
		return String.format("Ternak %s (Rp. %,d/ekor)\n", this.getClass().getSimpleName(), hargaKebun);
	}
	public String transaksiTumbuhan(int jumlah) {
		return String.format("-".repeat(25) + "\nDeskripsi\t\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp.%,d\nTotal Biaya\t: Rp. %,d\n", 
				this.getClass().getSimpleName(), jumlah, hargaKebun, getTotalBiaya(jumlah));
	}
}
