package modul6;

public class unta extends hewan {
    private int jmlSusu; //per hewan
    private float hargaSusu; //per telur

    public unta (String nama, int total, int jmlSusu, float hargaSusu){
        super(nama, total);
        this.jmlSusu=jmlSusu;
        this.hargaSusu=hargaSusu;
    }
    public int getJmlSusu(){
        return this.jmlSusu;
    }
    public float getHargaSusu(){
        return this.hargaSusu;
    }
    public int getTotalSusu(){
        return this.jmlSusu* super.getTotal();
    }
    public float getTtlHargaSusu(){
        float totalHarga = this.hargaSusu * this.getTotalSusu();
        return totalHarga;
    }
    public String info(){
        String fromparent = super.info();
        String fromchild = String.format("Susu/Liter\t\t: %d Liter\nTotal Susu/Liter\t: %d Liter\nHarga Susu/Liter\t: Rp. \nProfit/Hari\t\t: Rp.", this.jmlSusu, this.getTotalSusu(), this.hargaSusu, this.getTtlHargaSusu());
        return fromparent + fromchild;
    }
}
