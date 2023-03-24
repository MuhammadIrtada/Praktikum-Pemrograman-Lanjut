public class main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");

        System.out.println("-Bebek Telur biasa   = 15 ekor");
        System.out.println("-Bebek Telur asin    = 10 ekor");
        System.out.println("-Unta Susu putih     = 3 ekor");
        System.out.println("-Unta Susu coklat    = 4 ekor");
        System.out.println("-Domba Bulu hitam    = 4 ekor");
        System.out.println("-Domba Bulu putih    = 6 ekor");

        System.out.println("=======================================================");

        Animal bebekBiasa = new Animal("-Bebek", "Telur biasa", 15);
        Animal bebekAsin = new Animal("-Bebek", "Telur asin", 10);
        Animal untaPutih = new Animal("-Unta", "Susu putih", 3);
        Animal untaCoklat = new Animal("-Unta", "Susu coklat", 4);
        Animal dombaHitam = new Animal("-Domba", "Bulu hitam", 4);
        Animal dombaPutih = new Animal("-Domba", "Bulu putih", 6);

        System.out.println(bebekBiasa.toString());
        System.out.println(bebekAsin.toString());
        System.out.println(untaPutih.toString());
        System.out.println(untaCoklat.toString());
        System.out.println(dombaHitam.toString());
        System.out.println(dombaPutih.toString());

        double totalDosisBebek = bebekBiasa.hitungDosis() + bebekAsin.hitungDosis();
        double totalDosisUnta = untaPutih.hitungDosis() + untaCoklat.hitungDosis();
        double totalDosisDomba = dombaHitam.hitungDosis() + dombaPutih.hitungDosis();

        System.out.println("=======================================================");

        System.out.println("-Total dosis untuk bebek: " + totalDosisBebek + "mL/hari");
        System.out.println("-Total dosis untuk unta : " + totalDosisUnta + "mL/hari");
        System.out.println("-Total dosis untuk domba: " + totalDosisDomba + "mL/hari");

        double dosisPerEkorBebekBiasa = bebekBiasa.hitungDosis() / bebekBiasa.getJumlah();
        double dosisPerEkorBebekAsin = bebekAsin.hitungDosis() / bebekAsin.getJumlah();
        double dosisPerEkorUntaPutih = untaPutih.hitungDosis() / untaPutih.getJumlah();
        double dosisPerEkorUntaCoklat = untaCoklat.hitungDosis() / untaCoklat.getJumlah();
        double dosisPerEkorDombaHitam = dombaHitam.hitungDosis() / dombaHitam.getJumlah();
        double dosisPerEkorDombaPutih = dombaPutih.hitungDosis() / dombaPutih.getJumlah();

        System.out.println("=======================================================");

        System.out.println("-Dosis per ekor bebek ras telur biasa: " + dosisPerEkorBebekBiasa + "mL/hari");
        System.out.println("-Dosis per ekor bebek ras telur asin : " + dosisPerEkorBebekAsin + "mL/hari");
        System.out.println("-Dosis per ekor unta ras susu putih  : " + dosisPerEkorUntaPutih + "mL/hari");
        System.out.println("-Dosis per ekor unta ras susu coklat : " + dosisPerEkorUntaCoklat + "mL/hari");
        System.out.println("-Dosis per ekor domba ras bulu hitam : " + dosisPerEkorDombaHitam + "mL/hari");
        System.out.println("-Dosis per ekor domba ras bulu putih : " + dosisPerEkorDombaPutih + "mL/hari");
        System.out.println("-------------------------------------------------------");

    }
}
