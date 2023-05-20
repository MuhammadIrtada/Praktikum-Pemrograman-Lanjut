public class Tumbuhan{
    private String jenis;
    private float harga;
    private int wilayah;
    private float hargaPerKilo;
    private float biayaPerawatan;

    public Tumbuhan (String jenis,float harga,int wilayah,float hargaPerKilo,float baiayPerawatan){
        this.jenis = jenis;
        this.harga = harga;
        this.wilayah = wilayah;
        this.hargaPerKilo = hargaPerKilo;
        this.biayaPerawatan = baiayPerawatan;
    }

    public float getHarga(){
        return this.harga;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getWilayah(){
        return this.wilayah;
    }
    public float getHargaPerKilo(){
        return this.hargaPerKilo;
    }

    public float getBiayaPerawatan(){
        return this.biayaPerawatan;
    }

    public void addJumlah(int jumlahBaru){
        this.wilayah = this.wilayah + jumlahBaru;
    }

    public void pembelian(String namaTumbuhan,int jumlah,float hargaTotal){
        
    } 

    public String showInformasi(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.jenis, this.wilayah);
    }
}
