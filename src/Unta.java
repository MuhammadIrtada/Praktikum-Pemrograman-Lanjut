package praktikum_modul_06;

public class Unta extends Hewan {

	public Unta(int banyakEkor, int banyakProduk, int hargaEkor, int hargaProduk, int hargaRawat) {
		super(banyakEkor, banyakProduk, hargaEkor, hargaProduk, hargaRawat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getData() {
		System.out.printf("Jenis\t\t: %s\n", this.getClass().getSimpleName());
		System.out.printf("Jumlah\t\t: %d Ekor\n", banyakEkor);
		System.out.printf("Susu/Ekor\t: %d liter\n", banyakProduk);
		System.out.printf("Total Susu/Hari: %,d liter\n", getTotalProduk());
		System.out.printf("Harga Susu/liter: Rp. %,d\n", hargaProduk);
		System.out.printf("Profit/hari\t: %,d\n", getProfit());
	}
}
