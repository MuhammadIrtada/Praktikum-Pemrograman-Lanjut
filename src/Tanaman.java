public class Tanaman {
    private String jenis;
    private int luas;
    private float harga;
    public Tanaman (String j, int l, float h) {
        jenis = j;
        luas = l;
        harga = h;
    }

    public void addLuas(int i){
        luas += i;
    }

    public float getHarga(){
        return harga;
    }

    public String getJenis(){
        return jenis;
    }

    public int getLuas(){
        return luas;
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nLuas\t\t\t: %d Hektar\n", getJenis(),getLuas());
    }
}
