public class Bebek extends Peternakan { // ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahTelur;
    private float hargaTelur;

    public Bebek(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor, int jumlahTelur, float hargaTelur) {
        super(jenis, kuantitas, perawatanPerEkor, hargaPerEkor);
        this.jumlahTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
    }

    public int getJumlahTelur() {
        return this.jumlahTelur;
    }

    public float getHargaTelur() {
        return this.hargaTelur;
    }

    public int getTotalTelur() {
        return this.jumlahTelur * super.getKuantitas();
    }

    public float getTotalHargaTelur() {
        float totalHarga = this.hargaTelur * this.getTotalTelur();
        return totalHarga;
    }

    public double pendapatan() {
        return getTotalHargaTelur() * 30;
    }

    public double perawatan() {
        return (super.getPerawatanPerEkor() * super.getKuantitas()) * 30;
    }
}