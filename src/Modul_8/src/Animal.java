package Modul_8.src;

public class Animal implements InterfaceOfKiw{
  private int intTotalOfAnimal;
  private String szNameOfAnimal;
  private String szUnit;
  private double dCostEveryUnit;

  public Animal(int intTotalOfAnimal, String szNameOfAnimal) {
    this.intTotalOfAnimal = intTotalOfAnimal;
    this.szNameOfAnimal = szNameOfAnimal;
    this.szUnit = "Ekor";
  }

  public int getTotalOfAnimal() {
    return intTotalOfAnimal;
  }

  public void setTotalOfAnimal(int intTotalOfAnimal) {
    this.intTotalOfAnimal = intTotalOfAnimal;
  }

  public String getNameOfAnimal() {
    return szNameOfAnimal;
  }

  public void setNameOfAnimal(String szNameOfAnimal) {
    this.szNameOfAnimal = szNameOfAnimal;
  }

  public String getUnit() {
    return szUnit;
  }

  public void setUnit(String szUnit) {
    this.szUnit = szUnit;
  }

  public void addTotal(int add) {
    this.intTotalOfAnimal += add;
  }

  @Override
  public void displayTotal() {
    System.out.println(getNameOfAnimal() + "\t\t: " + getTotalOfAnimal() + " " + getUnit());
  }

  public double getCostEveryUnit() {
    return dCostEveryUnit;
  }

  public void setCostEveryUnit(double dCostEveryUnit) {
    this.dCostEveryUnit = dCostEveryUnit;
  }

  @Override
  public void buy(int option) {
    addTotal(option);
    System.out.println("-".repeat(45));
    System.out.println("\tNota Pembelian Hewan Ternak");
    System.out.println("-".repeat(45));
    System.out.printf("%s\t\tx(%d)\t Rp. %,.2f\n\n", szNameOfAnimal, option, (option * dCostEveryUnit));
  }
}
