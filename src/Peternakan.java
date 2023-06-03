import java.text.DecimalFormat;

public class Peternakan {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;
    private double jumlah;

    Peternakan(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah += jumlah;
    }

    public static void detail(Peternakan[] alls) {
        for (Peternakan p : alls) {
            System.out.printf("%-20s: %s ekor\n", p.getJenis(), formatter.format((int) p.getJumlah()));
        }
    }

}
