public class Unta extends Hewan{
    private int jmlSusu;
    private float hargaSusu;
    private float hargaUnta = 12000000;
    private float biayaPerawatan = 200000;

    Unta(String jenis, int kuantitas, int jmlSusu, float hargaSusu) {
        super(jenis, kuantitas);
        this.hargaSusu = hargaSusu;
        this.jmlSusu = jmlSusu;
    }
    public float getHarga(){
        return this.hargaUnta;
    }
    public int hitungTotal(){
        return this.jmlSusu * super.getKuantitas();
    }

    public float hitungProfit(){
        return (hitungTotal() * this.hargaSusu) - (this.biayaPerawatan * getKuantitas());
    }

    public String cetakInfo() {
        String infoUnta = String
                .format("Susu/Ekor\t\t: %d Liter\nTotal Susu/Hari\t\t: %d Liter\nHarga Susu/Liter\t: Rp. %,.0f\nProfit/Hari\t\t: %,.0f", jmlSusu, jmlSusu * super.getKuantitas(), hargaSusu, hitungProfit());
        return super.cetakInfo() + infoUnta;
    }
}
