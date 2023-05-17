public class Transaksi {
    private String deskripsi;
    private int jumlah;
    private float harga;
    private float totalBiaya;

    public Transaksi(String deskripsi, int jumlah, float harga) {
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
        this.harga = harga;
    }


    public String getDeskripsi() {
        return this.deskripsi;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public float getHarga() {
        return this.harga;
    }

    public float getTotalBiaya() {
        this.totalBiaya = this.getHarga()*this.getJumlah();
        return totalBiaya;
    }

}
