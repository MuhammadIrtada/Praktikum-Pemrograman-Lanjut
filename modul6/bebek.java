package modul6;
public class bebek extends hewan {
    private int jmlTelur; //per hewan
    private float hargaTelur; //per telur

    public bebek(String nama, int total, int jmlTelur, float hargaTelur){
        super(nama, total);
        this.jmlTelur = jmlTelur;
        this.hargaTelur=hargaTelur;
    }
    public int getJmlTelur(){
        return this.jmlTelur;
    }
    public float getHargaTelur(){
        return this.hargaTelur;
    }
    public int getTotalTelur(){
        return this.jmlTelur * super.getTotal();
    }
    public float getTtlHargaTelur(){
        float totalHarga = this.hargaTelur * this.getTotalTelur();
        return totalHarga;
    }
    public String infoBebek(){
        String fromparent = super.info();
        String fromchild = String.format("Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: Rp.\nProfit/Hari\t\t: Rp.", this.jmlTelur, this.getTotalTelur(), this.hargaTelur, this.getTtlHargaTelur());
        return fromparent + fromchild;
    }
}
