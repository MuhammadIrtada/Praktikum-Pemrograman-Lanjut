import java.util.Scanner;

public class Main {
    static KiwInterface[] arr = new KiwInterface[5];
    static Scanner sc = new Scanner(System.in);
    static int pilihan;

    public static void main(String[] args) throws Exception {

        arr[4] = new Sawit(10, "Sawit");
        arr[3] = new Apel(10, "Apel");
        arr[0] = new Bebek(10, "Bebek");
        arr[1] = new Domba(10, "Domba");
        arr[2] = new Unta(10, "Unta");
        boolean loop = true;

        while (loop) {
            mainMenu();
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    cetakJml();
                    break;
                case 2:
                    menuBeliHewan();
                    break;
                case 3:
                    menuBeliTanaman();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        }

    }

    public static void mainMenu() {
        System.out.print(
                "1. Informasi Peternakan dan Perkebunan\n2. Pembelian Hewan Ternak\n3. Pembelian Tanah Perkebunan\nMasukkan pilihan menu: ");
    }

    public static void cetakJml() {
        System.out.println("=".repeat(40) + "\n\tInformasi Peternakan dan Perkebunan\n" + "=".repeat(40));
        for (KiwInterface balls : arr) {
            balls.showJml();
        }
    }

    public static void menuBeliHewan() {
        System.out.println("=".repeat(40) + "\n\tPembelian Hewan Ternak\n" + "=".repeat(40));
        System.out.print("1. Bebek\n2. Domba\n3. Unta\nMasukkan pilihan hewan (nomor): ");
        pilihan = sc.nextInt();
        int pilihanHewan = pilihan;
        System.out.print("Masukkan banyak hewan: ");
        pilihan = sc.nextInt();
        arr[pilihanHewan - 1].beli(pilihan);
        System.out.println("=".repeat(40) + "\n\tInformasi Peternakan Sekarang\n" + "=".repeat(40));
        for (int i = 0; i < 3; i++) {
            arr[i].showJml();
        }

    }

    public static void menuBeliTanaman() {
        System.out.println("=".repeat(40) + "\n\tPembelian Tanah Perkebunan\n" + "=".repeat(40));
        System.out.print("1. Apel\n2. Kelapa Sawit\nMasukkan pilihan kebun (nomor): ");
        pilihan = sc.nextInt();
        int pilihanHewan = pilihan;
        System.out.print("Masukkan luas tanah: ");
        pilihan = sc.nextInt();
        arr[(pilihanHewan - 1) + 3].beli(pilihan);
        System.out.println("=".repeat(40) + "\n\tInformasi Perkebunan Sekarang\n" + "=".repeat(40));
        for (int i = 3; i < 5; i++) {
            arr[i].showJml();
        }
    }
}
