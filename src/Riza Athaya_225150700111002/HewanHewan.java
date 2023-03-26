public class HewanHewan {
	private String jenis;
	private String ras;
	private int jumlah;
	private int perekor;
	private int perhari;
	private int harga;
	static int total = 0;

	// constructor
	public HewanHewan() {
		total++;

	}

	public HewanHewan(String jenis, String ras) {
		this.jenis = jenis;
		this.ras = ras;
		total++;
	}

	public HewanHewan(int jumlah, int perekor, int harga) {
		this.jumlah = jumlah;
		this.perekor = perekor;
		this.perhari = jumlah * perekor;
		this.harga = harga;
		total++;
	}

	public HewanHewan(int jumlah, int perekor, int perhari, int harga) {
		this.jumlah = jumlah;
		this.perekor = perekor;
		this.perhari = perhari;
		this.harga = harga;
		total++;
	}

	public HewanHewan(String jenis, String ras, int jumlah, int perekor, int harga) {
		this.jenis = jenis;
		this.ras = ras;
		this.jumlah = jumlah;
		this.perekor = perekor;
		this.perhari = jumlah * perekor;
		this.harga = harga;
		total++;
	}

	public HewanHewan(String jenis, String ras, int jumlah, int perekor, int perhari, int harga) {
		this.jenis = jenis;
		this.ras = ras;
		this.jumlah = jumlah;
		this.perekor = perekor;
		this.perhari = perhari;
		this.harga = harga;
		total++;
	}

	// setter getter
	public String getJenis() {
		return jenis;
	}

	public String getRas() {
		return ras;
	}

	public int getJumlah() {
		return jumlah;
	}

	public int getPerekor() {
		return perekor;
	}

	public int getPerhari() {
		return perhari;
	}

	public int getHarga() {
		return harga;
	}

	public int getPemasukan() {
		return harga * perhari;
	}

	public int getHargaPPN(int ppn) {
		return getPemasukan() + (getPemasukan() / ppn);
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public void setRas(String ras) {
		this.ras = ras;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public void setPerekor(int perekor) {
		this.perekor = perekor;
	}

	public void setPerhari(int perhari) {
		this.perhari = perhari;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	// aturan variabel
	private String getTipe() {
		if (jenis.equalsIgnoreCase("bebek")) {
			return "Telur";
		} else if (jenis.equalsIgnoreCase("domba")) {
			return "Bulu";
		} else if (jenis.equalsIgnoreCase("unta")) {
			return "Susu";
		} else {
			return "";
		}
	}

	private String getSatuan() {
		if (jenis.equalsIgnoreCase("bebek")) {
			return "Butir";
		} else if (jenis.equalsIgnoreCase("domba")) {
			return "Kg";
		} else if (jenis.equalsIgnoreCase("unta")) {
			return "Liter";
		} else {
			return "";
		}
	}

	// print
	public void getDetail() {
		System.out.println("=".repeat(40));
		System.out.printf("%-20s: %s\n" + "%-20s: %s\n" + "%-20s: %s\n" + "%-20s: %s\n" + "%-20s: %s\n" + "%-20s: %s\n",
				"Jenis", jenis, "Ras", ras, "Jumlah", jumlah + " ekor", (getTipe() + "/Ekor"),
				perekor + " " + getSatuan(), "Total " + getTipe().toLowerCase() + "/Hari", perhari + " " + getSatuan(),
				"Harga " + getTipe().toLowerCase() + "/" + getSatuan(), "Rp " + harga);
	}

	public void getDetailPemasukan() {
		System.out.printf("%-15s : %-6s | %s\n" + "%-15s : %-6s \n", "Jenis", jenis, ras, "Pemasukan",
				"Rp " + getPemasukan());
		System.out.println("-".repeat(40));
	}

	public void getDetailPemasukanPPN(int ppn) {
		System.out.printf("%-15s : %-6s | %s\n" + "%-15s : %-6s\n", "Jenis", jenis, ras, "Pemasukan",
				"Rp " + getHargaPPN(ppn));
		System.out.println("-".repeat(40));
	}

}
