import java.util.Scanner;

public class Modul7 {
    public static void main(String[] args) {
        Hewan[] animals = {
                new Bebek(15),
                new Unta(3),
                new Domba(4)
        };

        Tanaman[] plants = {
                new Apel(5),
                new KelapaSawit(6)
        };

        double totalProduksiHewan = 0;
        double totalBiayaPerawatanHewan= 0;
        double totalPendapatanHewan = 0;

        for (Hewan animal : animals) {
            totalProduksiHewan += animal.hitungTotalProduksi();
            totalBiayaPerawatanHewan += animal.hitungTotalBiayaPerawatan();
            totalPendapatanHewan += animal.hitungTotalPendapatan();
        }

        double totalProduksiTanaman = 0;
        double totalBiayaPerawatanTanaman = 0;
        double totalPendapatanTanaman = 0;

        for (Tanaman plant : plants) {
            totalProduksiTanaman += plant.hitungTotalProduksi();
            totalBiayaPerawatanTanaman += plant.hitungTotalBiayaPerawatan();
            totalPendapatanTanaman += plant.hitungTotalPendapatan();
        }

        double totalBiayaPerawatan = totalBiayaPerawatanHewan + totalBiayaPerawatanTanaman;
        double totalPendapatan = totalPendapatanHewan + totalPendapatanTanaman;

        double biayaHidup = 100000; // Assume daily living expense is Rp 100,000
        double totalBiayaHidup = biayaHidup * 30;
        
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        
        do {
//            System.out.println("===== =====");
            System.out.println("1.Peternakan");
            System.out.println("2. perkebunan");
            System.out.println("3. Budgeting");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu: ");
             
            pilihan = input.nextInt();
            System.out.println();
            
            switch (pilihan) {
                case 1:
//                    peternakan.tampilkanInformasi();
                    System.out.println("Menu 1: Pendapatan Penjualan dan Biaya Perawatan Hewan Ternak");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Total pendapatan dari hasil jual hewan peternakan: Rp " + totalPendapatanHewan);
                    System.out.println("Total biaya perawatan hewan peternakan: Rp " + totalBiayaPerawatanHewan);
                    System.out.println();
//                    System.out.println();
                    break;
                case 2:
//                    peternakan.tampilkanPemasukan();
                    System.out.println("Menu 2: Pendapatan Penjualan dan Biaya Perawatan Tanaman Kebun");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Total pendapatan dari hasil jual tanaman perkebunan: Rp " + totalPendapatanTanaman);
                    System.out.println("Total biaya perawatan tanaman perkebunan: Rp " + totalBiayaPerawatanTanaman  );
                    System.out.println();
//                    System.out.println();
                    break;
                case 3:
//                    peternakan.tampilkanPemasukanSetelahPPN();
                    System.out.println("Menu 3: Pendapatan dan Biaya Perbulan ");
                    System.out.println("------------------------------------");
                    System.out.println("Total pendapatan dari hasil jual peternakan dan perkebunan: Rp " + totalPendapatan);
                    System.out.println("Total biaya perawatan peternakan dan perkebunan: Rp " + totalBiayaPerawatan);
                    System.out.println("Total biaya kehidupan sehari-hari: Rp " + totalBiayaHidup);
                    System.out.println("Sisa pendapatan setelah dikurangi biaya: Rp " + (totalPendapatan - totalBiayaPerawatan - totalBiayaHidup));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    System.out.println();
                    break;
            }
        } while (pilihan != 4); 
    }
}


    

