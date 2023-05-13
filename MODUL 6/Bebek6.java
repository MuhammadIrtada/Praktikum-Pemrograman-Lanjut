package com;

public class Bebek6 extends Hewan6 {
    private int telurPerEkor = 1;
    private int totalTelur = 1;
    private int hargaTelur = 1;
    private int profit = 1;

    public Bebek6(String Jenis, int Jumlah){
        super(Jenis, Jumlah);
    }
    public int getTelurPerEkor() {
        return telurPerEkor;
    }

    public void setTelurPerEkor(int telurPerEkor) {
        this.telurPerEkor = telurPerEkor;
        this.totalTelur = this.telurPerEkor * this.getJumlah();
        this.profit = this.totalTelur * this.hargaTelur/ 4;
        
    }
    public int getTotalTelur() {
        return totalTelur;
    }
    // public void setTotalTelur(int totalTelur) {
    //     this.totalTelur = totalTelur;
    // }
    public int getHargaTelur() {
        return hargaTelur;
    }
    public void setHargaTelur(int hargaTelur) {
        this.hargaTelur = hargaTelur;
    }
    public int getProfit() {
        return profit;
    }
    @Override
    public void setJumlah(int jumlah) {
        // TODO Auto-generated method stub
        super.setJumlah(jumlah);
        this.profit = this.totalTelur * this.hargaTelur/ 4;

    }
}
