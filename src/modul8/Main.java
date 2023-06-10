package modul8;

import java.util.Scanner;

public class Main {
    static Bebek bebek = new Bebek("Bebek", 15, 110000);
    static Domba domba = new Domba("Domba", 4, 2450000);
    static Unta unta = new Unta("Unta", 3, 12000000);
    static KelapaSawit kelapa = new KelapaSawit("Kelapa Sawit", 6, 18000000);
    static Apel apel = new Apel("Apel", 5, 7500000);
    static Scanner tasya = new Scanner(System.in);
    static Transaksi[] arrayItem={bebek,domba,unta,apel,kelapa};
    

    public static void main(String[] args) {
        boolean check = true;
        do {
            menu();
            System.out.print("Masukkan Menu Anda : ");
            int pilih = tasya.nextInt();
            System.out.println();
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
                default:System.out.println("Maaf Input Anda Salah\nSilahkan Ulang Kembali\n");
            }
        } while (check == true);
    }

    static void menu1() {
        System.out.println("Informasi Peternakan dan Perkebunan");
        breakLine();
       for(Transaksi arr:arrayItem){
            arr.Informasi();
       }
        breakLine(); System.out.println();
    }

    static void menu2() {
        System.out.println("Pembelian Hewan Ternak");
        breakLine();
        System.out.print("1. Bebek\n2. Domba\n3. Unta\nMasukkan pilihan hewan (nomor): ");
        int pilihan = tasya.nextInt();
        System.out.print("Masukkan banyak hewan: ");
        int tambahItem = tasya.nextInt();
        System.out.println();
        breakLine();
        System.out.println("Nota Pembelian Hewan Ternak");
        breakLine();
        arrayItem[pilihan-1].tambahItem(tambahItem); 
        System.out.println();
        breakLine();
        System.out.println("Informasi Perkebunan Sekarang");
        breakLine();
        for(int i=0;i<3;i++){
            arrayItem[i].Informasi();
        }
        breakLine();
        System.out.println();
    }
    static void menu3() {
        System.out.println("Pembelian Tanah Perkebunan");
        breakLine();
        System.out.print("1. Apel\n2. Kelapa Sawit\nMasukkan pilihan kebun (nomor): ");
        int pilihan = tasya.nextInt();
        System.out.print("Masukkan luas tanah: ");
        int tambahItem = tasya.nextInt();
        System.out.println();
        breakLine();
        System.out.println("Nota Pembelian Tanah Perkebunan");
        breakLine();
        arrayItem[(pilihan+2)].tambahItem(tambahItem); 
        System.out.println();
        breakLine();
        System.out.println("Informasi Perkebunan Sekarang");
        breakLine();
        for(int i=3;i<5;i++){
            arrayItem[i].Informasi();
        }
        breakLine();
        System.out.println();
    }

    static void menu() {
        System.out.println(
                "Menu:\n1. Informasi Peternakan dan Perkebunan\n2. Pembelian Hewan Ternak\n3. Pembelian Tanah Perkebunan\n4. Exit");
    }

    static void breakLine() {
        System.out.println("=".repeat(50));
    }

}