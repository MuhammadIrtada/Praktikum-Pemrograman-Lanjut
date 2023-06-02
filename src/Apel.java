
import java.util.Locale;

public class Apel extends Tanaman {
    private int jmlApel;
    private double hargaApel;

    public Apel(int luas, int jumlahApel, double hargaApel, double biayaPerawatan){
        super("Apel", luas, biayaPerawatan);
        jmlApel = jumlahApel;
        this.hargaApel = hargaApel;
    }

    public int getJmlApel() {
        return jmlApel;
    }

    public double getHargaApel() {
        return hargaApel;
    }

    public int getTotalApel(){
        return jmlApel * super.getLuas();
    }

    public double getPendapatan(){
        return getTotalApel() * 30 * hargaApel;
    }

    public double getBiayaPerawatan(){
        return super.getPerawatanTotal() * 30;
    }

    public String showPendapatan(){
        return String.format("Apel:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getPendapatan()));
    }

    public String showPerawatan(){
        return String.format("Apel:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getBiayaPerawatan()));
    }
}
