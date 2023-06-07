package Modul6;

public abstract class Tanaman {
    protected int luas;
    protected int hasilPerHari;
    protected int hargaHasil;
    protected int biayaPerawatan;

    public Tanaman(int luas, int hasilPerHari, int hargaHasil, int biayaPerawatan) {
        this.luas = luas;
        this.hasilPerHari = hasilPerHari;
        this.hargaHasil = hargaHasil;
        this.biayaPerawatan = biayaPerawatan;
    }public int getHasilPerHari() {
    return hasilPerHari;
}

public int getHargaHasil() {
    return hargaHasil;
}


    public int getProfit() {
        return luas * hasilPerHari * hargaHasil - luas * biayaPerawatan;
    }

    public void tambahLuas(int luas) {
        this.luas += luas;
    }

    public int getLuas() {
        return luas;
    }

    public abstract String getNama();
}

