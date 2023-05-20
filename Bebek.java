public class Bebek extends Hewan{
    private int jumlahTelur;
    private float hargaTelur;

    public Bebek (String jenis,int kuantitas, float hargaPerEkor, int jumlahTelur, float hargaTelur){
        super(jenis, kuantitas, hargaPerEkor);
        this.jumlahTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
    }

    public int getJumlahTelur() {
        return this.jumlahTelur = this.jumlahTelur * super.getKuantitas();
    }

    public float getHargaTelur() {
        return this.hargaTelur;
    }

    public float hargaTotalTelur() {
        float totalHarga = this.hargaTelur * this.jumlahTelur;
        return totalHarga;
    }

    public int getTotalTelur(){
        return this.jumlahTelur * super.getKuantitas();
    }

    public float getTotalHargaTelur(){
        float totalHarga = this.hargaTelur * this.getTotalTelur();
        return totalHarga;
    }

    public String showInformasi(){
        String fromParent = super.showInformasi();
        String fromChild = String.format(
            "Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f",
            this.jumlahTelur, this.getTotalTelur(), this.hargaTelur, this.getTotalHargaTelur());
        
        return fromParent + fromChild;
    }
}