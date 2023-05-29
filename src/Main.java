import java.util.*;
public class Main {

    static Hewan bebek = new Bebek("Bebek", 2000, 3000, 2, 15);
    static Hewan unta = new Unta("Unta", 60000, 200000, 5, 3);
    static Hewan domba = new Domba("Domba", 15000, 45000, 4, 4);
    static Tumbuhan apel = new Apel("Apel", 25000, 900000, 40, 5);
    static Tumbuhan sawit = new Sawit("Kelapa Sawit", 18000, 8500000, 500, 6);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loopMenu = true;

        while (loopMenu){
            System.out.println("1. Peternakan\n2. Perkebunan\n3. Budgeting\nMasukkan Pilihan Menu:");
            int pil = sc.nextInt();

            switch(pil){
                case 1:
                    display1();
                    break;
                case 2:
                    display2();
                    break;
                case 3:
                    display3();
                    break;

                default :
                    loopMenu = false;
            }
        }
    }

    static float totalPendapatanTernak = (bebek.getTotHarga()+unta.getTotHarga()+domba.getTotHarga());
    static float totalBiayaTernak = (bebek.getTotBiaya()+unta.getTotBiaya()+domba.getTotBiaya());
    static float totalPendapatanKebun = (apel.getTotHarga()+sawit.getTotHarga());
    static float totalBiayaKebun = (apel.getTotBiaya()+sawit.getTotBiaya());


    static void display1(){
        garis();
        System.out.println("\tPendapatan Penjualan Hasil Ternak");
        garis();
        System.out.printf("%s:\t\t\tRp %,.0f\n%s:\t\t\tRp %,.0f\n%s:\t\t\tRp %,.0f\n",bebek.getJenis(),bebek.getTotHarga(),unta.getJenis(),unta.getTotHarga(),domba.getJenis(),domba.getTotHarga());
        garis2();
        System.out.printf("TOTAL:\t\t\tRp %,.0f\n\n",totalPendapatanTernak);
        garis();
        System.out.println("\t\tBiaya Perawatan");
        garis();
        System.out.printf("%s:\t\t\tRp %,.0f\n%s:\t\t\tRp %,.0f\n%s:\t\t\tRp %,.0f\n",bebek.getJenis(),bebek.getTotBiaya(),unta.getJenis(),unta.getTotBiaya(),domba.getJenis(),domba.getTotBiaya());
        garis2();
        System.out.printf("TOTAL:\t\t\tRp %,.0f\n\n",totalBiayaTernak);
    }

    static void display2(){
        garis();
        System.out.println("\tPendapatan Penjualan Hasil Ternak");
        garis();
        System.out.printf("%s:\t\t\tRp %,.0f\n%s:\t\tRp %,.0f\n",apel.getJenis(),apel.getTotHarga(),sawit.getJenis(),sawit.getTotHarga());
        garis2();
        System.out.printf("TOTAL:\t\t\tRp %,.0f\n\n",totalPendapatanKebun);
        garis();
        System.out.println("\t\tBiaya Perawatan");
        garis();
        System.out.printf("%s:\t\t\tRp %,.0f\n%s:\t\tRp %,.0f\n",apel.getJenis(),apel.getTotBiaya(),sawit.getJenis(),sawit.getTotBiaya());
        garis2();
        System.out.printf("TOTAL:\t\t\tRp %,.0f\n\n",totalBiayaKebun);
    }

    static void display3(){
        float pendapatan = totalPendapatanKebun + totalPendapatanTernak;
        float Perawatan = totalBiayaKebun + totalBiayaTernak;
        float Biaya = pendapatan - Perawatan;

        garis();
        System.out.println("\t\tPendapatan per Bulan");
        garis();
        System.out.printf("Ternak:\t\t\tRp %,.0f\nKebun:\t\t\tRp %,.0f\n",totalPendapatanTernak,totalPendapatanKebun);
        garis2();
        System.out.printf("Total:\t\t\tRp %,.0f\n\n",pendapatan);
        garis();
        System.out.println("\t\tPerawatan per Bulan");
        garis();
        System.out.printf("Ternak:\t\t\tRp %,.0f\nKebun:\t\t\tRp %,.0f\n",totalBiayaTernak,totalBiayaKebun);
        garis2();
        System.out.printf("Total:\t\t\tRp %,.0f\n\n",Perawatan);
        garis();
        System.out.println("\t\tBiaya sehari-hari");
        garis();
        System.out.printf("Pendapatan:\t\tRp %,.0f\nPerawatan:\t\tRp %,.0f\n",pendapatan,Perawatan);
        garis2();
        System.out.printf("Total:\t\t\tRp %,.0f\n\n",Biaya);
    }

    static void garis() {
        System.out.println("=".repeat(50));
    }

    static void garis2() {
        System.out.println("-".repeat(50));
    }
}

