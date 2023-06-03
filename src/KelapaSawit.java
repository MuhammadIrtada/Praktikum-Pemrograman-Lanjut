public class KelapaSawit extends Perkebunan {
    private double pendapatan;
    private double penghasilansec;
    private double totalbiayasec;

    public KelapaSawit(String jenis, double jumlahTumbuhan, double hargaJual, double jumlahHasilkanPerHari,
            double perawatan) {
        super(jenis, jumlahTumbuhan, hargaJual, jumlahHasilkanPerHari, perawatan);
    }

    @Override
    double pendapatan() {
        return pendapatan += ((penghasilan() - totalbiayasec));
    }

    @Override
    double penghasilan() {
        return penghasilansec += ((super.getJumlahTumbuhan() * super.getHargaJual() * super.getJumlahHasilkanPerHari())
                * 30);
    }

    @Override
    double totalbiaya() {
        return totalbiayasec += ((super.getJumlahTumbuhan() * super.getPerawatan()) * 30);
    }

}
