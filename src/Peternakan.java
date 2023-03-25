public class Peternakan {
    private String jenis;
    private String ras;
    private int jumlah;
    private double dosis;

    public Peternakan() {
        this.jenis = "";
        this.ras = "";
        this.jumlah = 0;
        this.dosis = 0;
    }

    public Peternakan(String jenis, String ras, int jumlah) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.dosis = 0;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public double getDosis() {
        return dosis;
    }

    public void hitungDosis() {
        if (ras.equalsIgnoreCase("telur biasa")) {
            dosis = 5.0;
        } else if (ras.equalsIgnoreCase("telur asin")) {
            dosis = 8.0;
        } else if (ras.equalsIgnoreCase("susu putih")) {
            dosis = 10.0;
        } else if (ras.equalsIgnoreCase("susu coklat")) {
            dosis = 15.0;
        } else if (ras.equalsIgnoreCase("bulu hitam")) {
            dosis = 9.0;
        } else if (ras.equalsIgnoreCase("bulu putih")) {
            dosis = 14.0;
        }

        dosis = dosis * jumlah;
    }

    public void tampilkanData() {
        
       
        System.out.println("Ras : " + ras);
        System.out.println("Jumlah : " + jumlah + " ekor");
        System.out.println("Dosis obat/ekor/hari : " + (int)dosis / jumlah + "mL");
        System.out.println("--------------------------");
        
    }

    
}

