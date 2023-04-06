package modul5;

public class duck {
    private static int jmlBebek = 15;
    private static int hslTelur = 2;
    private static int hargabbk=2000;

    private static duck objectBbk=new duck();

    public int getTotaltlr(){
        return jmlBebek*hslTelur;
    }
    public int getPembbk(){
        return getTotaltlr()*hargabbk;
    }
    public static void infoBebek(){
        System.out.println("Jenis \t\t\t: Bebek");
        System.out.println("Ras \t\t\t: Telur Biasa");
        System.out.println("Jumlah \t\t\t: "+jmlBebek+" Ekor");
        System.out.println("Telur/Ekor \t\t: "+hslTelur+" Butir");
        System.out.println("Total Telur/Hari\t: "+objectBbk.getTotaltlr()+" Butir");
        System.out.println("Harga Telur/Butir\t: "+hargabbk);
    }
    public static void pemasukanBebek(){
        System.out.println("Jenis\t\t: Bebek | Telur Biasa");
        System.out.println("Pemasukan\t: "+objectBbk.getPembbk());
        System.out.println("-".repeat(40));
    }
    
}
