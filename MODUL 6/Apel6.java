package com;

public class Apel6 extends Tanaman6{
    private int ApelPerTanaman = 1;
    private int totalApel = 1;
    private int hargaApel = 1;
    private int profit = 1;

    public Apel6(String Jenis, int Jumlah){
        super(Jenis, Jumlah);
    }

    public int getApelPerTanaman() {
        return ApelPerTanaman;
    }
    public void setApelPerTanaman(int apelPerTanaman) {
        ApelPerTanaman = apelPerTanaman;
        this.totalApel = this.ApelPerTanaman * getJumlah();
        this.profit = this.totalApel * this.hargaApel / 10;
    }
    public int getTotalApel() {
        return totalApel;
    }

    // public void setTotalApel(int totalApel) {
    //     this.totalApel = totalApel;
    // }
    public int getHargaApel() {
        return hargaApel;
    }

    public void setHargaApel(int hargaApel) {
        this.hargaApel = hargaApel;
    }
    public int getProfit() {
        return profit;
    }

   

   

    
}
