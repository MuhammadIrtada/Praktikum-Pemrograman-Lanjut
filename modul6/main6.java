package modul6;
import java.util.Scanner;  
public class main6 {
    static Scanner scan= new Scanner(System.in);
    static float Modal = 25000000;
    static bebek Bebek = new bebek("Bebek", 15, 2, 2000);
    static domba Domba = new domba("Domba", 4, 4, 15000);
    static unta Unta = new unta("Unta", 3, 5, 60000);
    static apel Apel = new apel("Apel", 5, 40, 25000);
    static kelapaSawit Kelapa = new kelapaSawit("Kelapa Sawit", 6, 500, 18000);

    public static void main(String[] args) {
        // System.out.println(bebek.info());
        // System.out.println("kas = "+ Modal);
        String inputMenu;
        boolean loopMenu = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Anda: ");
            inputMenu = scan.next();
            
            switch (inputMenu) {
                case "1":
                    System.out.println("=".repeat(40));
                    System.out.println(Bebek.infoBebek());
                    System.out.println("=".repeat(40));
                    System.out.println(Domba.info());
                    System.out.println("=".repeat(40));
                    System.out.println(Unta.info());
                    System.out.println("=".repeat(40));
                    System.out.println(Apel.info());
                    System.out.println("=".repeat(40));
                    System.out.println(Kelapa.info());
                    System.out.println("=".repeat(40));
                    break;
                case "2":
                    System.out.println("=".repeat(40));
                    main6.opsi2();
                    break;
                case "3":
                    
                    break;
                case "4":
                    loopMenu = false;
                    System.out.println("Terimakasih telah menggunakan layanan kami");
                    break;            
                default:
                    System.out.println("Input yang anda masukkan tidak sesuai. Silahkan coba lagi!");
                    break;
            }
        } while (loopMenu);
    }
    public static void opsi2(){
        String inputMenu;
        boolean loopMenu = true;
        do {
            System.out.println("Silahkan pilih menu yang ingin dibeli!");
            System.out.println("1. Ternak Bebek (Rp. 110.000/Ekor)");
            System.out.println("2. Ternak Domba (Rp. 2.450.000/Ekor)");
            System.out.println("3. Ternak Unta (Rp. 12.000.000/Ekor)");
            System.out.println("4. Kebun Apel (Rp. 7.500.000/Hektar)");
            System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/Hektar)");
            System.out.println("0. Kembali ke menu utama");
            System.out.print("Masukkan Menu Anda: ");
            inputMenu = scan.next();
            System.out.println("=".repeat(40));
            System.out.print("Berapa Unit yang akan Anda Beli ? ");
            int inputJumlah = scan.nextInt();
            System.out.println("=".repeat(40));
            System.out.println("Transaksi Berhasil.");
            switch (inputMenu) {
                case "1":
                    Bebek.tmbhJumlah(inputJumlah);
                    
                case "2":
                    Domba.tmbhJumlah(inputJumlah);
                    System.out.println("=".repeat(40));
                    break;
                case "3":
                    Unta.tmbhJumlah(inputJumlah);
                    System.out.println("=".repeat(40));
                    break;
                case "4":
                    Apel.tmbhJumlah(inputJumlah);
                    System.out.println("=".repeat(40));
                    break;
                case "5":
                    Kelapa.tmbhJumlah(inputJumlah);
                    System.out.println("=".repeat(40));
                    break;
                case "0":
                    loopMenu = false;
                    main6.main(null);
                    break;            
                default:
                    System.out.println("Input yang anda masukkan tidak sesuai. Silahkan coba lagi!");
                    break;
            }
        } while (loopMenu);
    }
}
