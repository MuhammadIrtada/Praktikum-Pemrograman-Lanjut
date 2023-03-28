package Dinda;
public class Peternakan {
    private int jumlahBebek;
    private int jumlahUnta;
    private int jumlahDomba;

    public Peternakan(int jumlahBebek, int jumlahUnta, int jumlahDomba) {
        this.jumlahBebek = jumlahBebek;
        this.jumlahUnta = jumlahUnta;
        this.jumlahDomba = jumlahDomba;
    }

    public void tampilkanInformasiPeternakan() {
        System.out.println("Jenis hewan\tRas\tJumlah hewan\tHasil ternak\tHarga hasil ternak");
        tampilkanInformasiHewan("Bebek", "Ras telur biasa", jumlahBebek, 2, 2000);
        tampilkanInformasiHewan("Unta", "Susu putih", jumlahUnta, 5, 60000);
        tampilkanInformasiHewan("Domba", "Bulu hitam", jumlahDomba, 4, 15000);
    }

    private void tampilkanInformasiHewan(String jenis, String ras, int jumlah, int hasilPerEkor, int hargaPerHasil) {
        int totalHasil = jumlah * hasilPerEkor;
        int hargaHasil = jumlah * hasilPerEkor * hargaPerHasil;
        System.out.println(jenis + "\t\t" + ras + "\t" + jumlah + " Ekor\t\t" + hasilPerEkor + " " + getSatuan(hasilPerEkor) + "/hari\tRp " + hargaHasil);
    }

    private String getSatuan(int hasilPerEkor) {
        if (hasilPerEkor == 2) {
            return "Butir";
        } else if (hasilPerEkor == 5) {
            return "Liter";
        } else if (hasilPerEkor == 4) {
            return "Kg";
        } else {
            return "";
        }
    }

    public void tampilkanTotalPemasukanHarian() {
        int pemasukanBebek = jumlahBebek * 2 * 2000;
        int pemasukanUnta = jumlahUnta * 5 * 60000;
        int pemasukanDomba = jumlahDomba * 4 * 15000;
        System.out.println("Jenis hewan\tPemasukan harian");
        System.out.println("Bebek\t\tRp " + pemasukanBebek);
        System.out.println("Unta\t\tRp " + pemasukanUnta);
        System.out.println("Domba\t\tRp " + pemasukanDomba);
        System.out.println("Total\t\tRp " + (pemasukanBebek + pemasukanUnta + pemasukanDomba));
    }

    public void tampilkanHargaSetelahPpn(double ppn) {
        double hargaBebek = jumlahBebek * 2 * 2000;
        double hargaUnta = jumlahUnta * 5 * 60000;
        double hargaDomba = jumlahDomba * 4 * 15000;

        double ppnBebek = hargaBebek * ppn / 100;
        double ppnUnta = hargaUnta * ppn / 100;
        double ppnDomba = hargaDomba * ppn / 100;

        System.out.println("Jenis hewan\tHarga setelah PPN");
        System.out.printf("Bebek\t\tRp %,.2f\n", (hargaBebek + ppnBebek));
        System.out.printf("Unta\t\tRp %,.2f\n", (hargaUnta + ppnUnta));
        System.out.printf("Domba\t\tRp %,.2f\n", (hargaDomba + ppnDomba));
        System.out.printf("Total\t\tRp %,.2f\n", ((hargaBebek + ppnBebek) + (hargaUnta + ppnUnta) + (hargaDomba + ppnDomba)));
    }
}