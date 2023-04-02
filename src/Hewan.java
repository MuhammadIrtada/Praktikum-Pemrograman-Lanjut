public class Hewan {
    private String jenis;
    private String ras;
    private int jumlah;
    private int hasil;
    private int totHasilTernak;
    private int harga; 

    public Hewan(String jenis, String ras, int jumlah, int hasil, int totHasilTernak, int harga) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.hasil = hasil;
        this.totHasilTernak = totHasilTernak;
        this.harga = harga;
    }

    public double pemasukanHarian() {
        return jumlah * hasil * harga;
    }

    public double pemasukanHarianPPN() {
        return pemasukanHarian() * (1 + Main.PPN);
    }

    public String toString() {
        return jenis + " " + ras + "\t: " + jumlah + " ekor, hasil " + hasil + " Butir per hari, Total Ternak/Hari " + totHasilTernak + " Butir, harga "+ harga + " per satuan";
    }

}
