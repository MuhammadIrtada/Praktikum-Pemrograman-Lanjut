public class KelapaSawit extends Tanaman {
    // private String jenis;
    private int jumlahPohon; // jumlah buah/hektar
    private float hargaMinyak; // harga buah per kg
    private float hargaPohon; // harga beli pohon
    private float hargaPerawatan;
    // private int totalTelur;

    public KelapaSawit(String jenisTanaman, int kuantitas, int jumlahPohon, float hargaMinyak, float hargaPohon,
            float hargaPerawatan) {
        super(jenisTanaman, kuantitas);
        this.jumlahPohon = jumlahPohon;
        this.hargaMinyak = hargaMinyak;
        this.hargaPohon = hargaPohon;
        this.hargaPerawatan = hargaPerawatan;
    }

    public float getProfit() {
        return (this.getTotalPohon() * this.getHargaMinyak()) - (this.hargaPerawatan * super.getKuantitas());
    }

    public int getJumlahPohon() {
        return this.jumlahPohon;
    }

    public float getHargaMinyak() {
        return this.hargaMinyak;
    }

    public float getHargaHewan() {
        return this.hargaPohon;
    }

    public float getHargaPerawatan() {
        return this.hargaPerawatan;
    }

    public int getTotalPohon() {
        return this.jumlahPohon * super.getKuantitas();
    }

    public float getTotalHargaKelapa() {
        return this.getTotalPohon() * this.hargaMinyak;
    }

    public String show() {
        String p = ("=".repeat(40));
        String parent = super.toString();
        String child = String.format(
                "Minyak/Hektar\t\t: %d Kg\nTotal Minyak/Hari\t: %d Kg\nHarga Minyak/Kg\t\t: Rp. %s\nProfit/Hari\t\t: Rp. %s\n%s",
                this.jumlahPohon, this.getTotalPohon(), lk.format(this.getHargaMinyak()), lk.format(this.getProfit()),
                p);
        return parent + child;
    }

}
