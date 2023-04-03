package coding;
public class Domba {
    private int jumlah;
    private int harga;
    private int hasil;
    private int pemasukan;
    public Domba (int jumlah,int harga,int hasil){
        this.harga=harga;
        this.hasil=hasil;
        this.jumlah=jumlah;
        pemasukan=jumlah*harga*hasil;
    }
    public void menu1(){
        System.out.printf("Jenis\t\t\t: Domba\nRas  \t\t\t: Bulu Hitam\nJumlah\t\t\t: %d ekor\n",jumlah);
        int total = jumlah*hasil;
        System.out.printf("Bulu/Ekor\t\t: %d kg\nTotal Bulu/Hari\t\t: %d kg\nHarga Bulu/kg\t\t: %d\n",hasil,total,harga);
        System.out.println("=".repeat(50));
    }
    public int menu2(){
        return pemasukan;
    }
    public int menu3(int ppn){
        return pemasukan+ppn*pemasukan;
    }
}