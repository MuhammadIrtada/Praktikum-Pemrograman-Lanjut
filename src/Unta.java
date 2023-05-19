public class Unta extends Hewan{
    private int Jsusu;
    private float Hsusu;
    private float rawat;
    private String satuan = "Liter";
    
    public Unta (String jenis, int jumlah, float harga, int js, float hs, float r){
        super(jenis, jumlah, harga);
        Jsusu = js;
        Hsusu = hs;
        rawat = r;
    }

    public int getJsusu(){
        return Jsusu;
    }

    public float getHsusu(){
        return Hsusu;
    }

    public int getTotSusu(){
        return Jsusu * super.getJumlah();
    }

    public float getTotalHargaSusu(){
        return Hsusu * getTotSusu();
    } 

    public float getBiayaRawat(){
        return rawat;
    }

    public float getProfit(){
        return getTotalHargaSusu() - getBiayaRawat();
    }

    public String toString(){
            String fromParent = super.toString();
            String fromUnta = String.format("Susu/Ekor\t\t: %d\nTotal Susu/Hari\t\t: %d %s\nHarga Susu/%s\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f\n", getJsusu(), getTotSusu(), satuan, satuan,  getHsusu(), getProfit());
            return fromParent + fromUnta;
    }

}
