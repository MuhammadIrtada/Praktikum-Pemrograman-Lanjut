public class Apel extends Perkebunan { // ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahApel;
    private float hargaApel;

    public Apel(String jenis, int kuantitas, double perawatanPerHektar, double hargaPerKilo, int jumlahApel, float hargaApel) {
        super(jenis, kuantitas, perawatanPerHektar, hargaPerKilo);
        this.jumlahApel = jumlahApel;
        this.hargaApel = hargaApel;
    }

    public int getJumlahApel() {
        return this.jumlahApel;
    }

    public float getHargaApel() {
        return this.hargaApel;
    }

    public int getTotalApel() {
        return this.jumlahApel * super.getKuantitas();
    }

    public double getTotalHargaApel() {
        float totalHarga = this.hargaApel * this.getTotalApel();
        return totalHarga;
    }

    public double pendapatan() {
        return getTotalHargaApel() * 30;
    }

    public double perawatan() {
        return super.getPerawatanPerHektar() * super.getKuantitas() * 30;
    }
}
