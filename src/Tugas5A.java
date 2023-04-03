

public class Tugas5A {
    private String Hewan;
    private int jumlahHewan;
    private int Hasil;
    private int jumlahHasil;
    private int hargaHasil;
    private int jumlahHargaHasil;
    
    public Tugas5A(String Hewan, int jumlahHewan, int Hasil, int hargaHasil){
        this.Hewan = Hewan;
        this.jumlahHewan = jumlahHewan;
        this.Hasil = Hasil;
        this.hargaHasil = hargaHasil;
        this.jumlahHasil = this.Hasil * this.jumlahHewan;
        this.jumlahHargaHasil = this.hargaHasil * this.jumlahHasil;
    }
    
    public String getHewan(){
        return this.Hewan;
    }
    
    public int getjumlahHewan(){
        return this.jumlahHewan;
    }
    
    public int getHasil(){
        return this.Hasil;
    }
    
    public int gethargaHasil(){
        return this.hargaHasil;
    }        
    
    public int getjumlahHasil(){
        return this.jumlahHasil;
    }
    
    public int getjumlahHargaHasil(){
        return this.jumlahHargaHasil;
    }
    
    public void Output(){
        System.out.println("=".repeat(75));
        System.out.println("Jenis\t\t\t : " + this.Hewan);
        System.out.println("Jumlah\t\t\t : " + this.jumlahHewan + " Ekor");
        if (this.Hewan.equalsIgnoreCase("bebek")){
            System.out.println("Telur/Ekor\t\t : " + this.Hasil + " Butir");
            System.out.println("Total Telur/Hari\t : " + this.jumlahHasil + " Butir");
            System.out.println("Harga Telur/Butir\t : " + this.hargaHasil);
        } else if (this.Hewan.equalsIgnoreCase("domba")){
            System.out.println("Bulu/Ekor\t\t : " + this.Hasil + " Kg");
            System.out.println("Total Bulu/Hari\t\t : " + this.jumlahHasil + " Kg");
            System.out.println("Harga Bulu/Kg\t\t : " + this.hargaHasil);
        } else {
            System.out.println("Susu/Ekor\t\t : " + this.Hasil + " Liter");
            System.out.println("Total Susu/Hari\t\t : " + this.jumlahHasil + " Liter");
            System.out.println("Harga Susu/Liter\t : " + this.hargaHasil);
        }
    }
    
    public void Output2(){
        System.out.println("=".repeat(75));
        System.out.println("Jenis\t\t : " + this.Hewan);
        System.out.println("Pemasukan\t : " + this.jumlahHargaHasil);
        System.out.println("-".repeat(75));
    } 
    
    public void Output3 (){
        System.out.println("=".repeat(75));
        System.out.println("Jenis\t\t : " + this.Hewan);
        System.out.println("Pemasukan\t : " + this.jumlahHargaHasil / 10/100);
        System.out.println("-".repeat(75));
    }
}
