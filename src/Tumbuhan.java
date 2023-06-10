package praktikum_modul08;

public class Tumbuhan implements Behaviour{
	String nama;
	int hektar;
	int harga;
	public Tumbuhan(String nama,int hektar, int harga) {
		this.nama = nama;
		this.hektar = hektar;
		this.harga = harga;
	}
	@Override
	public void tambahUnit(int hektar) {
		this.hektar += hektar;
	}
	@Override
	public String getData() {
		return String.format("%-20s: %d ekor\n", getNama(), hektar);
	}
	@Override
	public String getNama() {
		return nama;
	}
	@Override
	public int totalHarga(int hektar) {
		return harga*hektar;
	}
}
