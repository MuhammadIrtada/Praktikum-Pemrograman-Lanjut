public class Domba {
    private String jenis, ras;
    private int kuantitas, buluPerEkor, ppn;
    private double hargaBulu;

    public Domba(String ras, int kuantitas, int buluPerEkor, double hargaBulu){
        this.jenis = "Domba";
        this.ras = ras;
        this.kuantitas = kuantitas;
        this.buluPerEkor = buluPerEkor;
        this.ppn = 0;
        this.hargaBulu = hargaBulu;
    }

    public String getJenis() {
        return this.jenis;
    }

    public String getRas() {
        return this.ras;
    }

    public int getBulu(){
        return this.buluPerEkor;
    }

    public int getTotalbulu(){
        return this.kuantitas * this.buluPerEkor;
    }

    public double getTotalPemasukan() {
        return (this.ppn + 100) / 100f * getTotalbulu() * this.hargaBulu;
    }

    public void setPpn(int ppn) {
        this.ppn = ppn;
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %d ekor\nBulu/Ekor\t\t: %d Kg\nTotal bulu/Hari\t\t: %d Kg\nHarga bulu/Kg\t\t: %.0f", this.jenis, this.ras, this.kuantitas, this.buluPerEkor, getTotalbulu(), this.hargaBulu);
    }
}
