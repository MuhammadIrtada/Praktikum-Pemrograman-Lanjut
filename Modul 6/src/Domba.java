public class Domba extends Hewan {
    private int jumlahBulu; // per hewan
    private float hargaBulu;

    public Domba(String jenis, int kuantitas, float hargaPerEkor, float perawatanPerEkor, int jumlahBulu,
            float hargaBulu) {
        super(jenis, kuantitas, hargaPerEkor, perawatanPerEkor);
        this.jumlahBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
    }

    public int getJumlahBulu() {
        return this.jumlahBulu;
    }

    public float getHargaBulu() {
        return this.hargaBulu;
    }

    public int getTotalBulu() {
        return this.jumlahBulu * super.getKuantitas();
    }

    public float getTotalHargaBulu() {
        float totalHarga = this.hargaBulu * this.getTotalBulu();
        return totalHarga;
    }

    public float getTotalPerawatanPerEkor() {
        float totalPerawatan = super.getPerawatanPerEkor() * super.getKuantitas();
        return totalPerawatan;
    }

    public float getProfitPerHari() {
        float profit = this.getTotalHargaBulu() - this.getTotalPerawatanPerEkor();
        return profit;
    }

    public String showInformasi() {
        String fromParent = super.showInformasi();
        String fromChild = String.format(
                "Bulu/ekor\t\t: %d Kg\nTotal Bulu/Hari\t\t: %d Kg\nHargaBulu/Kg\t\t: Rp.%,.0f\nProfit/Hari\t\t: Rp.%,.0f",
                this.jumlahBulu, this.getTotalBulu(), this.hargaBulu, this.getProfitPerHari());
        return fromParent + fromChild;
    }
}
