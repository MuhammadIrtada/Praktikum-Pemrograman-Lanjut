package Modul_3;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class main {
  public static void main(String[] args) {
    String[] jenisHewan = { "Bebek", "Unta", "Domba" };
    String[][] hewanRas = { { "Telur Biasa", "Telur Asin" }, { "Susu Putih", "Susu Coklat" },
        { "Bulu Hitam", "Bulu Putih" } };
    int[][] jumlahHewanRas = { { 15, 10 }, { 3, 4 }, { 4, 6 } };
    double[][] hewanDosisHarian = new double[jumlahHewanRas.length][jumlahHewanRas[0].length];
    double[][] hewanHasilDosisHarian = new double[jumlahHewanRas.length][jumlahHewanRas[0].length];

    Peternakan hewanTernak = new Peternakan(jenisHewan, hewanRas, jumlahHewanRas, hewanDosisHarian,
                                            hewanHasilDosisHarian);

    Peternakan hewanTernak1 = new Peternakan(); // jika ada sebuah constructor tanpa parameter, maka output default akan
                                                // ditampilkan

    Peternakan.getInfo();
  }
}
