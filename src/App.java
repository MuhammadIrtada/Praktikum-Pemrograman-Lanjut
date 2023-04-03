import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static Hewan bebek = new Hewan("Bebek", "Telur Biasa", 15, 2, 2000);
    static Hewan unta = new Hewan("Unta", "Susu Putih", 3, 5, 60000);
    static Hewan domba = new Hewan("Domba", "Bulu Hitam", 4, 4, 15000);

    public static void main(String[] args) throws Exception {

        boolean loopMenu = true;

        do {
            System.out.println("Menu : ");
            System.out.println("1. Menampilkan Info Peternakan");
            System.out.println("2. Menampilkan Info Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu anda : ");
            String inputMenu = input.nextLine();
            switch (inputMenu) {
                case "1":
                    bebek.setHitungProduksiHarian(2, 15);
                    bebek.infoBebek();
                    domba.setHitungProduksiHarian(4, 4);
                    domba.infoDomba();
                    unta.setHitungProduksiHarian(5, 3);
                    unta.infoUnta();
                    break;
                case "2":
                    bebek.setHitungPendapatanHarian(2000);
                    bebek.infoPendapatan();
                    domba.setHitungPendapatanHarian(15000);
                    domba.infoPendapatan();
                    unta.setHitungPendapatanHarian(60000);
                    unta.infoPendapatan();
                    System.out.println("Total Pendapatan : " + (bebek.getHitungPendapatanHarian()
                            + domba.getHitungPendapatanHarian() + unta.getHitungPendapatanHarian()));
                    System.out.println("=======================================================");
                    break;
                case "3":
                    bebek.setHitungPpn(2000);
                    bebek.infoPpn();
                    domba.setHitungPpn(15000);
                    domba.infoPpn();
                    unta.setHitungPpn(60000);
                    unta.infoPpn();
                    System.out.println("Total Pendapatan : "
                            + (bebek.getHitungPpn() + domba.getHitungPpn() + unta.getHitungPpn()));
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
}
