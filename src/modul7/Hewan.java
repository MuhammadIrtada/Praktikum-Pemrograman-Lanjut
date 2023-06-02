package modul7;

public abstract class Hewan {
    private String jenis;
    private int jumlahHewan;
    private float hargaBeli;//untuk pengembangan
    private float perawatan;

    public Hewan(String jenis, int jumlahHewan, float hargaBeli, float hargaPerawatan) {
        this.jenis = jenis;
        this.jumlahHewan = jumlahHewan;
        this.hargaBeli = hargaBeli;
        this.perawatan = hargaPerawatan;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.jumlahHewan;
    }
    public float getHargaBeli(){
        return this.hargaBeli;
    }
    public float getHargaPerawatan(){
        return this.perawatan;
    }
    public abstract void pendapatan();
    public abstract void perawatan();
    public abstract float uangPerawatan();
    public abstract float uangPendapatan();

}