import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static float uangModal = 25000000;
    static Bebek bebek = new Bebek("Bebek", 15, 110000, 3000, 2, 2000);
    static Domba domba = new Domba("Domba", 4, 2450000, 45000, 4, 15000);
    static Unta unta = new Unta("Unta", 3, 12000000, 200000, 5, 60000);
    static Apel apel = new Apel("Apel", 5, 7500000, 900000, 40, 25000);
    static KelapaSawit kelapaSawit = new KelapaSawit("Kelapa Sawit", 6, 18000000, 8500000, 500, 18000);

    public static void main(String[] args) throws Exception {
        String[] deskripsi = { null, bebek.getJenis(), domba.getJenis(), unta.getJenis(), apel.getJenis(),
                kelapaSawit.getJenis() };
        float[] harga = { 0, bebek.getHargaPerEkor(), domba.getHargaPerEkor(), unta.getHargaPerEkor(),
                apel.getHargaPerHektar(), kelapaSawit.getHargaPerHektar() };
        ArrayList<Integer> selectedMenu = new ArrayList<>();
        ArrayList<Integer> selectedUnit = new ArrayList<>();
        boolean loopMenu = true;
        boolean transaksiBerhasil = false;
        int jumlahTransaksi = 0;
        int jumlahBaru = 0;
        int pilihMenu = 0;
        int totalHarga = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Tampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.print("Masukkan Menu Anda : ");
            int input = in.nextInt();
            System.out.println("=".repeat(50));
            if (input == 0) {
                break;
            } else if (input < 0 || input > 3) {
                continue;
            }
            switch (input) {
                case 1:
                    System.out.println(bebek.showInformasi() + "\n" + "=".repeat(50));
                    System.out.println(domba.showInformasi() + "\n" + "=".repeat(50));
                    System.out.println(unta.showInformasi() + "\n" + "=".repeat(50));
                    System.out.println(apel.showInformasi() + "\n" + "=".repeat(50));
                    System.out.println(kelapaSawit.showInformasi() + "\n" + "=".repeat(50));
                    System.out.println(String.format("Uang kas anda saat ini\t: Rp.%,.0f", uangModal));
                    System.out.println("=".repeat(50));
                    break;
                case 2:
                    boolean loopTransaksi = true;
                    jumlahTransaksi = 0;
                    selectedMenu.clear();
                    while (loopTransaksi) {
                        System.out.println("Silahkan pilih menu yang ingin dibeli: ");
                        System.out.println("1. Ternak Bebek (Rp. 110.000/ekor)");
                        System.out.println("2. Ternak Domba (Rp. 2.450.000/ekor)");
                        System.out.println("3. Ternak Unta (Rp. 12.000.000/ekor)");
                        System.out.println("4. Kebun Apel (Rp. 7.500.000/hektar)");
                        System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)");
                        System.out.println("0. Kembali ke Menu Utama");
                        System.out.print("Masukkan Menu Anda : ");
                        pilihMenu = in.nextInt();
                        System.out.println("=".repeat(50));
                        if (pilihMenu < 0 || pilihMenu > 5) {
                            continue;
                        }
                        if (pilihMenu == 0) {
                            break;
                        }
                        System.out.print("Berapa Unit yang Akan Anda Beli? ");
                        jumlahBaru = in.nextInt();
                        System.out.println("=".repeat(50));
                        jumlahTransaksi++;
                        selectedMenu.add(pilihMenu);
                        selectedUnit.add(jumlahBaru);
                        switch (pilihMenu) {
                            case 1:
                                bebek.addJumlah(jumlahBaru);
                                uangModal = uangModal - (jumlahBaru * harga[1]);
                                break;
                            case 2:
                                domba.addJumlah(jumlahBaru);
                                uangModal = uangModal - (jumlahBaru * harga[2]);
                                break;
                            case 3:
                                unta.addJumlah(jumlahBaru);
                                uangModal = uangModal - (jumlahBaru * harga[3]);
                                break;
                            case 4:
                                apel.addJumlah(jumlahBaru);
                                uangModal = uangModal - (jumlahBaru * harga[4]);
                                break;
                            case 5:
                                kelapaSawit.addJumlah(jumlahBaru);
                                uangModal = uangModal - (jumlahBaru * harga[5]);
                                break;
                            case 0:
                                loopTransaksi = true;
                                break;
                        }
                        if (totalHarga > uangModal) {
                            System.out.println("Kas anda tidak mencukupi.\n" + "=".repeat(50));
                            if (uangModal < 0) {
                                uangModal = uangModal + (jumlahBaru * harga[pilihMenu]);
                            }
                            continue;
                        }
                        if (jumlahTransaksi >= 10) {
                            System.out.println("Transaksi Gagal\n" + "=".repeat(50));
                            loopTransaksi = true;
                        } else if (jumlahTransaksi > 0 || jumlahTransaksi <= 10) {
                            System.out.println("Transaksi Berhasil\n" + "=".repeat(50));
                            transaksiBerhasil = true;
                        }
                        continue;
                    }
                    break;
                case 3:
                    if (totalHarga > uangModal || uangModal == 0 || !transaksiBerhasil || jumlahTransaksi == 0) {
                        System.out.println("Belum ada transaksi\n" + "=".repeat(50));
                        continue;
                    }
                    for (int i = 0; i < Math.min(jumlahTransaksi, 10); i++) {
                        System.out.println("Transaksi " + (i + 1));
                        System.out.println("-".repeat(50));
                        int indexMenu = selectedMenu.get(i);
                        int jumlahUnit = selectedUnit.get(i);
                        System.out.println("Deskripsi\t: " + deskripsi[indexMenu]);
                        System.out.println("Jumlah Unit\t: " + jumlahUnit);
                        float totalBiaya = jumlahUnit * harga[indexMenu];
                        System.out.println(String.format("Harga\t\t: Rp.%,.0f", harga[indexMenu]));
                        System.out.println(String.format("Total Biaya\t: Rp.%,.0f", totalBiaya));
                        System.out.println("=".repeat(50));
                    }
                    break;
                default:
                    loopMenu = false;
                    break;
            }
        } while (loopMenu);
    }
}

