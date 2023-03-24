package Modul_3_4;

public class Main {
    public static void main(String[] args) {
        Animal bebek = new Animal(new String[][] { { "Telur biasa", "5" }, { "Telur asin", "8" } });
        bebek.printInfo("Bebek", 15, 10);

        Animal unta = new Animal(new String[][] { { "Susu putih", "10" }, { "Susu coklat", "15" } });
        unta.printInfo("unta", 3, 4);

        Animal domba = new Animal(new String[][] { { "Bulu hitam", "9" }, { "Bulu putih", "14" } });
        domba.printInfo("Domba", 4, 6);

    }
}
