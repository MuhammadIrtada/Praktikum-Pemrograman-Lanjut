package praktikum_modul08;

import java.util.Scanner;

public class Aplikasi {
	Bebek bebek = new Bebek("Bebek", 15, 110000);
	Domba domba = new Domba("Domba", 4, 2450000);
	Unta unta = new Unta("Unta", 3, 12000000);
	Apel apel = new Apel("Apel", 5, 7500000);
	Kelapa_Sawit kelapa = new Kelapa_Sawit("Kelapa Sawit", 6, 18000000);
	Behaviour[] list = {bebek, domba, unta, apel, kelapa};
	Scanner scanner = new Scanner(System.in);
	
	public void StartApp() {
		boolean status = true;
		int opsi = 0;
		while(status) {
			opsi = 0;
			System.out.println("1. Informasi Peternakan dan Perkebunan");
			System.out.println("2. Pembelian Hewan Ternak");
			System.out.println("3. Pembelian Tanah Perkebunan");
			System.out.println("4. Exit");
			System.out.print("Masukkan pilihan menu: ");
			opsi = scanner.nextInt();
			switch (opsi) {
			case 1: OpsiPertama(); break;
			case 2: OpsiKedua(); break;
			case 3: OpsiKetiga(); break;
			case 4: status = false; break;
			default: System.out.println("Pilihan tidak tersedia!"); break;
			}
		}
		System.out.println("Terima kasih telah menggunakan Aplikasi ini!");
	}
	
	void OpsiPertama() {
		System.out.println("=".repeat(40));
		System.out.printf("%37s\n", "Informasi Peternakan dan Perkebunan");
		System.out.println("=".repeat(40));
		for(Behaviour behaviour: list) {
			System.out.print(behaviour.getData());
		}
		System.out.println("\n");
	}
	void OpsiKedua() {
		int nomor = 1;
		System.out.println("=".repeat(40));
		System.out.printf("%30s\n", "Pembelian Hewan Ternak");
		System.out.println("=".repeat(40));
		for(Behaviour behaviour: list) {
			if(behaviour.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Hewan"))
			System.out.printf("%d. %s\n", nomor, behaviour.getNama());
			nomor++;
		}
		System.out.print("Masukkan pilihan hewan(nomor): ");
		int pilihan = 0;
		do{
			pilihan = scanner.nextInt();
			if(!(pilihan <= 3 && pilihan > 0)) System.out.print("pilihan tidak tersedia\nSilahkan pilih kembali! ");
		}while(!(pilihan<=3 && pilihan>0));
		System.out.print("Masukkan banyak hewan: ");
		int banyak = scanner.nextInt();
		System.out.println("\n"+"=".repeat(40));
		System.out.printf("%33s\n", "Nota Pembelian Hewan Ternak");
		System.out.println("=".repeat(40));
		Behaviour opsi = list[pilihan-1];
		System.out.printf("%-15s x(%d) : Rp %,d\n\n", opsi.getNama(), banyak, opsi.totalHarga(banyak));
		opsi.tambahUnit(banyak);
		System.out.println("\n"+"=".repeat(40));
		System.out.printf("%33s\n", "Informasi Peternakan Sekarang");
		System.out.println("=".repeat(40));
		for(Behaviour behaviour: list) {
			if(behaviour.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Hewan")) 
			System.out.print(behaviour.getData());
		}
	}
	void OpsiKetiga() {
		int nomor = 1;
		System.out.println("=".repeat(40));
		System.out.printf("%34s\n", "Pembelian Tanah Perkebunan");
		System.out.println("=".repeat(40));
		for(Behaviour behaviour: list) {
			if(behaviour.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Tumbuhan")) {
				System.out.printf("%d. %s\n", nomor, behaviour.getNama());
				nomor++;
			}
		}
		System.out.print("Masukkan pilihan kebun (nomor): ");
		int pilihan = 0;
		do{
			pilihan = scanner.nextInt();
			if(!(pilihan <= 2 && pilihan > 0)) System.out.print("pilihan tidak tersedia\nSilahkan pilih kembali! ");
		}while(!(pilihan<=2 && pilihan>0));
		System.out.print("Masukkan luas tanah: ");
		int banyak = scanner.nextInt();
		System.out.println("\n"+"=".repeat(40));
		System.out.printf("%36s\n", "Nota Pembelian Tanah Perkebunan");
		System.out.println("=".repeat(40));
		Behaviour opsi = list[pilihan+2];
		System.out.printf("%-15s x(%d) : Rp %,d\n\n", opsi.getNama(), banyak, opsi.totalHarga(banyak));
		opsi.tambahUnit(banyak);
		System.out.println("\n"+"=".repeat(40));
		System.out.printf("%35s\n", "Informasi Perkebunan Sekarang");
		System.out.println("=".repeat(40));
		for(Behaviour behaviour: list) {
			if(behaviour.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Tumbuhan")) 
			System.out.print(behaviour.getData());
		}
	}
}