public class Tugas3A {
    private int bebekBiasa;
    private int dosisBebekBiasa;
    private int bebekAsin;
    private int dosisBebekAsin;
    private int untaPutih;
    private int dosisUntaPutih;
    private int untaCoklat;
    private int dosisUntaCoklat;
    private int dombaHitam;
    private int dosisDombaHitam;
    private int dombaPutih;
    private int dosisDombaPutih;
    
    public Tugas3A(){
        System.out.println("Modul 3 dan 4");
    }
    
    public Tugas3A(int bebekBiasa, int bebekAsin, int untaPutih, int untaCoklat, int dombaHitam, int dombaPutih){
        this.bebekBiasa = bebekBiasa;
        this.bebekAsin = bebekAsin;
        this.untaPutih = untaPutih;
        this.untaCoklat = untaCoklat;
        this.dombaHitam = dombaHitam;
        this.dombaPutih = dombaPutih;
    }
    
    public int getbebekBiasa(){
     return this.bebekBiasa;
    }
    
    public int getbebekAsin(){
     return this.bebekAsin;
    }
    
    public int getuntaPutih(){
     return this.untaPutih;
    }
    
    public int getuntaCoklat(){
     return this.untaCoklat;
    }
    
    public int getdombaHitam(){
     return this.dombaHitam;
    }
    
    public int getdombaPutih(){
     return this.dombaPutih;
    }
    
    public void Dosis(int bebekBiasa, int bebekAsin, int untaPutih, int untaCoklat, int dombaHitam, int dombaPutih){
        this.dosisBebekBiasa = bebekBiasa;
        this.dosisBebekAsin = bebekAsin;
        this.dosisUntaPutih = untaPutih;
        this.dosisUntaCoklat = untaCoklat;
        this.dosisDombaHitam = dombaHitam;
        this.dosisDombaPutih = dombaPutih;
    } 
    
    public void Dosis(){
        System.out.println("-".repeat(65));
        System.out.println("Jenis\t\t" + "= Bebek");
        System.out.println("-".repeat(65));
        System.out.println("Ras\t\t" + "= Biasa");
        System.out.println("Jumlah\t\t" + "= " + this.bebekBiasa + " ekor");
        System.out.println("Dosis\t\t" + "= " + this.dosisBebekBiasa + "ml");
        System.out.println("Jumlah Dosis\t" + "= " + this.dosisBebekBiasa * this.bebekBiasa + "ml");
        System.out.println("-".repeat(65));
        System.out.println("Ras\t\t" + "= Asin");
        System.out.println("Jumlah\t\t" + "= " + this.bebekAsin + " ekor");
        System.out.println("Dosis\t\t" + "= " + this.dosisBebekAsin + "ml");
        System.out.println("Jumlah Dosis\t" + "= " + this.dosisBebekAsin * this.bebekAsin + "ml");
        System.out.println("-".repeat(65));
        System.out.println("Jenis\t\t" + "= Unta");
        System.out.println("-".repeat(65));
        System.out.println("Ras\t\t" + "= Putih");
        System.out.println("Jumlah\t\t" + "= " + this.untaPutih + " ekor");
        System.out.println("Dosis\t\t" + "= " + this.dosisUntaPutih + "ml");
        System.out.println("Jumlah Dosis\t" + "= " + this.dosisUntaPutih * this.dosisUntaPutih + "ml");
        System.out.println("-".repeat(65));
        System.out.println("Ras\t\t" + "= Coklat");
        System.out.println("Jumlah\t\t" + "= " + this.untaCoklat + " ekor");
        System.out.println("Dosis\t\t" + "= " + this.dosisUntaCoklat + "ml");
        System.out.println("Jumlah Dosis\t" + "= " + this.dosisUntaCoklat * this.dosisUntaCoklat + "ml");
        System.out.println("-".repeat(65));
        System.out.println("Jenis\t\t" + "= Domba");
        System.out.println("-".repeat(65));
        System.out.println("Ras\t\t" + "= Hitam");
        System.out.println("Jumlah\t\t" + "= " + this.dombaHitam + "ekor");
        System.out.println("Dosis\t\t" + "= " + this.dosisDombaHitam + "ml");
        System.out.println("Jumlah Dosis\t" + "= " + this.dosisDombaHitam * this.dombaHitam + "ml");
        System.out.println("-".repeat(65));
        System.out.println("Ras\t\t" + "= Putih");
        System.out.println("Jumlah\t\t" + "= " + this.dombaPutih + " ekor");
        System.out.println("Dosis\t\t" + "= " + this.dosisDombaPutih + "ml");
        System.out.println("Jumlah Dosis\t" + "= " + this.dosisDombaPutih * this.dombaPutih + "ml");
        
    }
    
}
