public class Unta extends Hewan {
    private int SusuPerUnta;
    private int totalSusu;
    private int hargaSusu;
    private int profit;
    private int biayaPerawat;

    public Unta(String jenis, int jumlah, int perUnta, int hrgSusu, int rawat) {
        super(jenis, jumlah);
        this.SusuPerUnta = perUnta;
        this.hargaSusu = hrgSusu;
        this.biayaPerawat = rawat;
        this.totalSusu = this.SusuPerUnta * this.getJumlah();
        this.profit = this.totalSusu * this.hargaSusu - this.getJumlah() * this.biayaPerawat;
    }

    public int getSusuPerUnta() {
        return SusuPerUnta;
    }

    public void setSusuPerUnta(int susuPerUnta) {
        this.SusuPerUnta = susuPerUnta;
        this.totalSusu = susuPerUnta * super.getJumlah();
        this.profit = this.totalSusu * this.hargaSusu / 3;
    }

    public int getTotalSusu() {
        return totalSusu;
    }

    public void setTotalSusu(int totalSusu) {
        this.totalSusu = totalSusu;
    }

    public int getHargaSusu() {
        return hargaSusu;
    }

    public void setHargaSusu(int hargaSusu) {
        this.hargaSusu = hargaSusu;
    }

    public int getBiayaPerawat() {
        return biayaPerawat;
    }

    public void setBiayaPerawat(int biayaPerawat) {
        this.biayaPerawat = biayaPerawat;
    }

    public int getProfit() {
        return profit;
    }

    public String toString() {
        return "Jenis\t\t\t\t : " + getJenis() + "\n" + "Jumlah\t\t\t\t : " + getJumlah() + "\n"
                + "Susu per ekor\t\t : "
                + getSusuPerUnta() + "\n" + "Total susu \t\t\t : " + getTotalSusu() + "\n" + "Harga susu \t\t\t : "
                + getHargaSusu() + "\n" + "Profit\t\t\t\t : " + getProfit();
    }

}
