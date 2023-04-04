public class Domba {
    public String jenis = "Domba";
    public String ras = "Bulu Hitam";
    public int jumlah = 4;
    public int bulu = 4;
    public int totalBulu = 16;
    public int hargaBulu = 15000;

    public void displayMessage2() {
        System.out.println("Jenis\t\t\t: " + jenis);
        System.out.println("Ras\t\t\t: " + ras);
        System.out.println("Jumlah\t\t\t: " + jumlah + " ekor");
        System.out.println("Bulu/Ekor\t\t: " + bulu + " Kg");
        System.out.println("Total Bulu/Hari\t\t: " + totalBulu + " Kg");
        System.out.println("Harga Bulu/Kg\t\t: " + hargaBulu);
    }
    public void displayMessage5() {
        System.out.println("Jenis\t\t: " + jenis + " | " + ras);
        System.out.println("Pemasukkan\t: " + hitungPemasukkan(totalBulu, hargaBulu));
        System.out.println("-".repeat(50));
    }
    public int hitungPemasukkan(int totalBulu, int hargaBulu) {
        int pemasukkan = totalBulu*hargaBulu;
        return pemasukkan;
    }
}
