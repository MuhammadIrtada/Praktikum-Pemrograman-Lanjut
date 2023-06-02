public class Apel extends Kebun {
    public Apel (String kebun, int jumlah, int penghasilan, float hargaJual, float hargaPerawatan){
        super(kebun, jumlah, penghasilan, hargaJual, hargaPerawatan);
    }

    //output 2
    @Override
    public float totalJual(){
        float total = super.getJumlah() * super.getPenghasilan() * super.getHargaJual();
        return total;
    }
    @Override
    public float totalPerawatan(){
        float total = super.getJumlah() * super.hargaPerawatan();
        return total;
    }

    @Override
    public void output1(){
        totalJual();
    }
    @Override
    public void output11() {
        totalPerawatan();
    }

    //output 3
}
