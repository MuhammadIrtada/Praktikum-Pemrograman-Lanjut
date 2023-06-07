import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Bebek bebek = new Bebek(15);
    static Domba domba = new Domba(4);
    static Unta unta = new Unta(3);
    static Apel apel = new Apel(5);
    static KelapaSawit kelapaSawit = new KelapaSawit(6);
    static Kebun[] kebun = {apel, kelapaSawit};
    static Ternak[] ternak = { bebek, domba, unta };

    public static void main(String[] args) throws Exception {
        boolean loop = true;
        do {
            System.out.println("\nPilihan Menu");
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan Pilihan Menu : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    Infomrasi();
                    break;

                case 2:
                    BeliTernak();
                    break;

                case 3:
                    BeliKebun();
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (loop);
    }

    //MENU 1
    private static void Infomrasi() {
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("  Informasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("Bebek        : " + bebek.getJumlah() + " ekor");
        System.out.println("Domba        : " + domba.getJumlah() + " ekor");
        System.out.println("Unta         : " + unta.getJumlah() + " ekor");
        System.out.println("Apel         : " + apel.getJumlah() + " hektar");
        System.out.println("Kelapa Sawit : " + kelapaSawit.getJumlah() + " hektar");
    }

    //MENU 2
    private static void BeliTernak() {
        System.out.println("=".repeat(40));
        System.out.println("\tPembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihan hewan (nomor) : ");
        int pilihan = input.nextInt();
        System.out.print("Masukkan banyak hewan : ");
        int banyak = input.nextInt();

        if (pilihan == 1 || pilihan == 2 || pilihan == 3) {
            System.out.println();
            System.out.println("=".repeat(40));
            System.out.println("      Nota Pembelian Hewan Ternak");
            System.out.println("=".repeat(40));
        }

        if (pilihan == 1) {
            bebek.pembelianTernak(banyak);
        } else if (pilihan == 2) {
            domba.pembelianTernak(banyak);
        } else if (pilihan == 3) {
            unta.pembelianTernak(banyak);
        }

        if (pilihan == 1 || pilihan == 2 || pilihan == 3) {
            System.out.println();
            System.out.println("=".repeat(40));
            System.out.println("    Informasi Peternakan Sekarang");
            System.out.println("=".repeat(40));
            
            for (Ternak t : ternak) {
                System.out.println(t.getJenis() + "\t : " + t.getJumlah() + " ekor");
            }
        }
    }

    //MENU 3
    private static void BeliKebun() {
        System.out.println("=".repeat(40));
        System.out.println("\tPembelian Tanah Kebun");
        System.out.println("=".repeat(40));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihan kebun (nomor) : ");
        int pilihan = input.nextInt();
        System.out.print("Masukkan banyak kebun : ");
        int banyak = input.nextInt();

        if (pilihan == 1 || pilihan == 2) {
            System.out.println();
            System.out.println("=".repeat(40));
            System.out.println("     Nota Pembelian Tanah Perkebunan");
            System.out.println("=".repeat(40));
        }

        if (pilihan == 1) {
            apel.pembelianKebun(banyak);
        } else if (pilihan == 2) {
            kelapaSawit.pembelianKebun(banyak);
        }

        if (pilihan == 1 || pilihan == 2) {
            System.out.println();
            System.out.println("=".repeat(40));
            System.out.println("     Informasi Perkebunan Sekarang");
            System.out.println("=".repeat(40));
    
            for (Kebun k : kebun) {
                System.out.println(k.getJenis() + " : " + k.getJumlah() + " hektar");
            }
        }
    }
}
