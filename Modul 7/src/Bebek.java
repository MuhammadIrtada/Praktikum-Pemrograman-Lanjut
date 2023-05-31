public class Bebek extends Ternak {
    private int jumlahTernak;
    private int hasilTernak;
    private float hargaJual;
    private float hargaPerawatan;

    Bebek(String jenis, int jumlahTernak, int hasilTernak, float hargaJual, float hargaPerawatan) {
        super.setJenis(jenis);
        super.setTotalPendapatan(hargaPerawatan);
        super.setTotalPerawatan(hargaPerawatan);

        this.jumlahTernak = jumlahTernak;
        this.hasilTernak = hasilTernak;
        this.hargaJual = hargaJual;
        this.hargaPerawatan = hargaPerawatan;
    }

    @Override
    public float pendapatan() {
        return this.hargaJual * this.jumlahTernak * this.hasilTernak * 30;
    }

    @Override
    public float perawatan() {
        return this.jumlahTernak * hargaPerawatan * 30;
    }
}
