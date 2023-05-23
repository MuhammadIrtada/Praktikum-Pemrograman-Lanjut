import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static float kas = 25000000;
    static int batas = 0;
    static String[] transaksi = new String[10];
    static Domba domba = new Domba("Domba", 4, 4, 15000);
    static Bebek bebek = new Bebek("Bebek", 15, 2, 2000);
    static Unta unta = new Unta("Unta", 3, 5, 60000);
    static Kelapa kelapa = new Kelapa("Kelapa Sawit", 6, 500, 18000);
    static Apel apel = new Apel("Apel", 5, 40, 25000);

    public static void main(String[] args) {

        boolean loop = !false;

        do {
            menu();
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    informasi();
                    break;

                case 2:
                    beli();
                    break;

                case 3:
                    transaksi();
                    break;

                case 0:
                    loop = false;
                    System.out.println("=".repeat(40));
                    System.out.println("Dadahhhh Tengkiu Sayangg");
                    System.out.println("=".repeat(40));
                    break;

                default:
                    System.out.println("=".repeat(40));
                    System.out.println("Pilihan menu tidak valid");
                    System.out.println("=".repeat(40));
                    break;
            }
        } while (loop);
        sc.close();
    }

    public static void beli() {
        boolean loop = true;
        while (loop) {
            if (batas < 10) {
                System.out.println("=".repeat(40));
                System.out.println("Silakan pilih menu yang ingin dibeli:");
                System.out.println("1. Ternak Bebek (Rp. 110.000/Ekor)");
                System.out.println("2. Ternak Domba (Rp. 2.450.000/Ekor)");
                System.out.println("3. Ternak Unta (Rp. 12.000.000/Ekor)");
                System.out.println("4. Kebun Apel (Rp. 7.500.000/ hektar)");
                System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/ hektar)");
                System.out.println("0. Kembali ke menu utama");
                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        int pilihan = sc.nextInt();
                        if (pilihan * bebek.getHarga() <= kas) {

                            bebek.tambahKuantitas(pilihan);
                            kas -= pilihan * bebek.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            history(batas, "Bebek", pilihan, bebek.getHarga());

                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;

                    case 2:
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * domba.getHarga() <= kas) {

                            domba.tambahKuantitas(pilihan);
                            kas -= pilihan * domba.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            history(batas, "Domba", pilihan, domba.getHarga());

                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;

                    case 3:
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * unta.getHarga() <= kas) {

                            unta.tambahKuantitas(pilihan);
                            kas -= pilihan * unta.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            history(batas, "Unta", pilihan, unta.getHarga());

                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;
                    case 4:
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * apel.getHarga() <= kas) {

                            apel.tambahKuantitas(pilihan);
                            kas -= pilihan * apel.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            history(batas, "Kebun Apel", pilihan, apel.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;
                    case 5:

                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * kelapa.getHarga() <= kas) {

                            kelapa.tambahKuantitas(pilihan);
                            kas -= pilihan * kelapa.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            history(batas, "Kebun Kelapa Sawit", pilihan, kelapa.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas kurang");
                        }
                        break;
                    case 0:
                        loop = false;
                        break;

                    default: // Pilihan tidak valid
                        System.out.println("=".repeat(40));
                        System.out.println("Pilih menu yang valid");
                        break;
                }
            } else {
                System.out.println("=".repeat(40));
                System.out.println("Transaksi udah kebanyakan");
                System.out.println("=".repeat(40));
                loop = false;
            }
        }
    }

    public static void menu() {
        System.out.println(
                "Menu \n1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. History Transaksi\n0. Exit\nMasukkan Pilihan Anda: ");
    }

    public static void informasi() {
        System.out.println("=".repeat(40));
        Hewan.cetakAll();
        Tanaman.cetakAll();
        System.out.printf("Uang kas saat ini: Rp. %,.0f\n", kas);
        System.out.println("=".repeat(40));
    }

    public static void transaksi() {
        System.out.println("=".repeat(40));
        if (transaksi[0] == null) {
            System.out.println("Kagak ada transaksi");
            System.out.println("=".repeat(40));
        } else {
            for (int i = 0; i < batas; i++) {
                System.out.println(transaksi[i]);
            }
        }
    }

    public static void history(int transaksi, String desc, int jmlUnit, float harga) {
        Main.transaksi[batas] = (String.format(
                "Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t \t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s",
                transaksi, "-".repeat(40), desc, jmlUnit, harga, jmlUnit * harga, "=".repeat(40)));
        batas += 1;
    }

}