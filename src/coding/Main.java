package coding;
import java.util.Scanner;
public class Main {
    static final int ppn = 10;
    static Bebek bebek = new Bebek(15,2000,2);
    static Unta unta = new Unta(3,60000,5);
    static Domba domba = new Domba (4,15000,4);
    public static void main(String[] args) {
        boolean loop = true;
        do{
            System.out.println("Menu:\n1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit");
            System.out.print("Masukkan Menu Anda : ");
            Scanner tasya = new Scanner(System.in);
            int pilih = tasya.nextInt(); 
            breakLine();
            switch (pilih){
                case 1:menu1();break;
                case 2:menu2();break;
                case 3:menu3();break;
                case 4:System.out.println("Terima kasih telah menggunakan program kami");breakLine(); loop=false;break;
            }
        }while (loop);
    }
    static void menu1(){
        bebek.menu1();
        domba.menu1();
        unta.menu1();
    }
    static void menu2(){
        System.out.println("Jenis\t\t: Bebek | Telur Biasa\nPemasukan\t: "+bebek.menu2()+"\n"+"-".repeat(50));
        System.out.println("Jenis\t\t: Domba | Bulu Hitam\nPemasukan\t: "+domba.menu2()+"\n"+"-".repeat(50));
        System.out.println("Jenis\t\t: Unta  | Susu Putih\nPemasukan\t: "+unta.menu2()+"\n"+"-".repeat(50));
        System.out.println("Total Pemasukan\t: "+(bebek.menu2()+domba.menu2()+unta.menu2())+"\n"+"=".repeat(50));
    }
    static void menu3(){
        System.out.println("Jenis\t\t: Bebek | Telur Biasa\nPemasukan\t: "+bebek.menu3(ppn)+"\n"+"-".repeat(50));
        System.out.println("Jenis\t\t: Domba | Bulu Hitam\nPemasukan\t: "+domba.menu3(ppn)+"\n"+"-".repeat(50));
        System.out.println("Jenis\t\t: Unta  | Susu Putih\nPemasukan\t: "+unta.menu3(ppn)+"\n"+"-".repeat(50));
        System.out.println("Total Pemasukan\t: "+(bebek.menu3(ppn)+domba.menu3(ppn)+unta.menu3(ppn))+"\n"+"=".repeat(50));
    }
    static void breakLine(){
        System.out.println("=".repeat(50));
    }
}