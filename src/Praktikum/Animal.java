package Praktikum;

public class Animal {
    private String type;
    private int jumAnimals;
    private int dosis;
    private String jenis;

    public String getJenis() {
        return jenis;
    }

    public Animal(String type, int jumAnimals, String jenis) {
        this.type = type;
        this.jumAnimals = jumAnimals;
        this.jenis = jenis;
        calculateDosis();
    }

    public Animal(String type, int jumAnimals, int dosis) {
        this.type = type;
        this.jumAnimals = jumAnimals;
        this.dosis = dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    private void calculateDosis() {
        switch (type) {
            case "Bebek Telur Biasa":
                dosis = 5;
                break;
            case "Bebek Telur Asin":
                dosis = 8;
                break;
            case "Unta Susu Putih":
                dosis = 10;
                break;
            case "Unta Susu Coklat":
                dosis = 15;
                break;
            case "Domba Bulu Hitam":
                dosis = 9;
                break;
            case "Domba Bulu Putih":
                dosis = 14;
                break;
            default:
                dosis = 0;
                break;
        }
    }

    public int getTotalDosis() {
        return jumAnimals * dosis;
    }

    public static int getTotalDosis(String jenis, Animal... animals) {
        int totalAnimals = 0;
        int totalDosis = 0;

        for (Animal animal : animals) {
            if (animal.getJenis().equalsIgnoreCase(jenis)) {
                totalAnimals += animal.jumAnimals;
                totalDosis += animal.getTotalDosis();
            }
        }

        if (totalAnimals == 0) {
            System.out.println("Tidak ada hewan " + jenis);
        }

        return totalDosis;

    }

    public void printInfo() {
        System.out.println("Jenis hewan\t\t\t: " + jenis);
        System.out.println("Ras\t\t\t\t: " + type);
        System.out.println("Jumlah hewan\t\t\t: " + jumAnimals + " ekor");
        System.out.println("Dosis obat per hari per ekor\t: " + dosis + "mL");
        System.out.println("Jumlah dosis obat/hari\t\t: " + getTotalDosis() + "mL");
        System.out.println("-".repeat(50));

    }

    public static void main(String[] args) {
        Animal bebekTelurBiasa = new Animal("Bebek Telur Biasa", 15, "Bebek");
        bebekTelurBiasa.printInfo();

        Animal bebekTelurAsin = new Animal("Bebek Telur Asin", 10, "Bebek");
        bebekTelurAsin.printInfo();
        int totalDosisBebek = Animal.getTotalDosis("Bebek", bebekTelurBiasa, bebekTelurAsin);
        System.out.println("Total dosis untuk Bebek\t\t: " + totalDosisBebek + "mL");
        System.out.println("=".repeat(50));
        System.out.println();

        Animal untaSusuPutih = new Animal("Unta Susu Putih", 3, "Unta");
        untaSusuPutih.printInfo();

        Animal untaSusuCoklat = new Animal("Unta Susu Coklat", 4, "Unta");
        untaSusuCoklat.printInfo();
        int totalDosisUnta = Animal.getTotalDosis("Unta", untaSusuPutih, untaSusuCoklat);
        System.out.println("Total dosis untuk Unta\t\t: " + totalDosisUnta + "mL");
        System.out.println("=".repeat(50));
        System.out.println();

        Animal dombaBuluHitam = new Animal("Domba Bulu Hitam", 4, "Domba");
        dombaBuluHitam.printInfo();

        Animal dombaBuluPutih = new Animal("Domba Bulu Putih", 6, "Domba");
        dombaBuluPutih.printInfo();
        int totalDosisDomba = Animal.getTotalDosis("Domba", dombaBuluHitam, dombaBuluPutih);
        System.out.println("Total dosis untuk Domba\t\t: " + totalDosisDomba + "mL");
        System.out.println("=".repeat(50));
        System.out.println();

    }
}
