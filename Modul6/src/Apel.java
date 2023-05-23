public class Apel extends Tanaman { //ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahApel;
    private float hargaApel;
        
    public Apel(String jenis, int kuantitas, double perawatanPerHektar, double hargaPerKilo, int jumlahApel, float hargaApel){
        super(jenis, kuantitas, perawatanPerHektar, hargaPerKilo);
        this.jumlahApel = jumlahApel;
        this.hargaApel = hargaApel;
    }
    public int getJumlahApel(){
        return this.jumlahApel;
    }
    public float getHargaApel(){
        return this.hargaApel;
    }
    public int getTotalApel(){
        return this.jumlahApel * super.getKuantitas();
    }
    public float getTotalHargaApel(){
        float totalHarga = this.hargaApel * this.getTotalApel();
        return totalHarga;
    }
    
    public void showInformasi(){
        super.showInformasi();
        System.out.println("Buah/Hektar\t\t: " + this.jumlahApel + " Kg");
        System.out.println("Total Buah/Hari\t\t: " + this.getTotalApel() + " Kg");
        System.out.println("Harga Buah/Kg\t\t: Rp. " + this.hargaApel);
        System.out.println("Profit/Hari\t\t: Rp. " + this.getTotalHargaApel());
    }
}