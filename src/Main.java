import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Apel apel = new Apel("Apel", 5, 50, 28000, 900000);
    static int durasiPupuk = 3;
    static double hargaPupuk = 320000;
    static int hari = 1;

    public static void main(String[] args) throws Exception {
        String inputMenu;
        boolean loopMenu = true;
        
        do {
            System.out.println("Silahkan pilih menu anda:");
            System.out.println("1. Melihat Informasi Apel");
            System.out.println("2. Tambah Lahan Apel");
            System.out.println("3. Pakai Pupuk");
            System.out.println("4. Next Day");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan Anda: ");
            inputMenu = sc.next();
            breakLine();
    
            switch (inputMenu) {
                case "1":
                    showInformasiApel();
                    break;
                case "2":
                    tambahLahanApel();
                    break;
                case "3":
                    pakaiPupuk();
                    break;
                case "4":
                    nextDay();
                    break;
                case "5":
                    loopMenu = false;
                    System.out.println("Terimakasih telah menggunakan layanan kami");
                    break;            
                default:
                    System.out.println("Input yang anda masukkan tidak sesuai. Silahkan coba lagi!");
                    break;
            }
            breakLine();
        } while (loopMenu);
    }

    static void showInformasiApel(){
        System.out.println(apel.toString(durasiPupuk, hargaPupuk));
    }

    static void tambahLahanApel() {
        double luasTanahTambahan;

        System.out.print("Tambah Luas Tanah (hektar) : ");
        luasTanahTambahan = sc.nextDouble();

        apel.tambahLuasTanah(luasTanahTambahan);
        System.out.println("-".repeat(50));
        System.out.println("Tanah Berhasil Ditambahkan");
    }

    static void pakaiPupuk() {
        apel.pakaiPupuk(durasiPupuk);
        System.out.println("Pupuk Berhasil Dipakai");
    }

    static void nextDay() {
        apel.kurangDurasiPupuk();
        hari++;

        System.out.println("Hari Telah Berganti, Memasuki hari ke-" + hari);
    }

    static void breakLine(){
        System.out.println("=".repeat(50));
    }

}
