package modul6;

public class KelapaSawit extends Tanaman{
    private int hasil;
    private float jualHasil;

    public KelapaSawit(String jenis, int luasTanah, float hargaBeli, float hargaPerawatan, int hasil, float jualHasil){
        super(jenis, luasTanah, hargaBeli, hargaPerawatan);
        this.hasil=hasil;
        this.jualHasil=jualHasil;
    }

    public void menu1(){
        super.Informasi();
        int total = super.getJumlah()*hasil;
        System.out.printf("Minyak/Hektar\t\t: %d Kg\nTotal Minyak/Hari\t: %d Kg\nHarga Minyak/Kg\t\t: Rp. %,.0f\n",hasil,total,jualHasil);
        profit();
        System.out.println("=".repeat(50));
    } 

    public void profit(){
        float profit=(super.getJumlah()*hasil*jualHasil)-(super.getJumlah()*super.getHargaPerawatan());
        System.out.printf("Profit/Hari\t\t: Rp. %,.0f\n",profit);
    }
}