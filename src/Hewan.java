public abstract class Hewan {
    private int jmlEkor;
    private int hasil;
    private float hargaHasil;
    private float biayaPerawatan;
    
    public Hewan(int jmlEkor, int hasil, float hargaHasil, float biayaPerawatan) {
        this.jmlEkor = jmlEkor;
        this.hasil = hasil;
        this.hargaHasil = hargaHasil;
        this.biayaPerawatan = biayaPerawatan;
    }
    public int getJmlEkor() {
        return jmlEkor;
    }
    public void setJmlEkor(int jmlEkor) {
        this.jmlEkor = jmlEkor;
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

    public float getPendapatan(){
        return jmlEkor * hasil * hargaHasil * 30;
    }

    public float getPerawatan() {
        return biayaPerawatan * jmlEkor * 30;
    }

    public abstract void cetakPendapatan();

    public abstract void cetakPerawatan();

    
    

}
