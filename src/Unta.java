public class Unta extends Hewan {
    private int jumlahSusu;
    private float hargaSusu;
    private float hargaHewan;
    private float hargaPerawatan;

    public Unta(String jenisHewan, int kuantitas, int jumlahSusu, float hargaSusu, float hargaHewan,
            float hargaPerawatan) {
        super(jenisHewan, kuantitas);
        this.jumlahSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
        this.hargaHewan = hargaHewan;
        this.hargaPerawatan = hargaPerawatan;
    }

    public float getProfit() {
        return (this.getTotalSusu() * this.getHargaSusu()) - (this.hargaPerawatan * super.getKuantitas());
    }

    public int getJumlahSusu() {
        return this.jumlahSusu;
    }

    public float getHargaSusu() {
        return this.hargaSusu;
    }

    public float getHargaHewan() {
        return this.hargaHewan;
    }

    public float getHargaPerawatan() {
        return this.hargaPerawatan;
    }

    public int getTotalSusu() {
        return this.jumlahSusu * super.getKuantitas();
    }

    public String show() {
        String p = ("=".repeat(40));
        String parent = super.toString();
        String child = String.format(
                "Susu/Ekor\t\t: %d Liter\nTotal Susu/Hari\t\t: %d Liter\nHarga Susu/Liter\t: Rp. %s\nProfit/Hari\t\t: Rp. %s\n%s",
                this.jumlahSusu,
                this.getTotalSusu(), lk.format(this.getHargaSusu()), lk.format(this.getProfit()), p);
        return parent + child;
    }
}
