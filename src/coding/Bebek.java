package coding;
public class Bebek {
    private int jumlah;
    private int harga;
    private int hasil;
    private int pemasukan;
    public Bebek(int jumlah,int harga,int hasil){
        this.harga=harga;
        this.hasil=hasil;
        this.jumlah=jumlah;
        pemasukan=jumlah*harga*hasil;
    }
    public void menu1(){
        System.out.printf("Jenis\t\t\t: Bebek\nRas  \t\t\t: Telur Biasa\nJumlah\t\t\t: %d ekor\n",jumlah);
        int total = jumlah*hasil;
        System.out.printf("Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: %d\n",hasil,total,harga);
        System.out.println("=".repeat(50));
    } 
    public int menu2(){
        return pemasukan;
    }
    public int menu3(int ppn){
        return pemasukan+ppn*pemasukan;
    }
}