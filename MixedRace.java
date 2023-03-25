class MixedAnimal {
    private String species;
    
    private String[] races = new String[2];
    private int[] doses = new int[2];
    private int[] population = new int[2];
    
    public MixedAnimal() {
    }
    
    public MixedAnimal(String speciesName) {
        this.species = speciesName;
    }

    public MixedAnimal(String speciesName, String firstRace, String secondRace) {
        this.species = speciesName;
        this.races[0] = firstRace;
        this.races[1] = secondRace;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setRaces(String firstRace, String secondRace) {
        this.races[0] = firstRace;
        this.races[1] = secondRace;
    }
    public void setPopulation(int first, int second) {
        this.population[0] = first;
        this.population[1] = second;
    }
    public void setDoses(int firstDose, int secondDose) {
        this.doses[0] = firstDose;
        this.doses[1] = secondDose;
    }
    public String getSpecies() {
        return species;
    }


    public void display(int race) {
        String doseEach = "Dosis obat/ekor/hari";
        if (race == 1 || race == 2)
            System.out.printf("%-30s: %s\n%-30s: %d ekor\n%-30s: %dmL\n%s\n", "Ras", races[race-1], "Jumlah", population[race-1],
                    doseEach, doses[race-1], "-".repeat(40));
    }

    public void display() {
        String doseSum = "Jumlah dosis obat/hari";
        String doseTotal = "Total dosis obat/ekor/hari";
        System.out.printf("%-30s: %d\n%-30s: %d\n%-30s: %d\n%s\n\n", doseSum, (population[0] * doses[0]), doseSum,
                (population[1] * doses[1]), doseTotal, (population[0] * doses[0]) + (population[1] * doses[1]), "=".repeat(40));
    }
}

public class MixedRace {
    public static void main(String[] args) {
        MixedAnimal duck = new MixedAnimal();
        duck.setSpecies("Bebek");
        duck.setRaces("Telur biasa", "Telur asin");
        duck.setPopulation(15, 10);
        duck.setDoses(5, 8);
        System.out.printf("%-30s: %s\n%s\n", "Jenis", duck.getSpecies(), "-".repeat(40));
        duck.display(1);
        duck.display(2);
        duck.display();

        MixedAnimal camel = new MixedAnimal("Unta");
        camel.setRaces("Susu putih", "Susu coklat");
        camel.setPopulation(3, 4);
        camel.setDoses(10, 15);
        System.out.printf("%-30s: %s\n%s\n", "Jenis", camel.getSpecies(), "-".repeat(40));
        camel.display(1);
        camel.display(2);
        camel.display();
        
        MixedAnimal sheep = new MixedAnimal("Domba", "Bulu hitam", "Bulu putih");
        sheep.setPopulation(4, 6);
        sheep.setDoses(9, 14);
        System.out.printf("%-30s: %s\n%s\n", "Jenis", sheep.getSpecies(), "-".repeat(40));
        sheep.display(1);
        sheep.display(2);
        sheep.display();
    }
}
