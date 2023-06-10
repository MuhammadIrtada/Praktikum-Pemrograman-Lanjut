package praktikum_modul_06;

public class Domba extends Hewan{

	public Domba(int banyakEkor, int banyakProduk, int hargaEkor, int hargaProduk, int hargaRawat) {
		super(banyakEkor, banyakProduk, hargaEkor, hargaProduk, hargaRawat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getData() {
		System.out.printf("Jenis\t\t: %s\n", this.getClass().getSimpleName());
		System.out.printf("Jumlah\t\t: %d Ekor\n", banyakEkor);
		System.out.printf("Bulu/Ekor\t: %d kg\n", banyakProduk);
		System.out.printf("Total Bulu/Hari: %,d kg\n", getTotalProduk());
		System.out.printf("Harga Bulu/Kg: Rp. %,d\n", hargaProduk);
		System.out.printf("Profit/hari\t: %,d\n", getProfit());
	}
}
