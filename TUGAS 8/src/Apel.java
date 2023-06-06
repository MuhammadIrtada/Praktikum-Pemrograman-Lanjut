import java.text.DecimalFormat;
public class Apel extends Perkebunan implements Interface {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;

    Apel(double jumlah) {
        super(jumlah);
        this.jenis = "Apel";
        super.setJenis(this.jenis);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis += jenis;
    }

    public void Beli(int jumlah) {
        double hasil = jumlah * 7500000;
        super.setJumlah(jumlah);
        System.out.println("Apel            x(" + jumlah + ")\t: Rp " + formatter.format(hasil));
    }

}
