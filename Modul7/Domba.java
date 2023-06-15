public class Domba extends Peternakan {
    private int jumlahBulu;
    private float hargaBulu;

    public Domba(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor, int jumlahBulu, float hargaBulu) {
        super(jenis, kuantitas, perawatanPerEkor, hargaPerEkor);
        this.jumlahBulu = jumlahBulu;
        this.hargaBulu = hargaBulu;
    }

    public int getJumlahBulu() {
        return this.jumlahBulu;
    }

    public float getHargaBulu() {
        return this.hargaBulu;
    }

    public int getTotalBulu() {
        return this.jumlahBulu * super.getKuantitas();
    }

    public float getTotalHargaBulu() {
        float totalHarga = this.hargaBulu * this.getTotalBulu();
        return totalHarga;
    }

    public double pendapatan() {
        return getTotalHargaBulu() * 30;
    }

    public double perawatan() {
        return (super.getPerawatanPerEkor() * super.getKuantitas()) * 30;
    }
}
