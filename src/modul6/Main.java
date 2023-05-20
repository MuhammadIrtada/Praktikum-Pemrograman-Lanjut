package modul6;

import java.util.Scanner;

public class Main {
    static Bebek bebek = new Bebek("Bebek", 15, 110000, 3000, 2, 2000);
    static Domba domba = new Domba("Domba", 4, 2450000, 45000, 4, 15000);
    static Unta unta = new Unta("Unta", 3, 12000000, 200000, 5, 60000);
    static KelapaSawit kelapa = new KelapaSawit("Kelapa Sawit", 6, 18000000, 8500000, 500, 18000);
    static Apel apel = new Apel("Apel", 5, 7500000, 900000, 40, 25000);
    static float modal = 25000000;
    static Scanner tasya = new Scanner(System.in);
    static Transaksi[] semuaTransaksi = new Transaksi[10];
    static int index = 0;

    public static void main(String[] args) {
        boolean check = true;
        do {
            menu();
            System.out.print("Masukkan Menu Anda : ");
            int pilih = tasya.nextInt();
            breakLine();
            switch (pilih) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    menu3();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program kami");
                    breakLine();
                    check = false;
                    break;
            }
        } while (check == true);
    }

    private static void menu3() {
        for (int i = 0; i < index; i++) {
            System.out.println("Transaksi " + (i+1));
            System.out.println("-".repeat(50));
            semuaTransaksi[i].infoTransaksi();
        }
    }

    static void menu1() {
        bebek.menu1();
        domba.menu1();
        unta.menu1();
        apel.menu1();
        kelapa.menu1();
        System.out.printf("Uang kas anda saat ini :  Rp. %,.0f\n", modal);
        breakLine();
    }

    static void menu2() {
        boolean check = true;
        do {
            System.out.println(
                    "Silahkan pilih menu yang ingin dibeli:\n1. Ternak Bebek (Rp. 110.000/ekor)\n2. Ternak Domba (Rp. 2.450.000/ekor)");
            System.out.print(
                    "3. Ternak Unta (Rp. 12.000.000/ekor)\n4. Kebun Apel (Rp. 2.450.000/ekor)\n5. Kebun Kelapa Sawit (Rp. 18.000.000/Hektar)\n0. Kembali ke Menu Utama\n Masukkan Menu Anda: ");
            int pilih = tasya.nextInt();
            breakLine();
            if (pilih != 0 && index <= 10) {
                System.out.print("Berapa Unit yang akan Anda Beli? ");
                int jmlbeli = tasya.nextInt();
                int[] harga = { 110000, 2450000, 12000000, 2450000, 18000000 };
                if (modal >= harga[pilih - 1] * jmlbeli) {
                    modal -= harga[pilih - 1] * jmlbeli;
                    breakLine();
                    System.out.println("Transaksi Berhasil.");
                    String[] items = { "Bebek", "Domba", "Unta", "Apel", "Kelapa Sawit" };
                    semuaTransaksi[index] = new Transaksi(items[pilih - 1], jmlbeli, harga[pilih - 1]);
                    index++;
                    tambahItems(pilih, jmlbeli);
                } else {
                    System.out.println("Kas anda tidak mencukupi");
                }
                breakLine();
            } else if (pilih == 0) {
                check = false;
            } else {
                System.out.println("Transaksi Gagal");
            }
        } while (check == true);
    }

    static void tambahItems(int pilih, int jmlbeli){
        switch(pilih){
            case 1: bebek.tambahHewan(jmlbeli); break;
            case 2: domba.tambahHewan(jmlbeli); break;
            case 3: unta.tambahHewan(jmlbeli); break;
            case 4: apel.tambahHewan(jmlbeli); break;
            case 5: kelapa.tambahHewan(jmlbeli); break;

        }
    }

    static void menu() {
        System.out.println(
                "Menu:\n1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. Histori Transaksi\n4. Exit");
    }

    static void breakLine() {
        System.out.println("=".repeat(50));
    }

}