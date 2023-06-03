import java.text.DecimalFormat;

public class Bebek extends Peternakan implements Interface {
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
        this.jenis = jenis;
    }

    @Override
    public void Pembelian(int jumlah) {
        // TODO Auto-generated method stub
        double hasil = jumlah * 110000;
        super.setJumlah(jumlah);
        System.out.printf("%-20s x%d : Rp %s\n", getJenis(), jumlah, formatter.format(hasil));
    }

}
