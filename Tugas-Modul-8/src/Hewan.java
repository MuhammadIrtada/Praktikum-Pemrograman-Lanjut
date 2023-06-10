public class Hewan implements Interface {
    private String nama;
    private int jumlahskrg;
    private int hargaBeli;
    private int jumlahBeli;
    private int totalBeli;

    public Hewan (String nama, int jumlahSkrg, int hargaBeli){
        this.nama = nama;
        this.jumlahskrg = jumlahSkrg;
        this.hargaBeli = hargaBeli;
    }
    public Hewan(){

    }

    public String getNama() {
        return nama;
    }

    public void setJumlahskrg(int jumlahskrg) {
        this.jumlahskrg = jumlahskrg;
    }

    public int getJumlahskrg() {
        return jumlahskrg;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }
    
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setTotalBeli(int totalBeli) {
        this.totalBeli = totalBeli;
    }

    public int getTotalBeli() {
        return totalBeli;
    }

    @Override
    public void saatIni() {
        System.out.println("=".repeat(50));
        System.out.println("Informasi Peternakan dan Perkebunan saat ini");
        System.out.println("=".repeat(50));
    }

    @Override
    public void beli1() {
        System.out.println("=".repeat(50));
        System.out.println("Pembelian Hewan Ternak");
        System.out.println("=".repeat(50));
        System.out.println("1. Ayam\n2. Domba\n3. Unta");
    }

    public void beli2(int jumlahBeli){
        System.out.println("Pembelian");
    }
}
