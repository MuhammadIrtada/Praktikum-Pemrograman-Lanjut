import java.text.DecimalFormat;

public class KelapaSawit implements Kebun {
    static DecimalFormat formatter = new DecimalFormat("#, ###. ##");   
    private String jenis;
    private int jumlah;

    KelapaSawit(int jumlah) {
        this.jenis = "Kelapa Sawit";
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
        int hasil = jumlah * 18000000;
        setJumlah(jumlah);
        System.out.println("Kelapa Sawit\tx(" + (jumlah)+ ")\t\t" + "Rp "+ formatter.format(hasil));
    }

    
}
