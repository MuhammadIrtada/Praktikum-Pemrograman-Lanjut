package Modul_6.src;

public class Duck extends Animal{
  private double dCostOfDuck = 110000;
  private double dCostMaintenance = 3000;
  private double dCostOfEgg;
  private int intQuantityOfEgg;

  Duck(String animalTypes, int quantity, int intQuantityOfEgg, double dCostOfEgg){
    super(animalTypes, intQuantityOfEgg);
    this.dCostOfEgg = dCostOfEgg;
    this.intQuantityOfEgg = intQuantityOfEgg;
  }

  public double getPrice() {
    return dCostOfDuck;
  }

  public double countTotalOfEgg() {
    return this.intQuantityOfEgg * super.getQuantity();
  }

  public double countProfitOfEgg() {
    return ((countTotalOfEgg() * this.dCostOfEgg) - (this.dCostMaintenance * this.getQuantity()));
  }

  public String displayInfo() {
    String infoOfDuck = String.format("Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t\t: %f Butir\nHarga Telur/Butir\t\t: Rp. %,.2f\nProfit/Hari\t\t: %,.2f", intQuantityOfEgg, countTotalOfEgg(), dCostOfEgg, countProfitOfEgg());
    return super.displayInfo() + infoOfDuck;
  }
}
