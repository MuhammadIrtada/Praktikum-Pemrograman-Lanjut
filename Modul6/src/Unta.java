public class Unta extends Hewan{ //ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahSusu;
    private float hargaSusu;
    
    public Unta(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor, int jumlahSusu, float hargaSusu){
        super(jenis, kuantitas, perawatanPerEkor, hargaPerEkor);
        this.jumlahSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
    }

    public int getJumlahSusu(){
        return this.jumlahSusu;
    }
    public float getHargaSusu(){
        return this.hargaSusu;
    }
    public int getTotalSusu(){
        return this.jumlahSusu * super.getKuantitas();
    }
    public float getTotalHargaSusu(){
        float totalHarga = this.hargaSusu * this.getTotalSusu();
        return totalHarga;
    }

    public void showInformasi(){
        super.showInformasi();
        System.out.println("Susu/Ekor\t\t: " + this.jumlahSusu + " Liter");
        System.out.println("Total Susu/Hari\t\t: " + this.getTotalSusu() + " Liter");
        System.out.println("Harga Susu/Liter\t: Rp. " + this.hargaSusu);
        System.out.println("Profit/Hari\t\t: Rp. " + this.getTotalHargaSusu());
    }
}

