public class Ternak {
    private  String[]jenis={"Bebek","Unta","Domba"};
    private  int[] produk = {2,5,4};
    private  double[] kons = {2.5,2,1.5};
    private int[] jumlah=new int[3];
    Ternak(int bebek,int unta,int domba){
        jumlah[0]=bebek; jumlah[1]=unta; jumlah[2]=domba;
    }
    public void display(){
        for(int i=0;i<3;i++){
            int telur = (int)((double)produk[i]*kons[i]);
            int bef =jumlah[i]*produk[i] ;
            double aft =bef*kons[i] ;
            String atr="";String atr2="";
            System.out.println("Jenis\t\t\t: "+jenis[i]+"\nJumlah\t\t\t: "+jumlah[i]+" ekor");
            switch(i){
                case 0:atr="Telur";;atr2="Butir";break;
                case 1:atr="Susu";atr2="Liter";break;
                case 2:atr="Bulu";atr2="kg";break;
            }
            System.out.println(atr+"/Ekor\t\t: "+produk[i]+" "+atr2+"\n"+atr+"/Ekor\t\t: "+telur+" "+atr2+" (Setelah Booster)");
            System.out.println("Total "+atr+"/Hari \t: "+bef+" "+atr2+"\nTotal "+atr+"/Hari \t: "+(int)aft+" "+atr2+" (Setelah Booster)");
            System.out.println("=".repeat(55));
        }
    }
}
