import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Peternakan peternakan = new Peternakan(15, 4, 3);
        Perkebunan perkebunan = new Perkebunan(5, 6);

        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu: ");

            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("Menu 1: Informasi Peternakan dan Perkebunan");
                    System.out.println("--------------------------------------------");
                    System.out.println("Jumlah bebek saat ini: " + peternakan.getJumlahBebek()+ "ekor");
                    System.out.println("Jumlah domba saat ini: " + peternakan.getJumlahDomba()+ "ekor");
                    System.out.println("Jumlah unta saat ini: " + peternakan.getJumlahUnta()+ "ekor");
                    System.out.println("Luas tanah apel saat ini: " + perkebunan.getLuasApel() + "hektar");
                    System.out.println("Luas tanah kelapa sawit saat ini: " + perkebunan.getLuasKelapaSawit()+ "hektar");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Menu 2: Pembelian Hewan Ternak");
                    System.out.println("-----------------------------");
                    System.out.println("1. Bebek");
                    System.out.println("2. Domba");
                    System.out.println("3. Unta");
                    System.out.println("Masukkan pilihan hewan (nomor):");
                    Scanner beli = new Scanner(System.in);
                    int nomor = input.nextInt();
                    System.out.println();
                        switch (pilihan) {
                    case 1:
                        System.out.print("Jumlah bebek yang akan dibeli: ");
                        int jumlahBebek = beli.nextInt();
                        peternakan.beliHewan(jumlahBebek);
                        System.out.println("Biaya yang harus dibayar: Rp " + peternakan.getHarga());
                        System.out.println("Jumlah bebek setelah pembelian: " + (peternakan.getJumlahBebek()-jumlahBebek)+ " ekor");
                        System.out.println();
                        break;
                   case 2:
                        System.out.print("Jumlah Domba yang akan dibeli: ");
                        int jumlahDomba = beli.nextInt();
                        peternakan.beliHewan(jumlahDomba);
                        System.out.println("Biaya yang harus dibayar: Rp " + peternakan.getHarga());
                        System.out.println("Jumlah Domba setelah pembelian: " + (peternakan.getJumlahDomba()- jumlahDomba)+ " ekor");
                        System.out.println();
                        break;
                   case 3:
                        System.out.print("Jumlah Unta yang akan dibeli: "+ "ekor");
                        int jumlahUnta = beli.nextInt();
                        peternakan.beliHewan(jumlahUnta);
                        System.out.println("Biaya yang harus dibayar: Rp " + peternakan.getHarga());
                        System.out.println("Jumlah bebek setelah pembelian: " + (peternakan.getJumlahUnta()- jumlahUnta)+ " ekor");
                        System.out.println();
                        break;
                   default:
                            System.out.println("Menu tidak valid.");
                            break;
                    }
                    break;
                        

                case 3:
                    System.out.println("Menu 2: Pembelian Tanah perkebunan");
                    System.out.println("-----------------------------");
                    System.out.println("1. Apel");
                    System.out.println("2. Kelapa Sawit");
//                    System.out.println("3. Unta");
                    System.out.println("Masukkan pilihan kebun (nomor):");
                    Scanner beli2 = new Scanner(System.in);
                    int nomor2 = input.nextInt();
                    System.out.println();
                        switch (pilihan) {
                    case 1:
                        System.out.print("Luas tanah apel yang akan dibeli (hektar): ");
                        double luasApel = beli2.nextDouble();
                        perkebunan.beliTanah(luasApel);
                        System.out.println("Biaya yang harus dibayar: Rp " + perkebunan.getHarga());
                        System.out.println("Luas tanah apel setelah pembelian: " + (perkebunan.getLuasApel()- luasApel) + " hektar");
                        System.out.println();
                    break; 
                   case 2:
                        System.out.print("Luas tanah apel yang akan dibeli (hektar): ");
                        double luasKelapaSawit = beli2.nextDouble();
                        perkebunan.beliTanah(luasKelapaSawit);
                        System.out.println("Biaya yang harus dibayar: Rp " + perkebunan.getHarga());
                        System.out.println("Luas tanah apel setelah pembelian: " + (perkebunan.getLuasKelapaSawit()- luasKelapaSawit)+ " hektar");
                        System.out.println();
                    break; 
                   default:
                            System.out.println("Menu tidak valid.");
                            break;
                    }
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
        // System.out.println("Hello, World!");
   
