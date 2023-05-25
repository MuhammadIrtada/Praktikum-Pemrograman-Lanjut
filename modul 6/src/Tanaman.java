public class Tanaman {
    protected int jumlahHektar;
    protected int biayaPerawatan;
    protected int hasil;
    protected int hargaJual;

    public Tanaman(int jumlahHektar, int biayaPerawatan, int hasil, int hargaJual) {
        this.jumlahHektar = jumlahHektar;
        this.biayaPerawatan = biayaPerawatan;
        this.hasil = hasil;
        this.hargaJual = hargaJual;
    }

    public int getJumlahHektar() {
        return jumlahHektar;
    }

    public int getBiayaPerawatan() {
        return biayaPerawatan;
    }

    public int getHasil() {
        return hasil;
    }

    public int getHargaJual() {
        return hargaJual;
    }
}
