import java.util.*;

public class main {
    static Scanner inputScanner = new Scanner(System.in);
    static double dMoney = 25000000;
    static int count = 0;
    static ArrayList<String> trans = new ArrayList<String>();
    static Sheep sheep = new Sheep("Domba", 4, 4, 15000);
    static Duck duck = new Duck("Bebek", 15, 2, 2000);
    static Camel camel = new Camel("Unta", 3, 5, 60000);
    static Coconut coconut = new Coconut("Kelapa", 6, 500, 18000);
    static Apple apple = new Apple("Apel", 5, 40, 25000);
    
    
    public static void main(String[] args) throws Exception {
        boolean isLoop = true;

        while (isLoop) {
            displayMenu();
            int option = inputScanner.nextInt();

            switch(option) {
                case 1:
                displayInfo();
                break;

                case 2:
                buyMenu();
                break;

                case 3:
                showHistory();
                break;

                case 0:
                isLoop = false;
                System.out.println("-".repeat(45));
                System.out.println("Terima kasih telah memakai program kami");
                System.out.println("-".repeat(45));
                break;
                
                default:
                System.out.println("-".repeat(45));
                System.out.println("Pilihan menu yang dimasukkan tidak valid");
                System.out.println("-".repeat(45));
                break;
            }
        }
        inputScanner.close();
    }

    public static void displayMenu() {
        System.out.printf("\n1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. Histori Transaksi\n0. Exit\n");
        System.out.print("Masukkan pilihan Anda: ");
    }

    public static void displayInfo() {
        System.out.println("-".repeat(45));
        Animal.displayAllInfo();
        Plant.displayAllInfo();
        System.out.printf("Uang kas saat ini: Rp. %,.2f\n", dMoney);
        System.out.println("-".repeat(45));
    }

    public static void showHistory() {
        System.out.println("-".repeat(45));
        if(trans.isEmpty()) {
            System.out.println("Anda belum melakukan transaksi");
            System.out.println("-".repeat(45));
        }
        else {
            for(String szTrans : trans) {
                System.out.println(trans);
            }
        }
    }

    public static void restoreHistory(int trans, String description, int totalOfUnit, double cost) {
        main.trans.add(String.format("Transaksi %d\n%s\nDespripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.2f\nTotal Biaya\t: Rp. %,.2f\n%s", trans, "-".repeat(45), description, totalOfUnit, cost, totalOfUnit * cost, "-".repeat(45)));
    }

    public static void buyMenu() {
        boolean isMenu = true;

        while(isMenu) {
            if(count == 10) {
                System.out.println("-".repeat(45));
                System.out.println("Transaksi sudah melebihi batas, silakan kembali ke Menu Utama");
                System.out.println("-".repeat(45));
            }
            else {
                System.out.println("-".repeat(45));
                System.out.println("Silakan pilih menu yang ingin dibeli: ");
                System.out.println("1. Ternak Bebek\t (Rp. 110.000/ekor)");
                System.out.println("2. Ternak Domba\t (Rp. 2.450.000/Ekor)");
                System.out.println("3. Ternak Unta\t (Rp. 12.000.000/Ekor)");
                System.out.println("4. Kebun Apel\t (Rp. 7.500.000/Hektar)");
                System.out.println("5. Kebun Kelapa Sawit\t (Rp. 18.000.000/Hektar)");
                System.out.println("0. Kembali ke Menu Utama");
                int chooseMenu = inputScanner.nextInt();

                switch (chooseMenu) {
                    case 1:
                    System.out.print("Berapa unit yang ingin dibeli? ");
                    int option = inputScanner.nextInt();
                    if(option * duck.getPrice() <= dMoney) {
                        count++;
                        duck.addQuantity(option);
                        dMoney -= option * duck.getPrice();
                        System.out.println("-".repeat(45));
                        System.out.println("Transaksi Berhasil.");
                        restoreHistory(count, "Bebek", option, duck.getPrice());
                    }
                    else {
                        System.out.println("-".repeat(45));
                        System.out.println("Kas anda tidak mencukupi");
                    }
                    break;

                    case 2:
                    System.out.print("Berapa unit yang ingin dibeli? ");
                    option = inputScanner.nextInt();
                    if(option * sheep.getPrice() <= dMoney) {
                        count++;
                        sheep.addQuantity(option);
                        dMoney -= option * sheep.getPrice();
                        System.out.println("-".repeat(45));
                        System.out.println("Transaksi Berhasil.");
                        restoreHistory(count, "Domba", option, sheep.getPrice());
                    }
                    else {
                        System.out.println("-".repeat(45));
                        System.out.println("Kas anda tidak mencukupi");
                    }
                    break;

                    case 3:
                    System.out.print("Berapa unit yang ingin dibeli? ");
                    option = inputScanner.nextInt();
                    if(option * camel.getPrice() <= dMoney) {
                        count++;
                        camel.addQuantity(option);
                        dMoney -= option * camel.getPrice();
                        System.out.println("-".repeat(45));
                        System.out.println("Transaksi Berhasil.");
                        restoreHistory(count, "Unta", option, camel.getPrice());
                    }
                    else {
                        System.out.println("-".repeat(45));
                        System.out.println("Kas anda tidak mencukupi");
                    }
                    break;

                    case 4:
                    System.out.print("Berapa unit yang ingin dibeli? ");
                    option = inputScanner.nextInt();
                    if(option * apple.getCostOfGarden() <= dMoney) {
                        count++;
                        apple.addQuantity(option);
                        dMoney -= option * apple.getCostOfGarden();
                        System.out.println("-".repeat(45));
                        System.out.println("Transaksi Berhasil.");
                        restoreHistory(count, "Kebun Apel", option, apple.getCostOfGarden());
                    }
                    else {
                        System.out.println("-".repeat(45));
                        System.out.println("Kas anda tidak mencukupi");
                    }
                    break;

                    case 5:
                    System.out.print("Berapa unit yang ingin dibeli? ");
                    option = inputScanner.nextInt();
                    if(option * coconut.getCostOfCoconut() <= dMoney) {
                        count++;
                        coconut.addQuantity(option);
                        dMoney -= option * coconut.getCostOfCoconut();
                        System.out.println("-".repeat(45));
                        System.out.println("Transaksi Berhasil.");
                        restoreHistory(count, "Kebun Kelapa Sawit", option, coconut.getCostOfCoconut());
                    }
                    else {
                        System.out.println("-".repeat(45));
                        System.out.println("Kas anda tidak mencukupi");
                    }
                    break;

                    case 0:
                    isMenu = false;
                    break;

                    default:
                    System.out.println("-".repeat(45));
                    System.out.println("Pilahan yang anda masukkan tidak valid");
                    break;
                }
            }
        }
    }
}
