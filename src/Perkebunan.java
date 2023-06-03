import java.text.DecimalFormat;

public class Perkebunan {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private double jumlah;
    private String jenis;

    Perkebunan(double jumlah) {
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

    public static void detail(Perkebunan[] all) {
        for (Perkebunan p : all) {
            System.out.printf("%-20s: %s hektar\n", p.getJenis(), formatter.format((int) p.getJumlah()));
        }

    }
}
