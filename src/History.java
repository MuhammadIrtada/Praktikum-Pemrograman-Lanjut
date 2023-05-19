public class History {
    private String jenis;
    private int unit;
    private float harga;

    public History(String j, int u, float h){
        jenis = j;
        unit = u;
        harga = h;
    }

    public String getJenis(){
        return jenis;
    }

    public int getUnit(){
        return unit;
    }

    public float getHarga(){
        return harga;
    }

    public float getTotHarga(){
        return unit * harga;
    } 
}
