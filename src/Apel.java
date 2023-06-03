public class Apel extends Tanaman {
    // private String jenis;
    private int jumlahBuah; // jumlah buah/hektar
    private float hargaBuah; // harga buah per kg
    private float hargaPohon; // harga beli pohon
    private float hargaPerawatan;

    public Apel(String jenisTanaman, int kuantitas, int jumlahBuah, float hargaBuah, float hargaPohon,
            float hargaPerawatan) {
        super(jenisTanaman, kuantitas);
        this.jumlahBuah = jumlahBuah;
        this.hargaBuah = hargaBuah;
        this.hargaPohon = hargaPohon;
        this.hargaPerawatan = hargaPerawatan;
    }

    public float getProfit() {
        return (this.getTotalBuah() * this.getHargaBuah()) - (this.hargaPerawatan * super.getKuantitas());
    }

    public int getJumlahBuah() {
        return this.jumlahBuah;
    }

    public float getHargaBuah() {
        return this.hargaBuah;
    }

    public float getHargaHewan() {
        return this.hargaPohon;
    }

    public float getHargaPerawatan() {
        return this.hargaPerawatan;
    }

    public int getTotalBuah() {
        return this.jumlahBuah * super.getKuantitas();
    }

    public float getTotalHargaBuah() {
        return this.getTotalBuah() * this.hargaBuah;
    }

    public String show() {
        String p = ("=".repeat(40));
        String parent = super.toString();
        String child = String.format(
                "Buah/Hektar\t\t: %d Kg\nTotal Buah/Hari\t\t: %d Kg\nHarga Buah/Kg\t\t: Rp. %s\nProfit/Hari\t\t: Rp. %s\n %s",
                this.jumlahBuah, this.getTotalBuah(), lk.format(this.getHargaBuah()), lk.format(this.getProfit()), p);
        return parent + child;
    }

}
