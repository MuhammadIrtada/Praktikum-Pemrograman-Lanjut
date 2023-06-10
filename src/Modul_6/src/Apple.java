public class Apple extends Plant {
  private double dCostMaintenance = 900000;
  private double dCostGarden = 7500000;
  private int intQuantityOfApple;
  private double dCostOfApple;

  Apple(String plantTypes, int intArea, int intQuantityOfApple, double dCostOfApple) {
    super(plantTypes, intArea);
    this.intQuantityOfApple = intQuantityOfApple;
    this.dCostOfApple = dCostOfApple;
  }

  public double getCostOfGarden() {
    return dCostGarden;
  }

  public int countTotalOfApple() {
    return this.intQuantityOfApple * super.getArea();
  }

  public double countProfitOfApple() {
    return ((countTotalOfApple() * this.dCostOfApple) - (this.dCostMaintenance * getArea()));
  }

  public String displayInfo() {
    String szInfoOfApple = String.format("Apel/Hari\t\t: %d kg\nTotal Apel/hari\t\t: %d kg\nHarga Apel/kg\t\t: Rp. %,.2f\nProfit/hari\t\t: %,.2f", this.intQuantityOfApple, countTotalOfApple(), this.dCostOfApple, countProfitOfApple());
    return super.displayInfo() + szInfoOfApple;
  }
}
