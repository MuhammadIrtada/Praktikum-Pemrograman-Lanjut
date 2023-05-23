public class Belanja {
    static private int ke = 1;
    private String deskripsi;
    private int urutan;
    private int jumlah;
    private int harga;
    private int total;

    // constructor
    public Belanja(String deskripsi, int ke, int jumlah, int harga, int total) {
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
        this.urutan = ke;
    }

    public static int getKe() {
        return ke;
    }

    public static void setKe(int ke) {
        Belanja.ke = ke;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String toString() {
        return "=".repeat(40) + "\n" + "Transaksi\t\t  : " + ke + "\n" + "-".repeat(40) + "\n"
                + "Deskripsi\t\t : " + deskripsi + "\n" + "Jumlah unit\t\t : " + jumlah
                + "\n" + "Harga\t\t\t : " + harga + "\n" + "Total Harga\t\t : " + total;
    }
}
