package modul5;

public class domba {
    private static int jmlDomba = 4;
    private static int hslBulu = 4;
    private static int hargadom=15000;

    private static domba objectDom=new domba();

    public int getTotalBul(){
        return jmlDomba*hslBulu;
    }
    public int getPemDom(){
        return getTotalBul()*hargadom;
    }
    
    public static void infoDomba(){
        System.out.println("=".repeat(40));
        System.out.println("Jenis\t\t\t: Domba");
        System.out.println("Ras\t\t\t: Bulu Hitam");
        System.out.println("Jumlah \t\t\t: "+jmlDomba+" Ekor");
        System.out.println("Bulu/Ekor \t\t: "+hslBulu+" Kg");
        System.out.println("Total Bulu/Hari\t\t: "+objectDom.getTotalBul()+" Kg");
        System.out.println("Harga Bulu/Butir\t: "+hargadom);
    }
    public static void pemasukanDomba(){
        System.out.println("Jenis\t\t: Domba | Bulu Hitam");
        System.out.println("Pemasukan\t: "+objectDom.getPemDom());
        System.out.println("-".repeat(40));
    }
}
