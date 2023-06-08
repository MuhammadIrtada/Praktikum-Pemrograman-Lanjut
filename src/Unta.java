
public class Unta extends Hewan implements Pembelian {
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
    @Override
    public void beli(int jumlahBarang) {
        super.setKuantitas(super.getKuantitas() + jumlahBarang);
    }

    @Override
    public void display() {
        System.out.println(super.getJenis() + "\t    : " + super.getKuantitas() + " ekor");
    }

    @Override
    public void nota(int jumlahBarang) {
        System.out.println(
                super.getJenis() + "\t\tx(" + jumlahBarang + ")   : Rp " + (int) super.getHarga() * jumlahBarang);
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
