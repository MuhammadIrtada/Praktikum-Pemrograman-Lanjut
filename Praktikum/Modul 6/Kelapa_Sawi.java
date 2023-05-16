package praktikum_modul_06;

public class Kelapa_Sawi extends Tumbuhan {

	public Kelapa_Sawi(int luasKebun, int banyakProduk, int hargaKebun, int hargaProduk, int hargaRawat) {
		super(luasKebun, banyakProduk, hargaKebun, hargaProduk, hargaRawat);
		// TODO Auto-generated constructor stub
	}
	public void getData() {
		System.out.printf("Jenis\t\t: %s\n", this.getClass().getSimpleName());
		System.out.printf("Luas\t\t: %d Hektar\n", luasKebun);
		System.out.printf("Minyak/Hektar\t: %d Kg\n", banyakProduk);
		System.out.printf("Total Minyak/Hari: %,d Kg\n", getTotalProduk());
		System.out.printf("Harga Minyak/kg: Rp. %,d\n", hargaProduk);
		System.out.printf("Profit/hari\t: %,d\n", getProfit());
	} 
}
