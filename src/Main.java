import java.util.Scanner;

interface Harga {
    int hargaBebek = 110000;
    int hargaDomba = 2450000;
    int hargaUnta = 12000000;
    int hargaApel = 7500000;
    int hargaKelapaSawit = 18000000;
}

class Ternak implements Harga {
    private int jumlahBebek;
    private int jumlahDomba;
    private int jumlahUnta;

    public Ternak(int jumlahBebek, int jumlahDomba, int jumlahUnta) {
        this.jumlahBebek = jumlahBebek;
        this.jumlahDomba = jumlahDomba;
        this.jumlahUnta = jumlahUnta;
    }

    public void informasiTernak() {
        System.out.println("Informasi Jumlah Hewan Ternak:");
        System.out.println("Bebek: " + jumlahBebek + " ekor");
        System.out.println("Domba: " + jumlahDomba + " ekor");
        System.out.println("Unta: " + jumlahUnta + " ekor");
    }

    public void beliTernak(int jenisTernak, int jumlahTernak) {
        String namaHewan = "";
        switch (jenisTernak) {
            case 1:
                jumlahBebek += jumlahTernak;
                namaHewan = "Bebek";
                break;
            case 2:
                jumlahDomba += jumlahTernak;
                namaHewan = "Domba";
                break;
            case 3:
                jumlahUnta += jumlahTernak;
                namaHewan = "Unta";
                break;
            default:
                System.out.println("Jenis hewan ternak tidak valid.");
                return;
        }
        System.out.println("Pembelian berhasil!");
        informasiTernak();
        System.out.println("Biaya yang harus dibayar: ");
        System.out.println("Tipe: "+namaHewan+", "+ jumlahTernak + " ekor");
        System.out.println("Total Biaya : Rp. " + hitungBiayaTernak(jenisTernak, jumlahTernak));
    }

    private int hitungBiayaTernak(int jenisTernak, int jumlahTernak) {
        int biaya = 0;
        switch (jenisTernak) {
            case 1:
                biaya = jumlahTernak * hargaBebek;
                break;
            case 2:
                biaya = jumlahTernak * hargaDomba;
                break;
            case 3:
                biaya = jumlahTernak * hargaUnta;
                break;
        }
        return biaya;
    }
}

class Perkebunan implements Harga {
    private int luasApel;
    private int luasKelapaSawit;

    public Perkebunan(int luasApel, int luasKelapaSawit) {
        this.luasApel = luasApel;
        this.luasKelapaSawit = luasKelapaSawit;
    }

    public void informasiPerkebunan() {
        System.out.println("Informasi Luas Tanah Perkebunan:");
        System.out.println("Apel: " + luasApel + " hektar");
        System.out.println("Kelapa Sawit: " + luasKelapaSawit + " hektar");
    }

    public void beliTanah(int jenisTanaman, int luasTanah) {
        String namaTanaman = "";
        switch (jenisTanaman) {
            case 4:
                luasApel += luasTanah;
                namaTanaman = "Apel";
                break;
            case 5:
                luasKelapaSawit += luasTanah;
                namaTanaman = "Kelapa Sawit";
                break;
            default:
                System.out.println("Jenis tanaman tidak valid.");
                return;
        }
        System.out.println("Pembelian berhasil!");
        informasiPerkebunan();
        System.out.println("Biaya yang harus dibayar: ");
        System.out.println("Tipe: "+namaTanaman+", "+ luasTanah + " hektar");
        System.out.println("Total Biaya : Rp. " + hitungBiayaTanah(jenisTanaman, luasTanah));
    }

    private int hitungBiayaTanah(int jenisTanaman, int luasTanah) {
        int biaya = 0;
        switch (jenisTanaman) {
            case 4:
                biaya = luasTanah * hargaApel;
                break;
            case 5:
                biaya = luasTanah * hargaKelapaSawit;
                break;
        }
        return biaya;
    }
}

public class Main {
    public static void main(String[] args) {
        Ternak ternak = new Ternak(15, 4, 3);
        Perkebunan perkebunan = new Perkebunan(5, 6);

        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Informasi Jumlah Hewan Ternak dan Luas Tanah Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    ternak.informasiTernak();
                    perkebunan.informasiPerkebunan();
                    break;
                case 2:
                    System.out.println("\nJenis Hewan Ternak:");
                    System.out.println("1. Bebek");
                    System.out.println("2. Domba");
                    System.out.println("3. Unta");
                    System.out.print("Pilih jenis hewan ternak: ");
                    int jenisTernak = scanner.nextInt();
                    System.out.print("Masukkan jumlah hewan ternak yang akan dibeli: ");
                    int jumlahTernak = scanner.nextInt();
                    ternak.beliTernak(jenisTernak, jumlahTernak);
                    break;
                case 3:
                    System.out.println("\nJenis Tanaman Perkebunan:");
                    System.out.println("4. Apel");
                    System.out.println("5. Kelapa Sawit");
                    System.out.print("Pilih jenis tanaman perkebunan: ");
                    int jenisTanaman = scanner.nextInt();
                    System.out.print("Masukkan luas tanah perkebunan yang akan dibeli (hektar): ");
                    int luasTanah = scanner.nextInt();
                    perkebunan.beliTanah(jenisTanaman, luasTanah);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } while (menu != 0);
    }
}
