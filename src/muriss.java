import java.text.DecimalFormat;
import java.util.Scanner;

public class muriss {
    static final double PPN = 0.1;
    static Bebek[] bebeks = {new Bebek("ras telur biasa", 15)};
    static Unta[] unta = {new Unta("susu putih", 3)};
    static Domba[] domba = {new Domba("bulu hitam", 4)};

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###");
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Tampilkan data ternak");
            System.out.println("2. Tampilkan pemasukan harian");
            System.out.println("3. Tampilkan pemasukan harian setelah PPN");
            System.out.println("4. Keluar program");
            System.out.print("Masukkan pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("DATA TERNAK");
                    System.out.println("Jenis hewan\tRas hewan\tJumlah\tHasil ternak\tHarga hasil ternak");
                    System.out.println("-----------\t---------\t------\t------------\t-------------------");
                    for (Bebek bebek : bebeks) {
                        System.out.printf("%-14s\t%-9s\t%-6d\t%-12d\tRp %s\n",
                                "Bebek", bebek.getRas(), bebek.getJumlah(),
                                bebek.getHasilTernak(), df.format(bebek.getHargaHasilTernak()));
                    }
                    for (Unta unta : unta) {
                        System.out.printf("%-14s\t%-9s\t%-6d\t%-12d\tRp %s\n",
                                "Unta", unta.getRas(), unta.getJumlah(),
                                unta.getHasilTernak(), df.format(unta.getHargaHasilTernak()));
                    }
                    for (Domba domba : domba) {
                        System.out.printf("%-14s\t%-9s\t%-6d\t%-12d\tRp %s\n",
                                "Domba", domba.getRas(), domba.getJumlah(),
                                domba.getHasilTernak(), df.format(domba.getHargaHasilTernak()));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("PEMASUKAN HARIAN");
                    System.out.println("Jenis hewan\tPemasukan");
                    System.out.println("-----------\t---------");
                    for (Bebek bebek : bebeks) {
                        System.out.printf("%-14s\tRp %s\n", "Bebek", df.format(bebek.getPemasukan()));
                    }
                    for (Unta unta : unta) {
                        System.out.printf("%-14s\tRp %s\n", "Unta", df.format(unta.getPemasukan()));
                    }
                    for (Domba domba : domba) {
                        System.out.printf("%-14s\tRp %s\n", "Domba", df.format(domba.getPemasukan()));
                    }
                    System.out.println("Total\t\tRp " + df.format(getTotalPemasukan()));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("PEMASUKAN HARIAN SETELAH PPN");
                    System.out.println("Jenis hewan\tPemasukan");
                    System.out.println("-----------\t---------");
                    for (Bebek bebek : bebeks) {
                        System.out.printf("%-14s\tRp %s\n", "Bebek", df.format(bebek.getPemasukanSetelahPPN()));
                    }
                    for (Unta unta : unta) {
                        System.out.printf("%-14s\tRp %s\n", "Unta", df.format(unta.getPemasukanSetelahPPN()));
                    }
                    for (Domba domba : domba) {
                        System.out.printf("%-14s\tRp %s\n", "Domba", df.format(domba.getPemasukanSetelahPPN()));
                    }
                    System.out.println("Total\t\tRp " + df.format(getTotalPemasukanSetelahPPN()));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
                    break;
            }
        } while (choice != 4);
    }

    public static int getTotalPemasukan() {
        int totalPemasukan = 0;
        for (Bebek bebek : bebeks) {
            totalPemasukan += bebek.getPemasukan();
        }
        for (Unta unta : unta) {
            totalPemasukan += unta.getPemasukan();
        }
        for (Domba domba : domba) {
            totalPemasukan += domba.getPemasukan();
        }
        return totalPemasukan;
    }

    public static int getTotalPemasukanSetelahPPN() {
        int totalPemasukanSetelahPPN = 0;
        for (Bebek bebek : bebeks) {
            totalPemasukanSetelahPPN += bebek.getPemasukanSetelahPPN();
        }
        for (Unta unta : unta) {
            totalPemasukanSetelahPPN += unta.getPemasukanSetelahPPN();
        }
        for (Domba domba : domba) {
            totalPemasukanSetelahPPN += domba.getPemasukanSetelahPPN();
        }
        return totalPemasukanSetelahPPN;
    }

    static class Bebek {
        private String ras;
        private int jumlah;
        private int hasilTernak;
        private int hargaHasilTernak;

        public Bebek(String ras, int jumlah) {
            this.ras = ras;
            this.jumlah = jumlah;
            this.hasilTernak = jumlah * 2;
            this.hargaHasilTernak = hasilTernak * 2000;
        }

        public String getRas() {
            return ras;
        }

        public int getJumlah() {
            return jumlah;
        }

        public int getHasilTernak() {
            return hasilTernak;
        }

        public int getHargaHasilTernak() {
            return hargaHasilTernak;
        }

        public int getPemasukan() {
            return hasilTernak * 2000;
        }

        public int getPemasukanSetelahPPN() {
            return (int) Math.round(hargaHasilTernak * (1 + PPN));
        }
    }

    static class Unta {
        private String ras;
        private int jumlah;
        private int hasilTernak;
        private int hargaHasilTernak;

        public Unta(String ras, int jumlah) {
            this.ras = ras;
            this.jumlah = jumlah;
            this.hasilTernak = jumlah * 5;
            this.hargaHasilTernak = hasilTernak * 60000;
        }

        public String getRas() {
            return ras;
        }

        public int getJumlah() {
            return jumlah;
        }

        public int getHasilTernak() {
            return hasilTernak;
        }

        public int getHargaHasilTernak() {
            return hargaHasilTernak;
        }

        public int getPemasukan() {
            return hasilTernak * 60000;
        }

        public int getPemasukanSetelahPPN() {
            return (int) Math.round(hargaHasilTernak * (1 + PPN));
        }
    }

    static class Domba {
        private String ras;
        private int jumlah;
        private int hasilTernak;
        private int hargaHasilTernak;

        public Domba(String ras, int jumlah) {
            this.ras = ras;
            this.jumlah = jumlah;
            this.hasilTernak = jumlah * 4;
            this.hargaHasilTernak = hasilTernak * 15000;
        }

        public String getRas() {
            return ras;
        }

        public int getJumlah() {
            return jumlah;
        }

        public int getHasilTernak() {
            return hasilTernak;
        }

        public int getHargaHasilTernak() {
            return hargaHasilTernak;
        }

        public int getPemasukan() {
            return hasilTernak * 15000;
        }

        public int getPemasukanSetelahPPN() {
            return (int) Math.round(hargaHasilTernak * (1 + PPN));
        }
    }
}


