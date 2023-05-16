package praktikum_modul_06;

public class Bebek extends Hewan{

	public Bebek(int banyakEkor, int banyakProduk, int hargaEkor, int hargaProduk, int hargaRawat) {
		super(banyakEkor, banyakProduk, hargaEkor, hargaProduk, hargaRawat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getData() {
		System.out.printf("Jenis\t\t: %s\n", this.getClass().getSimpleName());
		System.out.printf("Jumlah\t\t: %d Ekor\n", banyakEkor);
		System.out.printf("Telur/Ekor\t: %d butir\n", banyakProduk);
		System.out.printf("Total Telur/Hari: %,d butir\n", getTotalProduk());
		System.out.printf("Harga Telur/Butir: Rp. %,d\n", hargaProduk);
		System.out.printf("Profit/hari\t: %,d\n", getProfit());
	}
}
