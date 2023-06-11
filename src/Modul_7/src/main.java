package Modul_7.src;

import java.util.*;

public class main {
    static Animal[] animal = new Animal[3];
    static Plant[] plant = new Plant[2];
    static Scanner inputScanner = new Scanner(System.in);
    static double dSalaryOfAnimal;
    static double dSalaryOfGarden;
    static double dCostMaintenanceAnimal;
    static double dCostMaintenanceGarden;

    public static void main(String[] args) {
        animal[0] = new Duck(15, 2, 2000, 3000);
        animal[1] = new Sheep(4, 4, 15000, 45000);
        animal[2] = new Camel(3, 4, 60000, 200000);

        plant[0] = new Apple(5, 40, 25000, 900000);
        plant[1] = new Coconut(6, 500, 18000, 8500000);

        boolean isLoop = true;
        while(isLoop) {
            mainMenu();
            int option = inputScanner.nextInt();

            switch(option) {
                case 1:
                    menuOfAnimal();
                    break;
                case 2:
                    menuOfPlant();
                    break;
                case 3:
                    budgetingMenu();
                    break;
                case 0:
                    isLoop = false;
                    System.out.println("-".repeat(45));
                    System.out.println("Terima kasih telah menggunakan program kami");
                    System.out.println("-".repeat(45));
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("1. Peternakan");
        System.out.println("2. Perkebunan");
        System.out.println("3. Budgeting");
        System.out.println("0. Exit");
        System.out.print("Masukkan pilihan menu: ");
    }

    public static void menuOfAnimal() {
        System.out.println("-".repeat(45));
        System.out.println("\tPendapatan Penjualan Hasil Ternak");
        System.out.println("-".repeat(45));
        
        dSalaryOfAnimal = 0;
        for(Animal species : animal) {
            species.displaySalary();
            dSalaryOfAnimal += species.getSalary();
        }
        System.out.println("-".repeat(45));
        System.out.printf("\tTotal: %,.2f\n", dSalaryOfAnimal);
        
        System.out.println("-".repeat(45));
        System.out.println("\tBiaya Perawatan");
        System.out.println("-".repeat(45));
        dCostMaintenanceAnimal = 0;
        for(Animal species : animal) {
            species.displayMaintenance();
            dCostMaintenanceAnimal += species.getCostMaintenance();
        }
        System.out.printf("-".repeat(45) + "\n\tTotal: %,.2f\n", dCostMaintenanceAnimal);
    }

    public static void menuOfPlant() {
        System.out.println("-".repeat(45));
        System.out.println("\tPendapatan Penjualan Hasil Kebun");
        System.out.println("-".repeat(45));
        
        dSalaryOfAnimal = 0;
        for(Plant species : plant) {
            species.displaySalary();
            dSalaryOfGarden += species.getSalary();
        }
        System.out.println("-".repeat(45));
        System.out.printf("\tTotal: %,.2f\n", dSalaryOfGarden);
        
        System.out.println("-".repeat(45));
        System.out.println("\tBiaya Perawatan");
        System.out.println("-".repeat(45));
        dCostMaintenanceGarden = 0;
        for(Plant species : plant) {
            species.displayMaintenance();
            dCostMaintenanceGarden += species.getMaintenance();
        }
        System.out.printf("-".repeat(45) + "\n\tTotal: %,.2f\n", dCostMaintenanceGarden);
    }

    public static void budgetingMenu() {
        dSalaryOfAnimal = 0;
        dSalaryOfGarden = 0;
        dCostMaintenanceAnimal = 0;
        dCostMaintenanceGarden = 0;

        for(Animal species : animal) {
            dSalaryOfAnimal += species.getSalary();
            dCostMaintenanceAnimal += species.getCostMaintenance();
        }

        for(Plant species : plant) {
            dSalaryOfGarden += species.getSalary();
            dCostMaintenanceGarden += species.getMaintenance();
        }

        System.out.println("-".repeat(45));
        System.out.println("\tPendapatan per Bulan");
        System.out.println("-".repeat(45));
        
        System.out.printf("Ternak\t\t: %,.2f\nKebun\t\t: %,.2f\n", dSalaryOfAnimal, dSalaryOfGarden);
        
        System.out.println("-".repeat(45));
        System.out.printf("Total\t\t: %,.2f\n", (dSalaryOfAnimal + dSalaryOfGarden));

        System.out.println("-".repeat(45));
        System.out.println("\tPerawatan per Bulan");
        System.out.println("-".repeat(45));

        System.out.printf("Ternak\t\t: %,.2f\nKebun\t\t: %,.2f\n", dCostMaintenanceAnimal, dCostMaintenanceGarden);
        
        System.out.println("-".repeat(45));
        System.out.printf("Total\t\t: %,.2f\n", (dCostMaintenanceAnimal + dCostMaintenanceGarden));

        System.out.println("-".repeat(45));
        System.out.println("\tBiaya sehari-hari");
        System.out.println("-".repeat(45));

        System.out.printf("Pendapatan\t\t: %,.2f\nPerawatan\t\t: %,.2f\n", (dSalaryOfAnimal + dSalaryOfGarden), (dCostMaintenanceAnimal + dCostMaintenanceGarden));
        
        System.out.println("-".repeat(45));
        System.out.printf("Total\t\t: %,.2f\n", ((dSalaryOfAnimal + dSalaryOfGarden) - (dCostMaintenanceAnimal + dCostMaintenanceGarden)));
    }
}
