public class Bebek extends Hewan{
    private int jmlTelur;
    private float hargaTelur;

    public Bebek(int kuantitas, int hargaHewan, int jumlahTelur, float hargaTelur, float biayaPerawatan){
        super("Bebek", kuantitas, hargaHewan, biayaPerawatan);
        jmlTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
    }

    public int getJmlTelur() {
        return jmlTelur;
    }

    public float getHargaTelur() {
        return hargaTelur;
    }

    public int getTotalTelur(){
        return jmlTelur * super.getKuantitas();
    }

    public float getProfit(){
        return (getTotalTelur() * hargaTelur) - super.getPerawatanTotal();
    }

    public String showInfo(){
        return super.showInfo() + String.format("Telur/Ekor\t\t\t\t: %d Butir\nTotal Telur/Hari\t\t: %d Butir\nHarga Telur/Butir\t\t: Rp. %,.0f\nProfit/Hari\t\t\t\t: Rp. %,.0f\n" + "=".repeat(50),
                jmlTelur, getTotalTelur(), hargaTelur, getProfit());
    }
}
