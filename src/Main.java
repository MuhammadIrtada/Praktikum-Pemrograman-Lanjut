import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Transaksi> transaksiList = new ArrayList<>();
	private static int kas = 25000000;
	private static int transaksiCount = 0;
	
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
		
		while (true) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Peternakan dan Perkebunan");
            System.out.println("3. History Transaksi");
            System.out.println("4. Exit Program");
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanInformasi();
                    break;
                case 2:
                    if (transaksiCount >= 10) {
                        System.out.println("Transaksi gagal. Sudah mencapai batas transaksi.");
                    } else {
                        beliHewanAtauTanaman(scanner);
                    }
                    break;
                case 3:
                    tampilkanHistoryTransaksi();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program dihentikan.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        }
    }

    private static void tampilkanInformasi() {
        System.out.println("--- Informasi Peternakan dan Perkebunan ---");

        // Peternakan
        Bebek bebek = new Bebek(15);
        Unta unta = new Unta(3);
        Domba domba = new Domba(4);
        
        
        System.out.println("Jumlah Bebek: " + bebek.getJumlah());
        System.out.println("Jumlah Unta: " + unta.getJumlah());
        System.out.println("Jumlah Domba: " + domba.getJumlah());

        int totalHasilPeternakan = (bebek.getHasilPerHari() * bebek.getJumlah())
                + (unta.getHasilPerHari() * unta.getJumlah())
                + (domba.getHasilPerHari() * domba.getJumlah());
        System.out.println("Total Hasil Peternakan: " + totalHasilPeternakan);

        int totalHargaPeternakan = (bebek.getHargaJual() * bebek.getHasilPerHari() * bebek.getJumlah())
                + (unta.getHargaJual() * unta.getHasilPerHari() * unta.getJumlah())
                + (domba.getHargaJual() * domba.getHasilPerHari() * domba.getJumlah());
        System.out.println("Total Harga Peternakan: " + totalHargaPeternakan);
        
        int totalProfitPeternakan = bebek.hitungProfit() + unta.hitungProfit() + domba.hitungProfit();
        System.out.println("Total Profit Peternakan: " + totalProfitPeternakan);

        // Perkebunan
        Apel apel = new Apel(5);
        Kelapa_Sawit kelapaSawit = new Kelapa_Sawit(6);

        System.out.println("Jumlah Hektar Apel: " + apel.getJumlahHektar());
        System.out.println("Jumlah Hektar Kelapa Sawit: " + kelapaSawit.getJumlahHektar());

        int totalHasilPerkebunan = (apel.getHasilPerHari() * apel.getJumlahHektar())
                + (kelapaSawit.getHasilPerHari() * kelapaSawit.getJumlahHektar());
        System.out.println("Total Hasil Perkebunan: " + totalHasilPerkebunan);

        int totalHargaPerkebunan = (apel.getHargaJual() * apel.getHasilPerHari() * apel.getJumlahHektar())
                + (kelapaSawit.getHargaJual() * kelapaSawit.getHasilPerHari() * kelapaSawit.getJumlahHektar());
        System.out.println("Total Harga Perkebunan: " + totalHargaPerkebunan);

        int totalProfitPerkebunan = apel.hitungProfit() + kelapaSawit.hitungProfit();
        System.out.println("Total Profit Perkebunan: " + totalProfitPerkebunan);

        // Jumlah Kas
        System.out.println("Jumlah Kas saat ini: " + kas);
	}
    
    	private static void beliHewanAtauTanaman(Scanner scanner) {
        System.out.println("--- Pembelian Peternakan dan Perkebunan ---");
        System.out.println("Pilih jenis yang ingin dibeli:");
        System.out.println("1. Hewan");
        System.out.println("2. Tanaman");
        System.out.print("Masukkan pilihan (1-2): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            beliHewan(scanner);
        } else if (pilihan == 2) {
            beliTanaman(scanner);
        } else {
            System.out.println("Pilihan tidak valid. Transaksi gagal.");
        }	
    }
    	
    	private static void beliHewan(Scanner scanner) {
    	    System.out.println("Pilih jenis hewan yang ingin dibeli:");
    	    System.out.println("1. Bebek");
    	    System.out.println("2. Unta");
    	    System.out.println("3. Domba");
    	    System.out.print("Masukkan pilihan (1-3): ");
    	    int pilihan = scanner.nextInt();

    	    int harga, jumlah;
    	    String jenis = "";
    	    switch (pilihan) {
    	        case 1:
    	            harga = 110000;
    	            jenis = "Bebek";
    	            System.out.print("Masukkan jumlah yang ingin dibeli: ");
    	            jumlah = scanner.nextInt();
    	            	if (kas >= harga * jumlah) {
    	            		transaksiCount++;
    	            		kas -= harga * jumlah;
    	            		Bebek bebek = new Bebek(jumlah);
    	            		transaksiList.add(new Transaksi("Hewan", jenis, jumlah, harga * jumlah));
    	            		System.out.println("Transaksi berhasil. Anda telah membeli " + jumlah + " ekor Bebek.");
    	            	} else {
    	            		System.out.println("Kas tidak mencukupi. Transaksi gagal.");
    	            	}
    	            	break;
    	        case 2:
    	            harga = 12000000;
    	            jenis = "Unta";
    	            System.out.print("Masukkan jumlah yang ingin dibeli: ");
    	            jumlah = scanner.nextInt();
    	            	if (kas >= harga * jumlah) {
    	            		transaksiCount++;
    	            		kas -= harga * jumlah;
    	            		Unta unta = new Unta(jumlah);
    	            		transaksiList.add(new Transaksi("Hewan", jenis, jumlah, harga * jumlah));
    	            		System.out.println("Transaksi berhasil. Anda telah membeli " + jumlah + " ekor Unta.");
    	            	} else {
    	            		System.out.println("Kas tidak mencukupi. Transaksi gagal.");
    	            	}
    	            	break;
    	        case 3:
    	            harga = 2450000;
    	            jenis = "Domba";
    	            System.out.print("Masukkan jumlah yang ingin dibeli: ");
    	            jumlah = scanner.nextInt();
    	            	if (kas >= harga * jumlah) {
    	            		transaksiCount++;
    	            		kas -= harga * jumlah;
    	            		Domba domba = new Domba(jumlah);
    	            		transaksiList.add(new Transaksi("Hewan", jenis, jumlah, harga * jumlah));
    	            		System.out.println("Transaksi berhasil. Anda telah membeli " + jumlah + " ekor Domba.");
    	            	} else {
    	            		System.out.println("Kas tidak mencukupi. Transaksi gagal.");
    	            	}
    	            	break;
    	            	default:
    	            		System.out.println("Pilihan tidak valid. Transaksi gagal.");
    	            }
    	   }
    	
    	private static void beliTanaman(Scanner scanner) {
    	    System.out.println("Pilih jenis tanaman yang ingin dibeli:");
    	    System.out.println("1. Apel");
    	    System.out.println("2. Kelapa Sawit");
    	    System.out.print("Masukkan pilihan (1-2): ");
    	    int pilihan = scanner.nextInt();

    	    int harga, jumlah;
    	    String jenis = "";
    	    switch (pilihan) {
    	        case 1:
    	            harga = 7500000;
    	            jenis = "Apel";
    	            System.out.print("Masukkan jumlah hektar yang ingin dibeli: ");
    	            jumlah = scanner.nextInt();
    	            if (kas >= harga * jumlah) {
    	                transaksiCount++;
    	                kas -= harga * jumlah;
    	                Apel apel = new Apel(jumlah);
    	                transaksiList.add(new Transaksi("Tanaman", jenis, jumlah, harga * jumlah));
    	                System.out.println("Transaksi berhasil. Anda telah membeli " + jumlah + " hektar Apel.");
    	            } else {
    	                System.out.println("Kas tidak mencukupi. Transaksi gagal.");
    	            }
    	            break;
    	        case 2:
    	            harga = 18000000;
    	            jenis = "Kelapa Sawit";
    	            System.out.print("Masukkan jumlah hektar yang ingin dibeli: ");
    	            jumlah = scanner.nextInt();
    	            if (kas >= harga * jumlah) {
    	                transaksiCount++;
    	                kas -= harga * jumlah;
    	                Kelapa_Sawit kelapaSawit = new Kelapa_Sawit(jumlah);
    	                transaksiList.add(new Transaksi("Tanaman", jenis, jumlah, harga * jumlah));
    	                System.out.println("Transaksi berhasil. Anda telah membeli " + jumlah + " hektar Kelapa Sawit.");
    	            } else {
    	                System.out.println("Kas tidak mencukupi. Transaksi gagal.");
    	            }
    	            break;
    	        default:
    	            System.out.println("Pilihan tidak valid. Transaksi gagal.");
    	    }
    	}
    	
    	private static void tampilkanHistoryTransaksi() {
    		System.out.println("--- History Transaksi ---");
    		if (transaksiList.isEmpty()) {
    		System.out.println("Belum ada transaksi yang dilakukan.");
    		} else {
    		for (Transaksi transaksi : transaksiList) {
    		System.out.println("Jenis: " + transaksi.getJenis());
    		System.out.println("Nama: " + transaksi.getNama());
    		System.out.println("Jumlah: " + transaksi.getJumlah());
    		System.out.println("Total Harga: " + transaksi.getTotalHarga());
    		System.out.println("------------------------");
    		}
    	}
    }
    	        
}


