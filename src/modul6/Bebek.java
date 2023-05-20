package modul6;

public class Bebek extends Hewan{
    private int hasil;
    private float jualHasil;

    public Bebek(String jenis, int jumlahHewan, float hargaBeli, float hargaPerawatan, int hasil, float jualHasil){
        super(jenis, jumlahHewan, hargaBeli, hargaPerawatan);
        this.hasil=hasil;
        this.jualHasil=jualHasil;
    }

    public void menu1(){
        super.Informasi();
        int total = super.getJumlah()*hasil;
        System.out.printf("Telur/Ekor\t\t: %d Butir\nTotal Telur/Hari\t: %d Butir\nHarga Telur/Butir\t: Rp. %,.0f\n",hasil,total,jualHasil);
        profit();
        System.out.println("=".repeat(50));
    } 

    public void profit(){
        float profit=(super.getJumlah()*hasil*jualHasil)-(super.getJumlah()*super.getHargaPerawatan());
        System.out.printf("Profit/Hari\t\t: Rp. %,.0f\n",profit);
    }

}
