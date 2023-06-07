class Domba extends Hewan{
    public Domba(int jumlahHewan) {
        super(jumlahHewan, 4, 15000, 45000);
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