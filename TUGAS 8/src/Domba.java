import java.text.DecimalFormat;
public class Domba extends Peternakan implements Interface {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;

    Domba(double jumlah) {
        super(jumlah);
        this.jenis = "Domba";
        super.setJenis(this.jenis);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis += jenis;
    }


    public void Beli(int jumlah) {
        double hasil = jumlah * 2450000;
        super.setJumlah(jumlah);
        System.out.println("Domba            x(" + jumlah + ")\t: Rp " + formatter.format(hasil));
    }
}
