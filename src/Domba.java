import java.util.Locale;

public class Domba extends Hewan {
    private int jmlBulu;
    private double hargaBulu;

    public Domba(int kuantitas, int jumlahBulu, double hargaBulu, double biayaPerawatan){
        super("Domba", kuantitas, biayaPerawatan);
        jmlBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
    }

    public int getJmlBulu() {
        return jmlBulu;
    }

    public double getHargaBulu() {
        return hargaBulu;
    }

    public int getTotalBulu(){
        return jmlBulu * super.getKuantitas();
    }

    public double getPendapatan(){
        return getTotalBulu() * 30 * hargaBulu;
    }

    public double getBiayaPerawatan(){
        return super.getPerawatanTotal() * 30;
    }

    public String showPendapatan(){
        return String.format("Domba:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getPendapatan()));
    }

    public String showPerawatan(){
        return String.format("Domba:\t\t\t%19s", String.format(Locale.ITALY,"Rp %,.2f", getBiayaPerawatan()));
    }
}
