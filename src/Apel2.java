
import java.text.NumberFormat;
import java.util.Locale;
public class Apel2 extends Tanaman1 {
    private int jumlahBuah;
    private double hargaBuah;

    public Apel2 (String jenis, double luas,double perawatan,double harga, int jumlahBuah,double hargaBuah){
        super(jenis,luas,perawatan, harga);
        this.jumlahBuah=jumlahBuah;
        this.hargaBuah=hargaBuah;       
    }

    public double getTotalBuah (){
        return this.jumlahBuah * super.getLuas();
    }
    public double getProfit (){
        double profitKotor,profitBersih,perawatan;
        profitKotor= this.getHargaBuah() * getTotalBuah();
        perawatan= super.getLuas() * super.getPerawatan();
        profitBersih=profitKotor-perawatan;
        return profitBersih;
    }
    public void showInformasi(){
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        System.out.println("Jenis                   : "+super.getJenis());
        System.out.println("Luas                    : "+((int)super.getLuas())+" Hektar");
        System.out.println("Buah/Hektar             : "+this.getJumlahBuah()+" Kg");
        System.out.println("Total Buah/Hari         : "+((int)this.getTotalBuah())+" Kg"); 
        System.out.println("Harga Buah/Kg           : Rp. "+nf.format(this.getHargaBuah()));
        System.out.println("Profit/Hari             : Rp. "+nf.format(this.getProfit()));
        System.out.println("=".repeat(50));

    }

    public int getJumlahBuah() {
        return jumlahBuah;
    }

    public void setJumlahBuah(int jumlahBuah) {
        this.jumlahBuah = jumlahBuah;
    }

    public double getHargaBuah() {
        return hargaBuah;
    }

    public void setHargaBuah(double hargaBuah) {
        this.hargaBuah = hargaBuah;
    }
}