public class Obat {
    private String nama;
    private int durasi;
    private double dosis, harga;

    Obat(String nama, int durasi, double dosis, double harga){
        this.nama = nama;
        this.durasi = durasi;
        this.dosis = dosis;
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;
    }
    
    public int getDurasi() {
        return this.durasi;
    }
    
    public double getDosis() {
        return this.dosis;
    }
    
    public double getHarga() {
        return this.harga;
    }

    public boolean isObatBekerja() {
        return this.durasi > 0;
    }

    public void reduceDurasi() {
        this.durasi--;
    }
}
