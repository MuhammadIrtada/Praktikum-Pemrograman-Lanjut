import java.text.NumberFormat;
import java.util.Locale;
public class Sawit1 extends Tanaman1{
    private int jumlahMinyak;
    private double hargaMinyak;

    public Sawit1 (String jenis, double luas,double perawatan,double harga, int jumlahMinyak,double hargaMinyak){
        super(jenis,luas,perawatan,harga);
        this.jumlahMinyak=jumlahMinyak;
        this.hargaMinyak=hargaMinyak;       
    }

    public double getTotalMinyak (){
        return this.jumlahMinyak * super.getLuas();
    }
    public double getProfit (){
        double profitKotor,profitBersih,perawatan;
        profitKotor= this.getHargaMinyak() * getTotalMinyak();
        perawatan= super.getLuas() * super.getPerawatan();
        profitBersih=profitKotor-perawatan;
        return profitBersih;
    }
    public void showInformasi(){
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        System.out.println("Jenis                   : "+super.getJenis());
        System.out.println("Luas                    : "+((int)super.getLuas())+" Hektar");
        System.out.println("Minyak/Hektar           : "+this.getJumlahMinyak()+" Kg");
        System.out.println("Total Minyak/Hari       : "+ ((int) this.getTotalMinyak())+" Kg"); 
        System.out.println("Harga Minyak/Kg         : Rp. "+nf.format(this.getHargaMinyak()));
        System.out.println("Profit/Hari             : Rp. "+nf.format(this.getProfit()));
        System.out.println("=".repeat(50));

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
}
