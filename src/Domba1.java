import java.text.NumberFormat;
import java.util.Locale;
public class Domba1 extends Hewan1{
    private int jumlahBulu;
    private double hargaBulu;

    public Domba1 (String jenis, int kuantitas,double perawatan,double harga, int jumlahBulu,double hargaBulu){
        super(jenis,kuantitas,perawatan, harga);
        this.jumlahBulu=jumlahBulu;
        this.hargaBulu=hargaBulu;       
    }

    
    public int getTotalBulu (){
        return this.jumlahBulu * super.getKuantitas();
    }
    public double getProfit (){
        double profitKotor,profitBersih,perawatan;
        profitKotor= this.getHargaBulu() * getTotalBulu();
        perawatan= super.getKuantitas() * super.getPerawatan();
        profitBersih=profitKotor-perawatan;
        return profitBersih;
    }
    public void showInformasi(){
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        System.out.println("Jenis                   : "+super.getJenis());
        System.out.println("Jumlah                  : "+super.getKuantitas()+" ekor");
        System.out.println("Bulu/Ekor               : "+this.getJumlahBulu()+" Kg");
        System.out.println("Total Bulu/Hari         : "+this.getTotalBulu()+" Kg"); 
        System.out.println("Harga Bulu/Kg           : Rp. "+nf.format(this.getHargaBulu()));
        System.out.println("Profit/Hari             : Rp. "+nf.format(this.getProfit()));
        System.out.println("=".repeat(50));

    }

    public int getJumlahBulu() {
        return jumlahBulu;
    }

    public void setJumlahBulu(int jumlahBulu) {
        this.jumlahBulu = jumlahBulu;
    }

    public double getHargaBulu() {
        return hargaBulu;
    }

    public void setHargaBulu(double hargaBulu) {
        this.hargaBulu = hargaBulu;
    }


    

}
