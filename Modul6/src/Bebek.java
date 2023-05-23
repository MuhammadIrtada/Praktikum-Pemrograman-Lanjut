public class Bebek extends Hewan{ //ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahTelur;
    private float hargaTelur;
   
    public Bebek(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor, int jumlahTelur, float hargaTelur){
        super(jenis, kuantitas, perawatanPerEkor, hargaPerEkor);
        this.jumlahTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
    }
    public int getJumlahTelur(){
        return this.jumlahTelur;
    }
    public float getHargaTelur(){
        return this.hargaTelur;
    }
    public int getTotalTelur(){
        return this.jumlahTelur * super.getKuantitas();
    }
    public float getTotalHargaTelur(){
        float totalHarga = this.hargaTelur * this.getTotalTelur();
        return totalHarga;
    }
    public void showInformasi(){
        super.showInformasi();
        System.out.println("Telur/Ekor\t\t: " + this.jumlahTelur + " Kg");
        System.out.println("Total Telur/Hari\t: " + this.getTotalTelur() + " Kg");
        System.out.println("Harga Telur/Kg\t\t: Rp. " + this.hargaTelur);
        System.out.println("Profit/Hari\t\t: Rp. " + this.getTotalHargaTelur());
    }
}