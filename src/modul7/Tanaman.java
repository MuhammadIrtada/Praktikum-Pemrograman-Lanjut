package modul7;

public abstract class Tanaman {
    private String jenis;
    private int luasTanah;
    private float hargaBeli;//untuk pengembangan
    private float perawatan;

    public Tanaman(String jenis, int luasTanah, float hargaBeli, float hargaPerawatan) {
        this.jenis = jenis;
        this.luasTanah = luasTanah;
        this.hargaBeli = hargaBeli;
        this.perawatan = hargaPerawatan;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.luasTanah;
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