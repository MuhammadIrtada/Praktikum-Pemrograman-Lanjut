import java.text.DecimalFormat;
public class KelapaSawit extends Perkebunan implements Interface {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;

    KelapaSawit(double jumlah) {
        super(jumlah);
        this.jenis = "Kelapa Sawit";
        super.setJenis(this.jenis);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis += jenis;
    }

    public void Beli(int jumlah) {
        double hasil = jumlah * 18000000;
        super.setJumlah(jumlah);
        System.out.println("Kelapa Sawit      x(" + jumlah + ")\t: Rp " + formatter.format(hasil));
    }

}
