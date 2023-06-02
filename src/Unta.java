import java.util.Locale;

public class Unta extends Hewan {
    private int jmlSusu;
    private double hargaSusu;

    public Unta(int kuantitas, int jumlahSusu, double hargaSusu, double biayaPerawatan){
        super("Unta", kuantitas, biayaPerawatan);
        jmlSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
    }

    public int getJmlSusu() {
        return jmlSusu;
    }

    public double getHargaSusu() {
        return hargaSusu;
    }

    public int getTotalSusu(){
        return jmlSusu * super.getKuantitas();
    }

    public double getPendapatan(){
        return getTotalSusu() * 30 * hargaSusu;
    }

    public double getBiayaPerawatan(){
        return super.getPerawatanTotal() * 30;
    }

    public String showPendapatan(){
        return String.format("Unta:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getPendapatan()));
    }

    public String showPerawatan(){
        return String.format("Unta:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getBiayaPerawatan()));
    }
}
