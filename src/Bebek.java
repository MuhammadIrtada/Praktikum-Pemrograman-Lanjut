
public class Bebek extends Hewan {
    private int jumlahTelur;
    private double hargaTelur;
    private double perawatanBebek;

    public Bebek(String jenis, int kuantitas, double harga, int jumlahTelur,
            double hargaTelur, double perawatanBebek) {
        super(jenis, kuantitas, harga);
        this.jumlahTelur = jumlahTelur;
        this.hargaTelur = hargaTelur;
        this.perawatanBebek = perawatanBebek;
    }

    public int getTotalTelur() {
        return this.jumlahTelur * super.getKuantitas();
    }

    public double perawatan() {
        return super.getKuantitas() * this.getPerawatanBebek() * 30;
    }

    public double pendapatan() {
        return this.getHargaTelur() * getTotalTelur() * 30;
    }

    public double getPerawatanBebek() {
        return perawatanBebek;
    }

    public void setPerawatanBebek(double perawatanBebek) {
        this.perawatanBebek = perawatanBebek;
    }

    public int getJumlahTelur() {
        return jumlahTelur;
    }

    public void setJumlahTelur(int jumlahTelur) {
        this.jumlahTelur = jumlahTelur;
    }

    public double getHargaTelur() {
        return hargaTelur;
    }

    public void setHargaTelur(double hargaTelur) {
        this.hargaTelur = hargaTelur;
    }
}
