public class Bebek extends Hewan {
    private int jumlahTelur;
    private float hargaTelur;
    private float hargaHewan;
    private float hargaPerawatan;

    public Bebek(String jenisHewan, int kuantitas, int jumlahTelur, float hargaTelur, float hargaHewan,
            float hargaPerawatan) {
        super(jenisHewan, kuantitas);
        this.jumlahTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
        this.hargaHewan = hargaHewan;
        this.hargaPerawatan = hargaPerawatan;
    }

    public float getProfit() {
        return (this.getTotalTelur() * this.getHargaTelur()) - (this.hargaPerawatan * super.getKuantitas());
    }

    public int getJumlahTelur() {
        return this.jumlahTelur;
    }

    public float getHargaTelur() {
        return this.hargaTelur;
    }

    public float getHargaHewan() {
        return this.hargaHewan;
    }

    public float getHargaPerawatan() {
        return this.hargaPerawatan;
    }

    public int getTotalTelur() {
        return this.jumlahTelur * super.getKuantitas();
    }

    public float getTotalHargaTelur() {
        return this.getTotalTelur() * this.hargaTelur;
    }

    public String show() {
        String p = ("=".repeat(40));
        String parent = super.toString();
        String child = String.format(
                "Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: Rp. %s\nProfit/Hari\t\t: Rp. %s\n%s",
                this.jumlahTelur, this.getTotalTelur(), lk.format(this.getHargaTelur()), lk.format(this.getProfit()), p);
        return parent + child;
    }

}
