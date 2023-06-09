import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bebek bebek = new Bebek(15, 110000);
        Domba domba = new Domba(4, 2450000);
        Unta unta = new Unta(3, 12000000);
        Apel apel = new Apel(5, 7500000);
        KelapaSawit kelapa = new KelapaSawit(6, 18000000);
        Hewan[] kewan = {bebek, domba, unta};
        Tumbuhan[] wit = {apel, kelapa};
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    System.out.println();
                    batas();
                    System.out.println("  Informasi Peternakan dan Perkebunan");
                    batas();
                    for (Hewan animal: kewan) {
                        System.out.printf("%s: %d ekor\n", animal.getNama(), animal.getKuantitas());
                    }
                    for (Tumbuhan plant: wit) {
                        System.out.printf("%s: %d hektar\n", plant.getNama(), plant.getLuas());
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    batas();
                    System.out.println("        Pembelian Hewan Ternak");
                    batas();
                    System.out.println("1. Bebek");
                    System.out.println("2. Domba");
                    System.out.println("3. Unta");
                    System.out.print("Masukkan pilihan hewan (nomor): ");
                    int beliHewan = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan banyak hewan: ");
                    int jmlHewan = input.nextInt();
                    input.nextLine();
                    System.out.println();
                    kewan[beliHewan-1].beli(jmlHewan);
                    kewan[beliHewan-1].nota(jmlHewan);
                    System.out.println();
                    batas();
                    System.out.println("     Informasi Peternakan Sekarang");
                    batas();
                    for (Hewan animal: kewan) {
                        System.out.printf("%s: %d ekor\n", animal.getNama(), animal.getKuantitas());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    batas();
                    System.out.println("      Pembelian Tanah Perkebunan");
                    batas();
                    System.out.println("1. Apel");
                    System.out.println("2. Kelapa Sawit");
                    System.out.print("Masukkan pilihan kebun (nomor): ");
                    int beliTumbuhan = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan luas tanah: ");
                    int jmlTumbuhan = input.nextInt();
                    input.nextLine();
                    System.out.println();
                    wit[beliTumbuhan-1].beli(jmlTumbuhan);
                    wit[beliTumbuhan-1].nota(jmlTumbuhan);
                    System.out.println();
                    batas();
                    System.out.println("     Informasi Peternakan Sekarang");
                    batas();
                    for (Tumbuhan plant: wit) {
                        System.out.printf("%s: %d hektar\n", plant.getNama(), plant.getLuas());
                    }
                    System.out.println();
                    break;

                default:
                    System.exit(0);
            }
        }



    }

    public static void batas() {
        System.out.println("=".repeat(39));
    }
}
