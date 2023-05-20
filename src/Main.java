import java.util.*;

public class Main {
    public static int budget = 25000;
    static int receiptNum = 0;
    static ArrayList<String> receipts = new ArrayList<String>();

    public static void makeReceipt(String name, int purchased, int price){
        String temp = "Transaksi " + (++receiptNum) + "\n" + "-".repeat(40) + "\n";
        temp += String.format("%-15s: %s\n", "Deskripsi", name);
        temp += String.format("%-15s: %s\n", "Jumlah unit", purchased);
        temp += String.format("%-15s: %s%,d%s\n", "Harga", "Rp. ",price,",000");
        temp += String.format("%-15s: %s%,d%s\n", "Total Biaya", "Rp. ",price*purchased,",000");
        temp += "=".repeat(40);
        receipts.add(temp);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Hewan[] animals = new Hewan[3];
        Tanaman[] plants = new Tanaman[2]; 
        animals[0] = new Bebek();
        animals[1] = new Domba();
        animals[2] = new Unta();
        plants[0] = new Apel();
        plants[1] = new Kelapa();
        
        int choice;
        boolean loop = true;
        while (loop){
            System.out.println("Menu: ");
            System.out.println("1. Info Peternakan dan Perkebunan");
            System.out.println("2. Beli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan : ");
            choice = inp.nextInt();
            System.out.println("=".repeat(40));
            switch(choice){
                case 1:
                for (Hewan hewan : animals) {
                    hewan.show();
                }
                for (Tanaman tanaman : plants) {
                    tanaman.show();
                }
                System.out.printf("Uang kas saat ini : Rp. %,d,000\n%s\n", budget,"=".repeat(40));
                    break;
                case 2:
                System.out.println("Pilih menu yang ingin dibeli:");
                int order = 1;
                for (Hewan hewan : animals) {
                    System.out.printf("%d. Ternak %s (Rp. %,d,000/ekor)\n", order++, hewan.getName(), hewan.getPrice());
                }
                for (Tanaman tanaman : plants) {
                    System.out.printf("%d. Kebun %s (Rp. %,d,000/hektar)\n", order++, tanaman.getName(), tanaman.getPrice());   
                }
                System.out.print("0. Kembali\nPilihan: ");
                choice = inp.nextInt();
                System.out.println("=".repeat(40));
                    if (choice > 0 && choice < 6){
                        System.out.print("Berapa unit? ");
                        int unitBuy = inp.nextInt();
                        System.out.println("=".repeat(40));
                        if (choice > 0 && choice < 4){
                            if (budget >= (unitBuy * animals[choice - 1].getPrice()) && receiptNum < 10){
                                for (int i = 0; i < unitBuy; i++) {
                                    animals[choice - 1].buy();
                                }
                                System.out.println("Transaksi Berhasil.");
                                makeReceipt(animals[choice - 1].getName(), unitBuy, animals[choice - 1].getPrice());
                            }
                            else System.out.println("Transaksi Gagal.");                           
                        }
                        else{
                            if (budget >= (unitBuy * plants[choice - 4].getPrice()) && receiptNum < 10){
                                for (int i = 0; i < unitBuy; i++) {
                                    plants[choice - 4].buy();
                                }
                                System.out.println("Transaksi Berhasil.");
                                makeReceipt(plants[choice - 4].getName(), unitBuy, plants[choice - 4].getPrice());
                            }
                            else System.out.println("Transaksi Gagal.");                           
                        }
                        System.out.println("=".repeat(40));                           
                    }
                    break;
                case 3:
                for (int i = 0; i < receiptNum; i++) {
                    System.out.println(receipts.get(i));
                }
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        inp.close();   
    }
}
