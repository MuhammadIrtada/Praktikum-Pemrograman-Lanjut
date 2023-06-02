import java.util.Locale;

public class Bebek extends Hewan {
    private int jmlTelur;
    private double hargaTelur;

    public Bebek(int kuantitas, int jumlahTelur, double hargaTelur, double biayaPerawatan){
        super("Bebek", kuantitas, biayaPerawatan);
        jmlTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
    }

    public int getJmlTelur() {
        return jmlTelur;
    }

    public double getHargaTelur() {
        return hargaTelur;
    }

    public int getTotalTelur(){
        return jmlTelur * super.getKuantitas();
    }

    public double getPendapatan(){
        return getTotalTelur() * 30 * hargaTelur;
    }

    public double getBiayaPerawatan(){
        return super.getPerawatanTotal() * 30;
    }

    public String showPendapatan(){
        return String.format("Bebek:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getPendapatan()));
    }

    public String showPerawatan(){
        return String.format("Bebek:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getBiayaPerawatan()));
    }
}
