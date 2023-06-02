import java.util.Locale;

public class KelapaSawit extends Tanaman {
    private int jmlMinyak;
    private double hargaMinyak;

    public KelapaSawit(int luas, int jumlahMinyak, double hargaMinyak, double biayaPerawatan){
        super("Apel", luas, biayaPerawatan);
        jmlMinyak = jumlahMinyak;
        this.hargaMinyak = hargaMinyak;
    }

    public int getJmlMinyak() {
        return jmlMinyak;
    }

    public double getHargaMinyak() {
        return hargaMinyak;
    }

    public int getTotalMinyak(){
        return jmlMinyak * super.getLuas();
    }

    public double getPendapatan(){
        return getTotalMinyak() * 30 * hargaMinyak;
    }

    public double getBiayaPerawatan(){
        return super.getPerawatanTotal() * 30;
    }

    public String showPendapatan(){
        return String.format("Kelapa Sawit:\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getPendapatan()));
    }

    public String showPerawatan(){
        return String.format("Kelapa Sawit:\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getBiayaPerawatan()));
    }
}
