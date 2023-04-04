public class Bebek {
    public String jenis = "Bebek";
    public String ras = "Telur Biasa";
    public int jumlah = 15;
    public int telur = 2;
    public int totalTelur = 30;
    public int hargaTelur = 2000;

    public void displayMessage() {
        System.out.println("Jenis\t\t\t: " + jenis);
        System.out.println("Ras\t\t\t: " + ras);
        System.out.println("Jumlah\t\t\t: " + jumlah + " ekor");
        System.out.println("Telur/Ekor\t\t: " + telur + " Butir");
        System.out.println("Total Telur/Hari\t: " + totalTelur + " Butir");
        System.out.println("Harga Telur/Butir\t: " + hargaTelur);
    }
    public void displayMessage4() {
        System.out.println("Jenis\t\t: " + jenis + " | " + ras);
        System.out.println("Pemasukkan\t: " + hitungPemasukkan(totalTelur, hargaTelur));
        System.out.println("-".repeat(50));
    }
    public int hitungPemasukkan(int totalTelur, int hargaTelur) {
        int pemasukkan = totalTelur*hargaTelur;
        return pemasukkan;
    }
}