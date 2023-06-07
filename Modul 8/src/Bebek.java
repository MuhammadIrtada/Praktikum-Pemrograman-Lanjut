import java.text.DecimalFormat;
public class Bebek implements Ternak {
    static DecimalFormat formatter = new DecimalFormat("#, ###. ##");   
    private String jenis;
    private int jumlah;

    Bebek(int jumlah) {
        this.jenis = "Bebek";
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
    public void pembelianTernak(int jumlah) {
        int hasil = jumlah * 110000;
        setJumlah(jumlah);
        System.out.println("Bebek\tx(" + (jumlah)+ ")\t\t" + "Rp "+ formatter.format(hasil));
    }

}
