package MODUL8;

import java.util.Scanner;

interface MenuInterface {
    void showMenu();

    void processMenu();
}

class TernakKebun implements MenuInterface {
    private int bebek;
    private int domba;
    private int unta;
    private int apel;
    private int kelapaSawit;

    public TernakKebun(int bebek, int domba, int unta, int apel, int kelapaSawit) {
        this.bebek = bebek;
        this.domba = domba;
        this.unta = unta;
        this.apel = apel;
        this.kelapaSawit = kelapaSawit;
    }

    @Override
    public void showMenu() {
        System.out.println("\tInformasi Peternakan dan Perkebunan\t");
        System.out.println("=".repeat(50));
        System.out.println("Bebek\t\t: " + this.bebek + " ekor");
        System.out.println("Domba\t\t: " + this.domba + " ekor");
        System.out.println("Unta\t\t: " + this.unta + " ekor");
        System.out.println("Apel\t\t: " + this.apel + " hektar");
        System.out.println("Kelapa Sawit\t: " + this.kelapaSawit + " hektar");
        System.out.println();
    }

    @Override
    public void processMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("=".repeat(50));
            System.out.println("\t\tMenu Pembelian\t\t");
            System.out.println("=".repeat(50));
            System.out.println("1. Hewan Ternak");
            System.out.println("2. Tanaman");
            System.out.println("0. Kembali");
            System.out.print("Masukkan pilihan menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    processHewanTernak();
                    break;
                case 2:
                    processTanaman();
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (menu != 0);

        scanner.close();
    }

    private void processHewanTernak() {
        int hargaBebek = 110000;
        int hargaDomba = 2450000;
        int hargaUnta = 12000000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("\t\tPembelian Hewan Ternak\t\t");
        System.out.println("=".repeat(50));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();
        int jumlah, biaya;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jumlah bebek yang akan dibeli: ");
                jumlah = scanner.nextInt();
                biaya = jumlah * hargaBebek;
                this.bebek += jumlah;

                System.out.println("=".repeat(50));
                System.out.println("\tNota Pembelian Hewan Ternak\t");
                System.out.println("=".repeat(50));
                System.out.println("Biaya yang harus dibayar\t: Rp " + biaya);
                System.out.println("=".repeat(50));
                System.out.println("\tInformasi Peternakan Sekarang\t");
                System.out.println("=".repeat(50));
                System.out.println("Bebek\t: " + this.bebek + " ekor");
                System.out.println("Domba\t: " + this.domba + " ekor");
                System.out.println("Unta\t: " + this.unta + " ekor");
                break;
            case 2:
                System.out.print("Masukkan jumlah domba yang akan dibeli: ");
                jumlah = scanner.nextInt();
                biaya = jumlah * hargaDomba;
                this.domba += jumlah;

                System.out.println("Biaya yang harus dibayar: Rp " + biaya);
                System.out.println("Jumlah masing-masing jenis hewan ternak setelah pembelian:");
                System.out.println("Bebek: " + this.bebek + " ekor");
                System.out.println("Domba: " + this.domba + " ekor");
                System.out.println("Unta: " + this.unta + " ekor");
                break;
            case 3:
                System.out.print("Masukkan jumlah unta yang akan dibeli: ");
                jumlah = scanner.nextInt();
                biaya = jumlah * hargaUnta;
                this.unta += jumlah;

                System.out.println("Biaya yang harus dibayar: Rp " + biaya);
                System.out.println("Jumlah masing-masing jenis hewan ternak setelah pembelian:");
                System.out.println("Bebek: " + this.bebek + " ekor");
                System.out.println("Domba: " + this.domba + " ekor");
                System.out.println("Unta: " + this.unta + " ekor");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private void processTanaman() {
        int hargaApel = 750000;
        int hargaKelapaSawit = 18000000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("\tMenu Pembelian Tanaman\t");
        System.out.println("=".repeat(50));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihan (1-2): ");
        int pilihan = scanner.nextInt();
        int jumlah, biaya;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jumlah lahan apel yang akan dibeli (dalam hektar): ");
                jumlah = scanner.nextInt();
                biaya = jumlah * hargaApel;
                this.apel += jumlah;

                System.out.println("Biaya yang harus dibayar: Rp " + biaya);
                System.out.println(
                        "Jumlah masing-masing jenis hewan ternak dan luas tanah perkebunan setelah pembelian:");
                System.out.println("Apel: " + this.apel + " hektar");
                System.out.println("Kelapa Sawit: " + this.kelapaSawit + " hektar");
                break;
            case 2:
                System.out.print("Masukkan jumlah lahan kelapa sawit yang akan dibeli (dalam hektar): ");
                jumlah = scanner.nextInt();
                biaya = jumlah * hargaKelapaSawit;
                System.out.println("=".repeat(50));
                System.out.println("\tNota Pembelian Tanah Perkebunan\t");
                System.out.println("=".repeat(50));
                System.out.println("Biaya yang harus dibayar\t: Rp " + biaya);
                System.out.println();
                System.out.println("=".repeat(50));
                System.out.println("\tInformasi Perkebunan Sekarang\t");
                System.out.println("=".repeat(50));
                System.out.println("Apel\t\t: " + this.apel + " hektar");
                System.out.println("Kelapa Sawit\t: " + this.kelapaSawit + " hektar");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
