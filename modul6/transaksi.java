package modul6;

public class transaksi {
    private int ke;
    private String jenis;
    private int harga;

    public transaksi(int ke, String jenis, int harga) {
        this.ke = ke;
        this.jenis = jenis;
        this.harga = harga;
    }
    public int getKe() {
        return ke;
    }
    public String getJenis() {
        return jenis;
    }
    public int getHarga() {
        return harga;
    }
    // public static void opsi3() {
    //     if (transaksiList.isEmpty()) {
    //         System.out.println("Belum ada transaksi yang dilakukan.");
    //     } else {
    //         for (transaksi transaksi : transaksiList) {
    //             System.out.println("=".repeat(50));
    //             System.out.println("Transaksi " + transaksi.getKe());
    //             System.out.println("=".repeat(50));
    //             System.out.println("Deskripsi\t\t: " + transaksi.getJenis());
    //             System.out.println("Jumlah Unit\t\t: " + unit);
    //             System.out.println("Harga\t\t\t: Rp. " + transaksi.getHarga());
    //             System.out.println("Total Biaya\t\t: Rp. " + (transaksi.getHarga()*unit));
    //         }
    //     }
    //     System.out.println("=".repeat(50));
    
}
