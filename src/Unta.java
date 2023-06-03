
public class Unta extends Hewan {
    private int jumlahSusu;
    private double hargaSusu;
    private double perawatanUnta;

    public Unta(String jenis, int kuantitas, double harga, int jumlahSusu,
            double hargaSusu, double perawatanUnta) {
        super(jenis, kuantitas, harga);
        this.jumlahSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
        this.perawatanUnta = perawatanUnta;
    }

    public int getTotalSusu() {
        return this.jumlahSusu * super.getKuantitas();
    }

    public double perawatan() {
        return super.getKuantitas() * this.getPerawatanUnta() * 30;

    }

    public double pendapatan() {
        return this.getHargaSusu() * getTotalSusu() * 30;
    }

    public int getJumlahSusu() {
        return jumlahSusu;
    }

    public void setJumlahSusu(int jumlahSusu) {
        this.jumlahSusu = jumlahSusu;
    }

    public double getHargaSusu() {
        return hargaSusu;
    }

    public void setHargaSusu(double hargaSusu) {
        this.hargaSusu = hargaSusu;
    }

    public double getPerawatanUnta() {
        return perawatanUnta;
    }

    public void setPerawatanUnta(double perawatanUnta) {
        this.perawatanUnta = perawatanUnta;
    }

}
