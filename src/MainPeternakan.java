public class MainPeternakan {
    public static void main(String[] args) {
        Peternakan bebekBiasa = new Peternakan("Bebek", "Telur Biasa", 15);
        bebekBiasa.hitungDosis();
        System.out.println("Jenis : " + bebekBiasa.getJenis());
        System.out.println("--------------------------");
        bebekBiasa.tampilkanData();

        Peternakan bebekAsin = new Peternakan("Bebek", "Telur Asin", 10);
        bebekAsin.hitungDosis();
        bebekAsin.tampilkanData();

        double jumlahDosis = bebekBiasa.getDosis() + bebekAsin.getDosis();
        System.out.println("Jumlah dosis obat/hari : " + (int)bebekBiasa.getDosis() + "mL");
        System.out.println("Jumlah dosis obat/hari : " + (int)bebekAsin.getDosis()  + "mL");
        System.out.println("Total dosis obat/hari : " + (int)jumlahDosis + "mL");
        System.out.println("=========================\n");

        Peternakan untaPutih = new Peternakan("Unta", "Susu Putih", 3);
        System.out.println("Jenis : " + untaPutih.getJenis());
        System.out.println("--------------------------");
        untaPutih.hitungDosis();
        untaPutih.tampilkanData();
        Peternakan untaCoklat = new Peternakan("Unta", "Susu Coklat", 4);
        untaCoklat.hitungDosis();
        untaCoklat.tampilkanData();
        jumlahDosis = untaPutih.getDosis() + untaCoklat.getDosis();
        System.out.println("Jumlah dosis obat/hari : " + (int)untaPutih.getDosis() + "mL");
        System.out.println("Jumlah dosis obat/hari : " + (int)untaCoklat.getDosis()  + "mL");
        System.out.println("Total dosis obat/hari : " + (int)jumlahDosis + "mL");

        System.out.println("=========================\n");
        Peternakan dombaHitam = new Peternakan("Domba", "Bulu Hitam", 4);
        System.out.println("Jenis : " + dombaHitam.getJenis());
        System.out.println("--------------------------");
        dombaHitam.hitungDosis();
        dombaHitam.tampilkanData();

        Peternakan dombaPutih = new Peternakan("Domba", "Bulu Putih", 6);
        dombaPutih.hitungDosis();
        dombaPutih.tampilkanData();

        jumlahDosis = dombaHitam.getDosis() + dombaPutih.getDosis();
         System.out.println("Jumlah dosis obat/hari : " + (int)dombaHitam.getDosis() + "mL");
        System.out.println("Jumlah dosis obat/hari : " + (int)dombaPutih.getDosis()  + "mL");
        System.out.println("Total dosis obat/hari : " + (int)jumlahDosis + "mL");
        System.out.println("=========================\n");
    }
}
