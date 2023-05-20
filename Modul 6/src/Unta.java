public class Unta extends Hewan {
    private int jumlahSusu; // per hewan
    private float hargaSusu;

    public Unta(String jenis, int kuantitas, float hargaPerEkor, float perawatanPerEkor, int jumlahSusu,
            float hargaSusu) {
        super(jenis, kuantitas, hargaPerEkor, perawatanPerEkor);
        this.jumlahSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
    }

    public int getJumlahSusu() {
        return this.jumlahSusu;
    }

    public float getHargaSusu() {
        return this.hargaSusu;
    }

    public int getTotalSusu() {
        return this.jumlahSusu * super.getKuantitas();
    }

    public float getTotalHargaSusu() {
        float totalHarga = this.hargaSusu * this.getTotalSusu();
        return totalHarga;
    }

    public float getTotalPerawatanPerEkor() {
        float totalPerawatan = super.getPerawatanPerEkor() * super.getKuantitas();
        return totalPerawatan;
    }

    public float getProfitPerHari() {
        float profit = this.getTotalHargaSusu() - this.getTotalPerawatanPerEkor();
        return profit;
    }

    public String showInformasi() {
        String fromParent = super.showInformasi();
        String fromChild = String.format(
                "Susu/ekor\t\t: %d Liter\nTotal Susu/Hari\t\t: %d Liter\nHargaSusu/Liter\t\t: Rp.%,.0f\nProfit/Hari\t\t: Rp.%,.0f",
                this.jumlahSusu, this.getTotalSusu(), this.hargaSusu, this.getProfitPerHari());
        return fromParent + fromChild;
    }
}

