public class Domba extends Hewan{ //ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahBulu;
    private float hargaBulu;
        
    public Domba(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor, int jumlahBulu, float hargaBulu){
        super(jenis, kuantitas, perawatanPerEkor, hargaPerEkor);
        this.jumlahBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
    }
    public int getJumlahBulu(){
        return this.jumlahBulu;
    }
    public float getHargaBulu(){
        return this.hargaBulu;
    }
    public int getTotalBulu(){
        return this.jumlahBulu * super.getKuantitas();
    }
    public float getTotalHargaBulu(){
        float totalHarga = this.hargaBulu * this.getTotalBulu();
        return totalHarga;
    }
    
    public void showInformasi(){
        super.showInformasi();
        System.out.println("Bulu/Ekor\t\t: " + this.jumlahBulu + " Kg");
        System.out.println("Total Bulu/Hari\t\t: " + this.getTotalBulu() + " Kg");
        System.out.println("Harga Bulu/Kg\t\t: Rp. " + this.hargaBulu);
        System.out.println("Profit/Hari\t\t: Rp. " + this.getTotalHargaBulu());
    }
}