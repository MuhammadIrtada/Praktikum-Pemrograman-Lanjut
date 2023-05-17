public class Domba extends Hewan {
    private int jumlahBulu;
    private float hargaBulu;
    private float hargaHewan;
    private float hargaPerawatan;

    public Domba(String jenisHewan, int kuantitas, int jumlahBulu, float hargaBulu, float hargaHewan,
            float hargaPerawatan) {
        super(jenisHewan, kuantitas);
        this.jumlahBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
        this.hargaHewan = hargaHewan;
        this.hargaPerawatan = hargaPerawatan;
    }

    public float getProfit() {
        return ((this.getTotalBulu() * this.getHargaBulu()) - this.getBiayaPerawatan());
    }

    public int getJumlahBulu() {
        return this.jumlahBulu;
    }

    public float getHargaBulu() {
        return this.hargaBulu;
    }

    public float getHargaHewan() {
        return this.hargaHewan;
    }

    public float getHargaPerawatan() {
        return this.hargaPerawatan;
    }

    public float getBiayaPerawatan() {
        return (this.getHargaPerawatan() * super.getKuantitas());
    }

    public int getTotalBulu() {
        return this.jumlahBulu * super.getKuantitas();
    }

    public String show() {
        String p = ("=".repeat(40));
        String parent = super.toString();
        String child = String.format(
                "Bulu/Ekor\t\t: %d Kg\nTotal Bulu/Hari\t\t: %d Kg\nHarga Bulu/Kg\t\t: Rp. %s\nProfit/Hari\t\t: Rp. %s\n%s",
                this.jumlahBulu,
                this.getTotalBulu(), lk.format(this.getHargaBulu()), lk.format(this.getProfit()), p);
        return parent + child;
    }
}
