package Modul5;

public class Peternakan5{
    private String jenis;
    private String ras;
    private String satuan;
    private int jumlah;
    private int produk;
    private int harga;
    private int ppn;

    public Peternakan5(String j, String r, int ju, int p,int h, String s, int p2){
        jenis = j;
        ras = r;
        jumlah = ju;
        produk = p;
        harga = h;
        satuan = s;
        ppn = p2;
    }

    public void display1(String jProduk){
        System.out.println("Jenis\t\t\t: "+getJenis());
        System.out.println("Ras\t\t\t: "+getRas());
        System.out.println("Jumlah\t\t\t: "+getJumlah()+" ekor");
        System.out.println(jProduk+"/Ekor\t\t: "+getProduk()+" "+getSatuan());
        System.out.println("Total "+jProduk+"/Hari  \t: "+getTotProduk()+" "+getSatuan());
        System.out.println("Harga "+jProduk+"/"+getSatuan()+"      \t: "+getHarga());
        garis2();
    }

    public void display2(){
        System.out.println("Jenis\t\t: "+getJenis()+" | "+getRas());
        System.out.println("Pemasukan\t: "+getPemasukan());
        garis();
    }

    public void display3(){
        System.out.println("Jenis\t\t: "+getJenis()+" | "+getRas());
        System.out.println("Pemasukan\t: "+getPemasukanPPN());
        garis();
    }

    public String getJenis(){ return jenis;}

    public String getRas(){return ras;}

    public int getJumlah(){return jumlah;}

    public int getProduk(){return produk;}

    public int getTotProduk(){return getJumlah()*getProduk();}

    public int getHarga(){return harga;}

    public String getSatuan(){return satuan;}

    public int getPPN(){return ppn;}

    public int getPemasukan(){
        return getTotProduk() * getHarga();
    }

    public int getPemasukanPPN(){
        return getPemasukan() + (getPemasukan()/getPPN());
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