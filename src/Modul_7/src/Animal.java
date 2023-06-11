package Modul_7.src;

import java.util.*;

public abstract class Animal {
  private int intSumOfAnimal;
  private int intResult;
  private double dCostOfResult;
  private double dCostMaintenance;

  public Animal(int intSumOfAnimal, int intResult, double dCostOfResult, double dCostMaintenance) {
    this.intSumOfAnimal = intSumOfAnimal;
    this.intResult = intResult;
    this.dCostOfResult = dCostOfResult;
    this.dCostMaintenance = dCostMaintenance;
  }

  public int getSumOfAnimal() {
    return intSumOfAnimal;
  }

  public void setSumOfAnimal(int intSumOfAnimal) {
    this.intSumOfAnimal = intSumOfAnimal;
  }

  public int getResult() {
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

  public double getCostMaintenance() {
    return dCostMaintenance;
  }

  public void setCostMaintenance(double dCostMaintenance) {
    this.dCostMaintenance = dCostMaintenance;
  }

  public double getSalary() {
    return intSumOfAnimal * intResult * dCostOfResult * 30;
  }

  public double getMaintenance() {
    return dCostMaintenance * intSumOfAnimal * 30;
  }

  public abstract void displaySalary();

  public abstract void displayMaintenance();
}
