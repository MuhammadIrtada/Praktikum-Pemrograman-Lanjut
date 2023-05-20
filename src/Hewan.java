public class Hewan {
    protected int population, amountProduced, sellPrice, maintCost, buyPrice;
    protected String name, unit, type;
    public String getName(){
        return name;
    }
    public int getPrice(){
        return buyPrice;
    }
    public int profit(){
        int profit;
        profit = population * ((amountProduced * sellPrice) - maintCost);
        return profit;
    }
    public void buy(){
        population++;
        Main.budget -= buyPrice;
    }
    public void show(){
        System.out.printf("%-20s: %s\n", "Jenis", name);
        System.out.printf("%-20s: %s\n", "Jumlah", population + " ekor");
        System.out.printf("%-20s: %s\n", type+"/Ekor", amountProduced + " " +unit);
        System.out.printf("%-20s: %s\n", "Total "+type+"/Hari", (population * amountProduced) +" "+ unit);
        System.out.printf("%-20s: %s%,d%s\n", "Harga "+type+"/"+unit, "Rp. ",sellPrice,",000");
        System.out.printf("%-20s: %s%,d%s\n", "Profit/Hari", "Rp. " ,profit(),",000");
        System.out.println("=".repeat(40));
    }
}
