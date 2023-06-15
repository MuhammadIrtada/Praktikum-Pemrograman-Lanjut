abstract class peternakan {
    protected int kuantitas;
    protected double harga;
    protected double perawatan;

    public peternakan(int kuantitas, double harga, double perawatan) {
        this.kuantitas = kuantitas;
        this.harga = harga;
        this.perawatan = perawatan;
    }

    public abstract double pendapatan1();

    public abstract double perawatan1();

    public int getKuantitas() {
        return kuantitas;
    }

    public double getHarga() {
        return harga;
    }

    public double getPerawatan() {
        return perawatan;
    }
}
