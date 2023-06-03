public abstract class Ternak {
    private String jenis; 
    private int jumlah; 
    private int hasilPerHari; 
    private float harga; 
    private float perawatan;

    public Ternak(String je, int ju, int hph, float hr, float p) {
        this.jenis = je;
        this.jumlah = ju;
        this.hasilPerHari = hph;
        this.harga = hr;
        this.perawatan = p;
    }

    public String getJenis() {
        return this.jenis;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public float getHarga() {
        return this.harga;
    }

    public float getPerawatan() {
        return this.perawatan;
    }

    public float totalPenjualan() {
        return (this.jumlah * this.hasilPerHari * this.harga * Main.bulan);
    }

    public float totalPerawatan() {
        return (this.jumlah * this.perawatan * Main.bulan);
    }

    public float totalBiaya(){
        return this.totalBiaya();
    }
}
