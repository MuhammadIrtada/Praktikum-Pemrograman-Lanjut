class KelapaSawit extends Tanaman {
    public KelapaSawit(double area) {
        super(area, 500, 18000, 8500000);
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