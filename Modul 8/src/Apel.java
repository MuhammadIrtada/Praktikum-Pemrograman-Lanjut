import java.text.DecimalFormat;

public class Apel implements Kebun {
    static DecimalFormat formatter = new DecimalFormat("#, ###. ##");   
    private String jenis;
    private int jumlah;

    Apel(int jumlah) {
        this.jenis = "Apel";
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah += jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void pembelianKebun(int jumlah) {
        int hasil = jumlah * 7500000;
        setJumlah(jumlah);
        System.out.println("Apel\tx(" + (jumlah)+ ")\t\t" + "Rp "+ formatter.format(hasil));
    }
}
