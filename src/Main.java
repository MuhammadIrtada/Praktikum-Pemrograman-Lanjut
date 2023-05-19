import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bebek bebek = new Bebek(15, 110000, 2, 2000, 3000);
        Unta unta = new Unta(3, 12000000, 5, 60000, 200000);
        Domba domba = new Domba(4, 2450000, 4, 15000, 45000);
        Apel apel = new Apel(5, 7500000, 40, 25000, 900000);
        KelapaSawit kelapa = new KelapaSawit(6, 18000000, 500, 18000, 8500000);
        float kas = 25000000;
        String[] history = new String[10];
        int transaksi = 0;

        while(true){
            System.out.println("Menu");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("0. Exit");
            System.out.print("Masukkan Menu Anda: ");
            int masukan = input.nextInt();
            input.nextLine();

            switch(masukan){
                case 1:
                    batas();
                    System.out.println(bebek.showInfo());
                    System.out.println(domba.showInfo());
                    System.out.println(unta.showInfo());
                    System.out.println(apel.showInfo());
                    System.out.println(kelapa.showInfo());
                    System.out.printf("Uang kas anda saat ini\t: Rp. %,.0f\n", kas);
                    batas();
                    break;
                case 2:
                    while(true){
                        batas();
                        System.out.println("Silahkan pilih menu yang ingin dibeli: ");
                        System.out.println("1. Ternak Bebek (Rp. 110.000/ekor)");
                        System.out.println("2. Ternak Domba (Rp. 2.450.000/ekor)");
                        System.out.println("3. Ternak Unta (Rp. 12.000.000/ekor)");
                        System.out.println("4. Kebun Apel (Rp. 7.500.000/hektar)");
                        System.out.println("5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)");
                        System.out.println("0. Kembali ke Menu Utama");
                        System.out.print("Masukkan Menu Anda: ");
                        int beli = input.nextInt();
                        input.nextLine();
                        batas();
                        if(beli == 0){
                            break;
                        }
                        System.out.print("Berapa Unit yang Akan Anda Beli? ");
                        int berapa = input.nextInt();
                        input.nextLine();
                        batas();
                        if(history[9] != null){
                            System.out.println("Transaksi Gagal.");
                            continue;
                        }
                        if (beli == 1){
                            float harga = bebek.getHarga() * berapa;
                            if(kas>=harga){
                                bebek.beliHewan(berapa);
                                kas -= harga;
                                history[transaksi] = String.format("Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s\n",
                                        transaksi+1,"-".repeat(50), bebek.getTernak(), berapa, bebek.getHarga(), harga, "=".repeat(50));
                                transaksi++;
                                System.out.println("Transaksi Berhasil.");
                            } else {
                                System.out.println("Kas Anda Tidak Mencukupi.");
                            }
                        } else if (beli == 2) {
                            float harga = domba.getHarga() * berapa;
                            if(kas>=harga){
                                domba.beliHewan(berapa);
                                kas -= harga;
                                history[transaksi] = String.format("Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s\n",
                                        transaksi+1,"-".repeat(50), domba.getTernak(), berapa, domba.getHarga(), harga, "=".repeat(50));
                                transaksi++;
                                System.out.println("Transaksi Berhasil.");
                            } else {
                                System.out.println("Kas Anda Tidak Mencukupi.");
                            }
                        } else if (beli == 3){
                            float harga = unta.getHarga() * berapa;
                            if(kas>=harga){
                                unta.beliHewan(berapa);
                                kas -= harga;
                                history[transaksi] = String.format("Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s\n",
                                        transaksi+1,"-".repeat(50), unta.getTernak(), berapa, unta.getHarga(), harga, "=".repeat(50));
                                transaksi++;
                                System.out.println("Transaksi Berhasil.");
                            } else {
                                System.out.println("Kas Anda Tidak Mencukupi.");
                            }
                        } else if (beli == 4){
                            float harga = apel.getHarga() * berapa;
                            if(kas>=harga){
                                apel.beliTanaman(berapa);
                                kas -= harga;
                                history[transaksi] = String.format("Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s\n",
                                        transaksi+1,"-".repeat(50), apel.getKebun(), berapa, apel.getHarga(), harga, "=".repeat(50));
                                transaksi++;
                                System.out.println("Transaksi Berhasil.");
                            } else {
                                System.out.println("Kas Anda Tidak Mencukupi.");
                            }
                        } else if (beli == 5){
                            float harga = kelapa.getHarga() * berapa;
                            if(kas>=harga){
                                kelapa.beliTanaman(berapa);
                                kas -= harga;
                                history[transaksi] = String.format("Transaksi %d\n%s\nDeskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n%s\n",
                                        transaksi+1,"-".repeat(50), kelapa.getKebun(), berapa, kelapa.getHarga(), harga, "=".repeat(50));
                                transaksi++;
                                System.out.println("Transaksi Berhasil.");
                            } else {
                                System.out.println("Kas Anda Tidak Mencukupi.");
                            }
                        }

                    }
                    break;

                case 3:
                    batas();
                    if (history[0] == null){
                        System.out.println("Belum Ada Transaksi.");
                        batas();
                    }
                    for (int i = 0; i < 10; i++) {
                        if(history[i] == null){
                            break;
                        } else {
                            System.out.print(history[i]);
                        }
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public static void batas(){
        System.out.println("=".repeat(50));
    }

}
