public class mainPeternakan {
    public static void main(String[] args) {
        Ternak[] ternaks = new Ternak[6];
        ternaks[0] = new Ternak("Bebek", "Telur biasa", 15, 5.0);
        ternaks[1] = new Ternak("Bebek", "Telur asin", 10, 8.0);
        ternaks[2] = new Ternak("Unta", "Susu putih", 3, 10.0);
        ternaks[3] = new Ternak("Unta", "Susu coklat", 4, 15.0);
        ternaks[4] = new Ternak("Domba", "Bulu hitam", 4, 9.0);
        ternaks[5] = new Ternak("Domba", "Bulu putih", 6, 14.0);

        double totalDosis = 0.0;

        for (int i = 0; i < ternaks.length; i++) {
            if (i == 0 || !ternaks[i].getJenis().equals(ternaks[i - 1].getJenis())) {
                System.out.println();
                System.out.println("Jenis\t\t\t: " + ternaks[i].getJenis());
                System.out.println("-------------------------------------");
            }
            System.out.println("Ras\t\t\t: " + ternaks[i].getRas());
            System.out.println("Jumlah\t\t\t: " + ternaks[i].getJumlah() + " ekor");
            System.out.println("Dosis obat/ekor/hari\t: " + ternaks[i].getDosis() + " mL");
            double dosisObat = ternaks[i].hitungDosisObat();
            System.out.println("-------------------------------------");
            System.out.println("Jumlah dosis obat/hari\t: " + dosisObat + " mL");
            double dosisObatTwice = ternaks[i].hitungDosisObat(2.0);
            System.out.println("Jumlah dosis obat/hari\t: " + dosisObatTwice + " mL");
            System.out.println("Total dosis obat/hari\t: " + dosisObatTwice + " mL ");
        }
    }
}
