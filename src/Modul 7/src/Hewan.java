abstract class Hewan {
    protected int jumlah;
    protected double hasilPerHari;
    protected double hargaJual;
    protected double biayaPerawatan;

    public double getPendapatan() {
        return jumlah * hasilPerHari * hargaJual * 30;
    }

    public double getBiayaPerawatan() {
        return jumlah * biayaPerawatan * 30;
    }

    public abstract String getJenisHewan();
}
