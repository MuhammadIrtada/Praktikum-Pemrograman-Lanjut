import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static DecimalFormat formatter = new DecimalFormat("#,###.##");
    static Bebek bebek = new Bebek("Bebek", 15, 2, 2000, 3000);
    static Unta unta = new Unta("Unta", 3, 5, 60000, 200000);
    static Domba domba = new Domba("Domba", 4, 4, 15000, 45000);
    static Apel apel = new Apel("Apel", 5, 40,25000,900000);
    static Sawit sawit = new Sawit("Kelapa Sawit", 6, 500, 18000, 8500000);

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        boolean loop = true;
        do{
        System.out.println("Silakan pilih menu di bawah ");
        System.out.println("1. Peternakan");
        System.out.println("2. Perkebunan");
        System.out.println("3. Budgeting");
        System.out.print("Masukkan pilihan menu : ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("=".repeat(40));
                System.out.println("    Pendapatan Penjualan Hasil Ternak");
                System.out.println("=".repeat(40));
                // tambahin formatter.format() di setiap part yang mau kasih format rupiah
                System.out.println("Bebek    : Rp " + formatter.format(bebek.pendapatan()));
                System.out.println("Unta     : Rp " + formatter.format(unta.pendapatan()));
                System.out.println("Domba    : Rp " + formatter.format(domba.pendapatan()));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL    : Rp " + formatter.format(totalPendapatanTernak()) + "\n");
                
                System.out.println("=".repeat(40));
                System.out.println("         Biaya Perawatan Ternak");
                System.out.println("=".repeat(40));
                System.out.println("Bebek    : Rp " + formatter.format(bebek.perawatan()));
                System.out.println("Unta     : Rp " + formatter.format(unta.perawatan()));
                System.out.println("Domba    : Rp " + formatter.format(domba.perawatan()));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL    : Rp " + formatter.format(totalPerawatanTernak()) + "\n");
                break;

                case 2 : 
                System.out.println("=".repeat(40));
                System.out.println("    Pendapatan Penjualan Hasil Kebun");
                System.out.println("=".repeat(40));
                // tambahin formatter.format() di setiap part yang mau kasih format rupiah
                System.out.println("Apel             : Rp " + formatter.format(apel.pendapatan()));
                System.out.println("Kelapa Sawit     : Rp " + formatter.format(sawit.pendapatan()));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL            : Rp " + formatter.format(totalPendapatanKebun()) + "\n");
                
                System.out.println("=".repeat(40));
                System.out.println("         Biaya Perawatan Kebun");
                System.out.println("=".repeat(40));
                System.out.println("Apel            : Rp " + formatter.format(apel.perawatan()));
                System.out.println("Kelapa Sawit    : Rp " + formatter.format(sawit.perawatan()));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL           : Rp " + formatter.format(totalPerawatanKebun()) + "\n");
                break;

                case 3 :
                System.out.println("=".repeat(40));
                System.out.println("         Pendapatan per Bulan");
                System.out.println("=".repeat(40));
                System.out.println("Ternak     : Rp " + formatter.format(totalPendapatanTernak()));
                System.out.println("Kebun      : Rp " + formatter.format(totalPendapatanKebun()));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL      : Rp " + formatter.format((totalPendapatanKebun() + totalPendapatanTernak())) + "\n");

                System.out.println("=".repeat(40));
                System.out.println("         Perawatan per Bulan");
                System.out.println("=".repeat(40));
                System.out.println("Ternak     : Rp " + formatter.format(totalPerawatanTernak()));
                System.out.println("Kebun      : Rp " + formatter.format(totalPerawatanKebun()));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL      : Rp " + formatter.format((totalPerawatanKebun() + totalPerawatanTernak())) + "\n");

                System.out.println("=".repeat(40));
                System.out.println("         Biaya Sehari-Hari");
                System.out.println("=".repeat(40));
                System.out.println("Pendapatan : Rp " + formatter.format((totalPendapatanKebun() + totalPendapatanTernak())));
                System.out.println("Perawatan  : Rp " + formatter.format((totalPerawatanKebun() + totalPerawatanTernak())));
                System.out.println("-".repeat(40));
                System.out.println("TOTAL      : Rp " + formatter.format(((totalPendapatanKebun() + totalPendapatanTernak()) - (totalPerawatanKebun() + totalPerawatanTernak()))) + "\n");
                break;

                default :
                System.out.println("Silakan pilih menu yang tersedia");
        }
    } while (loop);
}

    public static float totalPendapatanTernak(){
        return (bebek.pendapatan() + unta.pendapatan() + domba.pendapatan());
    }
    public static float totalPerawatanTernak() {
        return (bebek.perawatan() + unta.perawatan() + domba.perawatan());
    }

    public static float totalPendapatanKebun(){
        return (apel.pendapatan() + sawit.pendapatan());
    }
    public static float totalPerawatanKebun(){
        return (apel.perawatan() + sawit.perawatan());
    }
   
}
