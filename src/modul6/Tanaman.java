package modul6;

public class Tanaman {
    private String jenis;
    private int luasTanah;
    private float hargaBeli;//untuk pengembangan
    private float perawatan;

    public Tanaman(String jenis, int luasTanah, float hargaBeli, float hargaPerawatan) {
        this.jenis = jenis;
        this.luasTanah = luasTanah;
        this.hargaBeli = hargaBeli;
        this.perawatan = hargaPerawatan;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.luasTanah;
    }
    public float getHargaBeli(){
        return this.hargaBeli;
    }
    public float getHargaPerawatan(){
        return this.perawatan;
    }

    public void tambahHewan(int tambahTanah){//untuk nambah jumlah kuantitas
        this.luasTanah += tambahTanah;
    }

    public void Informasi(){
        System.out.printf("Jenis\t\t\t: %s\nLuas\t\t\t: %d Hektar\n", this.jenis, this.luasTanah);
    }

}