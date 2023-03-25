package src;

public class HewanTernak {

    private String ras;
    private int jumlah;
    private int dosis;

    public HewanTernak(String ras, int jumlah, int dosis) {
        this.ras = ras;
        this.jumlah = jumlah;
        this.dosis = dosis;
    }

    public HewanTernak(String ras, int jumlah) {
        this(ras, jumlah, 0);
    }

    public int hitungDosis() {
        return jumlah * dosis;
    }

    public int hitungDosis(int dosis) {
        return jumlah * dosis;
    }

    public String getRas() {
        return ras;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getDosis() {
        return dosis;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    // main method
    public static void main(String[] args) {

        // membuat objek untuk tiap jenis hewan ternak
        HewanTernak bebek1 = new HewanTernak("Telur Biasa", 15, 5);
        HewanTernak bebek2 = new HewanTernak("Telur Asin", 10, 8);
        HewanTernak unta1 = new HewanTernak("Susu Putih", 3, 10);
        HewanTernak unta2 = new HewanTernak("Susu Coklat", 4, 15);
        HewanTernak domba1 = new HewanTernak("Bulu Hitam", 4, 9);
        HewanTernak domba2 = new HewanTernak("Bulu Putih", 6, 14);

        int a = bebek1.hitungDosis();
        int b = bebek2.hitungDosis();
        int c = unta1.hitungDosis();
        int d = unta2.hitungDosis();
        int e = domba1.hitungDosis();
        int f = domba2.hitungDosis();

        // menampilkan output untuk tiap objek
        System.out.println("\nJenis\t\t\t : Bebek");
        System.out.println("-----------------------------------------");
        System.out.println("Ras\t\t\t : " + bebek1.getRas());
        System.out.println("Jumlah\t\t\t : " + bebek1.getJumlah() + " ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + bebek1.getDosis() + "mL");
        System.out.println("-----------------------------------------");
        System.out.println("Ras\t\t\t : " + bebek2.getRas());
        System.out.println("Jumlah\t\t\t : " + bebek2.getJumlah() + " ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + bebek2.getDosis() + "mL");
        System.out.println("-----------------------------------------");
        System.out.println("Jumlah dosis obat/hari\t : " + a + "mL");
        System.out.println("Jumlah dosis obat/hari\t : " + b + "mL");
        System.out.println("Total dosis obat/hari\t : " + (a + b));
        System.out.println("=========================================");

        System.out.println("\nJenis\t\t\t : Unta");
        System.out.println("-----------------------------------------");
        System.out.println("Ras\t\t\t : " + unta1.getRas());
        System.out.println("Jumlah\t\t\t : " + unta1.getJumlah() + " ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + unta1.getDosis() + "mL");
        System.out.println("-----------------------------------------");
        System.out.println("Ras\t\t\t : " + unta2.getRas());
        System.out.println("Jumlah\t\t\t : " + unta2.getJumlah() + " ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + unta2.getDosis() + "mL");
        System.out.println("-----------------------------------------");
        System.out.println("Jumlah dosis obat/hari\t : " + c + "mL");
        System.out.println("Jumlah dosis obat/hari\t : " + d + "mL");
        System.out.println("Total dosis obat/hari\t : " + (c + d));
        System.out.println("=========================================");

        System.out.println("\nJenis\t\t\t : Domba");
        System.out.println("-----------------------------------------");
        System.out.println("Ras\t\t\t : " + domba1.getRas());
        System.out.println("Jumlah\t\t\t : " + domba1.getJumlah() + " ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + domba1.getDosis() + "mL");
        System.out.println("-----------------------------------------");
        System.out.println("Ras\t\t\t : " + domba2.getRas());
        System.out.println("Jumlah\t\t\t : " + domba2.getJumlah() + " ekor");
        System.out.println("Dosis obat/ekor/hari\t : " + domba2.getDosis() + "mL");
        System.out.println("-----------------------------------------");
        System.out.println("Jumlah dosis obat/hari\t : " + e + "mL");
        System.out.println("Jumlah dosis obat/hari\t : " + f + "mL");
        System.out.println("Total dosis obat/hari\t : " + (e + f));
        System.out.println("=========================================");
    }

}
