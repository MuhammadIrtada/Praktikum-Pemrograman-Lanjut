public class Hewan {
    private String hewan;
    private int jumlah;
    private int penghasilan;
    private float hargaJual;
    private float hargaPerawatan;
    
    public Hewan (String hewan, int jumlah, int penghasilan, float hargaJual, float hargaPerawatan){
        this.hewan = hewan;
        this.jumlah = jumlah;
        this.penghasilan = penghasilan;
        this.hargaJual = hargaJual;
        this.hargaPerawatan = hargaPerawatan;
    }

    public String getHewan(){
        return this.hewan;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }

    public int getPenghasilan(){
        return this.penghasilan;
    }

    public float getHargaJual(){
        return this.hargaJual;
    }

    public float hargaPerawatan(){
        return this.hargaPerawatan;
    }
    //Output 1
    public float totalJual(){
        return 0;
    }
    public float totalPerawatan(){
        return 0;
    }

    public void output1(){
        System.out.println(0);
    }
    public void output11() {
        System.out.println(0);
    }

    //output 2


}
