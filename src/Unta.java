public class Unta extends Hewan{
    private int jmlSusu;
    private float hargaSusu;

    public Unta(int kuantitas, int hargaHewan, int jumlahSusu, float hargaSusu, float biayaPerawatan){
        super("Unta", kuantitas, hargaHewan, biayaPerawatan);
        jmlSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
    }

    public int getJmlSusu() {
        return jmlSusu;
    }

    public float getHargaSusu() {
        return hargaSusu;
    }

    public int getTotalSusu(){
        return jmlSusu * super.getKuantitas();
    }

    public float getProfit(){
        return (getTotalSusu() * hargaSusu) - super.getPerawatanTotal();
    }

    public String showInfo(){
        return super.showInfo() + String.format("Susu/Ekor\t\t\t\t: %d Liter\nTotal Susu/Hari\t\t\t: %d Liter\nHarga Susu/Liter\t\t: Rp. %,.0f\nProfit/Hari\t\t\t\t: Rp. %,.0f\n" + "=".repeat(50),
                jmlSusu, getTotalSusu(), hargaSusu, getProfit());
    }
}
