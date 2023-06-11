package Modul_8.src;

import java.util.*;

public class main {
    static Scanner inputScanner = new Scanner(System.in);
    static int option;
    static InterfaceOfKiw[] arrInterfaceOfKiw = new InterfaceOfKiw[5];
    public static void main(String[] args) throws Exception {
        
        arrInterfaceOfKiw[0] = new Duck(10, "Bebek");
        arrInterfaceOfKiw[1] = new Sheep(10, "Domba");
        arrInterfaceOfKiw[2] = new Camel(10, "Unta");
        arrInterfaceOfKiw[3] = new Apple(10, "Apel");
        arrInterfaceOfKiw[4] = new Coconut(10, "Unta");

        boolean isLoop = true;

        while (isLoop) {
            mainMenu();
            option = inputScanner.nextInt();

            switch(option) {
                case 1:
                    displayTotal();
                    break;

                case 2:
                    menuBuyAnimal();
                    break;

                case 3:
                    menuBuyPlant();
                    break;

                case 0:
                isLoop = false;
                System.out.println("-".repeat(45));
                System.out.println("Terima kasih telah menggunakan program kami");
                System.out.println("-".repeat(45));
                break;
                
                default:
                System.out.println("-".repeat(45));
                System.out.println("Pilihan yang anda masukkan tidak valid!");
                System.out.println("-".repeat(45));
                break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("1. Informasi Peternakan dan Perkebunan");
        System.out.println("2. Pembelian Hewan Ternak");
        System.out.println("3. Pembelian Tanah Perkebunan");
        System.out.println("0. Exit");
        System.out.print("Masukkan pilihan menu\t: ");
    }

    public static void displayTotal() {
        System.out.println("-".repeat(45));
        System.out.println("\tInformasi Peternakan dan Perkebunan");
        System.out.println("-".repeat(45));
        for(InterfaceOfKiw kiw : arrInterfaceOfKiw) {
            kiw.displayTotal();
        }
    }

    public static void menuBuyAnimal() {
        System.out.println("-".repeat(45));
        System.out.println("\tPembelian Hewan Ternak");
        System.out.println("-".repeat(45));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihan hewan (nomor)\t: ");
        option = inputScanner.nextInt();

        int optionAnimal = option;
        System.out.print("Masukkan banyak hewan\t: ");
        option = inputScanner.nextInt();

        arrInterfaceOfKiw[optionAnimal - 1].buy(option);

        System.out.println("-".repeat(45));
        System.out.println("\tInformasi Peternakan Sekarang");
        System.out.println("-".repeat(45));

        for (int i = 0; i < 3; i++) {
            arrInterfaceOfKiw[i].displayTotal();
        }
    }

    public static void menuBuyPlant() {
        System.out.println("-".repeat(45));
        System.out.println("\tPembelian Tanah Perkebunan");
        System.out.println("-".repeat(45));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihan hewan (nomor)\t: ");
        option = inputScanner.nextInt();

        int optionPlant = option;
        System.out.print("Masukkan luas tanah\t: ");
        option = inputScanner.nextInt();

        arrInterfaceOfKiw[(optionPlant - 1) + 3].buy(option);

        System.out.println("-".repeat(45));
        System.out.println("\tInformasi Perkebunan Sekarang");
        System.out.println("-".repeat(45));

        for (int i = 3; i < 5; i++) {
            arrInterfaceOfKiw[i].displayTotal();
        }
    }
}
