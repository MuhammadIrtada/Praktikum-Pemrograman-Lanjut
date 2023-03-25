public class MainTernak {
    public static void main(String[] args) {
        Ternak bebek = new Ternak("Bebek");
        Ternak rincian = new Ternak(null, 0, 0, null, 0, 0);
        rincian.setRas1("Telur biasa");
        rincian.setBanyak1(15);
        rincian.setDosis1(5);
        rincian.setRas2("Telur asin");
        rincian.setBanyak2(10);
        rincian.setDosis2(8);

        Ternak unta = new Ternak("Unta");
        Ternak rincian2 = new Ternak("Susu putih", 3, 10, "Susu coklat", 4, 15);

        Ternak domba = new Ternak("Domba");
        Ternak rincian3 = new Ternak("Bulu hitam", 4, 9, "Bulu putih", 6, 14);

        bebek.displayMessage1();
        rincian.displayMessage2();
        unta.displayMessage1();
        rincian2.displayMessage2();
        domba.displayMessage1();
        rincian3.displayMessage2();   
    }
}
