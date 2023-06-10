import java.util.Scanner;

public class Farm implements Animals, Plants {
    String[] animalName = { "Bebek", "Domba", "Unta" };
    String[] plantName = { "Apel", "Kelapa sawit" };
    int[] amountOwned = { 15, 4, 3, 5, 6 };
    int[] prices = { 110, 2450, 12000, 7500, 18000};
    Scanner scan = new Scanner(System.in);

    public Farm() {
    }

    public void showInfo() {
        System.out.printf("%s\n%38s\n%s\n", "=".repeat(40), "Informasi Peternakan dan Perkebunan", "=".repeat(40));
        for (int i = 0; i < amountOwned.length; i++) {
            System.out.printf("%-15s: %d %s\n",
                    i < 3 ? animalName[i] : plantName[i - 3], amountOwned[i], i < 3 ? "ekor" : "hektar");
        }
        System.out.println();
    }

    @Override
    public void animalPurchase() {
        System.out.printf("%s\n%30s\n%s\n", "=".repeat(40), "Pembelian Hewan Ternak", "=".repeat(40));
        for (int i = 0; i < animalName.length; i++) {
            System.out.printf("%d. %s\n", i + 1, animalName[i]);
        }
        System.out.print("Masukkan pilihan hewan (nomor): ");
        int animalChoice = scan.nextInt();
        if (animalChoice > 3 || animalChoice < 1)
            throw new ArithmeticException();
        System.out.print("Masukkan banyak hewan: ");
        int buyAmount = scan.nextInt();
        animalReceipt(animalChoice, buyAmount);
    }

    @Override
    public void animalReceipt(int choice, int amount) {
        System.out.printf("\n%s\n%30s\n%s\n", "=".repeat(40), "Nota Pembelian Hewan Ternak", "=".repeat(40));
        System.out.printf("%-15s x(%d) : Rp %d000\n\n", animalName[choice - 1], amount, (prices[choice - 1] * amount));
        amountOwned[choice - 1] += amount;
        animalUpdate();
    }

    @Override
    public void animalUpdate() {
        System.out.printf("\n%s\n%35s\n%s\n", "=".repeat(40), "Informasi Peternakan Sekarang", "=".repeat(40));
        for (int i = 0; i < animalName.length; i++) {
            System.out.printf("%d. %-15s : %d ekor\n", i + 1, animalName[i], amountOwned[i]);
        }
        System.out.println();
    }

    @Override
    public void plantPurchase() {
        System.out.printf("%s\n%30s\n%s\n", "=".repeat(40), "Pembelian Tanah Perkebunan", "=".repeat(40));
        for (int i = 0; i < plantName.length; i++) {
            System.out.printf("%d. %s\n", i + 1, plantName[i]);
        }
        System.out.print("Masukkan pilihan kebun (nomor): ");
        int plantChoice = scan.nextInt();
        if (plantChoice > 2 || plantChoice < 1)
            throw new ArithmeticException();
        System.out.print("Masukkan luas tanah: ");
        int buyAmount = scan.nextInt();
        plantReceipt(plantChoice, buyAmount);
    }

    @Override
    public void plantReceipt(int choice, int amount) {
        System.out.printf("\n%s\n%30s\n%s\n", "=".repeat(40), "Nota Pembelian Tanah Perkebunan", "=".repeat(40));
        System.out.printf("%-15s x(%d) : Rp %d000\n\n", plantName[choice - 1], amount, (prices[choice + 2] * amount));
        amountOwned[choice + 2] += amount;
        plantUpdate();
    }

    @Override
    public void plantUpdate() {
        System.out.printf("\n%s\n%35s\n%s\n", "=".repeat(40), "Informasi Perkebunan Sekarang", "=".repeat(40));
        for (int i = 0; i < plantName.length; i++) {
            System.out.printf("%d. %-15s : %d ekor\n", i + 1, plantName[i], amountOwned[i + 3]);
        }
        System.out.println();
    }

}