import java.text.DecimalFormat;

public abstract class Hewan {
    static private DecimalFormat formatter = new DecimalFormat("#,###.##");
    private String jenis;
    private double pendapatan;
    private double perawatan;
    static private double totalPendapatan;
    static private double totalPerawatan;

    Hewan() {
    }

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
    public void getDetail(Hewan[] allHewan) {
        System.out.println("=".repeat(40));
        System.out.println("   Pendapatan Penjualan Hasil Ternak");
        System.out.println("=".repeat(40));
        for (Hewan h : allHewan) {
            System.out.printf("%-15s %20s\n", h.getJenis() + ":", "Rp " + formatter.format(h.pendapatan()));
        }
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ", "Rp " + formatter.format(getTotalPendapatan()));

        System.out.println("=".repeat(40));
        System.out.println("\t    Biaya Perawatan");
        System.out.println("=".repeat(40));
        for (Hewan h : allHewan) {
            System.out.printf("%-15s %20s\n", h.getJenis() + ":", "Rp " + formatter.format(h.perawatan()));
        }
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ", "Rp " + formatter.format(getTotalPerawatan()));

    }

    // abstract
    public abstract double pendapatan();

    public abstract double perawatan();
}
