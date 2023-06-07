package Modul6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Bebek bebek;
    private Domba domba;
    private Unta unta;
    private Apel apel;
    private KelapaSawit kelapaSawit;
    private int kas;
    private List<Transaksi> transaksiList;

    public Main() {
        bebek = new Bebek(15);
        domba = new Domba(4);
        unta = new Unta(3);
        apel = new Apel(5);
        kelapaSawit = new KelapaSawit(6);

        kas = 25000000;
        transaksiList = new ArrayList<>();
    }

    public void tampilkanInformasi() {
        System.out.println("\nInformasi Peternakan dan Perkebunan:");
        System.out.println("---------------------------------------------");

        System.out.println("Jenis: " + bebek.getNama());
        System.out.println("Jumlah: " + bebek.getJumlah() + " ekor");
        System.out.println("Telur/Ekor: " + bebek.getHasilPerHari() + " butir");
        System.out.println("Total Telur/Hari: " + bebek.getJumlah() * bebek.getHasilPerHari() + " butir");
        System.out.println("Harga Telur/Butir: Rp. " + bebek.getHargaHasil());
        System.out.println("Profit/Hari: Rp. " + bebek.getProfit());
        System.out.println("===============================================");

        System.out.println("Jenis: " + domba.getNama());
        System.out.println("Jumlah: " + domba.getJumlah() + " ekor");
        System.out.println("Susu/Ekor: " + domba.getHasilPerHari() + " kg");
        System.out.println("Total Susu/Hari: " + domba.getJumlah() * domba.getHasilPerHari() + " kg");
        System.out.println("Harga Susu/Kg: Rp. " + domba.getHargaHasil());
        System.out.println("Profit/Hari: Rp. " + domba.getProfit());
        System.out.println("===============================================");

        System.out.println("Jenis: " + unta.getNama());
        System.out.println("Jumlah: " + unta.getJumlah() + " ekor");
        System.out.println("Susu/Ekor: " + unta.getHasilPerHari() + " liter");
        System.out.println("Total Susu/Hari: " + unta.getJumlah() * unta.getHasilPerHari() + " liter");
        System.out.println("Harga Susu/Liter: Rp. " + unta.getHargaHasil());
        System.out.println("Profit/Hari: Rp. " + unta.getProfit());
        System.out.println("===============================================");

        System.out.println("Jenis: " + apel.getNama());
        System.out.println("Luas: " + apel.getLuas() + " hektar");
        System.out.println("Buah/Hektar: " + apel.getHasilPerHari() + " kg");
        System.out.println("Total Buah/Hari: " + apel.getLuas() * apel.getHasilPerHari() + " kg");
        System.out.println("Harga Buah/Kg: Rp. " + apel.getHargaHasil());
        System.out.println("Profit/Hari: Rp. " + apel.getProfit());
        System.out.println("===============================================");

        System.out.println("Jenis: " + kelapaSawit.getNama());
        System.out.println("Luas: " + kelapaSawit.getLuas() + " hektar");
        System.out.println("Minyak/Hektar: " + kelapaSawit.getHasilPerHari() + " kg");
        System.out.println("Total Minyak/Hari: " + kelapaSawit.getLuas() * kelapaSawit.getHasilPerHari() + " kg");
        System.out.println("Harga Minyak/Kg: Rp. " + kelapaSawit.getHargaHasil());
        System.out.println("Profit/Hari: Rp. " + kelapaSawit.getProfit());
        System.out.println("===============================================");
         System.out.println("Uang kas anda saat ini : Rp. "+ kas);
         System.out.println("===============================================");
    }

    public void beliHewanAtauKebun() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n"+ "Pilih hewan atau tanaman yang ingin dibeli:");
            System.out.println("---------------------------------------------");
        System.out.println("1. Bebek (110.000/ekor)");
        System.out.println("2. Domba (2.450.000/ekor)");
        System.out.println("3. Unta (12.000.000/ekor)");
        System.out.println("4. Kebun Apel (7.500.000/ hektar)");
        System.out.println("5. Kebun Kelapa Sawit (18.000.000/hektar)");
        System.out.println("0. Kembali Ke Menu Utama");
        System.out.print("Masukkan Menu Anda: ");
        int pilihan = scanner.nextInt();
        System.out.println("---------------------------------------------");
        if(pilihan==0){
            break;
        }
        System.out.print("Berapa unit yang akan Anda beli? ");
        int jumlah = scanner.nextInt();
        System.out.println("===============================================");
        int totalHarga = 0;
        String nama = "";

        switch (pilihan) {
            case 1:
                totalHarga = jumlah * 110000;
                nama = "Bebek";
                bebek.tambahJumlah(jumlah);
                break;
            case 2:
                totalHarga = jumlah * 2450000;
                nama = "Domba";
                domba.tambahJumlah(jumlah);
                break;
            case 3:
                totalHarga = jumlah * 12000000;
                nama = "Unta";
                unta.tambahJumlah(jumlah);
                break;
            case 4:
                totalHarga = jumlah * 7500000;
                nama = "Kebun Apel";
                apel.tambahLuas(jumlah);
                break;
            case 5:
                totalHarga = jumlah * 18000000;
                nama = "Kebun Kelapa Sawit";
                kelapaSawit.tambahLuas(jumlah);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                return;
        }

        if (kas >= totalHarga) {
            kas -= totalHarga;
            Transaksi transaksi = new Transaksi(nama, jumlah, totalHarga);
            transaksiList.add(transaksi);
            System.out.println("Transaksi Berhasil!");
            System.out.println("===============================================");
        } else {
            System.out.println("Kas tidak cukup!");
        }
        }
    }

   public void historyTransaksi() {
    System.out.println("\n"+ "History Transaksi:");
    System.out.println("---------------------------------------------");
    int transaksiIndex = 1;
    for (Transaksi transaksi : transaksiList) {
        System.out.println("Transaksi " + transaksiIndex++);
        System.out.println("---------------------------------------------");
        System.out.println(transaksi);
        System.out.println("===============================================");
    }
}


    public static void main(String[] args) {
        Main pakKiw = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.print("Masukkan Menu Anda: ");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    pakKiw.tampilkanInformasi();
                    break;
                case 2:
                    pakKiw.beliHewanAtauKebun();
                    break;
                case 3:
                    pakKiw.historyTransaksi();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
