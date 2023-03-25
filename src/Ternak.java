public class Ternak {

    public String jenis;
    public String ras;
    public int jumlah;
    public int dosis;

    public String getJenis() {
        return jenis;
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

    public Ternak(String jenis) {
        this.jenis = jenis;
    }

    public Ternak(String ras, int jumlah, int dosis) {
        this.ras = ras;
        this.jumlah = jumlah;
        this.dosis = dosis;
    }

    public void displayDosis() {
        System.out.println("Ras\t\t\t: " + ras);
        System.out.println("Jumlah\t\t\t: " + jumlah + " ekor");
        System.out.println("Dosis obat/ekor/hari\t: " + dosis + "mL" + "\n------------------------------------------");
    }

    public void displayDosis(int dosis) {
        this.dosis = dosis;
        displayDosis();
    }
}
