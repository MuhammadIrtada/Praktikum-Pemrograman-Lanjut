public class Apel extends Tanaman{
    private float biayaPerawatan = 900000;
    private float hargaKebun = 7500000;
    private int jmlApel;
    private float hargaApel;

    Apel(String jenis, int luas, int jmlApel, float hargaApel){
        super(jenis, luas);
        this.jmlApel = jmlApel;
        this.hargaApel = hargaApel;
    }

    
    public float getHarga(){
        return this.hargaKebun;
    }
    public int hitungTotal(){
        return this.jmlApel * super.getLuas();
    }

    public float hitungProfit(){
        return (hitungTotal() * this.hargaApel) - (this.biayaPerawatan * getLuas());
    }
    public String cetakInfo() {
        String infoApel = String
                .format("Apel/Hari\t\t: %d kg\nTotal Apel/Hari\t\t: %d kg\nHarga Apel/kg\t\t: Rp. %,.0f\nProfit/Hari\t\t: %,.0f", this.jmlApel, hitungTotal(), this.hargaApel, hitungProfit());
        return super.cetakInfo() + infoApel;
    }
}

