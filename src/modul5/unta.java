package modul5;

public class unta {
    private static int jmlUnta = 3;
    private static int hslSusu = 5;
    private static int hargaUn=60000;

    private static unta objectUnt=new unta();

    public int getTotalSs(){
        return jmlUnta*hslSusu;
    }
    public int getPemUn(){
        return getTotalSs()*hargaUn;
    }
    
    public static void infoUnta(){
        System.out.println("=".repeat(40));
        System.out.println("Jenis \t\t\t: Unta");
        System.out.println("Ras \t\t\t: Susu Putih");
        System.out.println("Jumlah \t\t\t: "+jmlUnta+" Ekor");
        System.out.println("Susu/Ekor \t\t: "+hslSusu+" Liter");
        System.out.println("Total Susu/Hari\t\t: "+objectUnt.getTotalSs()+" liter");
        System.out.println("Harga Susu/Butir\t: "+hargaUn);
    }
    public static void pemasukanUnta(){
        System.out.println("Jenis\t\t: Unta | Susu Putih");
        System.out.println("Pemasukan\t: "+objectUnt.getPemUn());
    }
   
}
