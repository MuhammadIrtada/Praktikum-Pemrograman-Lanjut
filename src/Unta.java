class Unta extends Hewan{
    public Unta(int jumlahHewan) {
        super(jumlahHewan, 5, 60000, 200000);
    }

    public double hitungTotalProduksi() {
        return jumlahHewan * hasilProduksi * 30;
    }

    public double hitungTotalBiayaPerawatan() {
        return jumlahHewan * biayaPerawatan * 30;
    }

    public double hitungTotalPendapatan() {
        return hitungTotalProduksi() * hargaJual;
    }
}