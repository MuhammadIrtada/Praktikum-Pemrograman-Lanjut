import java.util.*;

public class App {
    static Ayam ayam = new Ayam("Ayam", 15, 110000);
    static Domba domba = new Domba("Domba", 4, 2450000);
    static Unta unta = new Unta("Unta", 3, 12000000);
    static Apel apel = new Apel("Apel", 5, 7500000);
    static KelapaSawit kelapaSawit = new KelapaSawit("Kelapa Sawit", 6, 18000000);

    public static void main(String[] args) throws Exception {
        Hewan hewan = new Hewan();
        Kebun kebun = new Kebun();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop = true) {
            System.out.print(
                    "1. Informasi Peternakan dan Perkebunan\n2. Pembelian Hewan Tenak\n3. Pembelian Perkebunan\n4. Selesai\nMasukkan Pilihan Menu : ");
            int a = scan.nextInt();
            System.out.println();
            if (a == 1) {
                hewan.saatIni();
                ayam.saatIni();
                domba.saatIni();
                unta.saatIni();
                apel.saatIni();
                kelapaSawit.saatIni();
            } else if (a == 2) {
                hewan.beli1();
                System.out.print("Masukkan Pilihan Menu :");
                int b = scan.nextInt();
                System.out.println();
                if (b == 1) {
                    System.out.print("Masukkan Banyak Hewan :");
                    int c = scan.nextInt();
                    System.out.println();
                    ayam.beli2(c);
                } else if (b == 2) {
                    System.out.print("Masukkan Banyak Hewan :");
                    int c = scan.nextInt();
                    System.out.println();
                    domba.beli2(c);
                } else if (b == 3) {
                    System.out.print("Masukkan Banyak Hewan :");
                    int c = scan.nextInt();
                    System.out.println();
                    unta.beli2(c);
                }
            } else if (a == 3){
                kebun.beli1();
                System.out.print("Masukkan Pilihan Menu :");
                int b = scan.nextInt();
                System.out.println();
                if (b == 1){
                    System.out.print("Masukkan Banyak Hektar :");
                    int c = scan.nextInt();
                    System.out.println();
                    apel.beli2(c);
                } else if (b == 2){
                    System.out.print("Masukkan Banyak Hektar :");
                    int c = scan.nextInt();
                    System.out.println();
                    kelapaSawit.beli2(c);
                }
            } else if (a == 4){
                break;
            }
        }
    }
}
