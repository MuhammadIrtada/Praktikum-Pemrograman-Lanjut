
import java.util.Scanner;

public class Main {
    static Bebek bebek = new Bebek("Bebek", 15, 110000, 2, 2000, 3000);
    static Domba domba = new Domba("Domba", 4, 2450000, 4, 15000, 45000);
    static Unta unta = new Unta("Unta", 3, 12000000, 5, 60000, 200000);
    static Apel apel = new Apel("Apel", 5, 7500000, 40, 25000, 900000);
    static Sawit sawit = new Sawit("Kelapa Sawit", 6, 18000000, 500, 18000, 8500000);

    public static void main(String[] args) {
        Pembelian arrPembelian[] = { bebek, domba, unta, apel, sawit };
        Scanner elma = new Scanner(System.in);
        int menu;

        // do {
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu: ");
            menu = elma.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    border("  Informasi Peternakan dan Perkebunan");
                    for (int i = 0; i < arrPembelian.length; i++) {
                        arrPembelian[i].display();
                    }
                    break;

                case 2:
                int menu2;
                int banyakh;
                    border("        Pembelian Hewan Ternak");
                    System.out.println("1. Bebek");
                    System.out.println("2. Domba");
                    System.out.println("3. Unta");

                    System.out.print("Masukkan pilihan hewan (nomor): ");
                    menu2=elma.nextInt();
                    System.out.print("Masukkan banyak hewan: ");
                    banyakh=elma.nextInt();
                    arrPembelian[menu2-1].beli(banyakh);
                    System.out.println();
                    
                    border("      Nota Pembelian Hewan Ternak");
                    arrPembelian[menu2-1].nota(banyakh);
                    System.out.println();
                    
                    border("     Informasi Peternakan Sekarang");
                    for (int i = 0; i < 3; i++) {
                        arrPembelian[i].display();
                    }
                    break;
                case 3:
                int menu3;
                int banyakt;
                    border("      Pembelian Tanah Perkebunan");
                    System.out.println("1. Apel");
                    System.out.println("2. Kelapa Sawit");

                    System.out.print("Masukkan pilihan kebun (nomor): ");
                    menu3=elma.nextInt();
                    System.out.print("Masukkan luas tanah: ");
                    banyakt=elma.nextInt();
                    arrPembelian[menu3+2].beli(banyakt);
                    System.out.println();
                    
                    border("    Nota Pembelian Tanah Perkebunan");
                    arrPembelian[menu3+2].nota(banyakt);
                    System.out.println();
                    
                    border("     Informasi Perkebunan Sekarang");
                    for (int i = 3; i < 5; i++) {
                        arrPembelian[i].display();
                    }
                    break;
            }
        // } while (true);
    }
    public static void border(String judul){
        System.out.println("=".repeat(39));
        System.out.println(judul);
        System.out.println("=".repeat(39));
    }
}
