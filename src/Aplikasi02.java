package praktikum_modul_06;

import java.util.ArrayList;
import java.util.Scanner;


public class Aplikasi02 {
	Hewan bebek = new Bebek(15, 2, 110000, 2000, 3000);
	Hewan unta = new Unta(3, 5, 12000000, 60000, 200000);
	Hewan domba = new Domba(4, 4, 2450000, 15000, 45000);
	Tumbuhan apel = new Apel(5, 40, 7500000, 25000, 900000);
	Tumbuhan sawit = new Kelapa_Sawi(6, 500, 18000000, 18000, 8500000);
	ArrayList<Hewan> hewan = new ArrayList<Hewan>();
	ArrayList<Tumbuhan> tumbuhan = new ArrayList<Tumbuhan>();
	
	public void StartApp() {
		hewan.add(bebek);
		hewan.add(unta);
		hewan.add(domba);
		tumbuhan.add(apel);
		tumbuhan.add(sawit);
		Scanner input = new Scanner(System.in);
		boolean start = true;
		int pilihan;
		while(start) {
			System.out.println("1. Peternakan");
			System.out.println("2. Perkebunan");
			System.out.println("3. Budgeting");
			System.out.println("4. Exit");
			System.out.print("Masukkan pilihan menu: ");
			pilihan = input.nextInt();
			switch(pilihan) {
				case 1 : OpsiPertama();
						 break;
				case 2 : OpsiKedua();
						 break;
				case 3 : OpsiKetiga();
						 break;
				case 4 : start = false;
						 break;
				default: System.out.println("Pilihan tidak tersedia!");
						 break;
			}
		}
		System.out.println("Terima kasih telah menggunakan aplikasi ini!");
	}
	int getHargaHewan(boolean dapetProfit, boolean print) {
		int profit;
		int total = 0;
		for(Hewan anggota : hewan) {
			if(anggota instanceof Bebek) {
				Bebek _bebek = (Bebek)anggota;
				if(dapetProfit) profit = _bebek.getProfit()*30;
				else profit = _bebek.getHargaRawat()*30;
				if(print)System.out.printf("%-30s Rp %,d\n", _bebek.getClass().getSimpleName(), profit);
				total += profit;
			}
			if(anggota instanceof Unta) {
				Unta _unta = (Unta)anggota;
				if(dapetProfit) profit = _unta.getProfit()*30;
				else profit = _unta.getHargaRawat()*30;
				if(print)System.out.printf("%-30s Rp %,d\n", _unta.getClass().getSimpleName(), profit);
				total += profit;
			}
			if(anggota instanceof Domba) {
				Domba _domba = (Domba)anggota;
				if(dapetProfit) profit = _domba.getProfit()*30;
				else profit = _domba.getHargaRawat()*30;
				if(print)System.out.printf("%-30s Rp %,d\n", _domba.getClass().getSimpleName(), profit);
				total += profit;
			}
		} return total;
	}
	int getHargaTumbuhan(boolean dapetProfit, boolean print) {
		int profit;
		int total = 0;
		for(Tumbuhan anggota : tumbuhan) {
			if(anggota instanceof Apel) {
				Apel _bebek = (Apel)anggota;
				if(dapetProfit) profit = _bebek.getProfit()*30;
				else profit = _bebek.getHargaRawat()*30;
				if(print)System.out.printf("%-30s Rp %,d\n", _bebek.getClass().getSimpleName(), profit);
				total += profit;
			}
			if(anggota instanceof Kelapa_Sawi) {
				Kelapa_Sawi _unta = (Kelapa_Sawi)anggota;
				if(dapetProfit) profit = _unta.getProfit()*30;
				else profit = _unta.getHargaRawat()*30;
				if(print)System.out.printf("%-30s Rp %,d\n", _unta.getClass().getSimpleName(), profit);
				total += profit;
			}
		} return total;
	}
	void OpsiPertama() {
		int total = 0;
		int profit;
		System.out.println("=".repeat(50));
		System.out.printf("%40s\n","Pendapatan Penjualan Hasil Ternak");
		System.out.println("=".repeat(50));
		total = getHargaHewan(true,true);
		System.out.println("-".repeat(50));
		System.out.printf("%-30s: Rp %,d\n\n","Total: ", total);
		total = 0;
		System.out.println("=".repeat(50));
		System.out.printf("%30s\n","Biaya Perawatan");
		System.out.println("=".repeat(50));
		total = getHargaHewan(false,true);
		System.out.println("-".repeat(50));
		System.out.printf("%-30s: Rp %,d\n\n","Total: ", total);
	}
	void OpsiKedua() {
		int total = 0;
		int profit;
		System.out.println("=".repeat(50));
		System.out.printf("%40s\n","Pendapatan Penjualan Hasil Kebun");
		System.out.println("=".repeat(50));
		total = getHargaTumbuhan(true,true);
		System.out.println("-".repeat(50));
		System.out.printf("%-30s: Rp %,d\n\n","Total", total);
		total = 0;
		System.out.println("=".repeat(50));
		System.out.printf("%30s\n","Biaya Perawatan");
		System.out.println("=".repeat(50));
		total = getHargaTumbuhan(false,true);
		System.out.println("-".repeat(50));
		System.out.printf("%-30s: Rp %,d\n\n","Total", total);
	}
	void OpsiKetiga() {
		int totalProfit = 0;
		int totalRawat = 0;
		int uang = 0;
		System.out.println("=".repeat(50));
		System.out.printf("%35s\n","Pendapatan per Bulan");
		System.out.println("=".repeat(50));
		uang = getHargaHewan(true,false);
		System.out.printf("%-30s Rp %,d\n","Ternak: ", uang);
		totalProfit += uang;
		uang = getHargaTumbuhan(true,false);
		System.out.printf("%-30s Rp %,d\n","Kebun: ", uang);
		totalProfit += uang;
		System.out.println("-".repeat(50));
		System.out.printf("%-30s Rp %,d\n\n", "Total: ", totalProfit);
		System.out.println("=".repeat(50));
		System.out.printf("%35s\n","Perawatan per Bulan");
		System.out.println("=".repeat(50));
		uang = getHargaHewan(false,false);
		System.out.printf("%-30s Rp %,d\n","Ternak: ", uang);
		totalRawat += uang;
		uang = getHargaTumbuhan(false,false);
		System.out.printf("%-30s Rp %,d\n","Kebun: ", uang);
		totalRawat += uang;
		System.out.println("-".repeat(50));
		System.out.printf("%-30s Rp %,d\n\n", "Total: ", totalRawat);
		System.out.println("=".repeat(50));
		System.out.printf("%35s\n","Biaya sehari-hari");
		System.out.println("=".repeat(50));
		System.out.printf("%-30s Rp %,d\n", "Pendapatan: ", totalProfit);
		System.out.printf("%-30s Rp %,d\n", "Perawatan: ", totalRawat);
		System.out.println("-".repeat(50));
		System.out.printf("%-30s Rp %,d\n", "Total: ", totalProfit-totalRawat);
	}
}
