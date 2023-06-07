import java.text.DecimalFormat;
import java.util.Scanner;
public class BudgetingProgram {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        // Inisialisasi data hewan
        Bebek bebek = new Bebek(15, 2000, 3000);
        Unta unta = new Unta(3, 60000, 200000);
        Domba domba = new Domba(4, 15000, 45000);
        int totalPendapatanPerkebunan = 0;
        int totalPendapatanPeternakan = 0;
        int totalBiayaPerawatanPerkebunan = 0;
        int totalBiayaPerawatanPeternakan = 0;
        // Inisialisasi data tanaman
        Apel apel = new Apel(5, 40, 25000, 900000);
        KelapaSawit kelapaSawit = new KelapaSawit(6, 500, 18000, 8500000);
        Scanner input = new Scanner(System.in);
        int opsi = 0;
        boolean ganteng = true;
        while(ganteng){
            System.out.println("1.Peternakan");
            System.out.println("2.Perkebunan");
            System.out.println("3.BudgetingProgram");
            System.out.print("Masukkan pilihan menu: ");
            opsi = input.nextInt();
            if(opsi==1){
 // Menu 1: Pendapatan dan biaya perawatan hewan
        System.out.println("=".repeat(45));
        System.out.println("Pendapatan dan Biaya Perawatan Hasil Ternak");
        System.out.println("=".repeat(45));
        int pendapatanBebek = bebek.hitungPendapatan();
        int biayaPerawatanBebek = bebek.hitungBiayaPerawatan();
        int pendapatanUnta = unta.hitungPendapatan();
        int biayaPerawatanUnta = unta.hitungBiayaPerawatan();
        int pendapatanDomba = domba.hitungPendapatan();
        int biayaPerawatanDomba = domba.hitungBiayaPerawatan();
        
        totalPendapatanPeternakan = pendapatanBebek + pendapatanUnta + pendapatanDomba;
        totalBiayaPerawatanPeternakan = biayaPerawatanBebek + biayaPerawatanUnta + biayaPerawatanDomba;

        System.out.println("Pendapatan Bebek: Rp " + decimalFormat.format(pendapatanBebek));
        System.out.println("Pendapatan Unta: Rp " + decimalFormat.format(pendapatanUnta));
        System.out.println("Pendapatan Domba: Rp " + decimalFormat.format(pendapatanDomba));
        System.out.println("-".repeat(45));
        System.out.println("Total Pendapatan Hasil Ternak: Rp " + decimalFormat.format(totalPendapatanPeternakan));
        System.out.println("=".repeat(45));
        System.out.println("Perawatan Bebek: Rp " + decimalFormat.format(biayaPerawatanBebek));
        System.out.println("Perawatan Unta: Rp " + decimalFormat.format(biayaPerawatanUnta));
        System.out.println("Perawatan Domba: Rp " + decimalFormat.format(biayaPerawatanDomba));
        System.out.println("-".repeat(45));
        System.out.println("Total Biaya Perawatan Hasil Ternak: Rp " + decimalFormat.format(totalBiayaPerawatanPeternakan));
        System.out.println();
            }
            else if(opsi==2){
 // Menu 2: Pendapatan dan biaya perawatan tanaman
        System.out.println("=".repeat(45));
        System.out.println("Pendapatan dan Biaya Perawatan Kebun");
        System.out.println("=".repeat(45));
        int pendapatanApel = apel.hitungPendapatan();
        int biayaPerawatanApel = apel.hitungBiayaPerawatan();
        int pendapatanMinyak = kelapaSawit.hitungPendapatan();
        int biayaPerawatanMinyak = kelapaSawit.hitungBiayaPerawatan();

        totalPendapatanPerkebunan = pendapatanApel + pendapatanMinyak;
        totalBiayaPerawatanPerkebunan = biayaPerawatanApel + biayaPerawatanMinyak;

        System.out.println("Pendapatan Apel: Rp " + decimalFormat.format(pendapatanApel));
        System.out.println("Pendapatan Minyak: Rp " + decimalFormat.format(pendapatanMinyak));
        System.out.println("-".repeat(45));
        System.out.println("Total Pendapatan Perkebunan: Rp " + decimalFormat.format(totalPendapatanPerkebunan));
        System.out.println("=".repeat(45));
        System.out.println("Perawatan Apel: Rp " + decimalFormat.format(biayaPerawatanApel));
        System.out.println("Perawatan Minyak: Rp " + decimalFormat.format(biayaPerawatanMinyak));
        System.out.println("-".repeat(45));
        System.out.println("Total Biaya Perawatan Perkebunan: Rp " + decimalFormat.format(totalBiayaPerawatanPerkebunan));
        System.out.println();

            }
            else if(opsi == 3){
 // Menu 3: Pendapatan, biaya perawatan, dan biaya kehidupan sehari-hari
        System.out.println("=".repeat(60));
        System.out.println("Pendapatan per Bulan");
        System.out.println("=".repeat(60));
        int pendapatanBebek = bebek.hitungPendapatan();
        int biayaPerawatanBebek = bebek.hitungBiayaPerawatan();
        int pendapatanUnta = unta.hitungPendapatan();
        int biayaPerawatanUnta = unta.hitungBiayaPerawatan();
        int pendapatanDomba = domba.hitungPendapatan();
        int biayaPerawatanDomba = domba.hitungBiayaPerawatan();

        totalPendapatanPeternakan = pendapatanBebek + pendapatanUnta + pendapatanDomba;
        totalBiayaPerawatanPeternakan = biayaPerawatanBebek + biayaPerawatanUnta + biayaPerawatanDomba;

        int pendapatanApel = apel.hitungPendapatan();
        int biayaPerawatanApel = apel.hitungBiayaPerawatan();
        int pendapatanMinyak = kelapaSawit.hitungPendapatan();
        int biayaPerawatanMinyak = kelapaSawit.hitungBiayaPerawatan();

        totalPendapatanPerkebunan = pendapatanApel + pendapatanMinyak;
        totalBiayaPerawatanPerkebunan = biayaPerawatanApel + biayaPerawatanMinyak;

        int totalPendapatan = totalPendapatanPeternakan + totalPendapatanPerkebunan;
        int totalBiayaPerawatan = totalBiayaPerawatanPeternakan + totalBiayaPerawatanPerkebunan;
        int biayaKehidupan = totalPendapatan - totalBiayaPerawatan;

        System.out.println("Ternak: Rp " + decimalFormat.format(totalPendapatanPeternakan));
        System.out.println("Kebun: Rp " + decimalFormat.format(totalPendapatanPerkebunan));
        System.out.println("-".repeat(60));
        System.out.println("Total Pendapatan: Rp " + decimalFormat.format(totalPendapatan));
        System.out.println("=".repeat(60));
        System.out.println("Perawatan per Bulan");
        System.out.println("=".repeat(60));
        System.out.println("Ternak: Rp " + decimalFormat.format(totalBiayaPerawatanPeternakan));
        System.out.println("Kebun: Rp " + decimalFormat.format(totalBiayaPerawatanPerkebunan));
        System.out.println("-".repeat(60));
        System.out.println("Total Biaya Perawatan: Rp " + decimalFormat.format(totalBiayaPerawatan));
        System.out.println("=".repeat(60));
        System.out.println("Biaya Sehari-hari");
        System.out.println("=".repeat(60));
        System.out.println("Pendapatan: Rp " + decimalFormat.format(totalPendapatan));
        System.out.println("Perawatan: Rp " + decimalFormat.format(totalBiayaPerawatan));
        System.out.println("-".repeat(60));
        System.out.println("Total: Rp " + decimalFormat.format(biayaKehidupan));
            }
        }
    }
}