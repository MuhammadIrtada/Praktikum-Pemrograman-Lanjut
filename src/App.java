
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {

    static float uangModal = 25000000;
    static Bebek1 bebek = new Bebek1("Bebek", 15, 3000, 110000, 2, 2000);
    static Domba1 domba = new Domba1("Domba", 4, 45000, 2450000, 4, 15000);
    static Unta1 unta = new Unta1("Unta", 3, 200000, 12000000, 5, 60000);
    static Apel2 apel = new Apel2("Apel", 5, 900000, 7500000, 40, 25000);
    static Sawit1 sawit = new Sawit1("Kelapa Sawit", 6, 8500000, 18000000, 500, 18000);
    static NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public static void main(String[] args) {
        Scanner elma = new Scanner(System.in);

        Hewan1[] arrHewan = new Hewan1[3];
        arrHewan[0] = bebek;
        arrHewan[1] = domba;
        arrHewan[2] = unta;

        Tanaman1[] arrTanaman = new Tanaman1[5];
        arrTanaman[3] = apel;
        arrTanaman[4] = sawit;

        int menu, menuBeli, jumlahBeli;
        int[][] histori = new int[10][2];
        int transaksi = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Menampilkan Informasi Pertanian dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.print("Masukankan Menu Anda: ");
            menu = elma.nextInt();

            if (menu == 1) {
                System.out.println("=".repeat(50));
                bebek.showInformasi();
                domba.showInformasi();
                unta.showInformasi();
                apel.showInformasi();
                sawit.showInformasi();
                System.out.println("Uang kas anda saat ini  : Rp. " + nf.format(uangModal));
                System.out.println("=".repeat(50));

            } else if (menu == 2) {

                do {
                    System.out.println("=".repeat(50));
                    System.out.println("Silahkan pilih menu yang ingin dibeli!");
                    System.out.println("1. Ternak Bebek(Rp. " + nf.format(bebek.getHarga()) + "/ekor)");
                    System.out.println("2. Ternak Domba(Rp. " + nf.format(domba.getHarga()) + "/ekor)");
                    System.out.println("3. Ternak Unta(Rp. " + nf.format(unta.getHarga()) + "/ekor)");
                    System.out.println("4. Kebun Apel(Rp. " + nf.format(apel.getHarga()) + "/hektar)");
                    System.out.println("5. Kebun Sawit(Rp. " + nf.format(sawit.getHarga()) + "/hektar)");
                    System.out.println("0. Kembali ke Menu Utama");
                    System.out.print("Masukkan Menu Anda : ");
                    menuBeli = elma.nextInt();

                    if (menuBeli == 0) {
                        System.out.println("=".repeat(50));
                        break;
                    }

                    System.out.println("=".repeat(50));
                    System.out.print("Berapa Unit yang Akan anda Beli : ");
                    jumlahBeli = elma.nextInt();
                    System.out.println("=".repeat(50));

                    if (transaksi > 9) {
                        System.out.println("Transaksi Gagal.");

                    } else if (menuBeli > 0 && menuBeli < 4) {
                        if (uangModal > (arrHewan[menuBeli - 1].getHarga() * jumlahBeli)) {
                            uangModal -= (arrHewan[menuBeli - 1].getHarga() * jumlahBeli);
                            arrHewan[menuBeli - 1].setKuantitas(arrHewan[menuBeli - 1].getKuantitas() + jumlahBeli);
                            histori[transaksi][0] = menuBeli;
                            histori[transaksi][1] = jumlahBeli;
                            transaksi++;
                            System.out.println("Transaksi Berhasil.");
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    } else if (menuBeli > 3 && menuBeli < 6) {
                        if (uangModal > arrTanaman[menuBeli - 1].getHarga() * jumlahBeli) {
                            uangModal -= (arrTanaman[menuBeli - 1].getHarga() * jumlahBeli);
                            arrTanaman[menuBeli - 1].setLuas(arrTanaman[menuBeli - 1].getLuas() + jumlahBeli);
                            histori[transaksi][0] = menuBeli;
                            histori[transaksi][1] = jumlahBeli;
                            transaksi++;
                            System.out.println("Transaksi Berhasil.");
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    } else {
                        System.out.println("Maaf menu anda salah silahkan isikan 0-5");
                    }

                } while (true);

            } else if (menu == 3) {
                if (transaksi == 0) {
                    System.out.println("=".repeat(50));
                    System.out.println("Belum ada Transaksi.");
                }
                for (int i = 0; i < transaksi; i++) {

                    System.out.println("=".repeat(50));
                    System.out.println("Transaksi " + (i + 1));
                    System.out.println("-".repeat(50));
                    if (histori[i][0] > 0 && histori[i][0] < 4) {
                        System.out.println("Deskripsi       : " + arrHewan[histori[i][0] - 1].getJenis());
                        System.out.println("Jumlah Unit     : " + histori[i][1]);
                        System.out.println("Harga           : " + nf.format(arrHewan[histori[i][0] - 1].getHarga()));
                        System.out.println("Total Biaya     : "
                                + nf.format(histori[i][1] * arrHewan[histori[i][0] - 1].getHarga()));
                    } else if (histori[i][0] > 3 && histori[i][0] < 6) {
                        System.out.println("Deskripsi       : " + arrTanaman[histori[i][0] - 1].getJenis());
                        System.out.println("Jumlah Unit     : " + histori[i][1]);
                        System.out.println("Harga           : " + nf.format(arrTanaman[histori[i][0] - 1].getHarga()));
                        System.out.println("Total Biaya     : "
                                + nf.format(histori[i][1] * arrTanaman[histori[i][0] - 1].getHarga()));
                    }
                }
                System.out.println("=".repeat(50));

            } else if (menu == 0) {
                break;
            } else {
                System.out.println("Maaf menu anda salah silahkan isikan 0-3");
            }
        } while (true);
    }

}
