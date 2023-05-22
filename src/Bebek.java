public class Bebek extends Hewan {
    private int jumlah;
    private int items;
    private int harga;
    private int rawat;

    Bebek(int jumlah, int items, int harga, int rawat) {
        this.jumlah = jumlah;
        this.items = items;
        this.harga = harga;
        this.rawat = rawat;
        super.setJenis("Bebek");
        super.setTotalPendapatan(pendapatan());
        super.setTotalPerawatan(perawatan());
    }

    @Override
    public double pendapatan() {
        double rumus = this.jumlah * this.harga * this.items * 30;
        super.setPendapatan(rumus);
        return rumus;
    }

    @Override
    public double perawatan() {
        double rumus = this.jumlah * this.rawat * 30;
        super.setPerawatan(rumus);
        return rumus;
    }
}
