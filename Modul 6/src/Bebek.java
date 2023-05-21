public class Bebek extends Hewan {
    private int jumlahTelur; // per hewan
    private float hargaTelur;

    public Bebek(String jenis, int kuantitas, float hargaPerEkor, float perawatanPerEkor, int jumlahTelur,
            float hargaTelur) {
        super(jenis, kuantitas, hargaPerEkor, perawatanPerEkor);
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

    public float getTotalPerawatanPerEkor() {
        float totalPerawatan = super.getPerawatanPerEkor() * super.getKuantitas();
        return totalPerawatan;
    }

    public float getProfitPerHari() {
        float profit = this.getTotalHargaTelur() - this.getTotalPerawatanPerEkor();
        return profit;
    }

    public String showInformasi() {
        String fromParent = super.showInformasi();
        String fromChild = String.format(
                "Telur/ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHargaTelur/Butir\t: Rp.%,.0f\nProfit/Hari\t\t: Rp.%,.0f",
                this.jumlahTelur, this.getTotalTelur(), this.hargaTelur, this.getProfitPerHari());
        return fromParent + fromChild;
    }

}
