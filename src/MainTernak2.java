import java.util.Scanner;
public class MainTernak2 {
    static Bebek bebek = new Bebek();
    static Domba domba = new Domba();
    static Unta unta = new Unta();
    static final double ppn = 0.1d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Anda: ");
            int menu = sc.nextInt();
            
            if (menu == 1) {
                menu1();
            }
            else if (menu == 2 ) {
                menu2();
            }
            else if (menu == 3) {
                menu3();
            }
            else if (menu == 4) {
                break;
            }
        }
    }

    public static void menu1() {
        System.out.println("=".repeat(50));
        bebek.displayMessage();
        System.out.println("=".repeat(50));
        domba.displayMessage2();
        System.out.println("=".repeat(50));
        unta.displayMessage3();
        System.out.println("=".repeat(50));
    }

    public static void menu2() {
        System.out.println("=".repeat(50));
        bebek.displayMessage4();
        domba.displayMessage5();
        unta.displayMessage6();
        System.out.println("Total Pemasukkan: " + (bebek.hitungPemasukkan(30, 2000)+ domba.hitungPemasukkan(16, 15000) + unta.hitungPemasukkan(15, 60000)));
        System.out.println("=".repeat(50));
    }

    public static void menu3() {
        System.out.println("=".repeat(50));
        System.out.println("Jenis\t\t: " + bebek.jenis + " | " + bebek.ras);
        System.out.println("Pemasukkan\t: " + (bebek.hitungPemasukkan(30, 2000) + (int) (bebek.hitungPemasukkan(30, 2000)*ppn)) );
        System.out.println("-".repeat(50));
        System.out.println("Jenis\t\t: " + domba.jenis + " | " + domba.ras);
        System.out.println("Pemasukkan\t: " + (domba.hitungPemasukkan(16, 15000) + (int) (domba.hitungPemasukkan(16, 15000)*ppn)));
        System.out.println("-".repeat(50));;
        System.out.println("Jenis\t\t: " + unta.jenis + " | " + unta.ras);
        System.out.println("Pemasukkan\t: " + (unta.hitungPemasukkan(15, 60000) +(int) (bebek.hitungPemasukkan(15, 60000)*ppn)));
        System.out.println("-".repeat(50));
        System.out.println("Total Pemasukkan: " + ((bebek.hitungPemasukkan(30, 2000) + (int) (bebek.hitungPemasukkan(30, 2000)*ppn)) + (domba.hitungPemasukkan(16, 15000) + (int) (domba.hitungPemasukkan(16, 15000)*ppn)) + (unta.hitungPemasukkan(15, 60000) +(int) (bebek.hitungPemasukkan(15, 60000)*ppn))));
    }
}