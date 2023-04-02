import static java.lang.System.exit;
import java.util.Scanner;

public class Tugas {
static final double PPN = 0.1;

    static Peternakan bebek;
    static Peternakan unta;
    static Peternakan domba;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        bebek = new Peternakan("Bebek", "Telur Biasa", "Telur", "Butir", 15, 2, 2000);
        domba = new Peternakan("Domba", "Bulu Hitam", "bulu", "Kg", 4, 4, 15000);
        unta = new Peternakan("Unta", "Susu Putih", "susu", "liter", 3, 5, 60000);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Anda : ");
            int pilih = in.nextInt();
            Peternakan[] ternak = {bebek, domba, unta};
            System.out.println("=".repeat(50));
            if (pilih == 1) {
                for (int i = 0; i < ternak.length; i++) {
                    System.out.println("Jenis\t\t\t: " + ternak[i].getJenis());
                    System.out.println("Ras\t\t\t: " + ternak[i].getRas());
                    System.out.println("Jumlah\t\t\t: " + ternak[i].getJumlah() + " ekor");
                    System.out.println(ternak[i].getJenisHasil() + "/ekor\t\t: " + ternak[i].getBanyakHasil() + " " + ternak[i].getSatuanHasil());
                    System.out.println("Total " + ternak[i].getJenisHasil() + "/Hari\t\t: " + ternak[i].getTotal() + " " + ternak[i].getSatuanHasil());
                    System.out.println("Harga " + ternak[i].getJenisHasil() + "/" + ternak[i].getSatuanHasil() + "\t: " + ternak[i].getHarga());
                    System.out.println("=".repeat(50));
                }
            } else if (pilih == 2) {
                int totalPemasukan = 0;
                for (int i = 0; i < ternak.length; i++) {
                    System.out.println("Jenis\t\t: " + ternak[i].getJenis() + " | " + ternak[i].getRas());
                    int pemasukan = ternak[i].getTotal() * ternak[i].getHarga();
                    System.out.println("Pemasukan\t: " + pemasukan);
                    System.out.println("-".repeat(50));
                    totalPemasukan += pemasukan;
                }
                System.out.println("Total Pemasukan\t: " + totalPemasukan);
                System.out.println("=".repeat(50));
            } else if (pilih == 3) {
                int totalMasukPPN = 0;
                for (int i = 0; i < ternak.length; i++) {
                    System.out.println("Jenis\t\t: " + ternak[i].getJenis() + " | " + ternak[i].getRas());
                    int pemasukanPPN = (int) ((int) ternak[i].getTotal() * ternak[i].getHarga() + (PPN * ternak[i].getTotal() * ternak[i].getHarga()));
                    System.out.println("Pemasukan\t: " + pemasukanPPN);
                    System.out.println("-".repeat(50));
                    totalMasukPPN += pemasukanPPN;
                }
                System.out.println("Total Pemasukan\t: " + totalMasukPPN);
                System.out.println("=".repeat(50));
            } else {
                exit(0);
            }
        }
    }
}
