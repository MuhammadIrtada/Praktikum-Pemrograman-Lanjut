public class Peternakan {
    public String jenis;
    public String ras;
    public int jumlah;
    public String jenisHasil;
    public String satuanHasil;
    public int banyakHasil;
    public int total;
    public int harga;
    public int totalMasuk1;
    public int totalMasuk2;

    public String getJenis() {
        return jenis;
    }

    public String getRas() {
        return ras;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getJenisHasil() {
        return jenisHasil;
    }

    public String getSatuanHasil() {
        return satuanHasil;
    }

    public int getBanyakHasil() {
        return banyakHasil;
    }

    public int getTotal() {
        return jumlah * banyakHasil;
    }

    public int getHarga() {
        return harga;
    }
    
    public int getTotalMasuk1() {
        return totalMasuk1;
    }

    public int getTotalMasuk2() {
        return totalMasuk2;
    }

    public Peternakan(String jenis, String ras, String jenisHasil, String satuanHasil, int jumlah, int banyakHasil, int harga) {
        this.jenis = jenis;
        this.ras = ras;
        this.jenisHasil = jenisHasil;
        this.satuanHasil = satuanHasil;
        this.jumlah = jumlah;
        this.banyakHasil = banyakHasil;
        this.harga = harga;
    }
}
