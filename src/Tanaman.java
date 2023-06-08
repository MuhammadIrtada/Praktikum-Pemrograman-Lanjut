public  class Tanaman {
    private String jenis;
    private int luas;
    private double harga;
    public Tanaman (String jenis, int luas, double harga){
        this.jenis=jenis;
        this.luas=luas;
        this.harga=harga;
    }
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
