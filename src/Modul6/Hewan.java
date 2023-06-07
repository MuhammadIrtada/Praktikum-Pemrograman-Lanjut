package Modul6;

public abstract class Hewan {
    protected int jumlah;
    protected int hasilPerHari;
    protected int hargaHasil;
    protected int biayaPerawatan;

    public Hewan(int jumlah, int hasilPerHari, int hargaHasil, int biayaPerawatan) {
        this.jumlah = jumlah;
        this.hasilPerHari = hasilPerHari;
        this.hargaHasil = hargaHasil;
        this.biayaPerawatan = biayaPerawatan;
    }

    public int getProfit() {
        return jumlah * hasilPerHari * hargaHasil - jumlah * biayaPerawatan;
    }

    public void tambahJumlah(int jumlah) {
        this.jumlah += jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHasilPerHari() {
    return hasilPerHari;
}

public int getHargaHasil() {
    return hargaHasil;
}


    public abstract String getNama();
}
