public class Apel extends Tanaman{
    private int jmlApel;
    private float hargaApel;

    public Apel(int luas, int hargaTanaman, int jumlahApel, float hargaApel, float biayaPerawatan){
        super("Apel", luas, hargaTanaman, biayaPerawatan);
        jmlApel = jumlahApel;
        this.hargaApel = hargaApel;
    }

    public int getJmlApel() {
        return jmlApel;
    }

    public float getHargaApel() {
        return hargaApel;
    }

    public int getTotalApel(){
        return jmlApel * super.getLuas();
    }

    public float getProfit(){
        return (getTotalApel() * hargaApel) - super.getPerawatanTotal();
    }

    public String showInfo(){
        return super.showInfo() + String.format("Buah/Hektar\t\t\t\t: %d Kg\nTotal Buah/Hari\t\t\t: %d Kg\nHarga Buah/Kg\t\t\t: Rp. %,.0f\nProfit/Hari\t\t\t\t: Rp. %,.0f\n" + "=".repeat(50),
                jmlApel, getTotalApel(), hargaApel, getProfit());
    }
}
