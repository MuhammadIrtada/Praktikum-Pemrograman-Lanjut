public class Tanaman1 extends App{
    private String jenis;
    private double luas;
    private double perawatan;
    private double harga;
    public Tanaman1 (String jenis, double luas, double perawatan,double harga){
        this.jenis=jenis;
        this.luas=luas;
        this.perawatan=perawatan;
        this.harga=harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getPerawatan() {
        return perawatan;
    }

    public void setPerawatan(double perawatan) {
        this.perawatan = perawatan;
    }
}