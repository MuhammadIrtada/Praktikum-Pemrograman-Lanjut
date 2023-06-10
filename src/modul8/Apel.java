package modul8;

public class Apel implements Transaksi {
    private String jenis;
    private int jumlahTanaman;
    private int hargaBeli;//untuk pengembangan

    public Apel(String jenis, int luasTanah, int hargaBeli) {
        this.jenis = jenis;
        this.jumlahTanaman = luasTanah;
        this.hargaBeli = hargaBeli;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.jumlahTanaman;
    }
    public int getHargaBeli(){
        return this.hargaBeli;
    }

    public void tambahItem(int tambahItem){//untuk nambah jumlah kuantitas
        this.jumlahTanaman += tambahItem;
        int beli= getHargaBeli()*tambahItem;
        System.out.printf("%s\t\t\tx(%d)\t: Rp %d \n", this.jenis,tambahItem, beli);
    }

    public void Informasi(){
        System.out.printf("%s\t\t\t: %d Hektar\n", this.jenis, this.jumlahTanaman);
    }
}
