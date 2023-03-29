package Modul5;

import java.util.*;
public class BukaPeternakan5 {
    static Peternakan5 bebek;
    static Peternakan5 domba;
    static Peternakan5 unta;
    static final int ppn = 10;
    public static void main(String[] args) {
        boolean ayam = true;
        Scanner sc = new Scanner(System.in);
        bebek = new Peternakan5("Bebek", "Telur Biasa", 15, 2, 2000, "Butir", ppn);
        domba = new Peternakan5("Domba", "Bulu Hitam", 4, 4, 15000, "Kg", ppn);
        unta = new Peternakan5("Unta", "Susu Putih", 3, 5, 60000, "liter", ppn);

        do {

        System.out.print("Menu:\n1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit\nMasukkan Menu Anda: ");
        int menu = sc.nextInt();

        switch(menu){
         case 1:
            bebek.garis2();
            bebek.display1("Butir");
            domba.display1("Bulu");
            unta.display1("susu");
            break;
         case 2:
            bebek.garis2();
            bebek.display2();
            domba.display2();
            unta.display2();
            System.out.println("Total Pemasukan : "+(bebek.getPemasukan()+unta.getPemasukan()+domba.getPemasukan()));
            bebek.garis2();
            break;
         case 3:
            bebek.garis2();
            bebek.display3();
            domba.display3();
            unta.display3();
            System.out.println("Total Pemasukan : "+(bebek.getPemasukanPPN()+unta.getPemasukanPPN()+domba.getPemasukanPPN()));
            bebek.garis2();
            break;
        case 4:
            ayam = false;
            break;
        }
    } while (ayam);

    }
}
