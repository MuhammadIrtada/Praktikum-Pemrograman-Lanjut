package praktikum_modul08;

public abstract class Hewan implements Behaviour {
	String nama;
	int ekor;
	int harga;
	public Hewan(String nama, int ekor, int harga) {
		this.nama = nama;
		this.ekor = ekor;
		this.harga = harga;
	}
	@Override
	public void tambahUnit(int ekor) {
		this.ekor += ekor;
	}
	@Override
	public String getData() {
		return String.format("%-20s: %d ekor\n", getNama(), ekor);
	}
	@Override
	public String getNama() {
		return nama;
	}
	@Override
	public int totalHarga(int ekor) {
		return harga*ekor;
	}
}
