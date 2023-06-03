public class Bebek extends Peternakan {
    private double pendapatan;
    private double penghasilansec;
    private double totalbiayasec;

    public Bebek(String jenis, double jumlahHewan, double hargaJual, double jumlahHasilkanPerHari, double perawatan) {
        super(jenis, jumlahHewan, hargaJual, jumlahHasilkanPerHari, perawatan);
    }

    @Override
    double pendapatan() {
        return pendapatan += ((penghasilan() - totalbiayasec));
    }

    @Override
    double penghasilan() {
        return penghasilansec += ((super.getJumlahHewan() * super.getHargaJual() * super.getJumlahHasilkanPerHari())
                * 30);
    }

    @Override
    double totalbiaya() {
        return totalbiayasec += ((super.getJumlahHewan() * super.getPerawatan()) * 30);
    }

}
