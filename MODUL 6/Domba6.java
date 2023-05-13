package com;

public class Domba6 extends Hewan6{
    private int BuluPerEkor = 1;
    private int totalBulu = 1;
    private int hargaBulu = 1;
    private int profit = 1;

    public Domba6(String Jenis, int Jumlah){
        super(Jenis, Jumlah);
    }
    public int getBuluPerEkor() {
        return BuluPerEkor;
    }

    public void setBuluPerEkor(int BuluPerEkor) {
        this.BuluPerEkor = BuluPerEkor;
        this.totalBulu = this.BuluPerEkor * this.getJumlah();
        this.profit = this.totalBulu * this.hargaBulu/ 4;
    }
    public int getTotalBulu() {
        return totalBulu;
    }
    // public void setTotalBulu(int totalBulu) {
    //     this.totalBulu = totalBulu;
    // }
    public int getHargaBulu() {
        return hargaBulu;
    }
    public void setHargaBulu(int hargaBulu) {
        this.hargaBulu = hargaBulu;
    }
    public int getProfit() {
        return profit;
    }
    @Override
    public void setJumlah(int jumlah) {
        // TODO Auto-generated method stub
        super.setJumlah(jumlah);
        this.profit = this.totalBulu * this.hargaBulu/ 4;

    }
}
