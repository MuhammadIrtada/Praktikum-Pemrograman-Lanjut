abstract class Perkebunan {
    private double jumlahTumbuhan;
    private String jenis;
    private double hargaJual;
    private double jumlahHasilkanPerHari;
    private double perawatan;

    public Perkebunan(String jenis, double jumlahTumbuhan, double hargaJual, double jumlahHasilkanPerHari,
            double perawatan) {
        this.jenis = jenis;
        this.jumlahTumbuhan = jumlahTumbuhan;
        this.hargaJual = hargaJual;
        this.jumlahHasilkanPerHari = jumlahHasilkanPerHari;
        this.perawatan = perawatan;

    }

    abstract double penghasilan();

    abstract double totalbiaya();

    abstract double pendapatan();


    public double getJumlahTumbuhan() {
        return this.jumlahTumbuhan;
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
