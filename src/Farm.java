public class Farm {
    protected String[] name;
    protected int[] population, productionAmount, priceEach, maintenanceEach;

    public int rawProfit(int index) {
        return population[index] * productionAmount[index] * priceEach[index] * 30;
    }

    public void rawProfitLine(int index) {
        System.out.printf("%-20s Rp %,d,00\n", name[index] + ":", rawProfit(index));
    }

    public int totalRaw() {
        int total = 0;
        for (int i = 0; i < population.length; i++) {
            total += rawProfit(i);
        }
        return total;
    }

    public int maintenanceCost(int index) {
        return maintenanceEach[index] * population[index] * 30;
    }

    public void maintenanceLine(int index) {
        System.out.printf("%-20s Rp %,d,00\n", name[index] + ":", maintenanceCost(index));
    }

    public int totalMaint() {
        int total = 0;
        for (int i = 0; i < population.length; i++) {
            total += maintenanceCost(i);
        }
        return total;
    }
}
