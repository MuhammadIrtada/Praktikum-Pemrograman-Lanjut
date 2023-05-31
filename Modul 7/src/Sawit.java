public class Sawit extends Kebun {
    private int jumlahTanaman;
    private int hasilTanaman;
    private float hargaJual;
    private float hargaPerawatan;

    Sawit(String jenis, int jumlahTanaman, int hasilTanaman, float hargaJual, float hargaPerawatan) {
        super.setJenis(jenis);
        super.setTotalPendapatan(hargaPerawatan);
        super.setTotalPerawatan(hargaPerawatan);

        this.jumlahTanaman = jumlahTanaman;
        this.hasilTanaman = hasilTanaman;
        this.hargaJual = hargaJual;
        this.hargaPerawatan = hargaPerawatan;
    }

    @Override
    public float pendapatan() {
        return this.hargaJual * this.jumlahTanaman * this.hasilTanaman * 30;
    }

    @Override
    public float perawatan() {
        return this.jumlahTanaman * hargaPerawatan * 30;
    }


    

}
