import java.util.Scanner;
public class App {


    static final double PPN = 0.1;
    public static void main(String[] args) throws Exception {

        Peternakan peternakan = new Peternakan();
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Informasi Peternakan");
            System.out.println("2. Pemasukan Harian");
            System.out.println("3. Pemasukan Harian (Setelah PPN)");
            System.out.println("4. Keluar Program");
            System.out.print("Pilihan: ");
            
            pilihan = input.nextInt();
            System.out.println();
            
            switch (pilihan) {
                case 1:
                    peternakan.tampilkanInformasi();
                    System.out.println();
                    break;
                case 2:
                    peternakan.tampilkanPemasukan();
                    System.out.println();
                    break;
                case 3:
                    peternakan.tampilkanPemasukanSetelahPPN();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Program Berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    System.out.println();
                    break;
            }
        } while (pilihan != 4); 
    }
}

    

