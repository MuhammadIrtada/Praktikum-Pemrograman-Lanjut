package modul6;

public class kelapaSawit extends tumbuhan{
    private int jmlKelapa; //per hewan
    private float hargaKelapa; //per telur

    public kelapaSawit (String nama, int total, int jmlKelapa, float hargaKelapa){
        super(nama, total);
        this.jmlKelapa=jmlKelapa;
        this.hargaKelapa=hargaKelapa;
    }
    public int getJmlKelapa(){
        return this.jmlKelapa;
    }
    public float getHargaKelapa(){
        return this.hargaKelapa;
    }
    public int getTotalKelapa(){
        return this.jmlKelapa* super.getTotal();
    }
    public float getTtlHargaKelapa(){
        float totalHarga = this.hargaKelapa * this.getTotalKelapa();
        return totalHarga;
    }
    public String info(){
        String fromparent = super.info();
        String fromchild = String.format("Minyak/Hektar\t\t: %d Kg\nTotal Minyak/Hari\t: %d Kg\nHarga Minyak/Butir\t: Rp. \nProfit/Hari\t\t: Rp.", this.jmlKelapa, this.getTotalKelapa(), this.hargaKelapa, this.getTtlHargaKelapa());
        return fromparent + fromchild;
    }
}
