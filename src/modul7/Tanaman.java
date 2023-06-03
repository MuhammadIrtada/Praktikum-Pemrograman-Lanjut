package modul7;

public abstract class Tanaman {
    private String jenis;
    private int luasTanah;
    private float perawatan;

    public Tanaman(String jenis, int luasTanah, float hargaPerawatan) {
        this.jenis = jenis;
        this.luasTanah = luasTanah;
        this.perawatan = hargaPerawatan;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.luasTanah;
    }
    public float getHargaPerawatan(){
        return this.perawatan;
    }
    public abstract void pendapatan();
    public abstract void perawatan();
    public abstract float uangPerawatan();
    public abstract float uangPendapatan();

}