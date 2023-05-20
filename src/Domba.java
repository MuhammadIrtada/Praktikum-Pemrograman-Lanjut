public class Domba extends Hewan{
    private int jmlBulu;
    private float hargaBulu;
    private float hargaDomba = 2450000;
    private float biayaPerawatan = 45000;

    Domba(String jenis, int kuantitas, int jmlBulu, float hargaBulu){
        super(jenis, kuantitas);
        this.jmlBulu = jmlBulu;
        this.hargaBulu = hargaBulu;
    }

    public float getHarga(){
        return this.hargaDomba;
    }
    public int hitungTotal(){
        return this.jmlBulu * super.getKuantitas();
    }

    public float hitungProfit(){
        return (hitungTotal() * this.hargaBulu) - (this.biayaPerawatan * getKuantitas());
    }
    public String cetakInfo() {
        String infoDomba = String
                .format("Bulu/Ekor\t\t: %d kg\nTotal Bulu/Hari\t\t: %d kg\nHarga Bulu/kg\t\t: Rp. %,.0f\nProfit/Hari\t\t: %,.0f", this.jmlBulu, hitungTotal(), this.hargaBulu, hitungProfit());
        return super.cetakInfo() + infoDomba;
    }
    
}
