public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Membuat objek Peternak untuk setiap jenis hewan ternak
        Peternak bebek1 = new Peternak("Bebek", "Telur Biasa", 15, 5);
        Peternak bebek2 = new Peternak("Bebek", "Telur Asin", 10, 8);
        Peternak unta1 = new Peternak("Unta", "Susu Putih", 3, 10);
        Peternak unta2 = new Peternak("Unta", "Susu Coklat", 4, 15);
        Peternak domba1 = new Peternak("Domba", "Bulu Hitam", 4, 9);
        Peternak domba2 = new Peternak("Domba", "Bulu Putih", 6, 14);

        System.out.println("Jenis\t\t\t : " + bebek1.getjenisHewan());
        System.out.println("---------------------------------------");
        System.out.println("Ras\t\t\t : " + bebek1.getras());
        System.out.println("Jumlah\t\t\t : " + bebek1.getjumlahHewan() + " Ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + bebek1.getdosis() + " ml");
        System.out.println("---------------------------------------");
        System.out.println("Ras\t\t\t : " + bebek2.getras());
        System.out.println("Jumlah\t\t\t : " + bebek2.getjumlahHewan() + " Ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + bebek2.getdosis() + " ml");
        System.out.println("=======================================");
        bebek1.sethitungDosisPerHari(15, 5);
        System.out.println("Jumlah dosis obat/hari\t : " + bebek1.gethitungDosisPerHari() + " ml");
        bebek2.sethitungDosisPerHari(10, 8);
        System.out.println("Jumlah dosis obat/hari\t : " + bebek2.gethitungDosisPerHari() + " ml");
        System.out.println("Total dosis obat/hari \t : "
                + (bebek1.gethitungDosisPerHari() + bebek2.gethitungDosisPerHari()) + " ml");
        System.out.println("=======================================\n");

        System.out.println("Jenis\t\t\t : " + unta1.getjenisHewan());
        System.out.println("---------------------------------------");
        System.out.println("Ras\t\t\t : " + unta1.getras());
        System.out.println("Jumlah\t\t\t : " + unta1.getjumlahHewan() + " Ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + unta1.getdosis() + " ml");
        System.out.println("---------------------------------------");
        System.out.println("Ras\t\t\t : " + unta2.getras());
        System.out.println("Jumlah\t\t\t : " + unta2.getjumlahHewan() + " Ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + unta2.getdosis() + " ml");
        System.out.println("=======================================");
        unta1.sethitungDosisPerHari(3, 10);
        System.out.println("Jumlah dosis obat/hari\t : " + unta1.gethitungDosisPerHari() + " ml");
        unta2.sethitungDosisPerHari(4, 15);
        System.out.println("Jumlah dosis obat/hari\t : " + unta2.gethitungDosisPerHari() + " ml");
        System.out.println("Total dosis obat/hari \t : "
                + (unta1.gethitungDosisPerHari() + unta2.gethitungDosisPerHari()) + " ml");
        System.out.println("=======================================\n");

        System.out.println("Jenis\t\t\t : " + domba1.getjenisHewan());
        System.out.println("---------------------------------------");
        System.out.println("Ras\t\t\t : " + domba1.getras());
        System.out.println("Jumlah\t\t\t : " + domba1.getjumlahHewan() + " Ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + domba1.getdosis() + " ml");
        System.out.println("---------------------------------------");
        System.out.println("Ras\t\t\t : " + domba2.getras());
        System.out.println("Jumlah\t\t\t : " + domba2.getjumlahHewan() + " Ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + domba2.getdosis() + " ml");
        System.out.println("=======================================");
        domba1.sethitungDosisPerHari(4, 9);
        System.out.println("Jumlah dosis obat/hari\t : " + domba1.gethitungDosisPerHari() + " ml");
        domba2.sethitungDosisPerHari(6, 14);
        System.out.println("Jumlah dosis obat/hari\t : " + domba2.gethitungDosisPerHari() + " ml");
        System.out.println("Total dosis obat/hari \t : "
                + (domba1.gethitungDosisPerHari() + domba2.gethitungDosisPerHari()) + " ml");
        System.out.println("=======================================\n");
    }
}
