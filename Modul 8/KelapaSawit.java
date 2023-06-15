public class KelapaSawit implements PembelianInterface {
    private String jenis;
    private double harga;
    private int kuantitas;
    private double biaya;

    public KelapaSawit(String jenis, double harga, int kuantitas) {
        this.jenis = jenis;
        this.harga = harga;
        this.kuantitas = kuantitas;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public double getBiaya() {
        return biaya;
    }

    public void beliHewan(int jumlah) {
        // Tidak digunakan dalam kelas KelapaSawit
    }

    public void hitungBiaya(int jumlah) {
        biaya = harga * jumlah;
    }

    public void beliTanaman(int luas) {
        kuantitas += luas;
    }
}
