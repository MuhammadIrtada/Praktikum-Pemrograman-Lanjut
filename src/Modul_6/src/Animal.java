package Modul_6.src;

import java.util.*;

public class Animal {
  private String szAnimalTypes;
  private int intQuantity;
  
  public static ArrayList<Animal> arrAnimalList = new ArrayList<Animal>();

  Animal(String szAnimalTypes, int intQuantity) {
    this.szAnimalTypes = szAnimalTypes;
    this.intQuantity = intQuantity;
    arrAnimalList.add(this);
  }

  public void addQuantity(int option) {
    this.intQuantity += option;
  }

  public int getQuantity() {
    return intQuantity;
  }

  public String displayInfo() {
    return String.format("Jenis\t\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.szAnimalTypes, this.intQuantity);
  }

  public static void displayAllInfo() {
    for(Animal count : arrAnimalList) {
      System.out.printf("%s\n", count.displayInfo());
      System.out.println("-".repeat(40));
    }
  }
}
