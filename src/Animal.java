public class Animal {
    private String jenis;
    private String ras;
    private int jumlah;
    private double dosis;

    // Constructor overloading
    public Animal(String jenis, String ras, int jumlah) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
    }

    public Animal(String jenis, String ras, int jumlah, double dosis) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.dosis = dosis;
    }

    // Method overloading
    public double hitungDosis() {
        if (ras.equalsIgnoreCase("telur biasa")) {
            dosis = jumlah * 5;
        } else if (ras.equalsIgnoreCase("telur asin")) {
            dosis = jumlah * 8;
        } else if (ras.equalsIgnoreCase("susu putih")) {
            dosis = jumlah * 10;
        } else if (ras.equalsIgnoreCase("susu coklat")) {
            dosis = jumlah * 15;
        } else if (ras.equalsIgnoreCase("bulu hitam")) {
            dosis = jumlah * 9;
        } else if (ras.equalsIgnoreCase("bulu putih")) {
            dosis = jumlah * 14;
        } else {
            dosis = 0;
        }
        return dosis;
    }

    public double hitungDosis(double dosis) {
        this.dosis = dosis;
        return dosis;
    }

    // Encapsulation
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public String toString() {
        return jenis + " " + ras + ": " + hitungDosis() + "mL/hari";
    }
}
