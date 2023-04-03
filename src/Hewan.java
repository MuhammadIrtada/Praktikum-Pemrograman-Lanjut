public class Hewan {
    private String jenisHewan;
    private String ras;
    private int jumlahHewan;
    private int produksi;
    private int hargaJual;
    private int produksiHarian;
    private int pendapatanHarian;
    private int hargaPpn;

    Hewan(String jenisHewan, String ras, int jumlahHewan, int produksi, int hargaJual) {
        this.jenisHewan = jenisHewan;
        this.ras = ras;
        this.jumlahHewan = jumlahHewan;
        this.produksi = produksi;
        this.hargaJual = hargaJual;
    }

    public void setHitungProduksiHarian(int produksi, int jumlahHewan) {
        produksiHarian = produksi * jumlahHewan;
    }

    public int getHitungProduksiHarian() {
        return produksiHarian;
    }

    public void setHitungPendapatanHarian(int hargaJual) {
        pendapatanHarian = getHitungProduksiHarian() * hargaJual;
    }

    public int getHitungPendapatanHarian() {
        return pendapatanHarian;
    }

    public void setHitungPpn(int hargaJual) {
        hargaPpn = (int) ((int) (getHitungProduksiHarian() * hargaJual)
                + (getHitungProduksiHarian() * hargaJual * 0.1));
    }

    public int getHitungPpn() {
        return hargaPpn;
    }

    public void infoBebek() {
        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t : " + this.jenisHewan);
        System.out.println("Ras\t\t\t : " + this.ras);
        System.out.println("Jumlah\t\t\t : " + this.jumlahHewan + " Ekor");
        System.out.println("Telur/Ekor\t\t : " + this.produksi + " Butir");
        System.out.println("Total Telur / Hari\t : " + getHitungProduksiHarian() + " Butir");
        System.out.println("Harga Telur / Butir\t : " + this.hargaJual);
        System.out.println("==================================================");
    }

    public void infoDomba() {
        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t : " + this.jenisHewan);
        System.out.println("Ras\t\t\t : " + this.ras);
        System.out.println("Jumlah\t\t\t : " + this.jumlahHewan + " Ekor");
        System.out.println("Bulu/Ekor\t\t : " + this.produksi + " Kg");
        System.out.println("Total Bulu / Hari\t : " + getHitungProduksiHarian() + " Kg");
        System.out.println("Harga Bulu / Butir\t : " + this.hargaJual);
        System.out.println("==================================================");
    }

    public void infoUnta() {
        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t : " + this.jenisHewan);
        System.out.println("Ras\t\t\t : " + this.ras);
        System.out.println("Jumlah\t\t\t : " + this.jumlahHewan + " Ekor");
        System.out.println("Susu/Ekor\t\t : " + this.produksi + " Liter");
        System.out.println("Total Susu / Hari\t : " + getHitungProduksiHarian() + " Liter");
        System.out.println("Harga Susu / Butir\t : " + this.hargaJual);
        System.out.println("==================================================");
    }

    public void infoPendapatan() {
        System.out.println("=============================================");
        System.out.println("Jenis : " + this.jenisHewan + " | " + this.ras);
        System.out.println("Pemasukan : " + getHitungPendapatanHarian());
        System.out.println("=============================================");
    }

    public void infoPpn() {
        System.out.println("=============================================");
        System.out.println("Jenis : " + this.jenisHewan + " | " + this.ras);
        System.out.println("Pemasukan : " + getHitungPpn());
        System.out.println("=============================================");
    }

}
