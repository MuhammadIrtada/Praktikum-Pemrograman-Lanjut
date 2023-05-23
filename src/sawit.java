public class sawit extends Tanaman {
    private int beratperSawit;
    private int biayajagaSawit;
    private int totalSawit;
    private int keuntunganSawit;
    private int hargaSawit = 0;

    public sawit(int jumlah, String jenis, int beratperSawit, int biayajagaSawit, int hargaSawit) {
        super(jumlah, jenis);
        this.beratperSawit = beratperSawit;
        this.biayajagaSawit = biayajagaSawit;
        this.hargaSawit = hargaSawit;
        this.totalSawit = this.getBeratperSawit() * this.getJumlahTan();
        this.keuntunganSawit = this.totalSawit * this.hargaSawit / 18;
    }

    public int getBeratperSawit() {
        return beratperSawit;
    }

    public void setBeratperSawit(int beratperSawit) {
        this.beratperSawit = beratperSawit;
        this.totalSawit = this.beratperSawit * super.getJumlahTan();
        this.keuntunganSawit = this.totalSawit * this.hargaSawit - super.getJumlahTan() * this.biayajagaSawit;
    }

    public int getTotalSawit() {
        return totalSawit;
    }

    public void setTotalSawit(int totalSawit) {
        this.totalSawit = totalSawit;
    }

    public int getBiayajagaSawit() {
        return biayajagaSawit;
    }

    public void setBiayajagaSawit(int biayajagaSawit) {
        this.biayajagaSawit = biayajagaSawit;
    }

    public int getHargaSawit() {
        return hargaSawit;
    }

    public void setHargaSawit(int hargaSawit) {
        this.hargaSawit = hargaSawit;
    }

    public int getKeuntunganSawit() {
        return keuntunganSawit;
    }

    public void setKeuntunganSawit(int keuntunganSawit) {
        this.keuntunganSawit = keuntunganSawit;
    }

    public String toString() {
        return "Jenis\t\t\t\t : " + getJenisTan() + "\n" + "Jumlah\t\t\t\t : " + getJumlahTan() + "\n"
                + "Sawit per pohon\t\t : " + getBeratperSawit() + "\n" + "Total sawit\t\t\t : " + getTotalSawit()
                + "\n" + "Harga sawit\t\t\t : "
                + getHargaSawit() + "\n" + "Profit\t\t\t\t : " + getKeuntunganSawit();
    }

}
