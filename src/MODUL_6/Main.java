package MODUL_6;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uangKas = 25000000, pilihan1, pilihan2, unit = 0, count = 0;

        boolean cek = false;
        boolean gagal = false;

        Transaksi transaksi[] = new Transaksi[10];

        Bebek bebek = new Bebek();
        Domba domba = new Domba();
        Unta unta = new Unta();
        Apel apel = new Apel();
        KelapaSawit kelapaSawit = new KelapaSawit();

        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setGroupingUsed(true);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");

            System.out.print("Masukkan Menu Anda: ");
            pilihan1 = input.nextInt();
            garis();

            switch (pilihan1) {
                case 1:
                    bebek.tampilkan();
                    garis();
                    domba.tampilkan();
                    garis();
                    unta.tampilkan();
                    garis();
                    apel.tampilkan();
                    garis();
                    kelapaSawit.tampilkan();
                    garis();
                    System.out.println("Uang kas anda saat ini : Rp. " + format.format(uangKas));
                    garis();
                    break;

                case 2:
                    while (true) {
                        cek = false;
                        System.out.println("Silahkan pilih menu yang ingin dibeli!");
                        System.out.println("1. Ternak Bebek (Rp. 110.000/ekor)");
                        System.out.println("2. Ternak Domba (Rp. 2.450.000/ekor)");
                        System.out.println("3. Ternak Unta (Rp. 12.000.000/ekor)");
                        System.out.println("4. Kebun Apel (Rp. 7.500.000/hektar)");
                        System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)");
                        System.out.println("0. Kembali ke Menu Utama");
                        System.out.print("masukkan Menu Anda: ");
                        pilihan2 = input.nextInt();

                        garis();
                        switch (pilihan2) {
                            case 1:
                                System.out.print("Berapa Unit yang Akan Anda Beli? ");
                                unit = input.nextInt();
                                if (count >= 10) {
                                    garis();
                                    System.out.println("Transaksi Gagal.");
                                    garis();
                                    gagal = true;
                                    break;
                                }
                                if (uangKas < (unit * 110000)) {
                                    cek = true;
                                    break;
                                }
                                bebek.jumlah += unit;
                                transaksi[count] = new Transaksi("Bebek", unit, 110000);
                                break;
                            case 2:
                                System.out.print("Berapa Unit yang Akan Anda Beli? ");
                                unit = input.nextInt();
                                if (count >= 10) {
                                    garis();
                                    System.out.println("Transaksi Gagal.");
                                    garis();
                                    gagal = true;
                                    break;
                                }
                                if (uangKas < (unit * 2450000)) {
                                    cek = true;
                                    break;
                                }
                                domba.jumlah += unit;
                                transaksi[count] = new Transaksi("Domba", unit, 2450000);
                                break;
                            case 3:
                                System.out.print("Berapa Unit yang Akan Anda Beli? ");
                                unit = input.nextInt();
                                if (count >= 10) {
                                    garis();
                                    System.out.println("Transaksi Gagal.");
                                    garis();
                                    gagal = true;
                                    break;
                                }
                                if (uangKas < (unit * 12000000)) {
                                    cek = true;
                                    break;
                                }
                                unta.jumlah += unit;
                                transaksi[count] = new Transaksi("Unta", unit, 12000000);
                                break;
                            case 4:
                                System.out.print("Berapa Unit yang Akan Anda Beli? ");
                                unit = input.nextInt();
                                if (count >= 10) {
                                    garis();
                                    System.out.println("Transaksi Gagal.");
                                    garis();
                                    gagal = true;
                                    break;
                                }
                                if (uangKas < (unit * 7500000)) {
                                    cek = true;
                                    break;
                                }
                                apel.luas += unit;
                                transaksi[count] = new Transaksi("Apel", unit, 7500000);
                                break;
                            case 5:
                                System.out.print("Berapa Unit yang Akan Anda Beli? ");
                                unit = input.nextInt();
                                if (count >= 10) {
                                    garis();
                                    System.out.println("Transaksi Gagal.");
                                    garis();
                                    gagal = true;
                                    break;
                                }
                                if (uangKas < (unit * 18000000)) {
                                    cek = true;
                                    break;
                                }
                                kelapaSawit.luas += unit;
                                transaksi[count] = new Transaksi("Kelapa Sawit", unit, 18000000);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Pilihan Tidak Valid");
                                break;
                        }
                        if (pilihan2 == 0) {
                            break;
                        }
                        if (gagal) {
                            continue;
                        }
                        if (cek) {
                            System.out.println("Kas anda tidak mencukupi.");
                        } else {
                            uangKas -= (transaksi[count].harga * unit);
                            count++;
                            System.out.println("Transaksi Berhasil.");
                        }
                        garis();
                    }
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        garis();
                        System.out.println("Transaksi " + (i + 1));
                        garis();
                        transaksi[i].tampilkan();
                    }
                    garis();
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    break;
            }
            if (pilihan1 == 0) {
                break;
            }
        }
    }

    public static void garis() {
        System.out.println("=".repeat(50));
    }
}
