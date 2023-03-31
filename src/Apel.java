public class Apel {
    private String nama;
    private double luasTanah;
    private double kuantitasApel; // Dihasilkan per hari
    private double hargaJualApel;
    private double biayaPerawatanPerHektar; // Dikeluarkan per hari
    private int durasiPupuk;

    Apel(String nama, double luasTanah, double kuantitasApel, double hargaJualApel, double biayaPerawatanPerHektar){
        this.nama = nama;
        this.luasTanah = luasTanah;
        this.kuantitasApel = kuantitasApel;
        this.hargaJualApel = hargaJualApel;
        this.biayaPerawatanPerHektar = biayaPerawatanPerHektar;
        this.durasiPupuk = 0;
    }

    public void tambahLuasTanah(double luasTambahan) {
        this.luasTanah += luasTambahan;
    }

    public void pakaiPupuk(int durasiPupuk){
        this.durasiPupuk = durasiPupuk;
    }

    public boolean statusPupuk(){
        return this.durasiPupuk > 0;
    }

    public void kurangDurasiPupuk(){
        if (statusPupuk()) {
            this.durasiPupuk--;
        }
    }

    public double getKuantitasApel(){
        return statusPupuk() ? this.kuantitasApel * 2 : this.kuantitasApel;
    }
    
    public void tambahKuantitasApel(double kuantitasTambahan) {
        this.luasTanah += kuantitasTambahan;
    }

    public double getTotalApel() {
        return getKuantitasApel() * this.luasTanah;
    }

    public double getProfit(int durasiPupuk, double hargaPupuk){
        return getTotalApel() * this.hargaJualApel - this.luasTanah * this.biayaPerawatanPerHektar - (this.durasiPupuk == durasiPupuk ? this.luasTanah * hargaPupuk : 0);
    }

    public String toString(int durasiPupuk, double hargaPupuk) {
        return String.format("Nama\t\t: %s\nLuas\t\t: %.0f hektar\nTotal Apel/Hari\t: %.0f Kg\nKeuntungan/Hari\t: Rp. %.0f", this.nama, this.luasTanah, getTotalApel(), getProfit(durasiPupuk, hargaPupuk));
    }
}
