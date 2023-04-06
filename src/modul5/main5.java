package modul5;

import java.util.Scanner;  

public class main5 {
    static final double ppn=0.1;
    static duck bebek=new duck();
    static domba ship=new domba();
    static unta camel=new unta();
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); 
        String inputMenu;
        boolean loopMenu = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan Anda: ");
            inputMenu = scan.next();
            
            switch (inputMenu) {
                case "1":
                    System.out.println("=".repeat(40));
                    duck.infoBebek();
                    domba.infoDomba();
                    unta.infoUnta();
                    System.out.println("=".repeat(40));
                    break;
                case "2":
                    System.out.println("=".repeat(40));
                    duck.pemasukanBebek();
                    domba.pemasukanDomba();
                    unta.pemasukanUnta();
                    System.out.println("=".repeat(40));
                    break;
                case "3":
                    System.out.println("=".repeat(40));
                    System.out.println("Jenis\t\t: Bebek | Telur Biasa");
                    System.out.println("Pemasukan\t: "+ (bebek.getPembbk()+(int)(bebek.getPembbk()*ppn)));
                    System.out.println("-".repeat(40));
                    System.out.println("Jenis\t\t: Domba | Bulu Hitam");
                    System.out.println("Pemasukan\t: "+(ship.getPemDom()+(int)(ship.getPemDom()*ppn)));
                    System.out.println("-".repeat(40));
                    System.out.println("Jenis\t\t: Unta | Susu Putih");
                    System.out.println("Pemasukan\t: "+(camel.getPemUn()+(int)(camel.getPemUn()*ppn)));
                    System.out.println("-".repeat(40));
                    System.out.println("Total Pemasukan: "+((int)(bebek.getPembbk()+(bebek.getPembbk()*ppn))+(int)(ship.getPemDom()+(ship.getPemDom()*ppn))+(int)(camel.getPemUn()+(camel.getPemUn()*ppn))));
                    System.out.println("=".repeat(40));
                    break;
                case "4":
                    loopMenu = false;
                    System.out.println("Terimakasih telah menggunakan layanan kami");
                    break;            
                default:
                    System.out.println("Input yang anda masukkan tidak sesuai. Silahkan coba lagi!");
                    break;
            }
        } while (loopMenu);
    }      
}
