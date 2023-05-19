public class Hewan1 extends App{
    private String jenis;
    private int kuantitas;
    private double perawatan;
    private double harga;

    public Hewan1 (String jenis, int kuantitas, double perawatan,double harga){
        this.jenis=jenis;
        this.kuantitas=kuantitas;
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

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public double getPerawatan() {
        return perawatan;
    }

    public void setPerawatan(double perawatan) {
        this.perawatan = perawatan;
    }
}

