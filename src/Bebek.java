public class Bebek {
    private String jenis, ras;
    private int kuantitas, telurPerEkor, ppn;
    private double hargaTelur;

    public Bebek(String ras, int kuantitas, int telurPerEkor, double hargaTelur){
        this.jenis = "Bebek";
        this.ras = ras;
        this.kuantitas = kuantitas;
        this.telurPerEkor = telurPerEkor;
        this.ppn = 0;
        this.hargaTelur = hargaTelur;
    }

    public String getJenis() {
        return this.jenis;
    }

    public String getRas() {
        return this.ras;
    }

    public int getTelur(){
        return this.telurPerEkor;
    }

    public int getTotalTelur(){
        return this.kuantitas * this.telurPerEkor;
    }

    public double getTotalPemasukan() {
        return (this.ppn + 100) / 100f * getTotalTelur() * this.hargaTelur;
    }

    public void setPpn(int ppn) {
        this.ppn = ppn;
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %d ekor\nTelur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: %.0f", this.jenis, this.ras, this.kuantitas, this.telurPerEkor, getTotalTelur(), this.hargaTelur);
    }
}
