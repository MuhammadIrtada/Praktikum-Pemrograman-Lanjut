package MODUL_6;

public class Hewan {
    String jenis;
    int jumlah;
    int hasil;
    int hargaHasil;
    int biayaPerawatan;

    int totalHasil() {
        return jumlah * hasil;
    }

    int profit() {
        return (totalHasil() * hargaHasil) - (biayaPerawatan * jumlah);
    }
}
