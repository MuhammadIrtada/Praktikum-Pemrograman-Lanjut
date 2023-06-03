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
        this.jenis = jenis;
    }

    @Override
    public void Pembelian(int jumlah) {
        double hasil = jumlah * 18000000;
        super.setJumlah(jumlah);
        System.out.printf("%-20s x%d : Rp %s\n", getJenis(), jumlah, formatter.format(hasil));
    }

}
