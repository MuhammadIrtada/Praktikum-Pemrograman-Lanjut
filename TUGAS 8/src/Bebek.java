
import java.text.DecimalFormat;
public class Bebek extends Peternakan implements Interface  {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;

    Bebek(double jumlah) {
        super(jumlah);
        this.jenis = "Bebek";
        super.setJenis(this.jenis);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis += jenis;
    }

    public void Beli(int jumlah) {
        double hasil = jumlah * 110000;
        super.setJumlah(jumlah);
        System.out.println("Bebek            x(" + jumlah + ")\t: Rp " + formatter.format(hasil));
    }
}
