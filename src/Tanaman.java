import java.text.DecimalFormat;

public abstract class Tanaman {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;
    private double pendapatan;
    private double perawatan;
    static private double totalPendapatan;
    static private double totalPerawatan;

    // setter getter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public double getPerawatan() {
        return this.perawatan;
    }

    public void setPerawatan(double perawatan) {
        this.perawatan = perawatan;
    }

    public double getTotalPendapatan() {
        return totalPendapatan;
    }

    public void setTotalPendapatan(double totalPendapat) {
        totalPendapatan += totalPendapat;
    }

    public double getTotalPerawatan() {
        return totalPerawatan;
    }

    public void setTotalPerawatan(double totalPerawat) {
        totalPerawatan += totalPerawat;
    }

    // methods
    public void getDetail(Tanaman[] allTanamans) {
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("   Pendapatan Penjualan Hasil Kebun");
        System.out.println("=".repeat(40));
        for (Tanaman t : allTanamans) {
            System.out.printf("%-15s %20s\n", t.getJenis() + ":", "Rp " + formatter.format(t.pendapatan()));
        }
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ", "Rp " + formatter.format(getTotalPendapatan()));

        System.out.println("=".repeat(40));
        System.out.println("\t    Biaya Perawatan");
        System.out.println("=".repeat(40));
        for (Tanaman t : allTanamans) {
            System.out.printf("%-15s %20s\n", t.getJenis() + ":", "Rp " + formatter.format(t.perawatan()));
        }
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ", "Rp " + formatter.format(getTotalPerawatan()));
    
    }

    // abstract
    public abstract double pendapatan();

    public abstract double perawatan();
}
