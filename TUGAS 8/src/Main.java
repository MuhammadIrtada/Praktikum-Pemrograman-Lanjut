import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner ra = new Scanner(System.in);
    static DecimalFormat formatter = new DecimalFormat("#,###.##");
    static Apel apel = new Apel(5);
    static KelapaSawit kelapaSawit = new KelapaSawit(6);
    static Bebek bebek = new Bebek(15);
    static Domba domba = new Domba(4);
    static Unta unta = new Unta(3);
    
    // static Interface [] all = {apel, kelapaSawit, bebek, domba, unta};
    static Perkebunan[] tanamans = { apel, kelapaSawit };
    static Peternakan[] hewans = { bebek, domba, unta };

    public static void main(String[] args) throws Exception {
        boolean benar = true;
        do {
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu:");
            int memilih = ra.nextInt();
            if (memilih == 1) {
                menu1();
            } else if (memilih == 2) {
                menu2();
            } else if (memilih == 3) {
                menu3();
            } else {
                benar = false;
            }
 
        } while (benar);
    }
    private static void menu3() {
        System.out.println("========================================");
        System.out.println("\tPembelian Tanah Perkebunan");
        System.out.println("========================================");
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihan kebun (nomor): ");
        int pilihan = ra.nextInt();
        System.out.print("Masukkan luas tanah: ");
        int banyak = ra.nextInt();
        if ( pilihan == 1 || pilihan == 2) {
            System.out.println("========================================");
            System.out.println("\tNota Pembelian Tanah Perkebunan");
            System.out.println("========================================");
        }
        if (pilihan == 1){
            apel.setJumlah(banyak);
            apel.Beli(banyak);
        }
        else if(pilihan == 2){
            kelapaSawit.setJumlah(banyak);
            kelapaSawit.Beli(banyak);
        }
        if ( pilihan == 1 || pilihan == 2) {
            System.out.println("========================================");
            System.out.println("\tInformasi Perkebunan Sekarang");
            System.out.println("========================================");
            Perkebunan.detail(tanamans);
        }
        

    }
    private static void menu2() {
        System.out.println("========================================");
        System.out.println("\tPembelian Hewan Ternak");
        System.out.println("========================================");
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihan hewan (nomor): ");
        int pilihan = ra.nextInt();
        System.out.print("Masukkan banyak hewan: ");
        int banyak = ra.nextInt();
        if ( pilihan == 1 || pilihan == 2 || pilihan == 3) {
            System.out.println("========================================");
            System.out.println("\tNota Pembelian Hewan Ternak");
            System.out.println("========================================");
        }
        if (pilihan == 1){
            bebek.setJumlah(banyak);
            bebek.Beli(banyak);
        }
        else if(pilihan == 2){
            domba.setJumlah(banyak);
            domba.Beli(banyak);
        }
        else if(pilihan == 3){
            unta.setJumlah(banyak);
            unta.Beli(banyak);
        }
        if ( pilihan == 1 || pilihan == 2 || pilihan == 3) {
            System.out.println("========================================");
            System.out.println("\tInformasi Peternakan Sekarang");
            System.out.println("========================================");
            Peternakan.detail(hewans);
        }
        

    }
    private static void menu1() {
        for (Peternakan a : hewans){
            System.out.println( a.getJenis()+ "\t\t: " + a.getJumlah());

        }
        for (Perkebunan a : tanamans){
            if(a.getJenis() == "Kelapa Sawit"){
                System.out.println( a.getJenis()+ "\t: " + a.getJumlah());
            }
            else{
                System.out.println( a.getJenis()+ "\t\t: " + a.getJumlah());
            }
        }
    }
}

