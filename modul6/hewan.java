package modul6;

public class hewan {
    private String nama;
    private int total;

    public hewan(String nama, int total){
        this.nama = nama;
        this.total = total;
    }
    public String getNama(){
        return this.nama;

    }
    public int getTotal(){
        return this.total;
    }
    public void tmbhJumlah(int jmlBaru){
        this.total=this.total + jmlBaru;
    }
    public String info(){
        return String.format("jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.nama, this.total);
    }
}
