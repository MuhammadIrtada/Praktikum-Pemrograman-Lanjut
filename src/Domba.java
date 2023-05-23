public class Domba extends Hewan {
    private int buluperDomba;
    private int totalbuluDomba;
    private int hargaBulu;
    private int keuntunganBulu = 0;
    private int biayaNgerawat;

    public Domba(String jenis, int jumlah, int buluperDomba, int hargaBulu, int pelihara) {
        super(jenis, jumlah);
        this.buluperDomba = buluperDomba;
        this.hargaBulu = hargaBulu;
        this.biayaNgerawat = pelihara;
        this.totalbuluDomba = this.buluperDomba * this.getJumlah();
        this.keuntunganBulu = this.totalbuluDomba * this.hargaBulu - this.getJumlah() * this.biayaNgerawat;
    }

    public int getBiayaNgerawat() {
        return biayaNgerawat;
    }

    public void setBiayaNgerawat(int biayaNgerawat) {
        this.biayaNgerawat = biayaNgerawat;
    }

    public int getBuluperDomba() {
        return buluperDomba;
    }

    public void setBuluperDomba(int buluperDomba) {
        this.buluperDomba = buluperDomba;
        this.totalbuluDomba = this.buluperDomba * this.getJumlah();
        this.keuntunganBulu = this.totalbuluDomba * this.hargaBulu / 4;
    }

    public int getTotalbuluDomba() {
        return totalbuluDomba;
    }

    public void setTotalbuluDomba(int totalbuluDomba) {
        this.totalbuluDomba = totalbuluDomba;
    }

    public int getHargaBulu() {
        return hargaBulu;
    }

    public void setHargaBulu(int hargaBulu) {
        this.hargaBulu = hargaBulu;
    }

    public int getProfit() {
        return keuntunganBulu;
    }

    public String toString() {
        return "Jenis\t\t\t\t : " + getJenis() + "\n" + "Jumlah\t\t\t\t : " + getJumlah() + "\n"
                + "Bulu per ekor\t\t : "
                + getBuluperDomba() + "\n" + "Total bulu \t\t\t : " + getTotalbuluDomba() + "\n"
                + "Harga bulu \t\t\t : "
                + getHargaBulu() + "\n" + "Profit\t\t\t\t : " + getProfit();
    }

}