package modul6;

public class Transaksi {
    private String Jenis;
    private int Jumlah;
    private float Harga;
    private float Total;

    public Transaksi(String Jenis, int Jumlah, int Harga) {
        this.Jenis = Jenis;
        this.Jumlah = Jumlah;
        this.Harga = Harga;
        this.Total = this.Jumlah * this.Harga;
    }

    public void infoTransaksi() {
        System.out.printf("Deskripsi\t\t: %s\nJumlah Unit\t\t: %d\nHarga\t\t\t: Rp. %,.0f\nTotal Biaya\t\t: Rp. %,.0f\n",
                Jenis, Jumlah, Harga, Total);
        System.out.println("=".repeat(50));
    }
}