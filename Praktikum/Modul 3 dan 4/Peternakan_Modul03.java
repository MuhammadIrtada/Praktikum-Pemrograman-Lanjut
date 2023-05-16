package pemlanpraktikum_modul03;

public class Peternakan_Modul03 {

	public static void main(String[] args) {
		Hewan bebek01 = new Hewan("Bebek",15, 4, "telur biasa", 5, 2.5f);
		Hewan bebek02 = new Hewan("Bebek", 10, 5, "telur asin", 8, 2.5f);
		Hewan unta01 = new Hewan("Unta",3, 1, "susu putih", 10, 3.5f);
		Hewan unta02 = new Hewan("Unta", 4, 3, "susu coklat", 15, 3.5f);
		Hewan domba01 = new Hewan("Domba", 4, 2, "bulu hitam", 9, 1.5f);
		Hewan domba02 = new Hewan("Domba", 6, 1, "bulu putih", 14, 1.5f);
		System.out.println(bebek01.displayData());
		System.out.println(bebek02.displayData());
		System.out.println(unta01.displayData());
		System.out.println(unta02.displayData());
		System.out.println(domba01.displayData());
		System.out.println(domba02.displayData());
	}

}
