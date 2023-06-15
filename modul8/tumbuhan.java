public abstract class tumbuhan {
    protected String nama;
    protected int harga;

    public tumbuhan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
}
