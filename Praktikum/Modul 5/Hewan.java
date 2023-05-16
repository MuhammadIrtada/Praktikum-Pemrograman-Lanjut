package pemlanpraktikum_modul05;

public class Hewan {
	private String name;
	private String tipeHewan;
	private String penghasilan;
	private String format;
	private int banyakHewan;
	private int banyakPenghasilan;
	private int harga;
	public Hewan(String inputName,String tipeHewan, String tipePenghasilan,int inputHewan, int inputPenghasilan, int harga){
		this.name = inputName;
		this.tipeHewan = tipeHewan;
		this.penghasilan = tipePenghasilan;
		this.banyakHewan = inputHewan;
		this.banyakPenghasilan = inputPenghasilan;
		this.harga = harga;
		setFormat(tipePenghasilan);
	}
	public void setFormat(String tipePenghasilan) {
		if(tipePenghasilan.equalsIgnoreCase("telur")) {
			this.format = "butir";
		}
		if(tipePenghasilan.equalsIgnoreCase("susu")) {
			this.format = "liter";
		}
		if(tipePenghasilan.equalsIgnoreCase("bulu")) {
			this.format = "kg";
		}
	}
	public String getName() {
		return this.name;
	}
	public String getTipeHewan() {
		return this.tipeHewan;
	}
	public String getPenghasilan() {
		return this.penghasilan;
	}
	public String getFormat() {
		return this.format;
	}
	public int getBanyakHewan() {
		return this.banyakHewan;
	}
	public int getBanyakPenghasilan() {
		return this.banyakPenghasilan;
	}
	public int getHarga() {
		return this.harga;
	}
	public int totalPemasukkan() {
		return this.totalProduk()*this.harga;
	}
	public int totalProduk() {
		return this.banyakHewan*this.banyakPenghasilan;
	}
	public void setName(String input) {
		this.name = input;
	}
	public void setTipeHewan(String input) {
		this.tipeHewan = input;
	}
	public void setPenghasilan(String input) {
		this.penghasilan = input;
	}
	public void setBanyakHewan(int input) {
		this.banyakHewan = input;
	}
	public void setBanyakPenghasilan(int input) {
		this.banyakPenghasilan = input;
	}
	public void setHarga(int input) {
		this.harga = input;
	}
	
}
