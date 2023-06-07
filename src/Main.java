import java.util.*;
public class Main{
     static Scanner sc = new Scanner(System.in);
     static Ternak bebek = new Bebek("Bebek", 15, 110000);
     static Ternak domba = new Domba("Domba", 4, 2450000);
     static Ternak unta = new Unta("Unta", 3, 12000000);
     static Kebun apel = new Apel("Apel", 5, 7500000);
     static Kebun sawit = new Sawit("Kelapa Sawit", 6, 18000000);
     static Ternak [] arr1 = {bebek, domba, unta};
     static Kebun [] arr2 = {apel, sawit};
    public static void main(String[] args){
        boolean loopMenu = true;

        while(loopMenu){
            System.out.println("1. Informasi Peternakan dan Perkebunan\n2. Pembelian Hewan Ternak\n3. Pembelian Tanah Perkebunan\nMasukkan pilihan menu: ");
            int pil = sc.nextInt();

                switch(pil){
                    case 1:
                        display1();
                        break;

                    case 2:
                        display2();
                        break;

                    case 3:
                        display3();
                        break;

                    default:
                        loopMenu = false;
                }
        }
    }


    static void display1(){
        System.out.println();
        garis();
        System.out.println("\tInformasi Peternakan dan Perkebunan");
        garis();
            for (Ternak ternak : arr1){
                System.out.printf("%s\t: %d Ekor\n",ternak.getJenis(),ternak.getJumlah());
            }

            for (Kebun kebun : arr2){
                System.out.printf("%s\t: %d Hektar\n",kebun.getJenis(),kebun.getJumlah());
            }
            System.out.println();
    }

    static void display2(){
        Scanner input = new Scanner(System.in);
        int beli;
        System.out.println();
        garis();
        System.out.println("\t\tPembelian Hewan Ternak");
        garis();
        int i = 0;
            for (Ternak ternak : arr1){
                System.out.printf("%d. %s\t: %d Ekor\n",i+1,ternak.getJenis(),ternak.getJumlah());
                i++;
            }
        System.out.println("Masukkan pilihan hewan (nomor):");
        int pilih = input.nextInt();
        System.out.println("Masukkan banyak hewan:");
        beli = input.nextInt();
        switch(pilih){
            case 1:  
            arr1[0].setTambah(beli);
                break;
            case 2:
            arr1[1].setTambah(beli);
                break;
            case 3:
            arr1[2].setTambah(beli);
              break;
            default :
                break;
            }
        System.out.println();
        garis();
        System.out.println("\t\tNota Pembelian Hewan Ternak");
        garis();
        float totHarga = (arr1[pilih-1].getHarga()*beli);
        System.out.printf("%s\t\tx(%d)\t: Rp %.0f\n\n",arr1[pilih-1].getJenis(),beli,totHarga);
        garis();
        System.out.println("\t\tInformasi Peternakan Sekarang");
        garis();
        int j = 0;
        for (Ternak ternak : arr1){
            System.out.printf("%d. %s\t: %d Ekor\n",j+1,ternak.getJenis(),ternak.getJumlah());
            j++;
        }
        System.out.println();

    }

    static void display3(){
        Scanner input = new Scanner(System.in);
        int beli;
        System.out.println();
        garis();
        System.out.println("\tPembelian Tanah Perkebunan");
        garis();
        int i = 0;
            for (Kebun kebun : arr2){
                System.out.printf("%d. %s\t: %d Hektar\n",i+1,kebun.getJenis(),kebun.getJumlah());
                i++;
            }
        System.out.println("Masukkan pilihan kebun (nomor):");
        int pilih = input.nextInt();
        System.out.println("Masukkan luas lahan:");
        beli = input.nextInt();
        switch(pilih){
            case 1:  
            arr2[0].setTambah(beli);
                break;
            case 2:
            arr2[1].setTambah(beli);
                break;
            default :
                break;
            }
        System.out.println();
        garis();
        System.out.println("\tNota Pembelian Tanah Perkebunan");
        garis();
        float totHarga = (arr2[pilih-1].getHarga()*beli);
        System.out.printf("%s\t\tx(%d)\t: Rp %.0f\n\n",arr2[pilih-1].getJenis(),beli,totHarga);
        garis();
        System.out.println("\tInformasi Perkebunan Sekarang");
        garis();
        int j = 0;
        for (Kebun kebun : arr2){
            System.out.printf("%d. %s\t: %d Hektar\n",j+1,kebun.getJenis(),kebun.getJumlah());
            j++;
        }
        System.out.println();
    }

    static void garis(){
        System.out.println("=".repeat(50));
    }


}