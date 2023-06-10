package Modul_7.src;

public class Coconut extends Plant{
  public Coconut(int intAreaOfGarden, int intResult, double dCostOfResult, double dCostMaintenance) {
    super(intAreaOfGarden, intResult, dCostOfResult, dCostMaintenance);
  }

  @Override
  public void displaySalary() {
    System.out.printf("Kelapa Sawit:\t\t\t: Rp. %,.2f\n", getSalary());
  }

  @Override
  public void displayMaintenance() {
    System.out.printf("Kelapa Sawit\t\t: Rp. %,.2f\n", getMaintenance());
  }
}
