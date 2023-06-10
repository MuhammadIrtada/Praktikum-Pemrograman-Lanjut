package Modul_7.src;

public class Duck extends Animal{
  
  public Duck(int intSumOfAnimal, int intResult, double dCostOfResult, double dCostMaintenance) {
    super(intSumOfAnimal, intResult, dCostOfResult, dCostMaintenance);
  }

  @Override
  public void displaySalary() {
    System.out.printf("Bebek:\t\t\t: Rp. %,.2f\n", getSalary());
  }

  @Override
  public void displayMaintenance() {
    System.out.printf("Bebek\t\t: Rp. %,.2f\n", getCostMaintenance());
  }
}
