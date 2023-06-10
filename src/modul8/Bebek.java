package modul8;

public class Bebek implements Transaksi {
    private String jenis;
    private int jumlahHewan;
    private int hargaBeli;//untuk pengembangan

    public Bebek(String jenis, int jumlahHewan, int hargaBeli) {
        this.jenis = jenis;
        this.jumlahHewan = jumlahHewan;
        this.hargaBeli = hargaBeli;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.jumlahHewan;
    }
    public int getHargaBeli(){
        return this.hargaBeli;
    }

    public void tambahItem(int tambahItem){//untuk nambah jumlah kuantitas
        this.jumlahHewan += tambahItem;
        int beli= getHargaBeli()*tambahItem;
        System.out.printf("%s\t\tx(%d)\t: Rp %d \n", this.jenis,tambahItem, beli);
    }

    public void Informasi(){
        System.out.printf("%s\t\t\t: %d Ekor\n", this.jenis, this.jumlahHewan);
    }

}
