public class Unta extends Hewan{
    private int jumlahSusu;
    private float hargaSusu;

    public Unta (String jenis,int kuantitas, float hargaPerEkor, int jumlahSusu, float hargaSusu){
        super(jenis, kuantitas, hargaPerEkor);
        this.jumlahSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
    }

    public int getJumlahSusu() {
        return this.jumlahSusu = this.jumlahSusu * super.getKuantitas();
    }

    public float getHargaSusu() {
        return this.hargaSusu;
    }

    public float hargaTotalSusu() {
        float totalHarga = this.hargaSusu * this.jumlahSusu;
        return totalHarga;
    }

    public int getTotalSusu(){
        return this.jumlahSusu * super.getKuantitas();
    }

    public float getTotalHargaSusu(){
        float totalHarga = this.hargaSusu * this.getTotalSusu();
        return totalHarga;
    }


    public String showInformasi(){
        String fromParent = super.showInformasi();
        String fromChild = String.format(
            "Susu/Ekor\t\t: %d Liter\nTotal Susu/Hari\t\t: %d Liter\nHarga Susu/Liter\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f",
            this.jumlahSusu, this.getTotalSusu(), this.hargaSusu, this.getTotalHargaSusu());
        
        return fromParent + fromChild;
    }
}

