
public abstract class Hewan {
    protected String jenisHewan;
    protected int jumlahHewan;
    protected int hargaBeli;
    protected int hasilProduksi;
    protected int hargaProduksi;
//
    public Hewan(String jenisHewan, int jumlahHewan, int hargaBeli, int hasilProduksi, int hargaProduksi) {
        this.jenisHewan = jenisHewan;
        this.jumlahHewan = jumlahHewan;
        this.hargaBeli = hargaBeli;
        this.hasilProduksi = hasilProduksi;
        this.hargaProduksi = hargaProduksi;
    }
//
    public String getJenisHewan() {
        return jenisHewan;
    }

    public int getJumlahHewan() {
        return jumlahHewan;
    }
//
    public int getHargaBeli() {
        return hargaBeli;
    }
//
    public int getHasilProduksi() {
        return hasilProduksi;
    }

    public int getHargaProduksi() {
        return hargaProduksi;
    }

    public abstract int hitungProfit();
}