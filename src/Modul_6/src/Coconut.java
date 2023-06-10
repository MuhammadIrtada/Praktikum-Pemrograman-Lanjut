public class Coconut extends Plant{
  private double dCostMaintenance = 8500000;
  private double dCostCoconut = 18000000;
  private int intQuantityOfOil;
  private double dCostOfOil;

  Coconut(String plantTypes, int intArea, int intQuantityOfOil, double dCostOfOil) {
    super(plantTypes, intArea);
    this.intQuantityOfOil = intQuantityOfOil;
    this.dCostOfOil = dCostOfOil;
  }

  public double getCostOfCoconut() {
    return dCostCoconut;
  }

  public int countTotalOfOil() {
    return this.intQuantityOfOil * super.getArea();
  }

  public double countProfitOfOil() {
    return ((countTotalOfOil() * this.dCostOfOil) - (this.dCostMaintenance * getArea()));
  }

  public String displayInfo() {
    String szInfoOfOil = String.format("Minyak/Hari\t\t: %d kg\nTotal Minyak/hari\t\t: %d kg\nHarga Minyak/kg\t\t: Rp. %,.2f\nProfit/hari\t\t: %,.2f", this.intQuantityOfOil, countTotalOfOil(), this.dCostOfOil, countProfitOfOil());
    return super.displayInfo() + szInfoOfOil;
  }

}
