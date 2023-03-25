public class Ternak {
    private String jenis;
    private String ras1;
    private String ras2;
    private int banyak1;
    private int banyak2;
    private int dosis1;
    private int dosis2;

    public Ternak (String j) {
        this.jenis = j;
    }

    public Ternak (String r1, int b1, int d1, String r2, int b2, int d2) {
        this.ras1 = r1;
        this.banyak1 = b1;
        this.dosis1 = d1;
        this.ras2 = r2;
        this.banyak2 = b2;
        this.dosis2 = d2;
    }

    public void setJenis(String j) {
        jenis = j;
    }
    public void setRas1(String r1) {
        ras1 = r1;
    }
    public void setBanyak1(int b1) {
        banyak1 = b1;
    }
    public void setDosis1(int d1) {
        dosis1 = d1;
    }
    public void setRas2(String r2) {
        ras2 = r2;
    }
    public void setBanyak2(int b2) {
        banyak2 = b2;
    }
    public void setDosis2(int d2) {
        dosis2 = d2;
    }

    public void displayMessage1() {
        System.out.println("Jenis\t\t\t: " + jenis);
        System.out.println("--------------------------------------");
    }
    public void displayMessage2() {
        System.out.println("Ras\t\t\t: " + ras1);
        System.out.println("Jumlah\t\t\t: " + banyak1 + " ekor");
        System.out.println("Dosis obat/ekor/hari\t: " + dosis1 + "mL");
        System.out.println("--------------------------------------");
        System.out.println("Ras\t\t\t: " + ras2);
        System.out.println("Jumlah\t\t\t: " + banyak2 + " ekor");
        System.out.println("Dosis obat/ekor/hari\t: " + dosis2 + "mL");
        System.out.println("--------------------------------------");
    
        System.out.println("Jumlah dosis obat/hari\t: " + (banyak1*dosis1) + "mL");
        System.out.println("Jumlah dosis obat/hari\t: " + (banyak2*dosis2) + "mL");
        System.out.println("Total dosis obat/hari\t: " + ((banyak1*dosis1)+(banyak2*dosis2)) + "mL");
        System.out.println("======================================\n");
    }
}