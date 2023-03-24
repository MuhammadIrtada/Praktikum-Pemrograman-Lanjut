public class Main {
    public static void main(String[] args) {

        Hewan[] Bebek = new Hewan[2];
        Hewan[] Unta = new Hewan[2];
        Hewan[] Domba = new Hewan[2];

        Bebek[0] = new Hewan("Bebek", 15, 5);
        Bebek[1] = new Hewan("Bebek", "Telur asin", 10, 8);
        printHewan(Bebek);

        Unta[0] = new Hewan("Unta", 3, 10);
        Unta[1] = new Hewan("Unta", "Susu coklat", 4, 15);
        printHewan(Unta);

        Domba[0] = new Hewan("Domba", 4, 9);
        Domba[1] = new Hewan("Domba", "Bulu putih", 6, 14);
        printHewan(Domba);

    }

    public static void printHewan(Hewan[] hewan){
        hewan[0].printJenis();
        for (int i = 0; i < hewan.length; i++) {
            System.out.println(hewan[i]);
        }
        for (int i = 0; i < hewan.length; i++) {
            hewan[i].printJumlahDosis();
        }
        hewan[0].printTotalDosis();
    }
}
