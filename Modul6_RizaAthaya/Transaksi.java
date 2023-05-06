import java.text.DecimalFormat;

public class Transaksi {
    static private DecimalFormat formatter = new DecimalFormat("#,###");
    static private int ke = 1;
    private String deskripsi;
    private int urutan;
    private int jumlah;
    private int harga;
    private int total;

    // constructor
    public Transaksi(String deskripsi, int jumlah, int harga, int total) {
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
        this.urutan = ke;
        ke++;
    }

    // method show detail transaction
    public void getDetail() {
        System.out.println("=".repeat(40));
        System.out.println("Transaksi " + this.urutan);
        System.out.println("-".repeat(40));
        System.out.printf("%-20s : %s\n", "Deskripsi", this.deskripsi);
        System.out.printf("%-20s : %s\n", "Jumlah Unit", formatter.format(this.jumlah));
        System.out.printf("%-20s : %s\n", "Harga", "Rp. " + formatter.format(this.harga));
        System.out.printf("%-20s : %s\n", "Total Biaya", "Rp. " + formatter.format(this.total));
    }
}
