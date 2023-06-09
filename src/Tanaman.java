public abstract class Tanaman {
    private int luasKebun;
    private int hasil;
    private float hargaHasil;
    private float biayaPerawatan;

    
    
    public Tanaman(int luasKebun, int hasil, float hargaHasil, float biayaPerawatan) {
        this.luasKebun = luasKebun;
        this.hasil = hasil;
        this.hargaHasil = hargaHasil;
        this.biayaPerawatan = biayaPerawatan;
    }
    public int getLuasKebun() {
        return luasKebun;
    }
    public void setLuasKebun(int luasKebun) {
        this.luasKebun = luasKebun;
    }
    public int getHasil() {
        return hasil;
    }
    public void setHasil(int hasil) {
        this.hasil = hasil;
    }
    public float getHargaHasil() {
        return hargaHasil;
    }
    public void setHargaHasil(float hargaHasil) {
        this.hargaHasil = hargaHasil;
    }
    public float getBiayaPerawatan() {
        return biayaPerawatan;
    }
    public void setBiayaPerawatan(float biayaPerawatan) {
        this.biayaPerawatan = biayaPerawatan;
    }

    public float getPendapatan() {    
        return luasKebun * hasil * hargaHasil * 30;
    }

    public float getPerawatan() {
        return biayaPerawatan * luasKebun * 30;
    }

    public abstract void cetakPendapatan();

    public abstract void cetakPerawatan();
    
}
