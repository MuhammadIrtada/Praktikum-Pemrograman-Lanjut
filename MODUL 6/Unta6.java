package com;

public class Unta6 extends Hewan6 {
    private int SusuPerEkor = 1;
    private int totalSusu = 1;
    private int hargaSusu = 1;
    private int profit = 1;

    public Unta6(String Jenis, int Jumlah){
        super(Jenis, Jumlah);
    }
    public int getSusuPerEkor() {
        return SusuPerEkor;
    }

    public void setSusuPerEkor(int SusuPerEkor) {
        this.SusuPerEkor = SusuPerEkor;
        this.totalSusu = this.SusuPerEkor * this.getJumlah();
        this.profit = this.totalSusu * this.hargaSusu/ 3;
    }
    public int getTotalSusu() {
        return totalSusu;
    }
    // public void setTotalBulu(int totalBulu) {
    //     this.totalBulu = totalBulu;
    // }
    public int getHargaSusu() {
        return hargaSusu;
    }
    public void setHargaSusu(int hargaSusu) {
        this.hargaSusu = hargaSusu;
    }
    public int getProfit() {
        return profit;
    }
    @Override
    public void setJumlah(int jumlah) {
        // TODO Auto-generated method stub
        super.setJumlah(jumlah);
        this.profit = this.totalSusu * this.hargaSusu/ 3;

    }
}
