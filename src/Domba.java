
public class Domba extends Hewan {
    private int Jbulu;
    private float Hbulu;
    private float rawat;
    private String satuan = "Kg";

    public Domba (String jenis, int jumlah, float harga, int jb, float hb, float r){
        super(jenis,jumlah,harga);
        Jbulu = jb;
        Hbulu = hb;
        rawat = r;
    }

    public int getJbulu(){
        return Jbulu;
    }

    public float getHbulu(){
        return Hbulu;
    }

    public int getTotBulu(){
        return Jbulu * super.getJumlah();
    }

    public float getTotalHargaBulu(){
        return Hbulu * getTotBulu();
    }

    public float getBiayaRawat(){
        return rawat;
    }

    public float getProfit(){
        return getTotalHargaBulu() - getBiayaRawat();
    }

    public String toString(){
            String fromHewan = super.toString();
            String fromChild = String.format("Bulu/Ekor\t\t: %d\nTotal Bulu/Hari\t\t: %d %s\nHarga Bulu/%s\t\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f\n", getJbulu(), getTotBulu(),satuan, satuan,  getHbulu(), getProfit());
        return fromHewan + fromChild;
    }

}

