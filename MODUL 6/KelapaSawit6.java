package com;

public class KelapaSawit6 extends Tanaman6 {
    private int KelapaSawitPerTanaman = 1;
    private int totalKelapaSawit = 1;
    private int hargaKelapaSawit = 1;
    private int profit = 1;
    public KelapaSawit6(String Jenis, int Jumlah){
        super(Jenis, Jumlah);
    }
    public int getKelapaSawitPerTanaman() {
        return KelapaSawitPerTanaman;
    }

    public void setKelapaSawitPerTanaman(int kelapaSawitPerTanaman) {
        KelapaSawitPerTanaman = kelapaSawitPerTanaman;
        this.totalKelapaSawit = this.KelapaSawitPerTanaman * getJumlah();
        this.profit = this.totalKelapaSawit * this.hargaKelapaSawit/ 18;

    }
    public int getTotalKelapaSawit() {
        return totalKelapaSawit;
    }
    // public void setTotalKelapaSawit(int totalKelapaSawit) {
    //     this.totalKelapaSawit = totalKelapaSawit;
    // }
    public int getHargaKelapaSawit() {
        return hargaKelapaSawit;
    }
    public void setHargaKelapaSawit(int hargaKelapaSawit) {
        this.hargaKelapaSawit = hargaKelapaSawit;
    }
    public int getProfit() {
        return profit;
    }
    
    @Override
    public void setJumlah(int jumlah) {
        // TODO Auto-generated method stub
        super.setJumlah(jumlah);
        this.profit = this.totalKelapaSawit * this.hargaKelapaSawit/ 18;

    }
}
