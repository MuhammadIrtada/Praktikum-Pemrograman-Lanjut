public class Domba extends Hewan{
    private int jumlahBulu;
    private float hargaBulu;

    public Domba (String jenis,int kuantitas, float hargaPerEkor, int jumlahBulu, float hargaBulu){
        super(jenis, kuantitas, hargaPerEkor);
        this.jumlahBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
    }

    public int getJumlahBulu() {
        return this.jumlahBulu = this.jumlahBulu * super.getKuantitas();
    }

    public float getHargaBulu() {
        return this.hargaBulu;
    }

    public float hargaTotalBulu() {
        float totalHarga = this.hargaBulu * this.jumlahBulu;
        return totalHarga;
    }

    public int getTotalBulu(){
        return this.jumlahBulu * super.getKuantitas();
    }

    public float getTotalHargaBulu(){
        float totalHarga = this.hargaBulu * this.getTotalBulu();
        return totalHarga;
    }


    public String showInformasi(){
        String fromParent = super.showInformasi();
        String fromChild = String.format(
            "Bulu/Ekor\t\t: %d Kg\nTotal Bulu/Hari\t\t: %d Kg\nHarga Bulu/Kg\t\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f",
            this.jumlahBulu, this.getTotalBulu(), this.hargaBulu, this.getTotalHargaBulu());
        
        return fromParent + fromChild;
    }
}

