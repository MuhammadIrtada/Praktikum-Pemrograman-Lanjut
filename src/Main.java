import java.util.*;
public class Main{
    static float kas = 25000000;
    static int Unit = 0;
    static Bebek bebek = new Bebek("Bebek", 15,110000, 2, 2000, 3000);
    static Domba domba = new Domba("Domba", 4,2450000, 4, 15000, 45000);
    static Unta unta = new Unta("Unta", 3, 12000000,5, 60000, 200000);
    static Apel apel = new Apel("Apel", 5, 7500000 ,40, 25000, 900000);
    static Kelapa kelapa = new Kelapa("Kelapa Sawit", 6, 18000000 ,500, 18000, 8500000);
    static ArrayList <History> historyList = new ArrayList<History>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        while (loop){
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan dan Perkebunan");
            System.out.println("2. Membeli Ternak atau Kebun");
            System.out.println("3. History Transaksi");
            System.out.println("4. Exit");
            System.out.println("Masukkan menu pilihan anda : ");
            int pilih = sc.nextInt();
            int trans = 0;

            switch (pilih){
                case 1:
                    showInfo();
                    garis();
                    System.out.printf("Uang kas anda saat ini: Rp %,.0f\n",kas);
                    garis();
                    break;
                case 2:
                    int i = 0;
                    boolean u = true;
                    while (u){
                        menuBeli();
                        int menu = sc.nextInt();
                            if (menu == 6 ){
                                u = false;
                            } else if (menu >= 6){
                                break;
                            } else {
                                System.out.println("Berapa unit yang ingin dibeli: ");
                                int unit = sc.nextInt();
                                switch(menu){
                                    case 1:
                                        if(kas >= (bebek.getHarga()*unit) && trans < 10){
                                            bebek.addJumlah(unit);
                                            kas -= unit * bebek.getHarga();
                                            garis2();
                                            System.out.println("Transaksi Berhasil");
                                            History history = new History ("Bebek", unit, bebek.getHarga());
                                            historyList.add(history);
                                            i++;
                                            break;
                                        } else if (trans >= 10) {
                                            garis2();
                                            System.out.println("Transaksi gagal");
                                            System.out.println("Transaksi melebihi batas");
                                            break;
                                        } else if (kas < (bebek.getHarga()*unit) && trans < 10) {
                                            garis2();
                                            System.out.println("Kas Tidak Mencukupi");
                                            break;
                                        }
                                    case 2:
                                        if (kas >= (domba.getHarga()*unit) && trans < 10){
                                            domba.addJumlah(unit);
                                            kas -= unit * domba.getHarga();
                                            garis2();
                                            System.out.println("Transaksi Berhasil");
                                            History history = new History ("Domba", unit, domba.getHarga());
                                            historyList.add(history);
                                            i++;
                                            break;
                                        } else if (trans >= 10) {
                                            garis2();
                                            System.out.println("Transaksi gagal");
                                            System.out.println("Transaksi melebihi batas");
                                            break;
                                        } else if (kas < (domba.getHarga()*unit) && trans < 10){
                                            garis2();
                                            System.out.println("Kas Tidak Mencukupi");
                                            break;
                                        }
                                    case 3:
                                        if (kas >= (unta.getHarga()*unit) && trans < 10){
                                            unta.addJumlah(unit);
                                            kas -= unit * unta.getHarga();
                                            garis2();
                                            System.out.println("Transaksi Berhasil");
                                            History history = new History ("Unta", unit, unta.getHarga());
                                            historyList.add(history);
                                            i++;
                                            break;
                                        } else if (trans >= 10) {
                                            garis2();
                                            System.out.println("Transaksi gagal");
                                            System.out.println("Transaksi melebihi batas");
                                            break;
                                        } else if (kas < (unta.getHarga()*unit) && trans < 10){
                                            garis2();
                                            System.out.println("Kas Tidak Mencukupi");
                                            break;
                                        }
                                    case 4:
                                        if (kas >= (apel.getHarga()*unit) && trans < 10){
                                            apel.addLuas(unit);
                                            kas -= unit * apel.getHarga();
                                            garis2();
                                            System.out.println("Transaksi Berhasil");
                                            History history = new History ("Apel", unit, apel.getHarga());
                                            historyList.add(history);
                                            i++;
                                            break;
                                        } else if (trans >= 10) {
                                            garis2();
                                            System.out.println("Transaksi gagal");
                                            System.out.println("Transaksi melebihi batas");
                                            break;
                                        } else if (kas < (apel.getHarga()*unit) && trans < 10){
                                            garis2();
                                            System.out.println("Kas Tidak Mencukupi");
                                            break;
                                        }
                                    case 5:
                                        if (kas >= (kelapa.getHarga()*unit) && trans < 10){
                                            kelapa.addLuas(unit);
                                            kas -= unit * kelapa.getHarga();
                                            garis2();
                                            System.out.println("Transaksi Berhasil");
                                            History history = new History ("Kelapa", unit, kelapa.getHarga());
                                            historyList.add(history);
                                            i++;
                                            break;
                                        } else if (trans >= 10) {
                                            garis2();
                                            System.out.println("Transaksi gagal");
                                            System.out.println("Transaksi melebihi batas");
                                            break;
                                        } else if (kas < (kelapa.getHarga()*unit) && trans < 10){
                                            garis2();
                                            System.out.println("Kas Tidak Mencukupi");
                                            break;
                                        }
                                }
                            }
                            trans = i;                               
                    }
                    break;
                case 3:
                    garis();
                    showTransaksi();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Input menu tidak valid");
            }
        }


    }

    static void showInfo(){
        garis();
        System.out.println(bebek.toString());
        garis();
        System.out.println(domba.toString());
        garis();
        System.out.println(unta.toString());
        garis();
        System.out.println(apel.toString());
        garis();
        System.out.println(kelapa.toString());
    }

    static void menuBeli(){
        garis();
        System.out.println("Silahkah pilih menu yang ingin dibeli!");
        System.out.println("1. Ternak Bebek (Rp. 110,000/ekor)");
        System.out.println("2. Ternak Domba (Rp. 2,450,000/ekor)");
        System.out.println("3. Ternak Unta  (Rp. 12,000,000/ekor)");
        System.out.println("4. Kebun Apel (Rp. 7,500,000/hektar)");
        System.out.println("5. Kebun Kelapa Sawit (Rp. 18,000,000/hektar)");
        System.out.println("6. Kembali ke Menu Utama");
        System.out.println("Masukkan menu anda:");
    }

    static void showTransaksi(){
            int j = 0;
            if (historyList.isEmpty()){
                System.out.println("Tidak ada Transaksi");
            }
            for(History history : historyList){
                System.out.println("Transaksi "+(j+1));
                garis2();
                System.out.printf("Deskripsi\t: %s\nJumlah Unit\t: %d\nHarga\t\t: Rp. %,.0f\nTotal Biaya\t: Rp. %,.0f\n",history.getJenis(),history.getUnit(),history.getHarga(),history.getTotHarga());
                garis2();
                j++;
            }
    }

    static void garis(){
        System.out.println("=".repeat(40));
    }

    static void garis2(){
        System.out.println("-".repeat(40));
    }

}