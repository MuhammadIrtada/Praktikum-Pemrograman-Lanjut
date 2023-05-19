public class Kelapa extends Tanaman{
    private int Jminyak;
    private float Hminyak;
    private float rawat;
    private String satuan = "Kg";

    public Kelapa (String jenis, int luas, float harga, int jm, float hm, float r){
        super(jenis,luas,harga);
        Jminyak = jm;
        Hminyak = hm;
        rawat = r;
    }

    public int getJminyak(){
        return Jminyak;
    }

    public float getHminyak(){
        return Hminyak;
    }

    public int getTotMinyak(){
        return Jminyak * super.getLuas();
    }

    public float getTotalHargaMinyak(){
        return Hminyak * getTotMinyak();
    }

    public float getBiayaRawat(){
        return rawat;
    }

    public float getProfit(){
        return getTotalHargaMinyak() - getBiayaRawat();
    }

    public String toString(){
            String fromHewan = super.toString();
            String fromChild = String.format("Minyak/Hektar\t\t: %d\nTotal Minyak/Hari\t: %d %s\nHarga Minyak/%s\t\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f\n", getJminyak(), getTotMinyak(), satuan, satuan,  getHminyak(), getProfit());
        return fromHewan + fromChild;
    }

}

