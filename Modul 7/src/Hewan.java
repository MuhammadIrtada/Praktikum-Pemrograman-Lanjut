import java.text.DecimalFormat;

public abstract class Hewan {
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
        this.ttlPenghasilan += ttlPenghasilan;
    }

    public double getTtlPerawatan() {
        return ttlPerawatan;
    }

    public void setTtlPerawatan(double ttlPerawatan) {
        this.ttlPerawatan += ttlPerawatan;
    }
    public static double getTotalPenghasilan() {
        return totalPenghasilan;
    }
    public static double getTotalPerawatan() {
        return totalPerawatan;
    }

    // memanggil
    public static void penghasilan(Hewan[] hewans) {
        System.out.println("========================================");
        System.out.println("   Pendapatan Penjualan Hasil Ternak");
        System.out.println("========================================");
        for (int i = 0; i < hewans.length; i++) {
            System.out.println(hewans[i].getJenis() + ":\t\tRp." + formatter.format(hewans[i].pendapatan()));
            totalPenghasilan += hewans[i].pendapatan();
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:\t\tRp." + formatter.format(totalPenghasilan));
    }

    public static void Perawatans(Hewan[] Hewans) {
        System.out.println("========================================");
        System.out.println("           Biaya Perawatan");
        System.out.println("========================================");
        for (int i = 0; i < Hewans.length; i++) {
            System.out.println(Hewans[i].getJenis() + ":\t\tRp." + formatter.format(Hewans[i].perawatan()));
            totalPerawatan += Hewans[i].perawatan();
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:\t\tRp." + formatter.format(totalPerawatan));
    }

    // abstract
    public abstract double pendapatan();

    public abstract double perawatan();
}
