
package com;

import java.util.Scanner;

public class Modul5Main {
    static final int PPN = 10;
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        String loop = "Iya";
        Modul5 Bebek = new Modul5("Bebek","Telur Biasa", 15, 2, 30, 2000 );
        Modul5 Domba = new Modul5("Domba","Bulu Hitam", 4, 4, 16, 15000 );
        Modul5 Unta = new Modul5("Unta","Susu Putih", 3, 5, 15, 60000 );
      while(loop.equals("Iya")){
        System.out.println("Menu: ");
        System.out.println("1. Menampilkan Informasi Peternakan" );
        System.out.println("2. Menampilkan Total Pemasukkan Harian");
        System.out.println("3. Menampilkan Harga Setelan PPN");
        System.out.println("4. Exit");
        System.out.print("Masukkan Menu Anda: ");
        int Masukkan = ra.nextInt();
        if (Masukkan==1){
            tampilkanSemuaTernak(Bebek, Domba, Unta);
        }
        else if (Masukkan==2){
            tampilkanSemuaPemasukkan(Bebek, Domba, Unta);
        }
        else if (Masukkan==3){
            tampilkanSemuaPPN(Bebek, Domba, Unta);
        }
        else{
            break;
        }
      }  
    }
    
    public static void tampilkanSemuaTernak(Modul5 Bebek, Modul5 Domba, Modul5 Unta){
        Bebek.tampilkanTernak();
        Domba.tampilkanTernak();
        Unta.tampilkanTernak();
        System.out.println("============================================");
    }
    public static void tampilkanSemuaPemasukkan(Modul5 Bebek, Modul5 Domba, Modul5 Unta){
        System.out.println("============================================");
        Bebek.tampilkanPemasukkan();
        Domba.tampilkanPemasukkan();
        Unta.tampilkanPemasukkan();
        System.out.println("Total Pemasukan: " + (Bebek.getHarga()*Bebek.getTotal() + Domba.getHarga()*Domba.getTotal() + Unta.getHarga()*Unta.getTotal() ));
        System.out.println("============================================");

    }
    public static void tampilkanSemuaPPN(Modul5 Bebek, Modul5 Domba, Modul5 Unta){
        System.out.println("============================================");
        Bebek.tampilkanPPN(PPN);
        Domba.tampilkanPPN(PPN);
        Unta.tampilkanPPN(PPN);
        System.out.println("Total Pemasukan: " + ((Bebek.getHarga()*Bebek.getTotal()+(Bebek.getHarga()*Bebek.getTotal()/PPN)) + (Domba.getHarga()*Domba.getTotal()+(Domba.getHarga()*Domba.getTotal()/PPN)) + (Unta.getHarga()*Unta.getTotal() + (Unta.getHarga()*Unta.getTotal()/PPN)) ));
        System.out.println("============================================");
    }
}
