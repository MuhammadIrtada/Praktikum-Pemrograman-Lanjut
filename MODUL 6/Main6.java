package com;

import java.util.Scanner;

public class Main6 {
    static Scanner rara = new Scanner(System.in);
    static Bebek6 bebek = new Bebek6("Bebek", 15);
    static Domba6 domba = new Domba6("Domba", 4);
    static Unta6 unta = new Unta6("Unta", 3);
    static Apel6 apel = new Apel6("Apel", 5);
    static KelapaSawit6 kelapasawit = new KelapaSawit6("Kelapa Sawit", 6);
    static int duit = 25000000;
    static Transaksi6[] transaksi = new Transaksi6[10];
    static int index = 0;

    public static void main(String[] args) {
        boolean benar = true;
        do {
            System.out.println("==================================================");
            System.out.println("Menu: ");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan ");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.println("==================================================");
            System.out.println("Masukkan Menu Anda: ");
            int memilih = rara.nextInt();
            if (memilih == 1) {
                tampilkaninformasi();
            } else if (memilih == 2) {
                beliTernakKebun();

            } else if (memilih == 3) {
                historyTransaksi();
            } else if (memilih == 0) {
                benar = false;
            }

        } while (benar);
    }

    private static void historyTransaksi() {
        if (transaksi.length > 0) {
            for (int i = 0; i< index; i++) {
                transaksi[i].tampilkanTransaksi();
            }
            System.out.println("==================================================");
        } else {
            System.out.println("==================================================");
            System.out.println("Belum ada Transaksi yang dilakukan");
            System.out.println("==================================================");
        }

    }

    private static void beliTernakKebun() {
        boolean benar = true;
        do {
            System.out.println("==================================================");
            System.out.println("Silahkan pilih menu yang ingin dibeli: ");
            System.out.println("1. Ternak Bebek (Rp. 110.000/ekor)");
            System.out.println("2. Ternak Domba (Rp. 2.450.000/ekor)");
            System.out.println("3. Ternak Unta (Rp. 12.000.000/ekor)");
            System.out.println("4. Kebun Apel (Rp. 7.500.000/ekor)");
            System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/ekor)");
            System.out.println("0. Kembali Ke Menu Utama");
            System.out.println("==================================================");
            System.out.println("Masukkan Menu Anda: ");
            int memilih = rara.nextInt();
            System.out.println("==================================================");
            if (memilih == 1) {
                System.out.println("Berapa unit yang akan anda beli: ");
                int jumlah = rara.nextInt();
                if (index <= 10) {
                    if (duit >= 110000 * jumlah) {
                        duit -= 110000 * jumlah;
                        bebek.setJumlah(jumlah);
                        transaksi[index] = new Transaksi6("Bebek", (index + 1), jumlah, 110000, 110000 * jumlah);
                        index++;
                    } else {
                        System.out.println("Kas anda tidak mencukupi.");
                    }
                } else {
                    System.out.println("Transaksi Gagal.");
                }
            } else if (memilih == 2) {
                System.out.println("Berapa unit yang akan anda beli: ");
                int jumlah = rara.nextInt();
                if (index <= 10) {
                    if (duit >= 2450000 * jumlah) {
                        duit -= 2450000 * jumlah;
                        domba.setJumlah(jumlah);
                        transaksi[index] = new Transaksi6("Domba", (index + 1), jumlah, 2450000,  2450000 * jumlah);
                        index++;
                    } else {
                        System.out.println("Kas anda tidak mencukupi.");
                    }
                } else {
                    System.out.println("Transaksi Gagal.");
                }
            } else if (memilih == 3) {
                System.out.println("Berapa unit yang akan anda beli: ");
                int jumlah = rara.nextInt();
                if (index <= 10) {
                    if (duit >= 12000000 * jumlah) {
                        duit -= 12000000 * jumlah;
                        unta.setJumlah(jumlah);
                        transaksi[index] = new Transaksi6("Unta", (index + 1), jumlah, 12000000,  12000000 * jumlah);
                        index++;
                    } else {
                        System.out.println("Kas anda tidak mencukupi.");
                    }
                } else {
                    System.out.println("Transaksi Gagal.");
                }
            } else if (memilih == 4) {
                System.out.println("Berapa unit yang akan anda beli: ");
                int jumlah = rara.nextInt();
                if (index <= 10) {
                    if (duit >= 7500000 * jumlah) {
                        duit -= 7500000 * jumlah;
                        apel.setJumlah(jumlah);
                        transaksi[index] = new Transaksi6("Apel", (index + 1), jumlah, 7500000,  7500000 * jumlah);
                        index++;
                    } else {
                        System.out.println("Kas anda tidak mencukupi.");
                    }
                } else {
                    System.out.println("Transaksi Gagal.");
                }
            } else if (memilih == 5) {
                System.out.println("Berapa unit yang akan anda beli: ");
                int jumlah = rara.nextInt();
                if (index <= 10) {
                    if (duit >= 18000000 * jumlah) {
                        duit -= 18000000 * jumlah;
                        kelapasawit.setJumlah(jumlah);
                        transaksi[index] = new Transaksi6("Kelapa Sawit", (index + 1), jumlah, 18000000,  18000000 * jumlah);
                        index++;
                    } else {
                        System.out.println("Kas anda tidak mencukupi.");
                    }
                } else {
                    System.out.println("Transaksi Gagal.");
                }
            } else if (memilih == 0) {
                benar = false;
            }
        } while (benar);
    }

    private static void tampilkaninformasi() {
        masukkanValue();
        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t\t: " + bebek.getJenis());
        System.out.println("Jumlah\t\t\t\t: " + bebek.getJumlah() + " Ekor");
        System.out.println("Telur/Ekor\t\t\t: " + bebek.getTelurPerEkor() + " Butir");
        System.out.println("Total Telur/Hari\t\t: " + bebek.getTotalTelur() + " Butir");
        System.out.println("Harga Telur/Butir\t\t: Rp." + bebek.getHargaTelur());
        System.out.println("Profit/Hari\t\t\t: Rp" + bebek.getProfit());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t\t: " + domba.getJenis());
        System.out.println("Jumlah\t\t\t\t: " + domba.getJumlah() + " Ekor");
        System.out.println("Bulu/Ekor\t\t\t: " + domba.getBuluPerEkor() + " Kg");
        System.out.println("Total Bulu/Hari\t\t\t: " + domba.getTotalBulu() + " Kg");
        System.out.println("Harga Bulu/Butir\t\t: Rp." + domba.getHargaBulu());
        System.out.println("Profit/Hari\t\t\t: Rp." + domba.getProfit());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t\t: " + unta.getJenis());
        System.out.println("Jumlah\t\t\t\t: " + unta.getJumlah() + " Ekor");
        System.out.println("Susu/Ekor\t\t\t: " + unta.getSusuPerEkor() + " Liter");
        System.out.println("Total Susu/Hari\t\t\t: " + unta.getTotalSusu() + " Liter");
        System.out.println("Harga Susu/Butir\t\t: Rp." + unta.getHargaSusu());
        System.out.println("Profit/Hari\t\t\t: Rp." + unta.getProfit());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t\t: " + apel.getJenis());
        System.out.println("Jumlah\t\t\t\t: " + apel.getJumlah() + " Hektar");
        System.out.println("Buah/Hektar\t\t\t: " + apel.getApelPerTanaman() + " Kg");
        System.out.println("Total Buah/Hari\t\t\t: " + apel.getTotalApel() + " Kg");
        System.out.println("Harga Buah/Kg\t\t\t: Rp." + apel.getHargaApel());
        System.out.println("Profit/Hari\t\t\t: Rp." + apel.getProfit());
        System.out.println("==================================================");

        System.out.println("==================================================");
        System.out.println("Jenis\t\t\t\t: " + kelapasawit.getJenis());
        System.out.println("Jumlah\t\t\t\t: " + kelapasawit.getJumlah() + " Hektar");
        System.out.println("Buah/Hektar\t\t\t: " + kelapasawit.getKelapaSawitPerTanaman() + " Kg");
        System.out.println("Total Buah/Hari\t\t\t: " + kelapasawit.getTotalKelapaSawit() + " Kg");
        System.out.println("Harga Buah/Kg\t\t\t: Rp." + kelapasawit.getHargaKelapaSawit());
        System.out.println("Profit/Hari\t\t\t: Rp." + kelapasawit.getProfit());
        System.out.println("==================================================");

        System.out.println("Uang kas anda saat ini: Rp. " + duit);
    }

    private static void masukkanValue() {
        bebek.setHargaTelur(2000);
        bebek.setTelurPerEkor(2);

        domba.setHargaBulu(15000);
        domba.setBuluPerEkor(4);

        unta.setHargaSusu(60000);
        unta.setSusuPerEkor(5);

        apel.setHargaApel(25000);
        apel.setApelPerTanaman(40);

        kelapasawit.setHargaKelapaSawit(18000);
        kelapasawit.setKelapaSawitPerTanaman(500);
    }
}
