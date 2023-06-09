public class Domba implements Hewan{
    private String nama;
    private int kuantitas;
    private double harga;

    public Domba(int kuantitas, double harga) {
        this.nama = "Domba\t\t\t";
        this.kuantitas = kuantitas;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public void beli(int jumlah) {
        this.kuantitas += jumlah;
    }

    @Override
    public void nota(int jumlah) {
        System.out.println("=".repeat(39));
        System.out.println("      Nota Pembelian Hewan Ternak      ");
        System.out.println("=".repeat(39));
        System.out.printf("Domba\t\t\t%20s\n", String.format("x(%d)   : Rp %.0f", jumlah, harga*jumlah));

    }
}
