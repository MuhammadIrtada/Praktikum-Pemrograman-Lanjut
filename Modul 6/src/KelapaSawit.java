public class KelapaSawit extends Tanaman {
    private int jumlahKelapaSawit;
    private float hargaKelapaSawit;

    public KelapaSawit(String jenis, int kuantitas, float hargaPerHektar, float perawatanPerHektar,
            int jumlahKelapaSawit, float hargaKelapaSawit) {
        super(jenis, kuantitas, hargaPerHektar, perawatanPerHektar);
        this.jumlahKelapaSawit = jumlahKelapaSawit;
        this.hargaKelapaSawit = hargaKelapaSawit;
    }

    public int getJumlahKelapaSawit() {
        return this.jumlahKelapaSawit;
    }

    public float getHargaKelapaSawit() {
        return this.hargaKelapaSawit;
    }

    public int getTotalKelapaSawit() {
        return this.jumlahKelapaSawit * super.getKuantitas();
    }

    public float getTotalHargaKelapaSawit() {
        float totalHarga = this.hargaKelapaSawit * this.getTotalKelapaSawit();
        return totalHarga;
    }

    public float getTotalPerawatanPerHektar() {
        float totalPerawatan = super.getPerawatanPerHektar() * super.getKuantitas();
        return totalPerawatan;
    }

    public float getProfitPerHari() {
        float profit = this.getTotalHargaKelapaSawit() - this.getTotalPerawatanPerHektar();
        return profit;
    }

    public String showInformasi() {
        String fromParent = super.showInformasi();
        String fromChild = String.format(
                "Minyak/Hektar\t\t: %d Kg\nTotal Minyak/Hari\t: %d Kg\nHarga Minyak/Kg\t\t: Rp.%,.0f\nProfit/Hari\t\t: Rp.%,.0f",
                this.jumlahKelapaSawit, this.getTotalKelapaSawit(), this.hargaKelapaSawit, this.getProfitPerHari());
        return fromParent + fromChild;
    }
}
