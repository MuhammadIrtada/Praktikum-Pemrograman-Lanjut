import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        PeternakanPakKiw peternakanPakKiw = new PeternakanPakKiw(15, 4, 3, 5, 6);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Informasi jumlah hewan ternak dan luas tanah perkebunan saat ini");
            System.out.println("2. Membeli hewan ternak");
            System.out.println("3. Membeli tanah perkebunan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-3): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    peternakanPakKiw.tampilkanStatusSaatIni();
                    break;
                case 2:
                    peternakanPakKiw.beliHewanTernak();
                    break;
                case 3:
                    peternakanPakKiw.beliTanahPerkebunan();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
