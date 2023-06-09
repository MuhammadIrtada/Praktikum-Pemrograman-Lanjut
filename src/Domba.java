public class Domba extends Hewan{

    public Domba(int jmlEkor, int hasil, float hargaHasil, float biayaPerawatan) {
        super(jmlEkor, hasil, hargaHasil, biayaPerawatan);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void cetakPendapatan() {
        System.out.printf("Domba:\t\t Rp. %,.0f\n", getPendapatan());
        
    }
    
    @Override
    public void cetakPerawatan() {
        System.out.printf("Domba:\t\t Rp. %,.0f\n", getPerawatan());
    }
    
}
