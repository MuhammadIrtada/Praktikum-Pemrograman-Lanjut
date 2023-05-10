import java.text.DecimalFormat;

public class Hewan {
    static private DecimalFormat formatter = new DecimalFormat("#,###");
    private String jenis;
    private String satuan;
    private String item;
    private int jumlah;
    private int profit;
    private int perunit;
    private int total;
    private int harga;
    private int jual;
    private int potongan;

    // constructor
    public Hewan(String jenis, String item, String satuan, int jumlah, int perunit, int harga, int jual, int potongan) {
        this.jenis = jenis;
        this.item = item;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.perunit = perunit;
        this.harga = harga;
        this.jual = jual;
        this.potongan = potongan;
        this.total = perunit * jumlah;
        this.profit = this.total * this.harga / potongan;
    }

    // set get
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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
        this.profit = this.total * this.harga / potongan;
    }

    public int getProfit() {
        return profit;
    }

    public int getPerunit() {
        return perunit;
    }

    public void setPerunit(int perunit) {
        this.perunit = perunit;
        this.total = perunit * this.jumlah;
        this.profit = this.total * this.harga / potongan;
    }

    public int getTotal() {
        return total;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
        this.profit = this.total * this.harga / potongan;
    }

    public int getJual() {
        return jual;
    }

    // other method
    public void showAll() {
        System.out.printf("%-20s : %s\n", "Jenis", getJenis());
        System.out.printf("%-20s : %s %s\n", "Jumlah ", getJumlah(), "Ekor");
        System.out.printf("%-20s : %s %s\n", (getItem() + "/Ekor"), getPerunit(), getSatuan());
        System.out.printf("%-20s : %s %s\n", ("Total " + getItem() + "/Hari"), getTotal(), getSatuan());
        System.out.printf("%-20s : %s %s\n", ("Harga " + getItem() + "/Kg"), "Rp.", formatter.format(getHarga()));
        System.out.printf("%-20s : %s %s\n", "Profit/Hari", "Rp.", formatter.format(getProfit()));
    }

}
