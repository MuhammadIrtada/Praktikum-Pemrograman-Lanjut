class Bebek extends Hewan {
    public Bebek(int jumlahHewan) {
        super(jumlahHewan, 2, 2000, 3000);
    }

    public double hitungTotalProduksi() {
        return jumlahHewan * hasilProduksi * 30;
    }

    public double hitungTotalBiayaPerawatan() {
        return jumlahHewan * biayaPerawatan* 30;
    }

    public double hitungTotalPendapatan() {
        return hitungTotalProduksi() * hargaJual;
    }
}