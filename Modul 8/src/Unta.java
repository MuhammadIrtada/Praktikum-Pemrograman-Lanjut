import java.text.DecimalFormat;

public class Unta implements Ternak {
    static DecimalFormat formatter = new DecimalFormat("#, ###. ##");   
    private String jenis;
    private int jumlah;

    Unta(int jumlah) {
        this.jenis = "Unta";
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
        int hasil = jumlah * 12000000;
        setJumlah(jumlah);
        System.out.println("Unta\tx(" + (jumlah)+ ")\t\t" + "Rp "+ formatter.format(hasil));
    }

}
