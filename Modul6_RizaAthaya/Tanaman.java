import java.text.DecimalFormat;

public class Tanaman {
    static private DecimalFormat formatter = new DecimalFormat("#,###");
    private String jenis;
    private String satuan;
    private int jumlah;
    private int total;
    private int harga;
    private int profit;
    private int perunit;
    private int jual;
    private int potongan;

    // constructor
    public Tanaman(String jenis, String satuan, int jumlah, int perunit, int harga, int jual, int potongan) {
        this.jenis = jenis;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.perunit = perunit;
        this.harga = harga;
        this.jual = jual;
        this.potongan = potongan;
        this.total = perunit * jumlah;
        this.profit = total * harga / potongan;
    }

    // set get
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah += jumlah;
        this.total = perunit * this.jumlah;
        this.profit = this.total * this.harga / this.potongan;
    }

    public int getProfit() {
        return profit;
    }

    public int getPerunit() {
        return perunit;
    }

    public void setPerunit(int perunit) {
        this.perunit = perunit;
        this.total = this.perunit * jumlah;
        this.profit = this.total * this.harga / this.potongan;
    }

    public int getTotal() {
        return total;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
        this.profit = this.total * this.harga / this.potongan;
    }

    public int getJual() {
        return jual;
    }

    public int getPotongan() {
        return potongan;
    }

    // other method
    public void showAll() {
        System.out.printf("%-20s : %s\n", "Jenis", getJenis());
        System.out.printf("%-20s : %s %s\n", "Jumlah ", getJumlah(), "Hektar");
        System.out.printf("%-20s : %s %s\n", (getSatuan() + "/Hektar"), getPerunit(), "Kg");
        System.out.printf("%-20s : %s %s\n", ("Total " + getSatuan() + "/Hari"), getTotal(), "Kg");
        System.out.printf("%-20s : %s %s\n", ("Harga " + getSatuan() + "/Kg"), "Rp.", formatter.format(getHarga()));
        System.out.printf("%-20s : %s %s\n", "Profit/Hari", "Rp.", formatter.format(getProfit()));
    }

}
