import java.text.DecimalFormat;

public abstract class Tanaman {
    static DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;
    private double perawatan;
    private double penghasilan;
    private double ttlPenghasilan;
    private double ttlPerawatan;
    static double totalPenghasilan = 0;
    static double totalPerawatan = 0;


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getPerawatan() {
        return perawatan;
    }

    public void setPerawatan(double perawatan) {
        this.perawatan = perawatan;
    }

    public double getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    public double getTtlPenghasilan() {
        return ttlPenghasilan;
    }

    public void setTtlPenghasilan(double ttlPenghasilan) {
        this.ttlPenghasilan = ttlPenghasilan;
    }

    public double getTtlPerawatan() {
        return ttlPerawatan;
    }

    public void setTtlPerawatan(double ttlPerawatan) {
        this.ttlPerawatan = ttlPerawatan;
    }
    public static double getTotalPenghasilan() {
        return totalPenghasilan;
    }
    public static double getTotalPerawatan() {
        return totalPerawatan;
    }

    // memanggil
    public static void penghasilan(Tanaman[] tanamans) {
        System.out.println("========================================");
        System.out.println("   Pendapatan Penjualan Hasil Kebun");
        System.out.println("========================================");
        for (int i = 0; i < tanamans.length; i++) {
            if (tanamans[i].getJenis() == "Kelapa Sawit") {
                System.out.println(tanamans[i].getJenis() + ":\tRp." + formatter.format(tanamans[i].pendapatan()));
            } else {
                System.out.println(tanamans[i].getJenis() + ":\t\tRp." + formatter.format(tanamans[i].pendapatan()));
            }
            totalPenghasilan+=tanamans[i].pendapatan();
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:\t\tRp." + formatter.format(totalPenghasilan));
    }
    public static void Perawatans(Tanaman[] tanamans) {
        System.out.println("========================================");
        System.out.println("           Biaya Perawatan");
        System.out.println("========================================");
        for (int i = 0; i < tanamans.length; i++) {
            if (tanamans[i].getJenis() == "Kelapa Sawit") {
                System.out.println(tanamans[i].getJenis() + ":\tRp." + formatter.format(tanamans[i].perawatan()));
            } else {
                System.out.println(tanamans[i].getJenis() + ":\t\tRp." + formatter.format(tanamans[i].perawatan()));
            }
            totalPerawatan+=tanamans[i].perawatan();
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:\t\tRp." + formatter.format(totalPerawatan));
    }
    // abstract
    public abstract double pendapatan();

    public abstract double perawatan();
}
