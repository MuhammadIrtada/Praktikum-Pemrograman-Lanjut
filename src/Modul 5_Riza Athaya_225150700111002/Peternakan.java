import java.util.Scanner;

public class Peternakan {
	static HewanHewan Bebek;
	static HewanHewan Domba;
	static HewanHewan Unta;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bebek = new HewanHewan("Bebek", "Telur Biasa", 15, 2, 2000);
		Domba = new HewanHewan("Domba", "Bulu Hitam", 4, 4, 15000);
		Unta = new HewanHewan("Unta", "Susu Putih", 3, 5, 60000);
		HewanHewan[] semua = { Bebek, Domba, Unta };
		final int ppn = 10;
		boolean loop = true;
		do {
			System.out.println(
					"Menu:\n1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit\n");
			System.out.print("Masukkan Menu Anda : ");
			int pilihan = input.nextInt();
			switch (pilihan) {
			case 1:
				getAll(semua);
				break;
			case 2:
				getAll2(semua);
				break;
			case 3:
				getAll3(semua, ppn);
				break;
			case 4:
				loop = false;
				break;
			}
		} while (loop);
		System.out.println(" Sekian terimakasih!\n Hope you enjoy ^^");
	}

	static void getAll(HewanHewan[] semua) {
		for (int i = 0; i < HewanHewan.total; i++) {
			semua[i].getDetail();
		}
		System.out.println("=".repeat(40));
	}

	static void getAll2(HewanHewan[] semua) {
		int total = 0;
		System.out.println("=".repeat(40));
		for (int i = 0; i < HewanHewan.total; i++) {
			semua[i].getDetailPemasukan();
			total += semua[i].getPemasukan();
		}
		System.out.printf("%-15s : %s\n", "Total Pemasukan", "Rp " + total);
		System.out.println("=".repeat(40));
	}

	static void getAll3(HewanHewan[] semua, int ppn) {
		int total = 0;
		System.out.println("=".repeat(40));
		for (int i = 0; i < HewanHewan.total; i++) {
			semua[i].getDetailPemasukanPPN(ppn);
			total += semua[i].getHargaPPN(ppn);
		}
		System.out.printf("%-15s : %s\n", "Total Pemasukan", "Rp " + total);
		System.out.println("=".repeat(40));
	}

}
