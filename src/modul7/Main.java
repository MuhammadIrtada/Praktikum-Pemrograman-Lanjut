package modul7;

import java.util.Scanner;

public class Main {
    static Bebek bebek = new Bebek("Bebek", 15, 3000, 2, 2000);
    static Domba domba = new Domba("Domba", 4, 45000, 4, 15000);
    static Unta unta = new Unta("Unta", 3, 200000, 5, 60000);
    static KelapaSawit kelapa = new KelapaSawit("Kelapa Sawit", 6, 8500000, 500, 18000);
    static Apel apel = new Apel("Apel", 5, 900000, 40, 25000);
    static Scanner tasya = new Scanner(System.in);
    static Hewan[] arrHewan={bebek,unta,domba};
    static Tanaman[] arrTanaman = {apel,kelapa};

    public static void main(String[] args) {
        boolean check = true;
        do {
            menu();
            System.out.print("Masukkan Menu Anda : ");
            int pilih = tasya.nextInt();
            System.out.println();
            breakLine();
            switch (pilih) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    menu3();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program kami");
                    breakLine();
                    check = false;
                    break;
                default: System.out.println("Input Salah");
            }
        } while (check == true);
    }

    
    static void menu() {
        System.out.println(
                "Menu:\n1. Peternakan\n2. Perkebunan\n3. All Budgeting\n4. Exit");
    }

    public static void menu1() {
        //pendataan
        System.out.println("Pendapatan Penjualan Hasil Ternak");
        breakLine();
        for(Hewan hewan: arrHewan){
            hewan.pendapatan();
        }
        breakLine2();
        System.out.printf("TOTAL\t\t:Rp. %,.2f\n\n",totalPendapatan());
        //perawatan
        breakLine();
        System.out.println("Biaya Perawatan");
        breakLine();
        for(Hewan hewan: arrHewan){
            hewan.perawatan();;
        }
        breakLine2();
        System.out.printf("TOTAL\t\t:Rp. %,.2f\n",totalPerawatan());
        breakLine();
        
    }

    public static void menu2() {
        //pendataan
        System.out.println("Pendapatan Penjualan Hasil Kebun");
        breakLine();
        for(Tanaman tanaman: arrTanaman){
            tanaman.pendapatan();
        }
        breakLine2();
        System.out.printf("TOTAL\t\t:Rp. %,.2f\n\n",totalPendapatan2());
        //perawatan
        breakLine();
        System.out.println("Biaya Perawatan");
        breakLine();
        for(Tanaman tanaman: arrTanaman){
            tanaman.perawatan();
        }
        breakLine2();
        System.out.printf("TOTAL\t\t:Rp. %,.2f\n",totalPerawatan2());
        breakLine();
    }

    public static void menu3() {
        // ternak
        System.out.println("Pendapatan Perbulan");
        breakLine();
        System.out.printf("\nTernak\t\t: Rp. %,.2f\nKebun\t\t: Rp. %,.2f\n",totalPendapatan(),totalPendapatan2());
        breakLine2();
        float total1=totalPendapatan()+totalPendapatan2();
        System.out.printf("\nTOTAL\t\t:Rp. %,.2f\n\n",total1);

        // kebun
        breakLine();
        System.out.println("Perawatan Perbulan");
        breakLine();
        System.out.printf("\nTernak\t\t: Rp. %,.2f\nKebun\t\t: Rp. %,.2f\n",totalPerawatan(),totalPerawatan2());
        breakLine2();
        float total2=totalPerawatan()+totalPerawatan2();
        System.out.printf("\nTOTAL\t\t: Rp. %,.2f\n\n",total2);
        breakLine();

        //biaya sehari
        breakLine();
        System.out.println("Biaya Sehari-hari");
        breakLine();
        System.out.printf("\nTernak\t\t: Rp. %,.2f\nKebun\t\t: Rp. %,.2f\n",total1,total2);
        breakLine2();
        System.out.printf("\nTOTAL\t\t: Rp. %,.2f\n\n",(total1-total2));
        breakLine();

    }
    public static float totalPendapatan() {
        float total=0;
        for(Hewan hewan: arrHewan){
            total +=hewan.uangPendapatan();
        }return total;
    }

    public static float totalPerawatan() {
        float total=0;
        for(Hewan hewan: arrHewan){
            total +=hewan.uangPerawatan();
        }return total;
    }

    public static float totalPendapatan2() {
        float total=0;
        for(Tanaman tanaman: arrTanaman){
            total +=tanaman.uangPendapatan();
        }return total;
    }

    public static float totalPerawatan2() {
        float total=0;
        for(int i= 0;i<arrTanaman.length;i++){
            total +=arrTanaman[i].uangPerawatan();
        }return total;
        // float total=1.499f+ arrTanaman[0].uangPerawatan() + arrTanaman[1].uangPerawatan();
        // return total;
    }

    
    static void breakLine() {
        System.out.println("=".repeat(50));
    }
    static void breakLine2() {
        System.out.println("-".repeat(50));
    }

}