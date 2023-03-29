package Modul_5;

public class Pajak {
  private static String[] szAnimal;
  private static String[] szAnimalType;
  private static int[] intAnimalSum;
  private static int[] intAnimalResult;
  private static int[] intTotalAnimalResult;
  private static double[] dResultPrice;
  private static double[] dTotalResultPrice;
  private static double[] dTotalResultPriceAfterPPN;
  private static double sumTotalResultPrice = 0;
  private static double setSumTotalResultPriceAfterPPN = 0;
  public static double PPN;

  Pajak(String[] szAnimal, String[] szAnimalType, int[] intAnimalSum, int[] intAnimalResult, int[] intTotalAnimalResult,
      double[] dResultPrice, double[] dTotalResultPrice, double[] dTotalResultPriceAfterPPN, double sumTotalResultPrice,
      double setSumTotalResultPriceAfterPPN) {
    Pajak.szAnimal = szAnimal;
    Pajak.szAnimalType = szAnimalType;
    Pajak.intAnimalSum = intAnimalSum;
    Pajak.intAnimalResult = intAnimalResult;
    Pajak.intTotalAnimalResult = intTotalAnimalResult;
    Pajak.dResultPrice = dResultPrice;
    Pajak.dTotalResultPrice = dTotalResultPrice;
    Pajak.dTotalResultPriceAfterPPN = dTotalResultPriceAfterPPN;
    Pajak.sumTotalResultPrice = sumTotalResultPrice;
    Pajak.setSumTotalResultPriceAfterPPN = setSumTotalResultPriceAfterPPN;
    Pajak.setTotalAnimalResult(intTotalAnimalResult);
    Pajak.setTotalResultPrice(dTotalResultPrice);
    Pajak.setSumTotalResultPrice(dTotalResultPrice);
    Pajak.setTotalResultPriceAfterPPN();
    Pajak.setSumTotalResultPriceAfterPPN(dTotalResultPriceAfterPPN);
  }

  public Pajak(String string, String string2, int i, int j, int k) {
  }

  private static int[] setTotalAnimalResult(int[] intTotalAnimalResult) {
    for (int index = 0; index < intTotalAnimalResult.length; index++) {
      intTotalAnimalResult[index] = intAnimalSum[index] * intAnimalResult[index];
    }
    return intTotalAnimalResult;
  }

  private static double[] setTotalResultPrice(double[] dTotalResultPrice) {
    for (int i = 0; i < dTotalResultPrice.length; i++) {
      dTotalResultPrice[i] = intTotalAnimalResult[i] * dResultPrice[i];
    }
    return dTotalResultPrice;
  }

  private static double setSumTotalResultPrice(double[] dTotalResultPrice) {
    for (int i = 0; i < dTotalResultPrice.length; i++) {
      sumTotalResultPrice += dTotalResultPrice[i];
    }
    return sumTotalResultPrice;
  }

  private static double[] setTotalResultPriceAfterPPN() {
    for (int i = 0; i < dTotalResultPriceAfterPPN.length; i++) {
      dTotalResultPriceAfterPPN[i] = (dTotalResultPrice[i] / Pajak.PPN) + dTotalResultPrice[i];
      // dTotalResultPriceAfterPPN[i] = dTotalResultPriceAfterPPN[i] + dTotalResultPrice[i];
    }
    return dTotalResultPriceAfterPPN;
  }

  private static double setSumTotalResultPriceAfterPPN(double[] dTotalResultPriceAfterPPN) {
    for (int i = 0; i < dTotalResultPriceAfterPPN.length; i++) {
      setSumTotalResultPriceAfterPPN += dTotalResultPriceAfterPPN[i];
    }
    return setSumTotalResultPriceAfterPPN;
  }

  public static String[] getAnimal() {
    return szAnimal;
  }

  public static String[] getAnimalType() {
    return szAnimalType;
  }

  public static int[] getAnimalSum() {
    return intAnimalSum;
  }

  public static int[] getAnimalResult() {
    return intAnimalResult;
  }

  public static int[] getTotalAnimalResult() {
    return intTotalAnimalResult;
  }

  public static double[] getResultPrice() {
    return dResultPrice;
  }

  public static double[] getTotalResultPrice() {
    return dTotalResultPrice;
  }

  public static double[] getTotalResultPriceAfterPPN() {
    return dTotalResultPriceAfterPPN;
  }

  public static double getSumTotalResultPrice() {
    return sumTotalResultPrice;
  }

  public static double getSumTotalResultPriceAfterPPN() {
    return setSumTotalResultPriceAfterPPN;
  }

  public static void getInfo1() {
    for (int i = 0; i < szAnimal.length; i++) {
      if (szAnimal[i] == "Bebek") {
        System.out.println("=".repeat(40));
        String info = String.format(
            "Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %d ekor\nTelur/Ekor\t\t: %d butir\nTotal Telur/Hari\t: %d butir\nHarga Telur/Butir\t: %.0f",
            Pajak.getAnimal()[i], Pajak.getAnimalType()[i], Pajak.getAnimalSum()[i], Pajak.getAnimalResult()[i], Pajak.getTotalAnimalResult()[i],
            getResultPrice()[i]);
        System.out.println(info);
      }

      else if (szAnimal[i] == "Domba") {
        System.out.println("=".repeat(40));
        String info = String.format(
            "Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %d\nBulu/Ekor\t\t: %d kg\nTotal Bulu/Hari\t\t: %d kg\nHarga Bulu/Kg\t\t: %.0f",
            Pajak.getAnimal()[i], Pajak.getAnimalType()[i], Pajak.getAnimalSum()[i], Pajak.getAnimalResult()[i], Pajak.getTotalAnimalResult()[i],
            getResultPrice()[i]);
        System.out.println(info);
      }

      else if (szAnimal[i] == "Unta") {
        System.out.println("=".repeat(40));
        String info = String.format(
            "Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %d\nSusu/Ekor\t\t: %d liter\nTotal Susu/Hari\t\t: %d liter\nHarga Susu/liter\t: %.0f",
            Pajak.getAnimal()[i], Pajak.getAnimalType()[i], Pajak.getAnimalSum()[i], Pajak.getAnimalResult()[i], Pajak.getTotalAnimalResult()[i],
            getResultPrice()[i]);
        System.out.println(info);
      }
    }
    System.out.println("=".repeat(40));
  }

  public static void getInfo2() {
    System.out.println("=".repeat(40));
    for (int i = 0; i < dResultPrice.length; i++) {
      String info = String.format(
        "Jenis\t\t: %s | %s\nPemasukkan\t: %.0f", Pajak.getAnimal()[i], Pajak.getAnimalType()[i], Pajak.getTotalResultPrice()[i]
      );
      System.out.println(info);
      System.out.println("-".repeat(40));
    }
    System.out.printf("Total Pemasukkan: %.0f\n", Pajak.getSumTotalResultPrice());
    System.out.println("=".repeat(40));
  }

  public static void getInfo3() {
    System.out.println("=".repeat(40));
    for (int i = 0; i < dResultPrice.length; i++) {
      String info = String.format(
        "Jenis\t\t: %s | %s\nPemasukkan\t: %.0f", Pajak.getAnimal()[i], Pajak.getAnimalType()[i], Pajak.getTotalResultPriceAfterPPN()[i]
      );
      System.out.println(info);
      System.out.println("-".repeat(40));
    }
    System.out.printf("Total Pemasukkan: %.0f\n", Pajak.getSumTotalResultPriceAfterPPN());
    System.out.println("=".repeat(40));
  }
}
