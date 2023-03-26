package pemlanpraktikum_modul05;
import java.util.*;

public class Aplikasi_Peternakan {

	static Hewan bebek;
	static Hewan unta;
	static Hewan domba;
	static ArrayList<Hewan> banyakHewan;
	public static void main(String[] args) {
		final float ppn = 0.1f;
		bebek = new Hewan("Bebek", "telur biasa","telur", 15,2, 2000);
		domba = new Hewan("Domba", "bulu hitam", "bulu", 4,4, 15000);
		unta = new Hewan("Unta", "susu putih", "susu", 3,5, 60000);
		banyakHewan = new ArrayList<Hewan>();
		banyakHewan.add(bebek);
		banyakHewan.add(domba);
		banyakHewan.add(unta);
		Scanner scanner = new Scanner(System.in);
		boolean aplikasi = true;
		int input;
		while(aplikasi) {
			System.out.println("Menu:");
			System.out.println("1. Menampilkan Informasi Peternakan");
			System.out.println("2. Menampilkan Total Pemasukkan Harga");
			System.out.println("3. Menampilkan harga setelah PPN");
			System.out.println("4. Exit");
			System.out.print("Masukkan Menu Anda: ");
			input = scanner.nextInt();
			if(input==4) {
				aplikasi = false;
				break;
			}
			switch(input) {
			case 1: OpsiSatu();break;
			case 2: OpsiDua();break;
			case 3: OpsiTiga(ppn);break;
			default : System.out.println("Opsi tidak tersedia!\n");
			}
		}
		System.out.println("Terima kasih telah menggunakan Aplikasi ini!");
	}
	public static void OpsiSatu() {
		for(int counter = 0; counter<banyakHewan.size();counter++) {
			String tipeProduk = banyakHewan.get(counter).getPenghasilan();
			String format = banyakHewan.get(counter).getFormat();
			System.out.println("=".repeat(50));
			System.out.printf("Jenis\t\t\t\t:%s\n", banyakHewan.get(counter).getName());
			System.out.printf("Ras\t\t\t\t:%s\n", banyakHewan.get(counter).getTipeHewan());
			System.out.printf("Jumlah\t\t\t\t:%d ekor\n", banyakHewan.get(counter).getBanyakHewan());
			System.out.printf("%s/ekor\t\t\t:%d %s\n", tipeProduk,banyakHewan.get(counter).getBanyakPenghasilan(), format);
			System.out.printf("Total %s/Hari\t\t\t:%d %s\n", tipeProduk,banyakHewan.get(counter).totalProduk(), format);
			System.out.printf("Harga %s/%s\t\t:%d\n", tipeProduk, format,banyakHewan.get(counter).getHarga());
		}
		System.out.println("=".repeat(50));
	}
	
	public static void OpsiDua() {
		System.out.println("=".repeat(50));
		int totalLaba = 0;
		for(int counter = 0; counter<banyakHewan.size();counter++) {
			totalLaba+= banyakHewan.get(counter).totalPemasukkan();
			String nama = banyakHewan.get(counter).getName();
			String tipeProduk = banyakHewan.get(counter).getTipeHewan();
			System.out.printf("Jenis\t\t: %s  |  %s\n", nama, tipeProduk);
			System.out.printf("Pemasukkan\t: %d\n", banyakHewan.get(counter).totalPemasukkan());
			System.out.println("-".repeat(50));
		}
		System.out.printf("Total Pemasukkan: %d\n",totalLaba);
		System.out.println("=".repeat(50));
	}
	public static void OpsiTiga(float ppn) {
		System.out.println("=".repeat(50));
		int totalLaba = 0;
		float tambahUntung = 1+ppn;
		for(int counter = 0; counter<banyakHewan.size();counter++) {
			int untung = (int) (banyakHewan.get(counter).totalPemasukkan()*tambahUntung);
			totalLaba+= (int)(banyakHewan.get(counter).totalPemasukkan()*(tambahUntung));
			String nama = banyakHewan.get(counter).getName();
			String tipeProduk = banyakHewan.get(counter).getTipeHewan();
			System.out.printf("Jenis\t\t: %s  |  %s\n", nama, tipeProduk);
			System.out.printf("Pemasukkan\t: %d\n", untung);
			System.out.println("-".repeat(50));
		}
		System.out.printf("Total Pemasukkan: %d\n",totalLaba);
		System.out.println("=".repeat(50));
	}
}
