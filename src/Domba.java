public class Domba extends Hewan{
    private int jmlBulu;
    private float hargaBulu;

    public Domba(int kuantitas, int hargaHewan, int jumlahBulu, float hargaBulu, float biayaPerawatan){
        super("Domba", kuantitas, hargaHewan, biayaPerawatan);
        jmlBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
    }

    public int getJmlBulu() {
        return jmlBulu;
    }

    public float getHargaBulu() {
        return hargaBulu;
    }

    public int getTotalBulu(){
        return jmlBulu * super.getKuantitas();
    }

    public float getProfit(){
        return (getTotalBulu() * hargaBulu) - super.getPerawatanTotal();
    }

    public String showInfo(){
        return super.showInfo() + String.format("Bulu/Ekor\t\t\t\t: %d Liter\nTotal Bulu/Hari\t\t\t: %d Kg\nHarga Bulu/Kg\t\t\t: Rp. %,.0f\nProfit/Hari\t\t\t\t: Rp. %,.0f\n" + "=".repeat(50),
                jmlBulu, getTotalBulu(), hargaBulu, getProfit());
    }
}
