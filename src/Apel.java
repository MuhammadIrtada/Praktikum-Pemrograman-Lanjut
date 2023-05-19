public class Apel extends Tanaman {
    private int Japel;
    private float Hapel;
    private float rawat;
    private String satuan = "Kg";

    public Apel (String jenis, int luas, float harga, int ja, float ha, float r){
        super(jenis,luas,harga);
        Japel = ja;
        Hapel = ha;
        rawat = r;
    }

    public int getJapel(){
        return Japel;
    }

    public float getHapel(){
        return Hapel;
    }

    public int getTotApel(){
        return Japel * super.getLuas();
    }

    public float getTotalHargaApel(){
        return Hapel * getTotApel();
    }

    public float getBiayaRawat(){
        return rawat;
    }

    public float getProfit(){
        return getTotalHargaApel() - getBiayaRawat();
    }

    public String toString(){
            String fromHewan = super.toString();
            String fromChild = String.format("Buah/Hektar\t\t: %d\nTotal Buah/Hari\t\t: %d %s\nHarga Buah/%s\t\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f\n", getJapel(), getTotApel(), satuan, satuan,  getHapel(), getProfit());
        return fromHewan + fromChild;
    }
}

