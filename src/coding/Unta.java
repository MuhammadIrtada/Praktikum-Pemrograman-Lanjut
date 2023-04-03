package coding;
public class Unta {
    private int jumlah;
    private int harga;
    private int hasil;
    private int pemasukan;
    public Unta (int jumlah,int harga,int hasil){
        this.harga=harga;
        this.hasil=hasil;
        this.jumlah=jumlah;
        pemasukan=jumlah*harga*hasil;
    }
    public void menu1(){
        System.out.printf("Jenis\t\t\t: Unta\nRas  \t\t\t: Susu Putih\nJumlah\t\t\t: %d ekor\n",jumlah);
        int total = jumlah*hasil;
        System.out.printf("Susu/Ekor\t\t: %d liter\nTotal Susu/Hari\t\t: %d liter\nHarga Susu/liter\t: %d\n",hasil,total,harga);
        System.out.println("=".repeat(50));
    }
    public int menu2(){
        return pemasukan;
    }
    public int menu3(int ppn){
        return pemasukan+ppn*pemasukan;
    }
}