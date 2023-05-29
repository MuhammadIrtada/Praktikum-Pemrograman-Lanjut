public class Domba extends Hewan{
    private String jenis;
    private float harga;
    private float biaya;
    private int jumlah;
    private int produk;

    public Domba(String j,  float h, float b, int p, int je){
        jenis = j;
        harga = h;
        biaya = b;
        jumlah = je;
        produk = p;
    }

    @Override
    public String getJenis() {
        return jenis;
    }
    

    public float getHarga() {
        return harga;
    }


    public float getBiaya() {
        return biaya;
    }


    public int getJumlah() {
        return jumlah;
    }

    public int getProduk() {
        return produk;
    }

    public int getTotProduk(){
        return getProduk()*getJumlah();
    }
    
    @Override
    public float getTotHarga(){
        return (getHarga()*getTotProduk())*30;
    }

    @Override
    public float getTotBiaya(){
        return (getBiaya()*getJumlah())*30;
    }
    
}

