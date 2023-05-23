public class Transaksi {
    private int ke;
    private String jenis;
    private int harga;

    public Transaksi(int ke, String jenis, int harga) {
        this.ke = ke;
        this.jenis = jenis;
        this.harga = harga;
    }
    public int getKe() {
        return ke;
    }
    public String getJenis() {
        return jenis;
    }
    public int getHarga() {
        return harga;
    }
}