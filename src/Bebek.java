public class Bebek extends Hewan {
    private int telurPerEkor;
    private int totalTelur;
    private int hargaTelur;
    private int profit = 0;
    private int biayaPerawatan;

    public Bebek(String jenis, int jumlah, int telor, int hrgTelur, int hrgRawat) {
        super(jenis, jumlah);
        this.telurPerEkor = telor;
        this.hargaTelur = hrgTelur;
        this.biayaPerawatan = hrgRawat;
        this.totalTelur = this.telurPerEkor * this.getJumlah();
        this.profit = this.totalTelur * this.hargaTelur - this.getJumlah() * this.biayaPerawatan;
    }

    public int getTelurPerEkor() {
        return telurPerEkor;
    }

    public void setTelurPerEkor(int telurPerEkor) {
        this.telurPerEkor = telurPerEkor;
        this.totalTelur = this.telurPerEkor * this.getJumlah();
        this.profit = this.totalTelur * this.hargaTelur - this.getJumlah() * this.biayaPerawatan;
    }

    public int getTotalTelur() {
        return totalTelur;
    }

    public void setTotalTelur(int totalTelur) {
        this.totalTelur = this.telurPerEkor * this.getJumlah();
    }

    public int getHargaTelur() {
        return hargaTelur;
    }

    public void setHargaTelur(int hargaTelur) {
        this.hargaTelur = hargaTelur;
    }

    public int getProfit() {
        return profit;
    }

    public String toString() {
        return "Jenis\t\t\t\t : " + getJenis() + "\n" + "Jumlah\t\t\t\t : " + getJumlah() + "\n"
                + "Telur per ekor\t\t : "
                + getTelurPerEkor() + "\n" + "Total telur\t\t\t : " + getTotalTelur() + "\n" + "Harga telur\t\t\t : "
                + getHargaTelur() + "\n" + "Profit\t\t\t\t : " + getProfit();
    }

}
