package modul6;

public class Hewan {
    private String jenis;
    private int jumlahHewan;
    private float hargaBeli;//untuk pengembangan
    private float perawatan;

    public Hewan(String jenis, int jumlahHewan, float hargaBeli, float hargaPerawatan) {
        this.jenis = jenis;
        this.jumlahHewan = jumlahHewan;
        this.hargaBeli = hargaBeli;
        this.perawatan = hargaPerawatan;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getJumlah(){
        return this.jumlahHewan;
    }
    public float getHargaBeli(){
        return this.hargaBeli;
    }
    public float getHargaPerawatan(){
        return this.perawatan;
    }

    public void tambahHewan(int tambahHewan){//untuk nambah jumlah kuantitas
        this.jumlahHewan += tambahHewan;
    }

    public void Informasi(){
        System.out.printf("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.jenis, this.jumlahHewan);
    }

}