package modul6;

public class tumbuhan {
    private String nama;
    private int total;

    public tumbuhan(String nama, int total){
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
        return String.format("jenis\t\t\t: %s\nLuas\t\t\t: %d Hektar\n", this.nama, this.total);
    }
}
