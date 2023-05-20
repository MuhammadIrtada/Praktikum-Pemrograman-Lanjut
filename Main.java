import java.text.NumberFormat;
import java.util.*;

public class Main {

    static float modal = 25000000;
    static Bebek Bebek = new Bebek("Bebek", 15, 110000, 2, 2000);
    static Unta Unta = new Unta("Unta", 3, 12000000, 5, 60000);
    static Domba Domba = new Domba("Domba", 4, 2450000, 4, 45000);
    static Apel Apel = new Apel("Apel",7500000,5,25000,900000,40);
    static KelapaSawit kelapaSawit = new KelapaSawit("KelapaSawit", 18000000, 6, 18000, 8500000,500);
    public static void main(String[] args) throws Exception {
        List<History> historyPembelian = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("id", "ID");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        while (true) {
            System.out.println("Menu : \n1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. History Transaksi\n4. Exit");
            System.out.print("Masukkan Menu Anda : ");
            int menu = scan.nextInt();
            System.out.println();
            if (menu == 1) {
                System.out.println("===================================================");
                System.out.println(Bebek.showInformasi());
                System.out.println("===================================================");
                System.out.println(Unta.showInformasi());
                System.out.println("===================================================");
                System.out.println(Domba.showInformasi());
                System.out.println("===================================================");
                System.out.println(Apel.showInformasi());
                System.out.println("===================================================");
                System.out.println(kelapaSawit.showInformasi());
                System.out.println("===================================================");
                String formattedAmount = currencyFormat.format(modal);
                System.out.println("Uang kas anda saat ini : " + formattedAmount);
                System.out.println("===================================================");
            } else if (menu == 2) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Silahkan pilih menu yang anda ingin beli : \n1. Ternak Bebek (Rp. 110.000/ekor)\n2. Ternak Domba (Rp. 2.450.000/ekor)\n3. Ternak Unta (Rp. 12.000.000/ekor)\n4. Kebun Apel (Rp. 7.500.000/hektar)\n5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)\n6. Exit");
                    System.out.print("Masukkan Menu Anda : ");
                    int belanja = scan.nextInt();
                    System.out.println();
                    System.out.print("Masukkan jumlah yang diinginkan :");
                    int jumlah = scan.nextInt();
                    System.out.println();
                    if (belanja == 1) {
                        if(modal >= Bebek.getHarga()){
                            Bebek.addJumlah(jumlah);
                            modal = modal - (jumlah * Bebek.getHarga());
                            History history = new History("Bebek", jumlah, Bebek.getHarga());
                            historyPembelian.add(history);
                            System.out.println(Bebek.showInformasi());
                            String formattedAmount = currencyFormat.format(modal);
                            System.out.println("Kas\t\t\t: " + formattedAmount);
                            System.out.println("Apakah ingin melanjutkan : \n1.Ya\n2.Tidak");
                            System.out.print("Jawaban : ");
                            int lanjut = scan.nextInt();
                            System.out.println();
                            if(lanjut == 1){
                                System.out.println("Transaksi berhasil dilakukan");
                                continue;
                            }else if(lanjut == 2){
                                break;
                            }
                            i++;
                        } else{
                            System.out.println("Maaf uang anda tidak mencukupi");
                        }
                    } else if (belanja == 2) {
                        if(modal >= Domba.getHarga()){
                            Domba.addJumlah(jumlah);
                            modal = modal - (jumlah * Domba.getHarga());
                            System.out.println(Domba.showInformasi());
                            String formattedAmount = currencyFormat.format(modal);
                            System.out.println("Kas\t\t\t: " + formattedAmount);
                            History history = new History("Domba", jumlah, Domba.getHarga());
                            historyPembelian.add(history);
                            System.out.println("Apakah ingin melanjutkan : \n1.Ya\n2.Tidak");
                            System.out.print("Jawaban : ");
                            int lanjut = scan.nextInt();
                            System.out.println();
                            if(lanjut == 1){
                                System.out.println("Transaksi berhasil dilakukan");
                                continue;
                            }else if(lanjut == 2){
                                break;
                            }
                            i++;
                        } else{
                            System.out.println("Maaf uang anda tidak mencukupi");
                        }
                    } else if (belanja == 3){
                        if(modal >= Unta.getHarga()){
                            Unta.addJumlah(jumlah);
                            modal = modal - (jumlah * Unta.getHarga());
                            History history = new History("Unta", jumlah, Unta.getHarga());
                            historyPembelian.add(history);
                            String formattedAmount = currencyFormat.format(modal);
                            System.out.println(Unta.showInformasi());
                            System.out.println("Kas\t\t\t: " + formattedAmount);
                            System.out.println("Apakah ingin melanjutkan : \n1.Ya\n2.Tidak");
                            System.out.print("Jawaban : ");
                            int lanjut = scan.nextInt();
                            System.out.println();
                            if(lanjut == 1){
                                System.out.println("Transaksi berhasil dilakukan");
                                continue;
                            }else if(lanjut == 2){
                                break;
                            }
                            i++;
                        } else{
                            System.out.println("Maaf uang anda tidak mencukupi");
                        }
                    }else if (belanja == 4) {
                        if(modal >= Apel.getHarga()){
                            Apel.addJumlah(jumlah);
                            modal = modal - (jumlah * Apel.getHarga());
                            System.out.println(Apel.showInformasi());
                            String formattedAmount = currencyFormat.format(modal);
                            System.out.println("Kas\t\t\t: " + formattedAmount);
                            History history = new History("Apel", jumlah, Apel.getHarga());
                            historyPembelian.add(history);
                            System.out.println("Apakah ingin melanjutkan : \n1.Ya\n2.Tidak");
                            System.out.print("Jawaban : ");
                            int lanjut = scan.nextInt();
                            System.out.println();
                            if(lanjut == 1){
                                System.out.println("Transaksi berhasil dilakukan");
                                continue;
                            }else if(lanjut == 2){
                                break;
                            }
                            i++;
                        } else{
                            System.out.println("Maaf uang anda tidak mencukupi");
                        }
                    }else if (belanja == 5) {
                        if(modal >= kelapaSawit.getHarga()){
                            kelapaSawit.addJumlah(jumlah);
                            modal = modal - (jumlah * kelapaSawit.getHarga());
                            System.out.println(kelapaSawit.showInformasi());
                            String formattedAmount = currencyFormat.format(modal);
                            System.out.println("Kas\t\t\t: " + formattedAmount);
                            History history = new History("Apel", jumlah, kelapaSawit.getHarga());
                            historyPembelian.add(history);
                            System.out.println("Apakah ingin melanjutkan : \n1.Ya\n2.Tidak");
                            System.out.print("Jawaban : ");
                            int lanjut = scan.nextInt();
                            System.out.println();
                            if(lanjut == 1){
                                System.out.println("Transaksi berhasil dilakukan");
                                continue;
                            }else if(lanjut == 2){
                                break;
                            }
                            i++;
                        } else{
                            System.out.println("Maaf uang anda tidak mencukupi");
                        }        
                    } else if (belanja == 6){
                        break;
                    } else {
                        break;
                    }

                }
            } else if (menu == 3){
                if (historyPembelian.isEmpty()) {
                    System.out.println("Belum ada pembelian.");
                } else {
                    System.out.println("History Pembelian:");
                    for (History history: historyPembelian) {
                        System.out.println(history.toString());
                    }
                }
                System.out.println();
            } else {
                break;
            }
        }
    }
}




