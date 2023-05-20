import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static float kas = 25000000;
    static int hitungan = 0;
    static ArrayList<String> transaksi = new ArrayList<String>();
    static Domba domba = new Domba("Domba", 4, 4, 15000);
    static Bebek bebek = new Bebek("Bebek", 15, 2, 2000);
    static Unta unta = new Unta("Unta", 3, 5, 60000);
    static Kelapa kelapa = new Kelapa("Kelapa Sawit", 6, 500, 18000);
    static Apel apel = new Apel("Apel", 5, 40, 25000);

    public static void main(String[] args) {
       
        boolean loop = true;

        while (loop) {
            cetakMenu();
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: // Tampil Info
                    cetakInfo();
                    break;

                case 2: // Beli
                    menuBeli();
                    break;

                case 3: // History
                    cetakHistory();
                    break;

                case 0: // Exit
                    loop = false;
                    System.out.println("=".repeat(40));
                    System.out.println("Goodbye");
                    System.out.println("=".repeat(40));
                    break;

                default: // Pilihan tidak valid
                    System.out.println("=".repeat(40));
                    System.out.println("Pilihan menu tidak valid");
                    System.out.println("=".repeat(40));
                    break;
            }
        }
        sc.close();
    }

    public static void cetakMenu() {
        System.out.printf(
                "Menu: \n1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. History Transaksi\n0. Exit\nMasukkan Pilihan Anda: ");
    }

    public static void cetakInfo() {
        System.out.println("=".repeat(40));
        Hewan.cetakAll();
        Tanaman.cetakAll();
        System.out.printf("Uang kas saat ini: Rp. %,.0f\n", kas);
        System.out.println("=".repeat(40));
    }

    public static void cetakHistory() {
        System.out.println("=".repeat(40));
        if(transaksi.isEmpty()){
            System.out.println("Belum ada transaksi");
            System.out.println("=".repeat(40));
        } else {
        for (String trans : transaksi) {
            System.out.println(trans);
        }
    }

    }

    public static void simpanHistory(int transaksi, String desc, int jmlUnit, float harga) {
        Main.transaksi.add(String.format(
                "Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t \t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s",
                transaksi, "-".repeat(40), desc, jmlUnit, harga, jmlUnit * harga, "=".repeat(40)));
    }


    public static void menuBeli() {
        boolean loop = true;
        while (loop) {
            if (hitungan == 10) {
                System.out.println("=".repeat(40));
                System.out.println("Transaksi sudah melebihi batas, kembali ke Menu Utama");
                System.out.println("=".repeat(40));
                loop = false;
            } else {
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
                    case 1: // Bebek
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        int pilihan = sc.nextInt();
                        if (pilihan * bebek.getHarga() <= kas) {
                            hitungan += 1;
                            bebek.tambahKuantitas(pilihan);
                            kas -= pilihan * bebek.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            simpanHistory(hitungan, "Bebek", pilihan, bebek.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;

                    case 2: // Domba
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * domba.getHarga() <= kas) {
                            hitungan += 1;
                            domba.tambahKuantitas(pilihan);
                            kas -= pilihan * domba.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            simpanHistory(hitungan, "Domba", pilihan, domba.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;

                    case 3: // Unta
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * unta.getHarga() <= kas) {
                            hitungan += 1;
                            unta.tambahKuantitas(pilihan);
                            kas -= pilihan * unta.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            simpanHistory(hitungan, "Unta", pilihan, unta.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;
                    case 4: // Apel
                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * apel.getHarga() <= kas) {
                            hitungan += 1;
                            apel.tambahKuantitas(pilihan);
                            kas -= pilihan * apel.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            simpanHistory(hitungan, "Kebun Apel", pilihan, apel.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;
                    case 5: // Kelapa Sawit

                        System.out.print("Berapa unit yang ingin dibeli? ");
                        pilihan = sc.nextInt();
                        if (pilihan * kelapa.getHarga() <= kas) {
                            hitungan += 1;
                            kelapa.tambahKuantitas(pilihan);
                            kas -= pilihan * kelapa.getHarga();
                            System.out.println("=".repeat(40));
                            System.out.println("Transaksi Berhasil.");
                            simpanHistory(hitungan, "Kebun Kelapa Sawit", pilihan, kelapa.getHarga());
                        } else {
                            System.out.println("=".repeat(40));
                            System.out.println("Kas tidak mencukupi");
                        }
                        break;
                    case 0: // Exit to Main Menu
                        loop = false;
                        break;

                    default: // Pilihan tidak valid
                        System.out.println("=".repeat(40));
                        System.out.println("Pilihan menu tidak valid");
                        break;
                }
            }
        }
    }

}