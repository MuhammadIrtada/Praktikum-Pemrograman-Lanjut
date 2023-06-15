package modul6;

public class domba extends hewan{
    private int jmlBulu; //per hewan
    private float hargaBulu; //per telur

    public domba (String nama, int total, int jmlBulu, float hargaBulu){
        super(nama, total);
        this.jmlBulu=jmlBulu;
        this.hargaBulu=hargaBulu;
    }
    public int getJmlBulu(){
        return this.jmlBulu;
    }
    public float getHargaBulu(){
        return this.hargaBulu;
    }
    public int getTotalBulu(){
        return this.jmlBulu* super.getTotal();
    }
    public float getTtlHargaBulu(){
        float totalHarga = this.hargaBulu * this.getTotalBulu();
        return totalHarga;
    }
    public String info(){
        String fromparent = super.info();
        String fromchild = String.format("Bulu/Ekor\t\t: %d Butir\nTotal Bulu/Hari\t\t: %d Butir\nHarga Bulu/Butir\t: Rp. \nProfit/Hari\t\t: Rp.", this.jmlBulu, this.getTotalBulu(), this.hargaBulu, this.getTtlHargaBulu());
        return fromparent + fromchild;
    }
}
