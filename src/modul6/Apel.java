package modul6;

public class Apel extends Tanaman{
    private int hasil;
    private float jualHasil;

    public Apel(String jenis, int luasTanah, float hargaBeli, float hargaPerawatan, int hasil, float jualHasil){
        super(jenis, luasTanah, hargaBeli, hargaPerawatan);
        this.hasil=hasil;
        this.jualHasil=jualHasil;
    }

    public void menu1(){
        super.Informasi();
        int total = super.getJumlah()*hasil;
        System.out.printf("Buah/Hektar\t\t: %d Kg\nTotal Buah/Hari\t\t: %d Kg\nHarga Buah/Kg\t\t: Rp. %,.0f\n",hasil,total,jualHasil);
        profit();
        System.out.println("=".repeat(50));
    } 

    public void profit(){
        float profit=(super.getJumlah()*hasil*jualHasil)-(super.getJumlah()*super.getHargaPerawatan());
        System.out.printf("Profit/Hari\t\t: Rp. %,.0f\n",profit);
    }
}
