package peternakan_34;
public class Peternakan_34 {
    private String jenis;
    private String ras;
    private int jumlah;
    private String ras2;
    private int jumlah2;
    private int dosis = 1;
    private int dosis2 = 1;
    private double totalDosis;
    private double totalDosis2;
    
    public Peternakan_34(String jenis, String ras){
        this.jenis = jenis;
        this.ras = ras;
    }
    
    public Peternakan_34(String jenis, String ras, int jumlah, String ras2, int jumlah2,int dosis, int dosis2){
        this.jenis = jenis;
        this.ras = ras;
        this.ras2 = ras2;
        this.jumlah = jumlah;
        this.jumlah2 = jumlah2;
        this.dosis = dosis;
        this.dosis2 = dosis2;
    }
    
    public void display(){
        System.out.println("jenis\t\t: " + getJenis());
        garis();
        System.out.println("Ras\t\t: "+ getRas());
        System.out.println("Jumlah\t\t: "+getJumlah()+" ekor");
        System.out.println("Dosis/Obat/Ekor\t: "+getDosis()+"ml");
        garis();
        System.out.println("Ras\t\t: "+ getRas2());
        System.out.println("Jumlah\t\t: "+getJumlah2()+" ekor");
        System.out.println("Dosis/Obat/Ekor\t: "+getDosis2()+"ml");
        garis();
        System.out.println("Jumlah dosis Obat/Hari\t: "+(int)getTotalDosis()+"ml");
        System.out.println("Jumlah dosis Obat/Hari\t: "+(int)getTotalDosis2()+"ml");
        System.out.println("Total dosis Obat/Hari\t: "+getTotalAkhirInt()+"ml");
        garis2();
        System.out.println();
    }
    
    public void display(double a){
        System.out.println("jenis\t\t: " + getJenis());
        garis();
        System.out.println("Ras\t\t: "+ getRas());
        System.out.println("Jumlah\t\t: "+getJumlah()+" ekor");
        System.out.println("Dosis/Obat/Ekor\t: "+getDosis()+"ml");
        garis();
        System.out.println("Ras\t\t: "+ getRas2());
        System.out.println("Jumlah\t\t: "+getJumlah2()+" ekor");
        System.out.println("Dosis/Obat/Ekor\t: "+getDosis2()+"ml");
        garis();
        System.out.println("Jumlah dosis Obat/Hari\t: "+(int)getTotalDosis()+"ml");
        System.out.println("Jumlah dosis Obat/Hari\t: "+(int)getTotalDosis2()+"ml");
        System.out.println("Total dosis Obat/Hari\t: "+getTotalAkhir()+"ml");
        garis2();
        System.out.println();
    }
    
    public int setJumlah(int jumlah){
        return this.jumlah = jumlah;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }
    
    public int getJumlah2(){
        return this.jumlah2;
    }
    
    public String getJenis(){
        return this.jenis;
    }
    
    public String getRas(){
        return this.ras;
    }
    
    public String getRas2(){
        return this.ras2;
    }
    
    
    public int getDosis(){
        return this.dosis;
    }
    
    public int getDosis2(){
        return this.dosis2;
    }
    
    public  double getTotalDosis(){
        return getDosis() * getJumlah();
    }
    
    public  double getTotalDosis2(){
        return getDosis2() * getJumlah2();
    }
    
    public double getTotalAkhir(){
        return getTotalDosis() + getTotalDosis2();
    }
    
    public int getTotalAkhirInt(){
        return (int)(getTotalDosis() + getTotalDosis2());
    }
    
    public void garis(){
        for(int i=0; i < 45; i++){
            System.out.print("-");
        }
        System.out.println(); 
    }
    
    public void garis2(){
        for(int i=0; i < 45; i++){
            System.out.print("=");
        }
        System.out.println(); 
    }
    
    
    
}