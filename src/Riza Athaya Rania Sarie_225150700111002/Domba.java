
public class Domba {
	private String jenis;
	private double jumlah;

	// constructor
	public Domba() {
		// nilai default
		jenis = "bulu hitam";
		jumlah = 4;

	}

	public Domba(String jenis) {
		this.jenis = jenis;

	}

	public Domba(double jumlah) {
		this.jumlah = jumlah;

	}

	public Domba(String jenis, double jumlah) {
		this.jenis = jenis;
		this.jumlah = jumlah;

	}

	// set get
	public String getJenis() {
		return jenis;
	}

	public double getJumlah() {
		return jumlah;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public void setJumlah(double jumlah) {
		this.jumlah = jumlah;
	}

	public double getDosis() {
		return dosis();
	}

	public double getTotalDosis() {
		return totalDosis();
	}

	public double getTotalDosis(double jumlah) {
		return totalDosis(jumlah);
	}

	// rumus
	private double dosis() {
		if (jenis.equalsIgnoreCase("bulu hitam")) {
			return 9;
		} else if (jenis.equalsIgnoreCase("bulu putih")) {
			return 14;
		}
		return 0;
	}

	private double totalDosis() {
		return jumlah * dosis();
	}

	private double totalDosis(double jumlah) {
		return jumlah * dosis();
	}

	// print
	public void getAll() {
		System.out.printf(
				"%-25s: %s\n" + "%-25s: %-10s\n" + "%-25s: %-10s\n" + "%-25s: %-10s\n"
						+ "-----------------------------------------\n",
				"Jenis susu", jenis, "Jumlah", (int) jumlah + " ekor", "Dosis obat/ekor/hari", (int) getDosis() + "mL",
				"Dosis total ekor/hari", (int) getTotalDosis() + "mL");
	}
}
