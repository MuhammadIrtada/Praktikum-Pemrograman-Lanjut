public class Hewan {
    private String jenis;
    private int jumlah;
    private float harga;

    public Hewan (String j, int ju, float h) {
        jenis = j;
        jumlah = ju;
        harga = h;
    }

    public float getHarga(){
        return harga;
    }

    public void addJumlah(int i){
        jumlah += i;
    }

    public String getJenis(){
        return jenis;
    }

    public int getJumlah(){
        return jumlah;
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d Ekor\n", getJenis(),getJumlah());
    }
}
