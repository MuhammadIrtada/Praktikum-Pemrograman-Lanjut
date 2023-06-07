abstract class Tanaman {
    protected int luasHektar;
    protected double hasilPerHari;
    protected double hargaJual;
    protected double biayaPerawatan;

    public double getPendapatan() {
        return luasHektar * hasilPerHari * hargaJual * 30;
    }

    public double getBiayaPerawatan() {
        return luasHektar * biayaPerawatan * 30;
    }

    public abstract String getJenisTanaman();
}
