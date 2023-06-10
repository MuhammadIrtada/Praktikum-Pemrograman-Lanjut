package MODUL_7;

abstract class Tanaman {
    protected int luas;
    protected int hasil;
    protected int hargaJual;
    protected int biayaPerawatan;

    public Tanaman(int luas, int hasil, int hargaJual, int biayaPerawatan) {
        this.luas = luas;
        this.hasil = hasil;
        this.hargaJual = hargaJual;
        this.biayaPerawatan = biayaPerawatan;
    }

    public abstract int hitungPendapatan();

    public int hitungBiayaPerawatan() {
        return luas * biayaPerawatan * 30;
    }
}

class Apel extends Tanaman {
    public Apel(int luas) {
        super(luas, 40, 25000, 900000);
    }

    @Override
    public int hitungPendapatan() {
        return luas * hasil * hargaJual * 30;
    }
}

class KelapaSawit extends Tanaman {
    public KelapaSawit(int luas) {
        super(luas, 500, 18000, 8500000);
    }

    @Override
    public int hitungPendapatan() {
        return luas * hasil * hargaJual * 30;
    }
}
