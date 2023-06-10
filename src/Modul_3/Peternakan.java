package Modul_3;

public class Peternakan {
  private static String[] jenisHewan;
  private static String[][] hewanRas;
  private static int[][] jumlahHewanRas;
  private static double[][] hewanDosisHarian;
  private static double[][] hewanHasilDosisHarian;
  private static String namaDefault = "Hewan", RasDefault = "Unknown";
  private static int hewanKe = 1, jumlahDefault = 0;
  private static double TotalDefault = 0;

  public Peternakan() {
    System.out.println(">>>>>>>>>> PETERNAKAN DEFAULT <<<<<<<<<<");
    System.out.println("-".repeat(40));
    for (int i = 0; i < jenisHewan.length; i++) {
      System.out.printf("Jenis\t\t\t: %s ke-%d\n", namaDefault, hewanKe);
      hewanKe++;
      System.out.println("-".repeat(40));
      for (int j = 0; j < hewanRas[i].length; j++) {
        System.out.printf("Ras\t\t\t: %s\nJumlah\t\t\t: %d ekor\nDosis obat/ekor\t\t: %.0f mL\n",
            RasDefault, jumlahDefault, ((double) jumlahDefault));
        System.out.println("-".repeat(40));
      }
      for (int j = 0; j < hewanHasilDosisHarian[i].length; j++) {
        System.out.printf("Jumlah dosis obat/hari\t: %.0f mL\n", ((double) jumlahDefault));
      }
      for (int j = 0; j < hewanHasilDosisHarian[i].length - 1; j++) {
        System.out.printf("Total dosis obat/hari\t: %.0f mL\n", ((double) jumlahDefault));
      }
      System.out.println("=".repeat(40));
    }
  }

  public Peternakan(String[] jenisHewan, String[][] hewanRas, int[][] jumlahHewanRas, double[][] hewanDosisHarian,
      double[][] hewanHasilDosisHarian) {
    Peternakan.jenisHewan = jenisHewan;
    Peternakan.hewanRas = hewanRas;
    Peternakan.jumlahHewanRas = jumlahHewanRas;
    Peternakan.hewanDosisHarian = hewanDosisHarian;
    Peternakan.hewanHasilDosisHarian = hewanHasilDosisHarian;
    this.setHewanDosisHarian();
    this.setHewanDosisHarian(hewanHasilDosisHarian);
  }

  public static String[] getJenisHewan() {
    return jenisHewan;
  }

  public static String[][] getHewanRas() {
    return hewanRas;
  }

  public static int[][] getJumlahHewanRas() {
    return jumlahHewanRas;
  }

  private double[][] setHewanDosisHarian() {
    hewanDosisHarian[0][0] = 5;
    hewanDosisHarian[0][1] = 8;
    hewanDosisHarian[1][0] = 10;
    hewanDosisHarian[1][1] = 15;
    hewanDosisHarian[2][0] = 9;
    hewanDosisHarian[2][1] = 14;
    return hewanDosisHarian;
  }

  private double[][] setHewanDosisHarian(double[][] hewanHasilDosisHarian) {
    hewanHasilDosisHarian[0][0] = jumlahHewanRas[0][0] * hewanDosisHarian[0][0];
    hewanHasilDosisHarian[0][1] = jumlahHewanRas[0][1] * hewanDosisHarian[0][1];
    hewanHasilDosisHarian[1][0] = jumlahHewanRas[1][0] * hewanDosisHarian[1][0];
    hewanHasilDosisHarian[1][1] = jumlahHewanRas[1][1] * hewanDosisHarian[1][1];
    hewanHasilDosisHarian[2][0] = jumlahHewanRas[2][0] * hewanDosisHarian[2][0];
    hewanHasilDosisHarian[2][1] = jumlahHewanRas[2][1] * hewanDosisHarian[2][1];
    return hewanHasilDosisHarian;
  }

  public static double[][] getHewanDosisHarian() {
    return hewanDosisHarian;
  }

  public static double[][] getHewanDosisHarian(double[][] hewanHasilDosisHarian) {
    return hewanHasilDosisHarian;
  }

  public static void getInfo() {
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(">>>>>>>>>> PETERNAKAN CUSTOM <<<<<<<<<<");
    System.out.println("-".repeat(40));
    for (int i = 0; i < jenisHewan.length; i++) {
      System.out.printf("Jenis\t\t\t: %s\n", getJenisHewan()[i]);
      System.out.println("-".repeat(40));
      for (int j = 0; j < hewanRas[i].length; j++) {
        System.out.printf("Ras\t\t\t: %s\nJumlah\t\t\t: %d ekor\nDosis obat/ekor\t\t: %.0f mL\n",
            Peternakan.getHewanRas()[i][j], Peternakan.getJumlahHewanRas()[i][j],
            Peternakan.getHewanDosisHarian()[i][j]);
        System.out.println("-".repeat(40));
      }
      for (int j = 0; j < hewanHasilDosisHarian[i].length; j++) {
        System.out.printf("Jumlah dosis obat/hari\t: %.0f mL\n", Peternakan.hewanHasilDosisHarian[i][j]);
      }
      for (int j = 0; j < hewanHasilDosisHarian[i].length - 1; j++) {
        System.out.printf("Total dosis obat/hari\t: %.0f mL\n",
            Peternakan.hewanHasilDosisHarian[i][j] + Peternakan.hewanHasilDosisHarian[i][j + 1]);
      }
      System.out.println("=".repeat(40));
    }
  }
}
