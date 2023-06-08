public class Transaksi {
    private String jenis;
    private double harga;
    private double banyak;

    public Transaksi(String jenis, double harga, double banyak) {
        this.jenis = jenis;
        this.harga = harga;
        this.banyak = banyak;
    }

    public String getjenis() {
        return this.jenis;
    }

    public double getHarga(){
        return this.harga;
    }

    public double getBanyak(){
        return this.banyak;
    }

}
