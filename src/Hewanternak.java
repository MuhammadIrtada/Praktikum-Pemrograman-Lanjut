public class Hewanternak {
    String jenis;
    String ras;
    int jumlah;
    String satuan;

    public Hewanternak(String jenis, String ras, int jumlah, String satuan) {
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.satuan= satuan;
    }

    public int hitungBasilTernak() {
        return 0;
    }

    public int hitungHargaHasilTernak() {
        return 0;
    }

    public int hitungPemasukan() {
        return 0;
    }

    public int hitungPemasukanSetelahPPN() {
        return 0;
    }

    public void tampilkanData() {
        int basilTernak = hitungBasilTernak();
        int hargaHasilTernak = hitungHargaHasilTernak();
        var pemasukan = hitungPemasukan();

        System.out.println(jenis + "\t\t" + ras + "\t" + jumlah + " ekor"+ "\t        " +basilTernak/jumlah + satuan+"\t " + basilTernak + satuan +"\t\t" + hargaHasilTernak/basilTernak+"\n");
    }

    public void tampilkanPemasukan() {
        int pemasukan = hitungPemasukan();
        System.out.println(jenis + " | " + ras + "\t\t\t " + pemasukan);
    }

    public void tampilkanPemasukanSetelahPPN() {
        int pemasukanSetelahPPN = (int) hitungPemasukanSetelahPPN();
        System.out.println(jenis + " | " + ras + "\t\t\t  " + pemasukanSetelahPPN);
    }

    public double hitungPPN(double jumlah) {
        return jumlah * MainHewanternak.BR;
    }

    public double hitungTotalPemasukanSetelahPPN(int pemasukan) {
        return (int) (pemasukan + hitungPPN(pemasukan));
    }
}
