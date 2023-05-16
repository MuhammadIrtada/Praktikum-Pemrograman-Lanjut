package pemlanpraktikum_modul03;

public class Hewan {
	private String nama;
	private int anggota;
	private int jumlah_produk;
	private String penghasilan;
	private int dosis;
	private float efektifitas;
	Hewan(String name, int banyak_hewan,int banyak_produk, String jenis_produk){
		this.setNama(name);
		this.setAnggota(banyak_hewan);
		this.setBanyakProduk(banyak_produk);
		this.setJenisProduk(jenis_produk);
	}
	Hewan(String name,int banyak_hewan,int banyak_produk, String jenis_produk, int dose){
		this.setNama(name);
		this.setAnggota(banyak_hewan);
		this.setBanyakProduk(banyak_produk);
		this.setJenisProduk(jenis_produk);
		this.setDosis(dose);
	}
	Hewan(String name,int banyak_hewan,int banyak_produk, String jenis_produk, int dose, float effisien){
		this.setNama(name);
		this.setAnggota(banyak_hewan);
		this.setBanyakProduk(banyak_produk);
		this.setJenisProduk(jenis_produk);
		this.setDosis(dose);
		this.setEfektifitas(effisien);
	}
	public void setNama(String input) {
		this.nama = input;
	}
	public void setBanyakProduk(int input) {
		this.jumlah_produk = input;
	}
	public void setAnggota(int input) {
		this.anggota = input;
	}
	public void setJenisProduk(String input) {
		this.penghasilan = input;
	}
	public void setEfektifitas(float input) {
		this.efektifitas = input;
	}
	public void setDosis(int input) {
		this.dosis = input;
	}
	public String getNama() {
		return this.nama;
	}
	public int getAnggota() {
		return this.anggota;
	}
	public int getBanyakProduk() {
		return this.jumlah_produk;
	}
	public String getJenisProduk() {
		return this.penghasilan;
	}
	public float getEfektifitas() {
		return this.efektifitas;
	}
	public int getDosis() {
		return this.dosis;
	}
	public int boostProduk() {
		return (int) (this.jumlah_produk*this.efektifitas);
	}
	public int boostProduk(float efficient) {
		return (int) (this.jumlah_produk*efficient);
	}
	public int totalProduk() {
		return this.anggota*this.jumlah_produk;
	}
	public int totalBoostProduk() {
		return this.anggota * this.boostProduk();
	}
	public int totalBoostProduk(float efficient) {
		return this.anggota*this.boostProduk(efficient);
	}
	public String displayData() {
		return String.format("%s ras %s menghasilkan sebanyak %d kg per ekor setiap hari\n"
							,this.getNama(), this.getJenisProduk(), this.getBanyakProduk())
				+
				String.format("mereka beranggota %d, menghasilkan %d kg sebelum boost\n"
						+ "%d kg setelah di-boost secara total\n",this.anggota, this.totalProduk()
						,this.totalBoostProduk())
				+String.format("mereka membutuhkan dosis sebanyak %dmL/ekor/hari\n",this.dosis)
				+String.format("Total dosis yang dibutuhkan sebanyak %dmL/ekor/hari\n", this.dosis*this.anggota)
				;
		
	}

}

