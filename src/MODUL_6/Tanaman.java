package MODUL_6;

public class Tanaman {
    String jenis;
    int luas;
    int hasil;
    int hargaHasil;
    int biayaPerawatan;

    int totalHasil() {
        return luas * hasil;
    }

    int profit() {
        return (totalHasil() * hargaHasil) - (biayaPerawatan * luas);
    }
}