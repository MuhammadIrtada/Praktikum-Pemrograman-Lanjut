public class Apel extends Tanaman{
    
    public Apel(int luasKebun, int hasil, float hargaHasil, float biayaPerawatan) {
        super(luasKebun, hasil, hargaHasil, biayaPerawatan);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void cetakPendapatan() {
        System.out.printf("Apel:\t\t Rp. %,.0f\n", getPendapatan());
        
    }

    @Override
    public void cetakPerawatan() {
        System.out.printf("Apel:\t\t Rp. %,.0f\n", getPerawatan());
    }


}
