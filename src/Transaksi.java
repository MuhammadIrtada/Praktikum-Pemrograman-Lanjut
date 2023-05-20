public class Transaksi {
    private String jenis;
    private String nama;
    private int jumlah;
    private int totalHarga;

    public Transaksi(String jenis, String nama, int jumlah, int totalHarga) {
        this.jenis = jenis;
        this.nama = nama;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
