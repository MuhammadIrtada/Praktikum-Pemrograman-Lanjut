public class Apel implements Tumbuhan{
    private String nama;
    private int luas;
    private double harga;

    public Apel(int kuantitas, double harga) {
        this.nama = "Apel\t\t\t";
        this.luas = kuantitas;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public void beli(int jumlah) {
        this.luas += jumlah;
    }

    @Override
    public void nota(int jumlah) {
        System.out.println("=".repeat(39));
        System.out.println("    Nota Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(39));
        System.out.printf("Apel\t\t\t%20s\n", String.format("x(%d)   : Rp %.0f", jumlah, harga*jumlah));

    }
}
