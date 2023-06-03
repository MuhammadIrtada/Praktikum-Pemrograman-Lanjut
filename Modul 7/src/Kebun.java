public class Kebun {
    private String jenis; 
    private int jumlah; 
    private int hasilPerHari;
    private float harga; 
    private float perawatan;


    public Kebun(String je, int ju, int hph, float hr, float p){
        this.jenis = je;
        this.jumlah = ju;
        this.hasilPerHari = hph;
        this.harga = hr;
        this.perawatan = p;
    }

    public String getJenis(){
        return this.jenis;
    }

    public int getJumlah(){
        return this.jumlah;
    }

    public float getHarga(){
        return this.harga;
    }

    public float getPerawatan(){
        return this.perawatan;
    }

    public float totalPenjualan(){
        return (this.jumlah*this.hasilPerHari*this.harga*Main.bulan); 
    }

    public float totalPerawatan() {
        return (this.jumlah * this.perawatan * Main.bulan);
    }

    public String toString(){
        return String.format("%s:%10s Rp.%,.0f", this.jenis, "", totalPenjualan());
    }

    public String toString2() {
        return String.format("%s:%10s Rp.%,.0f", this.jenis, "", totalPerawatan());
    }

    public float totalBiaya(){
        return totalPenjualan() * totalPerawatan();
    }
}

