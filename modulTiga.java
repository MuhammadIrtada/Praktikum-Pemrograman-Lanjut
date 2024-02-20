public class modulTiga {
    private String jenis;
    private String ras;
    private int jumlah;
    private double dosis;

    public modulTiga(String jenis, String ras, int jumlah, double dosis) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.dosis = dosis;
    }
    public modulTiga(String jenis, String ras, int jumlah) {
        this(jenis, ras, jumlah, 0.0);
    }
    public double hitungDosisObat() {
        return this.jumlah * this.dosis;
    }
    public double hitungDosisObat(double frekuensi) {
        return this.jumlah * this.dosis * frekuensi;
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

    public double getDosis() {
        return dosis;
    }
}