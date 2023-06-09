import java.util.Scanner;
class PeternakanPakKiw implements Peternakan {
    private int jumlahBebek;
    private int jumlahDomba;
    private int jumlahUnta;
    private int luasTanahApel;
    private int luasTanahKelapaSawit;

    public PeternakanPakKiw(int jumlahBebek, int jumlahDomba, int jumlahUnta, int luasTanahApel, int luasTanahKelapaSawit) {
        this.jumlahBebek = jumlahBebek;
        this.jumlahDomba = jumlahDomba;
        this.jumlahUnta = jumlahUnta;
        this.luasTanahApel = luasTanahApel;
        this.luasTanahKelapaSawit = luasTanahKelapaSawit;
    }

    @Override
    public void tampilkanStatusSaatIni() {
        System.out.println("Jumlah Hewan Ternak Saat Ini:");
        System.out.println("Bebek: " + jumlahBebek + " ekor");
        System.out.println("Domba: " + jumlahDomba + " ekor");
        System.out.println("Unta: " + jumlahUnta + " ekor");
        System.out.println("Luas Tanah Perkebunan Saat Ini:");
        System.out.println("Apel: " + luasTanahApel + " hektar");
        System.out.println("Kelapa Sawit: " + luasTanahKelapaSawit + " hektar");
    }

    @Override
    public void beliHewanTernak() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Harga Hewan Ternak:");
        System.out.println("1. Bebek -> Rp 110.000/ekor");
        System.out.println("2. Domba -> Rp 2.450.000/ekor");
        System.out.println("3. Unta -> Rp 12.000.000/ekor");

        System.out.print("Pilih hewan yang akan dibeli (1-3): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan jumlah hewan yang akan dibeli: ");
        int jumlah = scanner.nextInt();

        int biayaTotal = 0;

        switch (pilihan) {
            case 1:
                biayaTotal = jumlah * 110000;
                jumlahBebek += jumlah;
                break;
            case 2:
                biayaTotal = jumlah * 2450000;
                jumlahDomba += jumlah;
                break;
            case 3:
                biayaTotal = jumlah * 12000000;
                jumlahUnta += jumlah;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Biaya yang harus dibayar: Rp " + biayaTotal);
        System.out.println("Jumlah masing-masing jenis hewan ternak setelah pembelian:");
        System.out.println("Bebek: " + jumlahBebek + " ekor");
        System.out.println("Domba: " + jumlahDomba + " ekor");
        System.out.println("Unta: " + jumlahUnta + " ekor");
    }

    @Override
    public void beliTanahPerkebunan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Harga Tanah Perkebunan:");
        System.out.println("1. Apel -> Rp 7.500.000/hektar");
        System.out.println("2. Kelapa Sawit -> Rp 18.000.000/hektar");

        System.out.print("Pilih tanaman yang akan dibeli (1-2): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan luas tanah yang akan dibeli (dalam hektar): ");
        int jumlah = scanner.nextInt();

        int biayaTotal = 0;

        switch (pilihan) {
            case 1:
                biayaTotal = jumlah * 7500000;
                luasTanahApel += jumlah;
                break;
            case 2:
                biayaTotal = jumlah * 18000000;
                luasTanahKelapaSawit += jumlah;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Biaya yang harus dibayar: Rp " + biayaTotal);
        System.out.println("Jumlah masing-masing jenis tanaman setelah pembelian:");
        System.out.println("Apel: " + luasTanahApel + " hektar");
        System.out.println("Kelapa Sawit: " + luasTanahKelapaSawit + " hektar");
    }
}
