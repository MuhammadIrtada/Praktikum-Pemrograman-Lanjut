public class Unta extends Hewan {
    private double jumlah;
    private double unit;
    private double harga;
    private double pelihara;

    Unta(int jumlah, int unit, int harga, int pelihara){
        super.setJenis("Unta");
        this.jumlah = jumlah;
        this.unit = unit;
        this.harga = harga;
        this.pelihara = pelihara;
    }
    @Override
    public double pendapatan(){
        return this.jumlah*this.harga*this.unit*30;
    }
    @Override
    public double perawatan(){
        return this.jumlah*this.pelihara*30;
    }
}

