public abstract class Hewan {
    protected int jumlah;
    protected double hargaJual;
    protected double biayaPerawatan;

    public Hewan(int jumlah, double hargaJual, double biayaPerawatan) {
        this.jumlah = jumlah;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public abstract double hitungPendapatan();

    public abstract double hitungBiayaPerawatan();
}
