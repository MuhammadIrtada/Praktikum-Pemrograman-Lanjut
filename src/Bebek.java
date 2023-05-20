public class Bebek extends Hewan {
    private int jmlTelur;
    private float hargaTelur;
    private float hargaBebek = 110000;
    private float biayaPerawatan = 3000;

    Bebek(String jenis, int kuantitas, int jmlTelur, float hargaTelur) {
        super(jenis, kuantitas);
        this.hargaTelur = hargaTelur;
        this.jmlTelur = jmlTelur;
    }

    public float getHarga(){
        return hargaBebek;
    }

    public int hitungTotal(){
        return this.jmlTelur * super.getKuantitas();
    }

    public float hitungProfit(){
        return (hitungTotal() * this.hargaTelur) - (this.biayaPerawatan * this.getKuantitas());
    }


    public String cetakInfo() {
        String infoBebek = String
                .format("Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: Rp. %,.0f\nProfit/Hari\t\t: %,.0f", jmlTelur, hitungTotal(), hargaTelur, hitungProfit());
        return super.cetakInfo() + infoBebek;
    }
}
