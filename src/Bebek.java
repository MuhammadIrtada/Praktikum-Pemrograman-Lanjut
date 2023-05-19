public class Bebek extends Hewan{
    private int Jtelur;
    private float Htelur;
    private float rawat;
    private String satuan = "Butir";

    public Bebek (String jenis, int jumlah,float harga, int jt, float ht, float r ){
        super(jenis,jumlah,harga);
        Jtelur = jt;
        Htelur = ht;
        rawat = r;
    }

    public int getJtelur(){
        return Jtelur;
    }

    public float getHtelur(){
        return Htelur;
    }

    public int getTotTelur(){
        return Jtelur * super.getJumlah();
    }

    public float getTotalHargaTelur(){
        return Htelur * getTotTelur();
    }

    public float getBiayaRawat(){
        return rawat;
    }

    public float getProfit(){
        return getTotalHargaTelur() - getBiayaRawat();
    }

    public String toString(){
            String fromParent = super.toString();
            String fromChild = String.format("Telur/Ekor\t\t: %d\nTotal Telur/Hari\t: %d %s\nHarga Telur/%s\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f\n", getJtelur(), getTotTelur(),satuan, satuan,  getHtelur(), getProfit());
        return fromParent + fromChild;
    }


}
