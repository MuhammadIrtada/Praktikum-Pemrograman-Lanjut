public class Tanaman {
    private String kebun;
    private int luas;
    private float harga;
    private float perawatan;

    protected Tanaman(String kebun, int luas, float harga, float perawatan) {
        this.kebun = kebun;
        this.luas = luas;
        this.harga = harga;
        this.perawatan = perawatan;
    }

    public String getKebun() {
        return kebun;
    }

    public int getLuas() {
        return luas;
    }

    public float getHarga() {
        return harga;
    }

    public float getPerawatan() {
        return perawatan;
    }

    protected float getPerawatanTotal(){
        return luas * perawatan;
    }

    public void beliTanaman(int jumlah){
        luas += jumlah;
    }

    public String showInfo(){
        return String.format("Jenis\t\t\t\t\t: %s\nJumlah\t\t\t\t\t: %d hektar\n", kebun, luas);
    }


}
