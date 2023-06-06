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
        for (Peternakan a : alls) {
            System.out.println( a.getJenis()+ "\t\t: " + a.getJumlah());

        }
    }

}