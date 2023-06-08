public class Hewan  {
    private String jenis;
    private int kuantitas;
    private double harga;
    public Hewan (String jenis, int kuantitas, double harga){
        this.jenis=jenis;
        this.kuantitas=kuantitas;
        this.harga=harga;
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

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
