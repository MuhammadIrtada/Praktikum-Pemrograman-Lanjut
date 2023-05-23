import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Transaksi> transaksiList = new ArrayList<>();
    static int transaksiCount = 0;
    static int unit;
    static Kas kas = new Kas(25000000);
    static Bebek bebek = new Bebek("Bebek", 15, 3000, 110000, 2, 2000);
    static Domba domba = new Domba("Domba", 4, 45000, 2450000, 4, 15000);
    static Unta unta = new Unta("Unta", 3, 200000, 12000000, 5, 60000);
    static Apel apel = new Apel("Apel", 5, 900000, 7500000, 40, 25000);
    static KelapaSawit kelapasawit = new KelapaSawit("Kelapa Sawit", 6, 8500000, 18000000, 500, 18000);
    
    
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Anda: ");
            int menu = sc.nextInt();
            
            if (menu == 1) { //informasi
                menu1();
            }
            else if (menu == 2 ) { //beli ternak/kebun
                if (transaksiCount >= 10) {
                    System.out.println("Maaf, sudah mencapai batas maksimum transaksi.");
                }
                menu2();
            }
            else if (menu == 3) { //histori
                menu3();
            }
            else if (menu == 4) {
                System.out.println("=".repeat(60));
                System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                break;
            }
            else {
                System.out.println("=".repeat(50));
                System.out.println("Input tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
    
    public static void menu1() {
        System.out.println("=".repeat(50));
        bebek.showInformasi();
        System.out.println("=".repeat(50));
        domba.showInformasi();
        System.out.println("=".repeat(50));
        unta.showInformasi();
        System.out.println("=".repeat(50));
        apel.showInformasi();
        System.out.println("=".repeat(50));
        kelapasawit.showInformasi();
        System.out.println("=".repeat(50));
        System.out.println("Uang kas anda saat ini\t: Rp. " + kas.getJumlahKas());
        System.out.println("=".repeat(50));
    }

    public static void menu2() {
        System.out.println("=".repeat(50));
        while (true) {
            System.out.println("Silahkan pilih menu yang ingin dibeli");
            System.out.println("1. Ternak Bebek\t\t(Rp. 110.000/ekor)");
            System.out.println("2. Ternak Domba\t\t(Rp. 2.450.000/ekor)");
            System.out.println("3. Ternak Unta\t\t(Rp. 12.000.000/ekor");
            System.out.println("4. Kebun Apel\t\t(Rp. 7.500.000/hektar)");
            System.out.println("5. Kebun Kelapa Sawit\t(Rp. 18.000.000/hektar)");
            System.out.println("0. Kembali ke Menu Utama");

            System.out.print("Masukkan Menu Anda: ");
            int pilihMenu = sc.nextInt();
            System.out.println("=".repeat(50));
            int harga;
            String jenis;

            switch (pilihMenu) {
                case 1:
                    harga = 110000;
                    jenis = "Bebek";
                break;
                case 2:
                    harga = 2450000;
                    jenis = "Domba";
                break;
                case 3:
                    harga = 12000000;
                    jenis = "Unta";
                break;
                case 4:
                    harga = 7500000;
                    jenis = "Apel";
                break;
                case 5:
                    harga = 18000000;
                    jenis = "Kelapa Sawit";
                break;
                case 6:
                    System.out.println("Kembali ke Menu Utama");
                return;
                default:
                    System.out.println("Input tidak valid. Pembelian gagal.");
                return;
            }
            
            System.out.print("Berapa Unit yang Akan Anda Beli? ");
            unit = sc.nextInt();
            System.out.println("=".repeat(50));

            if (kas.getJumlahKas() < harga) {
                System.out.println("Maaf, kas tidak mencukupi. Pembelian gagal.");
                System.out.println("=".repeat(50));
                return;
            }
    
            if (pilihMenu <= 3) {
                switch (jenis) {
                    case "Bebek":
                        bebek.tambahan(unit);
                    break;
                    case "Unta":
                        unta.tambahan(unit);
                    break;
                    case "Domba":
                        domba.tambahan(unit);
                    break;
                }
            }
            else if (4<= pilihMenu && pilihMenu >= 5){
                switch (jenis) {
                    case "Apel":
                        apel.tambahan(unit);
                    break;
                    case "Kelapa Sawit":
                        kelapasawit.tambahan(unit);
                    break;
                }
            }
    
            transaksiCount++;
            Transaksi transaksi = new Transaksi(transaksiCount, jenis, harga);
            transaksiList.add(transaksi);
            kas.kurangiKas(harga);
    
            System.out.println("Transaksi Berhasil.");
            System.out.println("=".repeat(50));

        }
    }

    public static void menu3() {
        if (transaksiList.isEmpty()) {
            System.out.println("Belum ada transaksi yang dilakukan.");
        } else {
            for (Transaksi transaksi : transaksiList) {
                System.out.println("=".repeat(50));
                System.out.println("Transaksi " + transaksi.getKe());
                System.out.println("=".repeat(50));
                System.out.println("Deskripsi\t\t: " + transaksi.getJenis());
                System.out.println("Jumlah Unit\t\t: " + unit);
                System.out.println("Harga\t\t\t: Rp. " + transaksi.getHarga());
                System.out.println("Total Biaya\t\t: Rp. " + (transaksi.getHarga()*unit));
            }
        }
        System.out.println("=".repeat(50));
    }
}