abstract class Peternakan {
    private double jumlahHewan;
    private String jenis;
    private double hargaJual;
    private double jumlahHasilkanPerHari;
    private double perawatan;

    public Peternakan(String jenis, double jumlahHewan, double hargaJual, double jumlahHasilkanPerHari,
            double perawatan) {
        this.jenis = jenis;
        this.jumlahHewan = jumlahHewan;
        this.hargaJual = hargaJual;
        this.jumlahHasilkanPerHari = jumlahHasilkanPerHari;
        this.perawatan = perawatan;
    }

    abstract double penghasilan();

    abstract double totalbiaya();

    abstract double pendapatan();

    public double getJumlahHewan() {
        return this.jumlahHewan;
    }

    public double getHargaJual() {
        return this.hargaJual;
    }

    public double getJumlahHasilkanPerHari() {
        return this.jumlahHasilkanPerHari;
    }

    public double getPerawatan() {
        return this.perawatan;
    }

}
