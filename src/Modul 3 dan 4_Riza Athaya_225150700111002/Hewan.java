
public class Hewan {
	public static void main(String[] args) {
		Bebek telurBiasa = new Bebek("Telur biasa", 15);
		Bebek telurAsin = new Bebek ("Telur asin", 10);
		Bebek [] semuaBebek = {telurBiasa, telurAsin};
		Unta susuPutih = new Unta("Susu putih", 3);
		Unta susuCoklat = new Unta("Susu coklat", 4);
		Unta [] semuaUnta = {susuPutih,susuCoklat};
		Domba buluHitam = new Domba ("bulu hitam", 4);
		Domba buluPutih = new Domba ("bulu putih", 6);
		Domba [] semuaDomba = {buluHitam, buluPutih};
		getAllHewan(semuaBebek, semuaUnta, semuaDomba);
	}
	public static void getAllBebek(Bebek []semuaBebek) {
		System.out.printf("%-25s: Bebek\n", "Hewan");
		System.out.println("-----------------------------------------" );
		for (int i = 0; i<semuaBebek.length; i++) {
			semuaBebek[i].getAll();
		}
		System.out.println();
	}
	public static void getAllUnta(Unta []semuaUnta) {
		System.out.printf("%-25s: Unta\n", "Hewan");
		System.out.println("-----------------------------------------" );
		for (int i = 0; i<semuaUnta.length; i++) {
			semuaUnta[i].getAll();
		}
		System.out.println();
	}
	public static void getAllDomba(Domba []semuaDomba) {
		System.out.printf("%-25s: Domba\n", "Hewan");
		System.out.println("-----------------------------------------" );
		for (int i = 0; i<semuaDomba.length; i++) {
			semuaDomba[i].getAll();
		}
		System.out.println();
	}
	public static void getAllHewan(Bebek []semuaBebek, Unta []semuaUnta,Domba []semuaDomba) {
		getAllBebek(semuaBebek);
		getAllUnta(semuaUnta);
		getAllDomba(semuaDomba);
	}

}
