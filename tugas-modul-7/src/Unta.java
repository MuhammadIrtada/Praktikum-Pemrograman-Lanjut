public class Unta extends Hewan {
    public Unta (String hewan, int jumlah, int penghasilan, float hargaJual, float hargaPerawatan){
        super(hewan, jumlah, penghasilan, hargaJual, hargaPerawatan);
    }

    //output 1
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

