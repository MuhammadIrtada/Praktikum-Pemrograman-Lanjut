package praktikum_modul_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplikasi {
	Bebek bebek = new Bebek(15, 2, 110000, 2000, 3000);
	Unta unta = new Unta(3, 5, 2450000, 60000, 200000);
	Domba domba = new Domba(4, 4, 12000000, 15000, 45000);
	Apel apel = new Apel(5, 40, 7500000, 25000, 900000);
	Kelapa_Sawi sawi = new Kelapa_Sawi(6, 500, 18000000, 18000, 8500000);
	ArrayList<Hewan> daftarHewan = new ArrayList<Hewan>();
	ArrayList<Tumbuhan> daftarTumbuhan = new ArrayList<Tumbuhan>();
	int uang = 25000000;
	int countertransaksi = 0;
	ArrayList<String> transaksi = new ArrayList<String>();
	public void StartApp() {
		Scanner input = new Scanner(System.in);
		daftarHewan.add(bebek);
		daftarHewan.add(domba);
		daftarHewan.add(unta);
		daftarTumbuhan.add(apel);
		daftarTumbuhan.add(sawi);
		Hewan hewan = new Hewan(3, 5, 2450000, 60000, 200000);
		boolean status = true;
		int pilihan = 0;
		
		while(status) {
			System.out.println("Menu:");
			System.out.println("1. Tampilkan Informasi Peternakan dan Perkebunan");
			System.out.println("2. Membeli Ternak atau Kebun");
			System.out.println("3. History Transaksi");
			System.out.println("0. Exit");
			System.out.print("Masukkan Menu Anda:");
			pilihan = input.nextInt();
			switch(pilihan) {
			case 0: status = false;
					break;
			case 1: OpsiPertama();
					break;
			case 2: while(pilihan!=0) {
						int opsiUnit = 0;
						int banyakUnit = 0;
						OpsiKedua();
						opsiUnit = input.nextInt();
						if(opsiUnit == 0) break;
						while(!(opsiUnit >= 0 && opsiUnit <=5)) {
							System.out.println("Pilihan tidak tersedia!");
							opsiUnit = input.nextInt();
						}
						System.out.println("=".repeat(25));
						System.out.print("Berapa Unit yang Akan Anda Beli? ");
						banyakUnit = input.nextInt();
						System.out.println("=".repeat(25));
						if(uang >= getHarga(opsiUnit, banyakUnit) && countertransaksi <= 10) {
							uang -= getHarga(opsiUnit, banyakUnit);
							TambahUnit(opsiUnit,banyakUnit);
							System.out.println("Transaksi Berhasil!");
							transaksi.add(getTransaksi(opsiUnit, banyakUnit));
							countertransaksi++;
						}
						else {
							if(uang < getHarga(opsiUnit, banyakUnit)) System.out.println("Uang kas tidak mencukupi!");
							if(countertransaksi > 10)System.out.println("Transaksi Gagal!");
						}
					}
					break;
			case 3 :if(transaksi.size() == 0) {
						System.out.println("Belum ada Transaksi!");
					}
					else {
						for(int counter = 0; counter < transaksi.size(); counter++ ) {
						 	 System.out.println("=".repeat(25));
						 	 System.out.printf("Transaksi %d\n", counter+1);
						 	 System.out.println(transaksi.get(counter));
						 	 System.out.println("=".repeat(25));
						}
					}
					break;
			}
		}
		System.out.println("Terima kasih telah menggunakan aplikasi ini!");
	}
	void OpsiPertama() {
		for(int counter = 0; counter<daftarHewan.size();counter++) {
			System.out.println("=".repeat(25));
			daftarHewan.get(counter).getData();
		}
		for(int counter = 0; counter<daftarTumbuhan.size();counter++) {
			System.out.println("=".repeat(25));
			daftarTumbuhan.get(counter).getData();
		}
		System.out.println("=".repeat(25));
		System.out.printf("Uang kas Anda saat ini: %,d\n", uang);
		System.out.println("=".repeat(25));
	}
	void OpsiKedua() {
		int urutan = 1;
		System.out.println("=".repeat(25));
		for(int counter = 0; counter<daftarHewan.size();counter++) {
			System.out.printf("%d. %s \n",urutan, daftarHewan.get(counter).getHargaHewan());
			urutan++;
		}
		for(int counter = 0; counter<daftarTumbuhan.size();counter++) {
			System.out.printf("%d. %s \n", urutan, daftarTumbuhan.get(counter).getHargaTumbuhan());
			urutan++;
		}
		System.out.println("0. Kembali ke Menu Utama");
		System.out.print("Masukkan Menu Anda: ");
	}
	int getHarga(int opsi, int jumlah) {
		switch(opsi) {
		case 1: return bebek.getTotalBiaya(jumlah);
		case 2: return domba.getTotalBiaya(jumlah);
		case 3: return unta.getTotalBiaya(jumlah);
		case 4: return apel.getTotalBiaya(jumlah);
		case 5: return sawi.getTotalBiaya(jumlah);
		default: return 0;
		}
	}
	String getTransaksi(int opsi, int jumlah) {
		switch(opsi) {
			case 1: return bebek.transaksiHewan(jumlah);
			case 2: return domba.transaksiHewan(jumlah);
			case 3: return unta.transaksiHewan(jumlah);
			case 4: return apel.transaksiTumbuhan(jumlah);
			case 5: return sawi.transaksiTumbuhan(jumlah);
			default: return "";
		}
	}
	void TambahUnit(int opsi, int jumlah) {
		switch(opsi) {
			case 1: bebek.tambarEkor(jumlah); break; 
			case 2: domba.tambarEkor(jumlah); break; 
			case 3: unta.tambarEkor(jumlah); break; 
			case 4: apel.tambahLuas(jumlah); break; 
			case 5: sawi.tambahLuas(jumlah); break; 
		}
	}
}
