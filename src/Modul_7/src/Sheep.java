package Modul_7.src;

public class Sheep extends Animal {
  public Sheep(int intSumOfAnimal, int intResult, double dCostOfResult, double dCostMaintenance) {
    super(intSumOfAnimal, intResult, dCostOfResult, dCostMaintenance);
  }

  @Override
  public void displaySalary() {
    System.out.printf("Domba:\t\t\t: Rp. %,.2f\n", getSalary());
  }

  @Override
  public void displayMaintenance() {
    System.out.printf("Domba\t\t: Rp. %,.2f\n", getCostMaintenance());
  }
}
