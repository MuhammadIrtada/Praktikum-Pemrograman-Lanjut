package modul6;

public class apel extends tumbuhan{
    private int jmlApel; //per hewan
    private float hargaApel; //per telur

    public apel (String nama, int total, int jmlApel, float hargaApel){
        super(nama, total);
        this.jmlApel=jmlApel;
        this.hargaApel=hargaApel;
    }
    public int getJmlApel(){
        return this.jmlApel;
    }
    public float getHargaApel(){
        return this.hargaApel;
    }
    public int getTotalApel(){
        return this.jmlApel* super.getTotal();
    }
    public float getTtlHargaApel(){
        float totalHarga = this.hargaApel * this.getTotalApel();
        return totalHarga;
    }
    public String info(){
        String fromparent = super.info();
        String fromchild = String.format("Buah/Hektar\t\t: %d Kg\nTotal Apel/Hari\t\t: %d Kg\nHarga Apel/Butir\t: Rp. \nProfit/Hari\t\t: Rp.", this.jmlApel, this.getTotalApel(), this.hargaApel, this.getTtlHargaApel());
        return fromparent + fromchild;
    }
}
