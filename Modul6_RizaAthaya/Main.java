import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner baru = new Scanner(System.in);
    static Bebek bebek = new Bebek();
    static Domba domba = new Domba();
    static Unta unta = new Unta();
    static Apel apel = new Apel();
    static KelapaSawit kelapa = new KelapaSawit();
    static int kas = 25000000;
    static int transaksi = 0;
    static DecimalFormat formatter = new DecimalFormat("#,###");
    static ArrayList<Transaksi> listTransaksi = new ArrayList<>();

    public static void main(String[] args) {
        boolean loop = true;
        do {
            showMenu();
            System.out.print("Masukkan Menu Anda : ");
            int pilihan = baru.nextInt();
            switch (pilihan) {
                case 1:
                    showAllInfo();
                    break;
                case 2:
                    showShop();
                    break;
                case 3:
                    showTransactions();
                    break;
                default:
                    loop = false;
                    break;
            }
        } while (loop);
        System.out.println("=".repeat(40));
        System.out.println("Terima kasih - by Riza Athaya");
        System.out.println("=".repeat(40));
    }

    // method case 3
    private static void showTransactions() {
        if (listTransaksi.size() > 0) {
            for (Transaksi t : listTransaksi) {
                t.getDetail();
            }
            System.out.println("=".repeat(40));
        } else {
            System.out.println("=".repeat(40));
            System.out.println("Belum ada Transaksi yang dilakukan");
            System.out.println("=".repeat(40));
        }

    }

    // method case 2
    private static void showShop() {
        boolean loopshop = true;
        do {
            System.out.println("Silahkan pilih menu yang ingin dibeli!");
            System.out.println(
                    "1. Ternak Bebek (Rp. 110.000/ekor)\n2. Ternak Domba (Rp. 2.450.000/ekor)\n3. Ternak Unta (Rp. 12.000.000/ekor)\n4. Kebun Apel (Rp. 7.500.000/hektar)\n5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)\n0. Kembali ke Menu Utama");
            System.out.print("Masukkan Menu anda : ");
            int pilih = baru.nextInt();
            if (pilih == 0) {
                loopshop = false;
            } else {
                System.out.println("=".repeat(40));
                System.out.print("Berapa Unit yang Akan Anda Beli? ");
                int jumlah = baru.nextInt();
                System.out.println("=".repeat(40));

                switch (pilih) {
                    case 1:
                        if (transaksi(bebek.getJual(), jumlah)) {
                            bebek.setJumlah(jumlah);
                            listTransaksi
                                    .add(new Transaksi("Bebek", jumlah, bebek.getJual(), bebek.getJual() * jumlah));
                        }
                        break;
                    case 2:
                        if (transaksi(domba.getJual(), jumlah)) {
                            domba.setJumlah(jumlah);
                            listTransaksi
                                    .add(new Transaksi("Domba", jumlah, domba.getJual(), domba.getJual() * jumlah));
                        }
                        break;
                    case 3:
                        if (transaksi(unta.getJual(), jumlah)) {
                            unta.setJumlah(jumlah);
                            listTransaksi.add(new Transaksi("Unta", jumlah, unta.getJual(), unta.getJual() * jumlah));

                        }
                        break;
                    case 4:
                        if (transaksi(apel.getJual(), jumlah)) {
                            apel.setJumlah(jumlah);
                            listTransaksi.add(new Transaksi("Apel", jumlah, apel.getJual(), apel.getJual() * jumlah));
                        }
                        break;
                    case 5:
                        if (transaksi(kelapa.getJual(), jumlah)) {
                            kelapa.setJumlah(jumlah);
                            listTransaksi
                                    .add(new Transaksi("Kelapa Sawit", jumlah, kelapa.getJual(),
                                            kelapa.getJual() * jumlah));
                        }
                        break;
                }

            }
        } while (loopshop);
    }

    // method response transaction
    private static boolean transaksi(int harga, int jumlah) {
        if (checkSaldo(harga * jumlah)) {
            kas -= harga * jumlah;
            transaksi++;
            if (transaksi <= 10) {
                System.out.println("Transaksi Berhasil.");
                System.out.println("=".repeat(40));
                return true;
            } else {
                System.out.println("Transaksi Gagal.");
                System.out.println("=".repeat(40));
                return false;
            }
        } else if (checkSaldo(harga * jumlah) == false) {
            System.out.println("Kas anda tidak mencukupi.");
            System.out.println("=".repeat(40));
            return false;
        } else {
            System.out.println("Transaksi Gagal.");
            System.out.println("=".repeat(40));
            return false;
        }

    }

    // method check saldo
    private static boolean checkSaldo(int total) {
        if (kas >= total) {
            return true;
        } else {
            return false;
        }
    }

    // method case 1
    private static void showAllInfo() {
        System.out.println("=".repeat(40));
        bebek.showAll();
        System.out.println("=".repeat(40));
        domba.showAll();
        System.out.println("=".repeat(40));
        unta.showAll();
        System.out.println("=".repeat(40));
        apel.showAll();
        System.out.println("=".repeat(40));
        kelapa.showAll();
        System.out.println("=".repeat(40));
        System.out.println("Uang kas anda saat ini : Rp. " + formatter.format(kas));
        System.out.println("=".repeat(40));
    }

    // method show main menu
    private static void showMenu() {
        System.out.println("Menu : ");
        System.out.println(
                "1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. History Transaksi\n0. Exit");

    }
}
