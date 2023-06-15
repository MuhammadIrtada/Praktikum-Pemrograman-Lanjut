abstract class pertanian {
    protected int luas;
    protected double harga;
    protected double perawatan;

    public pertanian(int luas, double harga, double perawatan) {
        this.luas = luas;
        this.harga = harga;
        this.perawatan = perawatan;
    }

    public abstract double pendapatan1();

    public abstract double perawatan1();

    public int getLuas() {
        return luas;
    }

    public double getHarga() {
        return harga;
    }

    public double getPerawatan() {
        return perawatan;
    }
}
