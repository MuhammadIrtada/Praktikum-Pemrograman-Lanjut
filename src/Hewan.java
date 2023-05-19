public class Hewan {
    private String ternak;
    private int kuantitas;
    private float harga;
    private float perawatan;

    protected Hewan(String ternak, int kuantitas, float harga, float perawatan) {
        this.ternak = ternak;
        this.kuantitas = kuantitas;
        this.harga = harga;
        this.perawatan = perawatan;
    }

    public String getTernak() {
        return ternak;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public float getHarga() {
        return harga;
    }

    public float getPerawatan() {
        return perawatan;
    }

    protected float getPerawatanTotal(){
        return kuantitas * perawatan;
    }

    public void beliHewan(int jumlah){
        kuantitas += jumlah;
    }

    public String showInfo(){
        return String.format("Jenis\t\t\t\t\t: %s\nJumlah\t\t\t\t\t: %d ekor\n", ternak, kuantitas);
    }


}
