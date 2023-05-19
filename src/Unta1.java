import java.text.NumberFormat;
import java.util.Locale;
public class Unta1 extends Hewan1 {
    private int jumlahSusu;
    private double hargaSusu;

    public Unta1 (String jenis, int kuantitas,double perawatan,double harga, int jumlahSusu,double hargaSusu){
        super(jenis,kuantitas,perawatan, harga);
        this.jumlahSusu=jumlahSusu;
        this.hargaSusu=hargaSusu;       
    }

    
    public int getTotalSusu (){
        return this.jumlahSusu * super.getKuantitas();
    }
    public double getProfit (){
        double profitKotor,profitBersih,perawatan;
        profitKotor= this.getHargaSusu() * getTotalSusu();
        perawatan= super.getKuantitas() * super.getPerawatan();
        profitBersih=profitKotor-perawatan;
        return profitBersih;
    }
    public void showInformasi(){
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
        System.out.println("Jenis                   : "+super.getJenis());
        System.out.println("Jumlah                  : "+super.getKuantitas()+" ekor");
        System.out.println("Susu/Ekor               : "+this.getJumlahSusu()+" Liter");
        System.out.println("Total Susu/Hari         : "+this.getTotalSusu()+" Liter"); 
        System.out.println("Harga Susu/Liter        : Rp. "+nf.format(this.getHargaSusu()));
        System.out.println("Profit/Hari             : Rp. "+nf.format(this.getProfit()));
        System.out.println("=".repeat(50));

    }


    public int getJumlahSusu() {
        return jumlahSusu;
    }


    public void setJumlahSusu(int jumlahSusu) {
        this.jumlahSusu = jumlahSusu;
    }


    public double getHargaSusu() {
        return hargaSusu;
    }


    public void setHargaSusu(double hargaSusu) {
        this.hargaSusu = hargaSusu;
    }

    

}
