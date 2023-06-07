public class Sawit implements Kebun{
    private String jenis;
    private int jumlah;
    private float harga;

    public Sawit(String j, int ju, float h){
        jenis = j;
        jumlah = ju;
        harga = h;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public float getHarga() {
        return harga;
    }

    public void setTambah(int i){
        jumlah += i;
    }
}

