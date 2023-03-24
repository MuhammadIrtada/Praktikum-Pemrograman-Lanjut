public class Farm {
    private String jenisHewan;
	private String jenisRas;
	private int jumlah;
	private int dosis;
	private int totDosis1;
	private int totDosis2;
	
	// overloading constructor
	
	public Farm (String jenisHewan, String jenisRas, int jumlah, int dosis) {
		this.jenisHewan = jenisHewan;
		this.jenisRas = jenisRas;
		this.jumlah = jumlah;
		this.dosis = dosis;
	}
	
	public Farm (String jenisRas, int jumlah, int dosis) {
		this.jenisRas = jenisRas;
		this.jumlah = jumlah;
		this.dosis = dosis;
	}
	
	public Farm (int totDosis1, int totDosis2) {
		this.totDosis1 = totDosis1;
		this.totDosis2 = totDosis2;
	}
	
	// overloading method
	public int hitungDosis(int jumlah) {
		return this.dosis*jumlah;
	}
	
	public int hitungDosis() {
		return hitungDosis(this.jumlah);
	}
	
	// encapsulation
	public String getJenis() {
		return jenisRas;
	}
	
	public void setJenis(String jenisRas) {
		this.jenisRas = jenisRas;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public int getDosis() {
		return dosis;
	}
	
	public int getTotDosis() {
		return totDosis1 += totDosis2;
	}
	
	
	// display
	 public void display1() {
		 System.out.println("Jenis\t\t\t: " + jenisHewan);
		 System.out.println("-------------------------------------");
		 System.out.println("Ras\t\t\t: " + jenisRas);
		 System.out.println("Jumlah\t\t\t: " + jumlah + " ekor");
		 System.out.println("Dosis obat/ekor/hari\t: " + dosis + "mL");
		 System.out.println("-------------------------------------");
	 }
	 
	 public void display2() {
		 System.out.println("Ras\t\t\t: " + jenisRas);
		 System.out.println("Jumlah\t\t\t: " + jumlah + " ekor");
		 System.out.println("Dosis obat/ekor/hari\t: " + dosis + "mL");
		 System.out.println("-------------------------------------");
	 }

	 public void display3() {
		System.out.println("Jumlah dosis obat/hari\t: " + hitungDosis() + "mL");
	 }
	 
	 public void display4() {
		System.out.println("Jumlah dosis obat/hari\t: " + hitungDosis() + "mL");
	 }
	 
	 public void display5() {
		 System.out.println("Total dosis obat/hari\t: " + getTotDosis() + "mL");
		 System.out.println("=====================================\n");
	 }
	
}
