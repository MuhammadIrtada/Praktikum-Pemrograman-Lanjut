
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

   

    public class main {   
        //  public static void main(String[] args) {
        List<Hewan> peternakan = new ArrayList<>();
        List<Tanaman> perkebunan = new ArrayList<>();
        List<String> transaksi = new ArrayList<>();
        int kas = 25000000;
        int transaksiCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Menu: ====");
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Peternakan dan Perkebunan");
            System.out.println("3. History Transaksi");
            System.out.println("4. Exit ");
            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();
//           

            switch (menu) {
                case 1:
                    System.out.println("=== Informasi Peternakan ===");
                     for (Hewan hewan : peternakan){
//                       Hewan peternakan = new Hewan();
                        System.out.println("Jenis Hewan: " + hewan.getJenisHewan());
                        System.out.println("Jumlah Hewan: " + hewan.getJumlahHewan());
                        System.out.println("Hasil Produksi: " + hewan.getHasilProduksi());
                        System.out.println("Harga Produksi: " + hewan.getHargaProduksi());
                        System.out.println("Profit: " + hewan.hitungProfit());
                        System.out.println("----------------------");
                    
                     }
//                        Tanaman perkebunan = new Tanaman();
                    System.out.println("=== Informasi Perkebunan ===");
                    for (Tanaman tanaman : perkebunan) {
                        System.out.println("Jenis Tanaman: " + tanaman.getJenisTanaman());
                        System.out.println("Jumlah Tanaman: " + tanaman.getJumlahTanaman());
                        System.out.println("Hasil Produksi: " + tanaman.getHasilProduksi());
                        System.out.println("Harga Produksi: " + tanaman.getHargaProduksi());
                        System.out.println("Profit: " + tanaman.hitungProfit());
                        System.out.println("----------------------");
                    }

                    System.out.println("Jumlah Kas saat ini: " + kas);
                    break;

                case 2:
                    if (transaksiCount >= 10) {
                        System.out.println("Maaf, Anda telah mencapai batas transaksi.");
                        break;
                    }  

                    System.out.println("=== Pembelian Peternakan dan Perkebunan ===");
                    System.out.println("1. Ternak Bebek (Rp. 110.000/ekor)");
                    System.out.println("2. Ternak Domba (Rp. 2.450.000/ekor)");
                    System.out.println("3. Ternak Unta (Rp. 12.000.000/ekor)");
                    System.out.println("4. Kebun Apel (Rp. 7.500.000/hektar)");
                    System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)");
                    System.out.print("Pilih jenis pembelian (1-5): ");
                    int jenisPembelian = scanner.nextInt();

                    switch (jenisPembelian) {
                        case 1:
                            System.out.print("Masukkan jumlah bebek yang ingin dibeli: ");
                            int jumlahBebek = scanner.nextInt();
                            int totalBebekHarga= jumlahBebek * 110000;
                
                    if (kas < totalBebekHarga) {
                        System.out.println("Maaf, kas tidak mencukupi untuk melakukan transaksi ini.");
                    } else {
                        peternakan.add(new Bebek(jumlahBebek, 110000, 2, 3000, 2));
                        kas -= totalBebekHarga;
                        transaksi.add("Pembelian " + jumlahBebek + " ekor bebek");
                        transaksiCount++;
                        System.out.println("Pembelian bebek sukses!");
                    }
                
                            break;


                        case 2:
                            System.out.print("Masukkan jumlah domba yang ingin dibeli: ");
                            int jumlahDomba = scanner.nextInt();
                            int totalDombaHarga = jumlahDomba * 2450000;

                            if (kas < totalDombaHarga) {
                                System.out.println("Maaf, kas tidak mencukupi untuk melakukan transaksi ini.");
                            } else {
                                peternakan.add(new Domba(jumlahDomba, 2450000, 4, 45000, 4));
                                kas -= totalDombaHarga;
                                transaksi.add("Pembelian " + jumlahDomba + " ekor domba");
                                transaksiCount++;
                                System.out.println("Pembelian domba sukses!");
                            }
                            break;

                        case 3:
                            System.out.print("Masukkan jumlah unta yang ingin dibeli: ");
                            int jumlahUnta = scanner.nextInt();
                            int totalUntaHarga = jumlahUnta * 12000000;

                            if (kas < totalUntaHarga) {
                                System.out.println("Maaf, kas tidak mencukupi untuk melakukan transaksi ini.");
                            } else {
                                peternakan.add(new Unta(jumlahUnta, 12000000, 5, 200000, 5));
                                kas -= totalUntaHarga;
                                transaksi.add("Pembelian " + jumlahUnta + " ekor unta");
                                transaksiCount++;
                                System.out.println("Pembelian unta sukses!");
                            }
                            break;

                        case 4:
                            System.out.print("Masukkan jumlah hektar kebun apel yang ingin dibeli: ");
                            int jumlahApel = scanner.nextInt();
                            int totalApelHarga = jumlahApel * 7500000;

                            if (kas < totalApelHarga) {
                                System.out.println("Maaf, kas tidak mencukupi untuk melakukan transaksi ini.");
                            } else {
                                perkebunan.add(new Apel(jumlahApel, 7500000, 40, 900000, 40));
                                kas -= totalApelHarga;
                                transaksi.add("Pembelian " + jumlahApel + " hektar kebun apel");
                                transaksiCount++;
                                System.out.println("Pembelian kebun apel sukses!");
                            }
                            break;

                        case 5:
                            System.out.print("Masukkan jumlah hektar kebun kelapa sawit yang ingin dibeli: ");
                            int jumlahKelapaSawit = scanner.nextInt();
                            int totalKelapaSawitHarga = jumlahKelapaSawit * 18000000;

                            if (kas < totalKelapaSawitHarga) {
                                System.out.println("Maaf, kas tidak mencukupi untuk melakukan transaksi ini.");
                            } else {
                                perkebunan.add(new KelapaSawit(jumlahKelapaSawit, 18000000, 500, 8500000, 500) {});
                                kas -= totalKelapaSawitHarga;
                                transaksi.add("Pembelian " + jumlahKelapaSawit + " hektar kebun kelapa sawit");
                                transaksiCount++;
                                System.out.println("Pembelian kebun kelapa sawit sukses!");
                            }
                            break;

                        default:
                            System.out.println("Menu tidak valid.");
                            break;
                    }
                    break;

                case 3:
                    if (transaksi.isEmpty()) {
                        System.out.println("Belum ada transaksi yang dilakukan.");
                    } else {
                        System.out.println("=== History Transaksi ===");
                        for (String transaksiItem : transaksi) {
                            System.out.println(transaksiItem);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
// }
    // }
// }
