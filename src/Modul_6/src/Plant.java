package Modul_6.src;

import java.util.*;

public class Plant {
  private String szPlantTypes;
  private int intArea;
  
  public static ArrayList<Plant> arrPlantList = new ArrayList<Plant>();

  Plant(String szPlantTypes, int intArea) {
    this.szPlantTypes = szPlantTypes;
    this.intArea = intArea;
    arrPlantList.add(this);
  }

  public void addQuantity(int option) {
    this.intArea += option;
  }

  public int getArea() {
    return this.intArea;
  }

  public String displayInfo() {
    return String.format("Jenis\t\t\t\t: %s\nLuas\t\t\t: %d hektar\n", this.szPlantTypes, this.intArea);
  }

  public static void displayAllInfo() {
    for(Plant count : arrPlantList) {
      System.out.printf("%s\n", count.displayInfo());
      System.out.println("-".repeat(40));
    }
  }
}
