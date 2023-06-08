
public class Sawit extends Tanaman implements Pembelian{
    private int jumlahMinyak;
    private double hargaMinyak;
    private double perawatanSawit;

    public Sawit(String jenis, int luas, double harga, int jumlahMinyak,
            double hargaMinyak, double perawatanSawit) {
        super(jenis, luas, harga);
        this.jumlahMinyak = jumlahMinyak;
        this.hargaMinyak = hargaMinyak;
        this.perawatanSawit = perawatanSawit;
    }

    @Override
    public void beli(int jumlahBarang){
         super.setLuas(super.getLuas()+jumlahBarang);
    }
    @Override
    public void display(){
        System.out.println(super.getJenis()+": "+super.getLuas()+" hektar");
    }
    @Override
    public void nota(int jumlahBarang){
        System.out.println(super.getJenis()+"\tx("+jumlahBarang+")   : Rp "+(int)super.getHarga()*jumlahBarang);
    
    }

    public int getTotalMinyak() {
        return this.jumlahMinyak * super.getLuas();
    }

    public double perawatan() {
        return super.getLuas() * this.getPerawatanSawit() * 30;

    }

    public double pendapatan() {
        return this.getHargaMinyak() * getTotalMinyak() * 30;
    }

    public int getJumlahMinyak() {
        return jumlahMinyak;
    }

    public void setJumlahMinyak(int jumlahMinyak) {
        this.jumlahMinyak = jumlahMinyak;
    }

    public double getHargaMinyak() {
        return hargaMinyak;
    }

    public void setHargaMinyak(double hargaMinyak) {
        this.hargaMinyak = hargaMinyak;
    }

    public double getPerawatanSawit() {
        return perawatanSawit;
    }

    public void setPerawatanSawit(double perawatanSawit) {
        this.perawatanSawit = perawatanSawit;
    }

}
