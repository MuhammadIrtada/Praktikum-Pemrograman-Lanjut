package Modul_6.src;

public class Sheep extends Animal {
  private double dCostOfSheep = 2450000;
  private double dCostMaintenance = 45000;
  private double dCostOfWool;
  private int intQuantityOfWool;

  Sheep(String animalTypes, int quantity, int intQuantityOfWool, double dCostOfWool){
    super(animalTypes, intQuantityOfWool);
    this.dCostOfWool = dCostOfWool;
    this.intQuantityOfWool = intQuantityOfWool;
  }

  public double getPrice() {
    return dCostOfSheep;
  }

  public double countTotalOfWool() {
    return this.intQuantityOfWool * super.getQuantity();
  }

  public double countProfitOfWool() {
    return ((countTotalOfWool() * this.dCostOfWool) - (this.dCostMaintenance * this.getQuantity()));
  }

  public String displayInfo() {
    String infoOfSheep = String.format("Bulu/Ekor\t\t: %d Kg\nTotal Bulu/Hari\t\t: %f Kg\nHarga Bulu/Kg\t\t: Rp. %,.2f\nProfit/Hari\t\t: %,.2f", intQuantityOfWool, countTotalOfWool(), dCostOfWool, countProfitOfWool());
    return super.displayInfo() + infoOfSheep;
  }
}
