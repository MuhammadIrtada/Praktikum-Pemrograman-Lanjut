package Modul_8.src;

public class Plant implements InterfaceOfKiw{
  private int intTotalOfPlant;
  private String szNameOfPlant;
  private String szUnit;
  private double dCostEveryUnit;

  public Plant(int intTotalOfPlant, String szNameOfPlant) {
    this.intTotalOfPlant = intTotalOfPlant;
    this.szNameOfPlant = szNameOfPlant;
    this.szUnit = "Hektar";
  }

  public int getTotalOfPlant() {
    return intTotalOfPlant;
  }

  public void setTotalOfPlant(int intTotalOfPlant) {
    this.intTotalOfPlant = intTotalOfPlant;
  }

  public String getNameOfPlant() {
    return szNameOfPlant;
  }

  public void setNameOfPlant(String szNameOfPlant) {
    this.szNameOfPlant = szNameOfPlant;
  }

  public String getUnit() {
    return szUnit;
  }

  public void setUnit(String szUnit) {
    this.szUnit = szUnit;
  }

  public void addTotal(int add) {
    this.intTotalOfPlant += add;
  }

  @Override
  public void displayTotal() {
    System.out.println(getNameOfPlant() + "\t\t: " + getTotalOfPlant() + " " + getUnit());
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
    System.out.println("\tNota Pembelian Tanah Perkebunan");
    System.out.println("-".repeat(45));
    System.out.printf("%s\t\tx(%d)\t Rp. %,.2f\n\n", szNameOfPlant, option, (option * dCostEveryUnit));
  }
}
