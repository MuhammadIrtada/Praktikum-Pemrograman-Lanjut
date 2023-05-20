public class TernakV2 {
    private final String[] jenis = {"Bebek","Unta","Domba"};
    private final String[] atribut = {"Telur biasa","Telur asin","Susu putih","Susu coklat","Bulu hitam","Bulu putih"};
    private final int[] dosisObat = {5,8,10,15,9,14};
    private int[] jumlah=new int[6];
    private int hasil=0;
    TernakV2(int bebekBiasa,int bebekAsin,int untaPutih,int untaCoklat,int dombaHitam,int dombaPutih){
        jumlah[0]=bebekBiasa; jumlah[1]=bebekAsin; jumlah[2]=untaPutih;jumlah[3]=untaCoklat;jumlah[4]=dombaHitam;jumlah[5]=dombaPutih;
    }
    TernakV2(){//nilai default
        jumlah[0]=1; jumlah[1]=1; jumlah[2]=1;jumlah[3]=1; jumlah[4]=1; jumlah[5]=1;
    }
    public void dosis(){
        int count=0;
        for(int i=0;i<6;i++){
            if (i%2==0){ 
                System.out.println("Jenis\t\t\t: "+jenis[count]+"\n"+"-".repeat(55));
                count++;
            }
            System.out.println("Ras\t\t\t: "+atribut[i]+"\nJumlah\t\t\t: "+ jumlah[i]+" ekor\nDosis obat/ekor\t\t: "+dosisObat[i]+"ml\n"+"-".repeat(55));
            if(i%2==1){
                System.out.println("Jumlah dosis obat/hari\t: "+dosis(i-1)+"ml\nJumlah dosis obat/hari\t: "+dosis(i)+"ml\nTotal dosis obat/hari\t: "+dosis(dosis(i-1), dosis(i))+"ml\n"+"=".repeat(55)+"\n");
            } 
        }
    }
    private int dosis(int kode){
        hasil= jumlah[kode]*dosisObat[kode];
        return hasil;
    }
    private int dosis(int dosis1, int dosis2){//total
        hasil= dosis1+dosis2;
        return hasil;
    }
}
