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
        this.jenis = jenis;
    }

    @Override
    public void Pembelian(int jumlah) {
        double hasil = jumlah * 2450000;
        super.setJumlah(jumlah);
        System.out.printf("%-20s x%d : Rp %s\n", getJenis(), jumlah, formatter.format(hasil));
    }

}
