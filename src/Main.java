import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    static Hewan bebek = new Bebek(15);
    static Hewan unta = new Unta(3);
    static Hewan domba = new Domba(4);
    
    static Tanaman apel = new Apel(5);
    static Tanaman kelapaSawit = new KelapaSawit(6);

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
	        
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        
        while (true) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            
            System.out.print("Masukkan pilihan menu: ");
            int menu = scanner.nextInt();

         switch (menu) {
         case 1:
             System.out.println();
             System.out.println("=".repeat(40));
             System.out.println("    Pendapatan Penjualan Hasil Ternak");
             System.out.println("=".repeat(40));
             System.out.println("Bebek \t\t: Rp " + formatter.format(bebek.hitungPendapatan()));
             System.out.println("Unta \t\t: Rp " + formatter.format(unta.hitungPendapatan()));
             System.out.println("Domba \t\t: Rp " + formatter.format(domba.hitungPendapatan()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp " + formatter.format(totpendapatanTernak()));
             
             System.out.println();
             
             System.out.println("=".repeat(40));
             System.out.println("            Biaya Perawatan");
             System.out.println("=".repeat(40));
             System.out.println("Bebek \t\t: Rp " + formatter.format(bebek.hitungBiayaPerawatan()));
             System.out.println("Unta \t\t: Rp " + formatter.format(unta.hitungBiayaPerawatan()));
             System.out.println("Domba \t\t: Rp " + formatter.format(domba.hitungBiayaPerawatan()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp " + formatter.format(totbiayaTernak()));
             break;
         
         case 2:
             System.out.println();
             System.out.println("=".repeat(40));
             System.out.println("    Pendapatan Penjualan Hasil Kebun");
             System.out.println("=".repeat(40));
             System.out.println("Apel \t\t: Rp " + formatter.format(apel.hitungPendapatan()));
             System.out.println("Kelapa Sawit \t: Rp " + formatter.format(kelapaSawit.hitungPendapatan()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp " + formatter.format(totpendapatanKebun()));
             
             System.out.println();
             
             System.out.println("=".repeat(40));
             System.out.println("            Biaya Perawatan");
             System.out.println("=".repeat(40));
             System.out.println("Apel \t\t: Rp " + formatter.format(apel.hitungBiayaPerawatan()));
             System.out.println("Kelapa Sawit \t: Rp " + formatter.format(kelapaSawit.hitungBiayaPerawatan()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp " + formatter.format(totbiayaKebun()));
             break;
             
         case 3:
             System.out.println();
             System.out.println("=".repeat(40));
             System.out.println("    \tPendapatan per Bulan");
             System.out.println("=".repeat(40));
             System.out.println("Ternak \t\t: Rp " + formatter.format(totpendapatanTernak()));
             System.out.println("Kebun \t\t: Rp " + formatter.format(totpendapatanKebun()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp " + formatter.format(totpendapatan()));
             
             System.out.println();
             
             System.out.println("=".repeat(40));
             System.out.println("     \tPerawatan per Bulan");
             System.out.println("=".repeat(40));
             System.out.println("Ternak \t\t: Rp " + formatter.format(totbiayaTernak()));
             System.out.println("Kebun \t\t: Rp " + formatter.format(totbiayaKebun()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp " + formatter.format(totbiayaPerawatan()));
             
             System.out.println();
             
             System.out.println("=".repeat(40));
             System.out.println("     \tBiaya sehari-hari");
             System.out.println("=".repeat(40));
             System.out.println("Pendapatan \t: Rp " + formatter.format(totpendapatan()));
             System.out.println("Perawatan \t: Rp " + formatter.format(totbiayaPerawatan()));
             System.out.println("-".repeat(40));
             System.out.println("Total \t\t: Rp "+ formatter.format(totbiayaSeharihari()));
             break;
          
          default:
              System.out.println("Mohon Maaf, Silakan Masukkan menu yang tersedia");
         
             
         }  


    }
}

public static double totpendapatanTernak(){
    return (bebek.hitungPendapatan() + unta.hitungPendapatan() + domba.hitungPendapatan());
}

public static double totbiayaTernak() {
    return (bebek.hitungBiayaPerawatan() + unta.hitungBiayaPerawatan() + domba.hitungBiayaPerawatan());
}

public static double totpendapatanKebun() {
    return (apel.hitungPendapatan() + kelapaSawit.hitungPendapatan());
}

public static double totbiayaKebun() {
    return (apel.hitungBiayaPerawatan() + kelapaSawit.hitungBiayaPerawatan());
}

public static double totpendapatan() {
    return totpendapatanTernak() + totpendapatanKebun();
}

public static double totbiayaPerawatan() {
    return totbiayaTernak() + totbiayaKebun();
}

public static double totbiayaSeharihari() {
    return totpendapatan() - totbiayaPerawatan();
}

   
}