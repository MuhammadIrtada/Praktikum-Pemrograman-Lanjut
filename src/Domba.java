public class Domba implements Ternak{
    private String jenis;
    private double hargaTransaksi;
    private double jumlah;
    private final double harga;

    public Domba(String jenis, double harga, double jumlah){
        this.harga = harga;
        this.jenis = jenis;
        this.hargaTransaksi= harga;
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return this.jumlah;
    }

    public double getHarga(){
        return this.hargaTransaksi;
    }

    @Override
    public double setHarga(double baru) {
        return this.hargaTransaksi = (this.harga*baru);
    }

    @Override
    public String getJenis() {
        return this.jenis;
    }

    @Override
    public double setJumlah(double baru) {
        setHarga(baru);
        return this.jumlah += baru;
    }
}

