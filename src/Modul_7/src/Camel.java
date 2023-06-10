package Modul_7.src;

public class Camel extends Animal {
  public Camel(int intSumOfAnimal, int intResult, double dCostOfResult, double dCostMaintenance) {
    super(intSumOfAnimal, intResult, dCostOfResult, dCostMaintenance);
  }

  @Override
  public void displaySalary() {
    System.out.printf("Unta:\t\t\t: Rp. %,.2f\n", getSalary());
  }

  @Override
  public void displayMaintenance() {
    System.out.printf("Unta\t\t: Rp. %,.2f\n", getCostMaintenance());
  }
}
