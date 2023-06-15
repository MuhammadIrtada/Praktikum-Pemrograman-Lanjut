public class KelapaSawit extends Perkebunan { // ntar dikasi extend buat ngehubungi sama kelas hewan
    private int jumlahKelapaSawit;
    private float hargaKelapaSawit;

    public KelapaSawit(String jenis, int kuantitas, double perawatanPerHektar, double hargaPerKilo, int jumlahKelapaSawit, float hargaKelapaSawit) {
        super(jenis, kuantitas, perawatanPerHektar, hargaPerKilo);
        this.jumlahKelapaSawit = jumlahKelapaSawit;
        this.hargaKelapaSawit = hargaKelapaSawit;
    }

    public int getJumlahKelapaSawit() {
        return this.jumlahKelapaSawit;
    }

    public float getHargaKelapaSawit() {
        return this.hargaKelapaSawit;
    }

    public int getTotalKelapaSawit() {
        return this.jumlahKelapaSawit * super.getKuantitas();
    }

    public double getTotalHargaKelapaSawit() {
        double totalHarga = this.hargaKelapaSawit * this.getTotalKelapaSawit();
        return totalHarga;
    }
    
    public double pendapatan() {
        return getTotalHargaKelapaSawit() * 30;
    }

    public double perawatan() {
        return super.getPerawatanPerHektar() * super.getKuantitas() * 30;
    }
}
