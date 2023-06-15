public class Unta extends Peternakan {
    private int jumlahSusu;
    private float hargaSusu;

    public Unta(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor, int jumlahSusu, float hargaSusu) {
        super(jenis, kuantitas, perawatanPerEkor, hargaPerEkor);
        this.jumlahSusu = jumlahSusu;
        this.hargaSusu = hargaSusu;
    }

    public int getJumlahSusu() {
        return this.jumlahSusu;
    }

    public float getHargaSusu() {
        return this.hargaSusu;
    }

    public int getTotalSusu() {
        return this.jumlahSusu * super.getKuantitas();
    }

    public double getTotalHargaSusu() {
        double totalHarga = this.hargaSusu * this.getTotalSusu();
        return totalHarga;
    }

    public double pendapatan() {
        return getTotalHargaSusu() * 30;
    }

    public double perawatan() {
        return (super.getPerawatanPerEkor() * super.getKuantitas()) * 30;
    }
}
