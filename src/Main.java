public class Main {
    public static void main(String[] args) throws Exception {
        Ternak jenis = new Ternak("Bebek");
        System.out.println("Jenis\t\t\t: " + jenis.getJenis() +"\n------------------------------------------");
        Ternak bebekBiasa = new Ternak("Telur biasa", 15, 5);
        bebekBiasa.displayDosis();

        Ternak bebekAsin = new Ternak("Telur asin", 10, 8);
        bebekAsin.displayDosis();
        System.out.println("Jumlah dosis obat/hari\t: " + (bebekBiasa.getDosis() * bebekBiasa.getJumlah()) + "mL");
        System.out.println("Jumlah dosis obat/hari\t: " + (bebekAsin.getDosis()*bebekAsin.getJumlah()) + "mL");
        System.out.println("Total dosis obat/hari\t: " + ((bebekBiasa.getDosis()*bebekBiasa.getJumlah())+(bebekAsin.getDosis()*bebekAsin.getJumlah())) + "mL"+ "\n==========================================" + "\n");

        Ternak jenis2 = new Ternak("Unta");
        System.out.println("Jenis\t\t\t: " + jenis2.getJenis() +"\n------------------------------------------");
        Ternak untaPutih = new Ternak("Susu putih", 3, 10);
        untaPutih.displayDosis();

        Ternak untaCoklat = new Ternak("Susu coklat", 4, 15);
        untaCoklat.displayDosis();
        System.out.println("Jumlah dosis obat/hari\t: " + (untaPutih.getDosis() * untaPutih.getJumlah()) + "mL");
        System.out.println("Jumlah dosis obat/hari\t: " + (untaCoklat.getDosis()*untaCoklat.getJumlah()) + "mL");
        System.out.println("Total dosis obat/hari\t: " + ((untaPutih.getDosis()*untaPutih.getJumlah())+(untaCoklat.getDosis()*untaCoklat.getJumlah())) + "mL"+ "\n==========================================" + "\n");

        Ternak jenis3 = new Ternak("Domba");
        System.out.println("Jenis\t\t\t: " + jenis3.getJenis() +"\n------------------------------------------");
        Ternak dombaHitam = new Ternak("Bulu hitam", 4, 9);
        dombaHitam.displayDosis();

        Ternak dombaPutih = new Ternak("Bulu putih", 6, 14);
        dombaPutih.displayDosis();
        System.out.println("Jumlah dosis obat/hari\t: " + (dombaHitam.getDosis() * dombaHitam.getJumlah()) + "mL");
        System.out.println("Jumlah dosis obat/hari\t: " + (dombaPutih.getDosis()*dombaPutih.getJumlah()) + "mL");
        System.out.println("Total dosis obat/hari\t: " + ((dombaHitam.getDosis()*dombaHitam.getJumlah())+(dombaPutih.getDosis()*dombaPutih.getJumlah())) + "mL"+ "\n==========================================" + "\n");
    }
}
