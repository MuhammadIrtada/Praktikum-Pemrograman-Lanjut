
public class Apel extends Tanaman {
    private int jumlahBuah;
    private double hargaBuah;
    private double perawatanApel;

    public Apel(String jenis, int luas, double harga, int jumlahBuah,
            double hargaBuah, double perawatanApel) {
        super(jenis, luas, harga);
        this.jumlahBuah = jumlahBuah;
        this.hargaBuah = hargaBuah;
        this.perawatanApel = perawatanApel;
    }

    public int getTotalBuah() {
        return this.jumlahBuah * super.getLuas();
    }

    public double perawatan() {
        return super.getLuas() * this.getPerawatanApel() * 30;

    }

    public double pendapatan() {
        return this.getHargaBuah() * getTotalBuah() * 30;
    }

    public int getJumlahBuah() {
        return jumlahBuah;
    }

    public void setJumlahBuah(int jumlahBuah) {
        this.jumlahBuah = jumlahBuah;
    }

    public double getHargaBuah() {
        return hargaBuah;
    }

    public void setHargaBuah(double hargaBuah) {
        this.hargaBuah = hargaBuah;
    }

    public double getPerawatanApel() {
        return perawatanApel;
    }

    public void setPerawatanApel(double perawatanApel) {
        this.perawatanApel = perawatanApel;
    }

}
