
public class Hewan {
    private String jenis;
    private String ras;
    private int jumlah;
    private int dosis;
    private static int jumlahJenis;
    private static int[] totalDosis = new int[2];

    public Hewan (String jenis, int jumlah, int dosis){
        jumlahJenis++;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.dosis = dosis;
        totalDosis[jumlahJenis-1] = getJumlahDosis();
        switch(jenis.toLowerCase()){
            case "bebek":
                this.ras = "Telur biasa";
                break;
            case "unta":
                this.ras = "Susu putih";
                break;
            case "domba":
                this.ras = "Bulu hitam";
                break;
            default:
                this.ras = "Ras biasa";
        }

    }

    public Hewan (String jenis, String ras, int jumlah, int dosis){
        jumlahJenis++;
        this.jenis = jenis;
        this.ras = ras;
        this.jumlah = jumlah;
        this.dosis = dosis;
        totalDosis[jumlahJenis-1] = getJumlahDosis();

    }

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

    public int getJumlahDosis(){
        return dosis*jumlah;
    }

    public int getJumlahDosis(int dosis1, int dosis2){
        return dosis1 + dosis2;
    }


    @Override
    public String toString() {
        return String.format("Ras\t\t\t\t\t\t: %s\nJumlah\t\t\t\t\t: %d ekor\nDosis obat/ekor/hari\t: %dmL\n%s", getRas(), getJumlah(), getDosis(), "-".repeat(37));
    }

    public void printJenis(){
        System.out.printf("Jenis\t\t\t\t\t: %s\n%s\n", getJenis(), "-".repeat(37));
    }

    public void printJumlahDosis() {
        System.out.printf("Jumlah dosis obat/hari\t: %dmL\n", getJumlahDosis());
    }

    public void printTotalDosis() {
        System.out.printf("Total dosis obat/hari\t: %dmL\n%s\n\n", getJumlahDosis(totalDosis[0], totalDosis[1]), "=".repeat(37));
        totalDosis[0] = 0;
        totalDosis[1] = 0;
        jumlahJenis = 0;
    }


}
