import java.util.*;

class TaxAnimal {
    private String name, race, product;
    private int amount, eachProduct;
    private double priceEach;
    private String[] productionType;

    TaxAnimal(String name, String race, String product) {
        this.name = name;
        this.race = race;
        this.product = product;
        productionType = race.split(" ");
    }

    public void setEachProduct(int eachProd) {
        this.eachProduct = eachProd;
    }

    public void setAmount(int number) {
        this.amount = number;
    }

    public void setPriceEach(double price) {
        this.priceEach = price;
    }

    public double rawProfit() {
        return amount * eachProduct * priceEach;
    }

    public void info() {
        String perSingle = productionType[0] + "/Ekor";
        String perDay = productionType[0] + "/Hari";
        String perper = String.format("%s/%s", productionType[0], product);
        System.out.printf("%-20s: %s\n%-20s: %s\n%-20s: %d ekor\n%-20s: %d %s\n%-20s: %d %s\n%-20s: %.0f\n%s\n",
                "Jenis", name, "Ras", race, "Jumlah", amount, perSingle, eachProduct, product,
                "Total " + perDay, amount * eachProduct, product, "Harga " + perper, priceEach, "=".repeat(40));
    }
    public void showRawProfit(){
        System.out.printf("%-20s: %s | %s\n%-20s: %.0f\n%s\n", "Jenis", name, race, "Pemasukan", rawProfit(), "-".repeat(40));
    }
    public void showTax(){
        System.out.printf("%-20s: %s | %s\n%-20s: ", "Jenis", name, race, "Pemasukan");
    }
}

public class Modul5 {
    static TaxAnimal[] animals = new TaxAnimal[3];
    public static void main(String[] args) {
        
        Scanner sken = new Scanner(System.in);
        final double tax = 1.1;

        animals[0] = new TaxAnimal("Bebek", "Telur Biasa", "Butir");
        animals[1] = new TaxAnimal("Domba", "Bulu Hitam", "Kg");
        animals[2] = new TaxAnimal("Unta", "Susu Putih", "liter");

        animals[0].setAmount(15);
        animals[0].setEachProduct(2);
        animals[0].setPriceEach(2000);

        animals[1].setAmount(4);
        animals[1].setEachProduct(4);
        animals[1].setPriceEach(15000);

        animals[2].setAmount(3);
        animals[2].setEachProduct(5);
        animals[2].setPriceEach(60000);

        double totalWithTax = 0;
        for (TaxAnimal taxed : animals) {
            totalWithTax += taxed.rawProfit() * tax;
        }
        final double totalTax = totalWithTax;
        boolean loop = true;
        do {
            System.out.print("Menu:\n1. Info Ternak\n2. Total Harian\n3. Setelah PPN\n4. Exit\nPilihan: ");
            int choice = sken.nextInt();
            System.out.println("=".repeat(40));
            switch (choice) {
                case 1:
                for (TaxAnimal taxed : animals) {
                    taxed.info();
                }
                break;
                case 2:
                double total = 0;
                for (TaxAnimal taxed : animals) {
                    taxed.showRawProfit();
                    total += taxed.rawProfit();
                }
                System.out.printf("%-20s: %.0f\n%s\n", "Total Pemasukan", total,"=".repeat(40));
                break;
                case 3: 
                for (TaxAnimal taxed : animals) {
                    taxed.showTax();
                    System.out.printf("%.0f\n%s\n", totalTax, "-".repeat(40));
                    
                }
                System.out.printf("%-20s: %.0f\n%s\n", "Total Pemasukan", totalTax,"=".repeat(40));
                break;
                default:
                loop = false;
            }
        } while (loop);
        sken.close();
    }
}
