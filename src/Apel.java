class Apel extends Tanaman  {
    public Apel(double area) {
        super(area, 40, 25000, 900000);
    }

    public double hitungTotalProduksi() {
        return area * hasilProduksi * 30;
    } 

    public double hitungTotalBiayaPerawatan() {
        return area * biayaPerawatan * 30;
    }

    public double hitungTotalPendapatan() {
        return hitungTotalProduksi() * hargaJual;
    }
}