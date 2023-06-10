import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Farm farm = new Farm();
        boolean loop = true;
        do {

            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu: ");
            int menuChoice = sc.nextInt();
            System.out.println();
            switch (menuChoice) {
                case 1:
                    farm.showInfo();
                    break;
                case 2:
                    try {
                        farm.animalPurchase();
                    } catch (Exception e) {
                        continue;
                    }
                    break;
                case 3:
                    try {
                        farm.plantPurchase();
                    } catch (Exception e) {
                        continue;
                    }
                    break;
                default:
                    loop = false;
                    break;
            }

        } while (loop);
        sc.close();
    }
}
