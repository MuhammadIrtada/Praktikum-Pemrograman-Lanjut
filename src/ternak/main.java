

public class  main {

    public static void main(String[] args) {

        
        // Membuat objek untuk setiap jenis hewan
        Peternakan bebekBiasa = new Peternakan("Bebek", 15, "Bebek ras telur biasa");
        Peternakan bebekAsin = new Peternakan("Bebek", 10, "Bebek ras telur asin");
        Peternakan untaPutih = new Peternakan("Unta", 3, "Unta ras susu putih");
        Peternakan untaCoklat = new Peternakan("Unta", 4, "Unta ras susu coklat");
        Peternakan dombaHitam = new Peternakan("Domba", 4, "Domba ras bulu hitam");
        Peternakan dombaPutih = new Peternakan("Domba", 6, "Domba ras bulu putih");
        
        // Menampilkan dosis obat yang dibutuhkan setiap hari untuk tiap jenis ras hewan ternak

        System.out.println("Dosis obat yang dibutuhkan setiap hari: ");
        System.out.println(bebekBiasa.getJenisRas()+ "\t: " + bebekBiasa.hitungDosisObat() + " mL");
        System.out.println(bebekAsin.getJenisRas() + "\t: " + bebekAsin.getDosisObat()+ " mL");
        System.out.println("Total  dosis obat/hari\t: "+( bebekAsin.hitungDosisObat()+bebekBiasa.hitungDosisObat())+ " mL");
        System.out.println("===============================");
        System.out.println("Dosis obat yang dibuthkan setiap hari: ");
        System.out.println(untaPutih.getJenisRas()+"\t:"+ untaPutih.hitungDosisObat()+ " mL");
        System.out.println(untaCoklat.getJenisRas()+"\t:"+untaCoklat.hitungDosisObat()+ " mL");
        System.out.println("Total dosis obat/hari\t: "+ (untaPutih.hitungDosisObat()+ untaCoklat.hitungDosisObat())+ " mL");
        System.out.println("===============================");
        System.out.println("Dosis obat yang dibutuhkan setiap hari: ");
        System.out.println(dombaHitam.getJenisRas()+"\t:"+ dombaHitam.hitungDosisObat()+ " mL");
        System.out.println(dombaPutih.getJenisRas()+"\t:"+ dombaPutih.hitungDosisObat()+ " mL");
        System.out.println("Total dosis obat/hari\t: "+(dombaHitam.hitungDosisObat()+dombaPutih.hitungDosisObat())+ " mL");
    }
    
}
