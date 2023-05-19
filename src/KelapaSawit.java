public class KelapaSawit extends Tanaman{
    private int jmlMinyak;
    private float hargaMinyak;

    public KelapaSawit(int luas, int hargaTanaman, int jumlahMinyak, float hargaMinyak, float biayaPerawatan){
        super("Apel", luas, hargaTanaman, biayaPerawatan);
        jmlMinyak = jumlahMinyak;
        this.hargaMinyak = hargaMinyak;
    }

    public int getJmlMinyak() {
        return jmlMinyak;
    }

    public float getHargaMinyak() {
        return hargaMinyak;
    }

    public int getTotalMinyak(){
        return jmlMinyak * super.getLuas();
    }

    public float getProfit(){
        return (getTotalMinyak() * hargaMinyak) - super.getPerawatanTotal();
    }

    public String showInfo(){
        return super.showInfo() + String.format("Minyak/Hektar\t\t\t: %d Kg\nTotal Minyak/Hari\t\t: %d Kg\nHarga Minyak/Kg\t\t\t: Rp. %,.0f\nProfit/Hari\t\t\t\t: Rp. %,.0f\n" + "=".repeat(50),
                jmlMinyak, getTotalMinyak(), hargaMinyak, getProfit());
    }
}
