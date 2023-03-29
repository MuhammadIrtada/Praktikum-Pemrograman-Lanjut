package Modul_5;

import java.util.Scanner;

public class TestPajak {
  static Pajak Tax;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] szAnimal = { "Bebek", "Domba", "Unta" };
    String[] szAnimalType = { "Telur Biasa", "Bulu Hitam", "Susu Putih" };
    int[] intAnimalSum = { 15, 4, 3 };
    int[] intAnimalResult = { 2, 4, 5 };
    int[] intTotalAnimalResult = new int[szAnimal.length];
    double[] dResultPrice = { 2000, 15000, 60000 };
    double[] dTotalResultPrice = new double[dResultPrice.length];
    double[] dTotalResultPriceAfterPPN = new double[dTotalResultPrice.length];
    double sumTotalResultPrice = 0;
    double setSumTotalResultPriceAfterPPN = 0;
    final double PPN = 10;
    Pajak.PPN = PPN;
    boolean check = true;

    Tax = new Pajak(szAnimal, szAnimalType, intAnimalSum, intAnimalResult, intTotalAnimalResult, dResultPrice,
        dTotalResultPrice, dTotalResultPriceAfterPPN, sumTotalResultPrice, setSumTotalResultPriceAfterPPN);

    while(check){
      System.out.printf("Menu\n1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukkan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit\n");
      System.out.print("Masukkan Menu Anda : ");
      int inputMenu = input.nextInt();
      switch(inputMenu){
        case 1:
        Tax.getInfo1(); 
        break;
        case 2:
        Tax.getInfo2(); 
        break;
        case 3:
        Tax.getInfo3();
        break;
        case 4:
          check = false;
          System.out.println("Terima kasih telah menggunakan program kami");
        break;
        default:
          System.out.println("Menu yang anda masukkan salah, silakan coba lagi!");
          break;
      }
    }
  }
}
