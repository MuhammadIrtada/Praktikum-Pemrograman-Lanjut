import java.util.ArrayList;

public class Peternakan {
    private String binatang = "Binatang";
    private String ras = "Ras Binatang";
    private int jml = 0;
    private int dosis = 0;
    private static ArrayList<Peternakan> ternak = new ArrayList<Peternakan>();
    private static ArrayList<String> namaBinatang = new ArrayList<String>();

    Peternakan(String binatang, String ras, int jml) {
        ternak.add(this);
        if (!namaBinatang.contains(binatang)) {
            namaBinatang.add(binatang);
        }
        this.ras = ras;
        this.binatang = binatang;
        this.jml = jml;
    }

    Peternakan() {
        ternak.add(this);
    }

    public void setBinatang(String binatang) {
        this.binatang = binatang;
        if (!namaBinatang.contains(binatang)) {
            namaBinatang.add(binatang);
        }

    }

    public void setJumlah(int jml) {
        this.jml = jml;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public void setDosis(int booster) {
        dosis = booster;
    }

    public static void display() {
        for (int i = 0; i < namaBinatang.size(); i++) {
            display(namaBinatang.get(i));
        }
    }

    public static void display(String binatang) {

        System.out.printf("Jenis\t\t\t: %s\n", binatang);
        System.out.println("-".repeat(40));
        for (int i = 0; i < ternak.size(); i++) {
            if (ternak.get(i).binatang.equalsIgnoreCase(binatang)) {
                System.out.printf("Ras\t\t\t: %s\n", ternak.get(i).ras);
                System.out.printf("Jumlah\t\t\t: %d ekor\n", ternak.get(i).jml);
                System.out.printf("Dosis obat/ekor\t\t: %d mL\n", ternak.get(i).dosis);
                System.out.println("-".repeat(40));
            }
        }
        int hitung = 0;
        for (int i = 0; i < ternak.size(); i++) {
            if (ternak.get(i).binatang.equalsIgnoreCase(binatang)) {
                System.out.printf("Jumlah dosis obat/hari\t: %d mL\n",
                        ternak.get(i).dosis * ternak.get(i).jml);
                hitung += ternak.get(i).dosis * ternak.get(i).jml;
            }

        }
        System.out.println("Total dosis obat/hari\t: " + hitung + " mL");
        System.out.println("=".repeat(40));
    }

}