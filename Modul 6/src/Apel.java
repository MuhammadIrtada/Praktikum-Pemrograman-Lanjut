public class Apel extends Tanaman {
    private int jumlahApel;
    private float hargaApel;

    public Apel(String jenis, int kuantitas, float hargaPerHektar, float perawatanPerHektar, int jumlahApel,
            float hargaApel) {
        super(jenis, kuantitas, hargaPerHektar, perawatanPerHektar);
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

    public float getTotalHargaApel() {
        float totalHarga = this.hargaApel * this.getTotalApel();
        return totalHarga;
    }

    public float getTotalPerawatanPerHektar() {
        float totalPerawatan = super.getPerawatanPerHektar() * super.getKuantitas();
        return totalPerawatan;
    }

    public float getProfitPerHari() {
        float profit = this.getTotalHargaApel() - this.getTotalPerawatanPerHektar();
        return profit;
    }

    public String showInformasi() {
        String fromParent = super.showInformasi();
        String fromChild = String.format(
                "Buah/Hektar\t\t: %d Kg\nTotal Buah/Hari\t\t: %d Kg\nHarga Buah/Kg\t\t: Rp.%,.0f\nProfit/Hari\t\t: Rp.%,.0f",
                this.jumlahApel, this.getTotalApel(), this.hargaApel, this.getProfitPerHari());
        return fromParent + fromChild;
    }
}
