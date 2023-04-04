public class Unta {
    public String jenis = "Unta";
    public String ras = "Susu Putih";
    public int jumlah = 3;
    public int susu = 5;
    public int totalSusu = 15;
    public int hargaSusu = 60000;

    public void displayMessage3() {
        System.out.println("Jenis\t\t\t: " + jenis);
        System.out.println("Ras\t\t\t: " + ras);
        System.out.println("Jumlah\t\t\t: " + jumlah + " ekor");
        System.out.println("Susu/Ekor\t\t: " + susu + " liter");
        System.out.println("Total Susu/Hari\t\t: " + totalSusu + " liter");
        System.out.println("Harga Susu/Liter\t: " + hargaSusu);
    }
    public void displayMessage6() {
        System.out.println("Jenis\t\t: " + jenis + " | " + ras);
        System.out.println("Pemasukkan\t: " + hitungPemasukkan(totalSusu, hargaSusu));
        System.out.println("-".repeat(50));
    }
    public int hitungPemasukkan(int totalSusu, int hargaSusu) {
        int pemasukkan = totalSusu*hargaSusu;
        return pemasukkan;
    }
}
