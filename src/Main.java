import java.util.Scanner;

public class Main {
    static Scanner baru = new Scanner(System.in);
    static Apel apel = new Apel(5);
    static KelapaSawit kelapa = new KelapaSawit(6);
    static Perkebunan[] all = { apel, kelapa };
    static Bebek bebek = new Bebek(15);
    static Unta unta = new Unta(3);
    static Domba domba = new Domba(4);
    private static Peternakan[] alls = { bebek, domba, unta };

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            System.out.println("\nMenu");
            System.out.print(
                    "1. Infromasi Peternakan dan Perkebunan\n2. Pembelian Hewan Ternak\n3. Pembelian Tanah Perkebunan\nMasukkan pilihan menu:");
            int pilih = baru.nextInt();
            System.out.println();
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
                default:
                    loop = false;
                    break;
            }
        }
        System.out.println("Terima Kasih - by Riza Athaya");
    }

    private static void menu3() {
        System.out.println("=".repeat(40));
        System.out.println("Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(40));
        System.out.print("1. Apel\n2. Kelapa Sawit\n");
        System.out.printf("%-32s: ", "Masukkan pilihan kebun (nomor)");
        int pilih = baru.nextInt();
        boolean loop = true;
        while (loop) {
            if (pilih > 0 && pilih < 3) {
                System.out.printf("%-32s: ", "Masukkan luas tanah ");
                int jumlah = baru.nextInt();
                System.out.println("=".repeat(40));
                System.out.println("Nota Pembelian Tanah Perkebunan");
                System.out.println("=".repeat(40));
                switch (pilih) {
                    case 1:
                        apel.Pembelian(jumlah);
                        loop = false;
                        break;
                    case 2:
                        kelapa.Pembelian(jumlah);
                        loop = false;
                        break;
                }
                System.out.println();

            } else {
                System.out.print("Harap Masukkan angka yang sesuai:");
                pilih = baru.nextInt();
            }
        }
        menuNowPerkebunan();
    }

    private static void menu2() {
        System.out.println("=".repeat(40));
        System.out.println("Pembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.print("1. Bebek\n2. Domba\n3. Unta\n");
        System.out.printf("%-32s: ", "Masukkan pilihan hewan (nomor)");
        int pilih = baru.nextInt();
        boolean loop = true;
        while (loop) {
            if (pilih > 0 && pilih < 4) {
                System.out.printf("%-32s: ", "Masukkan banyak hewan ");
                int jumlah = baru.nextInt();
                System.out.println("=".repeat(40));
                System.out.println("Nota Pembelian Hewan");
                System.out.println("=".repeat(40));
                switch (pilih) {
                    case 1:
                        bebek.Pembelian(jumlah);
                        loop = false;
                        break;
                    case 2:
                        domba.Pembelian(jumlah);
                        loop = false;
                        break;
                    case 3:
                        unta.Pembelian(jumlah);
                        loop = false;
                        break;
                }
                System.out.println();

            } else {
                System.out.print("Harap Masukkan angka yang sesuai:");
                pilih = baru.nextInt();
            }
        }
        menuNowPeternakan();

    }

    private static void menu1() {
        System.out.println("=".repeat(40));
        System.out.println("Informasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(40));
        Peternakan.detail(alls);
        Perkebunan.detail(all);
        System.out.println("=".repeat(40));
    }

    private static void menuNowPeternakan() {
        System.out.println("=".repeat(40));
        System.out.println("Informasi Peternakan Sekarang");
        System.out.println("=".repeat(40));
        Peternakan.detail(alls);
        System.out.println("=".repeat(40));
    }

    private static void menuNowPerkebunan() {
        System.out.println("=".repeat(40));
        System.out.println("Informasi Perkebunan Sekarang");
        System.out.println("=".repeat(40));
        Perkebunan.detail(all);
        System.out.println("=".repeat(40));
    }

}
