public class KelapaSawit extends Tanaman { //ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahKelapaSawit;
    private float hargaKelapaSawit;
    
    public KelapaSawit(String jenis, int kuantitas, double perawatanPerHektar, double hargaPerKilo, int jumlahKelapaSawit, float hargaKelapaSawit){
        super(jenis, kuantitas, perawatanPerHektar, hargaPerKilo);
        this.jumlahKelapaSawit = jumlahKelapaSawit;
        this.hargaKelapaSawit = hargaKelapaSawit;
    }
    public int getJumlahKelapaSawit(){
        return this.jumlahKelapaSawit;
    }
    public float getHargaKelapaSawit(){
        return this.hargaKelapaSawit;
    }
    public int getTotalKelapaSawit(){
        return this.jumlahKelapaSawit * super.getKuantitas();
    }
    public float getTotalHargaKelapaSawit(){
        float totalHarga = this.hargaKelapaSawit * this.getTotalKelapaSawit();
        return totalHarga;
    }

    public void showInformasi(){
        super.showInformasi();
        System.out.println("Buah/Hektar\t\t: " + this.jumlahKelapaSawit + " Kg");
        System.out.println("Total Buah/Hari\t\t: " + this.getTotalKelapaSawit() + " Kg");
        System.out.println("Harga Buah/Kg\t\t: Rp. " + this.hargaKelapaSawit);
        System.out.println("Profit/Hari\t\t: Rp. " + this.getTotalHargaKelapaSawit());
    }
}