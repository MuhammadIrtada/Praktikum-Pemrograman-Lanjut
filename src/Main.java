import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Bebek bebek = new Bebek("Bebek", 15, 2, 2000, 3000);
    static Domba domba = new Domba("Domba", 4, 4, 15000, 45000);
    static Unta unta = new Unta("Unta", 3, 5, 60000, 200000);
    static apel Apel = new apel(5, "Apel", 40, 25000, 900000);
    static sawit Sawit = new sawit(6, "Kelapa Sawit", 500, 8500000, 18000);
    static int kas = 25000000;
    static int index=0;
    static Belanja[] belanja = new Belanja[10];

    public static void main(String[] args) {
        boolean menu = true;
        do {
            System.out.println("=".repeat(40));
            System.out.println("Menu : ");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.println("=".repeat(40));
            System.out.println("Masukkan Menu Anda : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    informasiTernak();
                    break;
                case 2:
                    beli();
                    break;
                case 3 :
                    historyTransaksi();
                    break;
                case 0 :
                    exit();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;

            }

        } while (menu);
    }
    public static void informasiTernak() {
        System.out.println("=".repeat(40));
        System.out.println(bebek.toString());
        System.out.println("=".repeat(40));
        System.out.println(domba.toString());
        System.out.println("=".repeat(40));
        System.out.println(unta.toString());
        System.out.println("=".repeat(40));
        System.out.println(Apel.toString());
        System.out.println("=".repeat(40));
        System.out.println(Sawit.toString());
        System.out.println("=".repeat(40));
        System.out.println("Uang kas anda saat ini : Rp " + kas);
    }
    public static void beli(){
        int pilihan=0;
        int menu=0;
        do {
            System.out.println("==================================================");
            System.out.println("Silahkan pilih menu yang ingin dibeli: ");
            System.out.println("1. Ternak Bebek (Rp. 110.000/ekor)");
            System.out.println("2. Ternak Domba (Rp. 2.450.000/ekor)");
            System.out.println("3. Ternak Unta (Rp. 12.000.000/ekor)");
            System.out.println("4. Kebun Apel (Rp. 7.500.000/hektar)");
            System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)");
            System.out.println("0. Kembali Ke Menu Utama");
            System.out.println("==================================================");
            System.out.print("Masukkan Menu Anda: ");
            menu = input.nextInt();
            System.out.println("=".repeat(40));

            switch(menu){
                case 1:
                    System.out.println("Berapa unit yang akan anda beli : ");
                    pilihan = input.nextInt();
                    if (index < 10){
                        if (kas >= 110000 * pilihan){
                            kas = kas - 110000 * pilihan;
                            bebek.setJumlah(pilihan);
                            belanja[index] = new Belanja ("Bebek", (index + 1), pilihan, 110000,110000* pilihan);
                            index++;
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    }else {
                        System.out.println("Transaksi anda gagal");
                    }break;

                case 2 :
                    System.out.println("Berapa unit yang akan anda beli : ");
                    pilihan = input.nextInt();
                    if (index < 10){
                        if (kas >= 2450000 * pilihan){
                            kas = kas - 2450000 * pilihan;
                            bebek.setJumlah(pilihan);
                            belanja[index] = new Belanja ("Domba", (index + 1), pilihan,2450000,2450000 * pilihan);
                            index++;
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    }else {
                        System.out.println("Transaksi anda gagal");
                    }break;

                case 3 :
                    System.out.println("Berapa unit yang akan anda beli : ");
                    pilihan = input.nextInt();
                    if (index < 10){
                        if (kas >= 12000000 * pilihan){
                            kas = kas - 12000000 * pilihan;
                            bebek.setJumlah(pilihan);
                            belanja[index] = new Belanja ("Unta", (index + 1), pilihan,12000000,12000000 * pilihan);
                            index++;
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    }else {
                        System.out.println("Transaksi anda gagal");
                    }break;
                case 4 :
                    System.out.println("Berapa unit yang akan anda beli : ");
                    pilihan = input.nextInt();
                    if (index < 10){
                        if (kas >= 7000000 * pilihan){
                            kas = kas - 7000000 * pilihan;
                            bebek.setJumlah(pilihan);
                            belanja[index] = new Belanja ("Apel", (index + 1), pilihan,7000000,7000000 * pilihan);
                            index++;
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    }else {
                        System.out.println("Transaksi anda gagal");
                    }break;

                case 5 :
                    System.out.println("Berapa unit yang akan anda beli : ");
                    pilihan = input.nextInt();
                    if (index < 10){
                        if (kas >= 18000000 * pilihan){
                            kas = kas - 18000000 * pilihan;
                            bebek.setJumlah(pilihan);
                            belanja[index] = new Belanja ("Kelapa Sawit", (index + 1), pilihan,18000000,18000000 * pilihan);
                            index++;
                        } else {
                            System.out.println("Kas anda tidak mencukupi");
                        }
                    }else {
                        System.out.println("Transaksi anda gagal");
                    }break;
                default:
                    System.out.println("Pilihan anda salah mohon input ulang!");
                    break;
            }
        } while (menu==0);
    }
    public static  void historyTransaksi(){
       if (belanja.length > 0) {
           for (int i = 0; i < index; i++) {
               System.out.println(belanja[i].toString());
           }
           System.out.println("Uang kas anda saat ini sisa : " +kas);
       }else{
                System.out.println("=".repeat(40));
                System.out.println("Tidak terdapat transaksi");
                System.out.println("=".repeat(40));
            }

        }

    private static boolean cekSaldo(int total) {
        if (kas >= total) {
            return true;
        } else {
            return false;
        }
    }
    public static void exit(){
        System.out.println("Terima kasih sudah menggunakan layanan ini 😊");
    }

}
