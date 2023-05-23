public class Kelapa extends Tanaman {
    private float biayaPerawatan = 8500000;
    private float hargaKelapa = 18000000;
    private int jmlMinyak;
    private float hargaMinyak;

    Kelapa(String jenis, int luas, int jmlMinyak, float hargaMinyak){
        super(jenis, luas);
        this.jmlMinyak = jmlMinyak;
        this.hargaMinyak = hargaMinyak;
    }

    
    public float getHarga(){
        return this.hargaKelapa;
    }
    public int hitungTotal(){
        return this.jmlMinyak * super.getLuas();
    }

    public float hitungProfit(){
        return (hitungTotal() * this.hargaMinyak) - (this.biayaPerawatan * getLuas());
    }
    public String cetakInfo() {
        String infoKelapa = String
                .format("Minyak/Hari\t\t: %d kg\nTotal Minyak/Hari\t: %d kg\nHarga Minyak/kg\t\t: Rp. %,.0f\nProfit/Hari\t\t: %,.0f", this.jmlMinyak, hitungTotal(), this.hargaMinyak, hitungProfit());
        return super.cetakInfo() + infoKelapa;
    }
}
