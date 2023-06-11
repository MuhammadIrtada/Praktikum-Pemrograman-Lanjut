package Modul_6.src;

public class Camel extends Animal {
  private double dCostOfCamel = 12000000;
  private double dCostMaintenance = 200000;
  private double dCostOfMilk;
  private int intQuantityOfMilk;

  Camel(String animalTypes, int quantity, int intQuantityOfMilk, double dCostOfMilk){
    super(animalTypes, intQuantityOfMilk);
    this.dCostOfMilk = dCostOfMilk;
    this.intQuantityOfMilk = intQuantityOfMilk;
  }

  public double getPrice() {
    return dCostOfCamel;
  }

  public double countTotalOfMilk() {
    return this.intQuantityOfMilk * super.getQuantity();
  }

  public double countProfitOfMilk() {
    return ((countTotalOfMilk() * this.dCostOfMilk) - (this.dCostMaintenance * this.getQuantity()));
  }

  public String displayInfo() {
    String infoOfCamel = String.format("Susu/Ekor\t\t: %d Liter\nTotal Susu/Hari\t\t: %f Liter\nHarga Susu/Liter\t\t: Rp. %,.2f\nProfit/Hari\t\t: %,.2f", intQuantityOfMilk, countTotalOfMilk(), dCostOfMilk, countProfitOfMilk());
    return super.displayInfo() + infoOfCamel;
  }
}
