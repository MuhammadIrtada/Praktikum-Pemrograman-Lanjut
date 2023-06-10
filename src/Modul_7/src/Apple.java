package Modul_7.src;

public class Apple extends Plant {
  public Apple(int intAreaOfGarden, int intResult, double dCostOfResult, double dCostMaintenance) {
    super(intAreaOfGarden, intResult, dCostOfResult, dCostMaintenance);
  }

  @Override
  public void displaySalary() {
    System.out.printf("Apel:\t\t\t: Rp. %,.2f\n", getSalary());
  }

  @Override
  public void displayMaintenance() {
    System.out.printf("Apel\t\t: Rp. %,.2f\n", getMaintenance());
  }
}
