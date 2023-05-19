import java.text.NumberFormat;
import java.util.Locale;

public class Bebek1 extends Hewan1 {
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    private int jumlahTelur;
    private double hargaTelur;

    public Bebek1(String jenis, int kuantitas, double perawatan, double harga, int jumlahTelur, double hargaTelur) {
        super(jenis, kuantitas, perawatan, harga);
        this.jumlahTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
    }

    public int getTotalTelur() {
        return this.jumlahTelur * super.getKuantitas();
    }

    public double getProfit() {
        double profitKotor, profitBersih, perawatan;
        profitKotor = this.getHargaTelur() * getTotalTelur();
        perawatan = super.getKuantitas() * super.getPerawatan();
        profitBersih = profitKotor - perawatan;
        return profitBersih;
    }

    public void showInformasi() {
        System.out.println("Jenis                   : " + super.getJenis());
        System.out.println("Jumlah                  : " + super.getKuantitas() + " ekor");
        System.out.println("Telur/Ekor              : " + this.getJumlahTelur() + " butir");
        System.out.println("Total Telur/Hari        : " + this.getTotalTelur() + " butir");
        System.out.println("Harga Telur/Butir       : Rp. " + nf.format(this.getHargaTelur()));
        System.out.println("Profit/Hari             : Rp. " + nf.format(this.getProfit()));
        System.out.println("=".repeat(50));

    }

    public int getJumlahTelur() {
        return jumlahTelur;
    }

    public void setJumlahTelur(int jumlahTelur) {
        this.jumlahTelur = jumlahTelur;
    }

    public double getHargaTelur() {
        return hargaTelur;
    }

    public void setHargaTelur(double hargaTelur) {
        this.hargaTelur = hargaTelur;
    }

}
