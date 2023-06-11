package Modul_7.src;

import java.util.*;

public abstract class Plant {
  private int intAreaOfGarden;
  private int intResult;
  private double dCostOfResult;
  private double dCostMaintenance;

  public Plant(int intAreaOfGarden, int intResult, double dCostOfResult, double dCostMaintenance) {
    this.intAreaOfGarden = intAreaOfGarden;
    this.intResult = intResult;
    this.dCostOfResult = dCostOfResult;
    this.dCostMaintenance = dCostMaintenance;
  }

  public int getAreaOfGarden() {
    return intAreaOfGarden;
  }

  public void setAreaOfGarden(int intAreaOfGarden) {
    this.intAreaOfGarden = intAreaOfGarden;
  }

  public int intResult() {
    return intResult;
  }

  public void setResult(int intResult) {
    this.intResult = intResult;
  }

  public double getCostOfResult() {
    return dCostOfResult;
  }

  public void setCostOfResult(double dCostOfResult) {
    this.dCostOfResult = dCostOfResult;
  }

  public double getSalary() {
    return intAreaOfGarden * intResult * dCostOfResult * 30;
  }

  public double getMaintenance() {
    return dCostMaintenance * intAreaOfGarden * 30;
  }

  public abstract void displaySalary();

  public abstract void displayMaintenance();
}
