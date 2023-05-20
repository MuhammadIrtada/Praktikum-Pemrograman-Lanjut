package modul6;

public class Unta extends Hewan {
    private int hasil;
    private float jualHasil;

    public Unta(String jenis, int jumlahHewan, float hargaBeli, float hargaPerawatan, int hasil, float jualHasil){
        super(jenis, jumlahHewan, hargaBeli, hargaPerawatan);
        this.hasil=hasil;
        this.jualHasil=jualHasil;
    }

    public void menu1(){
        super.Informasi();
        int total = super.getJumlah()*hasil;
        System.out.printf("Susu/Ekor\t\t: %d Liter\nTotal Susu/Hari\t\t: %d Liter\nHarga Susu/Liter\t: Rp. %,.0f\n",hasil,total,jualHasil);
        profit();
        System.out.println("=".repeat(50));
    } 
    
    public void profit(){
        float profit=(super.getJumlah()*hasil*jualHasil)-(super.getJumlah()*super.getHargaPerawatan());
        System.out.printf("Profit/Hari\t\t: Rp. %,.0f\n",profit);
    }

}
