public class Unta {
    private String jenis, ras;
    private int kuantitas, susuPerEkor, ppn;
    private double hargaSusu;

    public Unta(String ras, int kuantitas, int susuPerEkor, double hargaSusu){
        this.jenis = "Unta";
        this.ras = ras;
        this.kuantitas = kuantitas;
        this.susuPerEkor = susuPerEkor;
        this.ppn = 0;
        this.hargaSusu = hargaSusu;
    }

    public String getJenis() {
        return this.jenis;
    }

    public String getRas() {
        return this.ras;
    }

    public int getSusu(){
        return this.susuPerEkor;
    }

    public int getTotalSusu(){
        return this.kuantitas * this.susuPerEkor;
    }

    public double getTotalPemasukan() {
        return (this.ppn + 100) / 100f * getTotalSusu() * this.hargaSusu;
    }

    public void setPpn(int ppn) {
        this.ppn = ppn;
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %d ekor\nsusu/Ekor\t\t: %d liter\nTotal susu/Hari\t\t: %d liter\nHarga susu/liter\t: %.0f", this.jenis, this.ras, this.kuantitas, this.susuPerEkor, getTotalSusu(), this.hargaSusu);
    }
}
