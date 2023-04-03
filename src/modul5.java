package prakt;


public class modul5 {
    private String jenis;
    private String ras;
    private int jumlah;
    private int jumlahHasil;
    private int hargaEkor;

    public modul5(String jenis, String ras, int jumlah, int jumlahHasil, int hargaEkor) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.jumlahHasil = jumlahHasil;
        this.hargaEkor = hargaEkor;
    }

    public String getJenis() {
        return jenis;
    }

    public String getRas() {
        return ras;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getJumlahHasil() {
        return jumlahHasil;
    }

    public int getHargaEkor() {
        return hargaEkor;
    }

    public int getTotalHasilTernak() {
        return jumlah * jumlahHasil;
    }

    public int getHargaTernak() {
        return getTotalHasilTernak() * hargaEkor;
    }

    public int getHargaTernakSetelahPPN() {
        return (int) Math.round(getHargaTernak() * (1 - mainModul5.PPN));
    }
}
