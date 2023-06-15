public abstract class Perkebunan {
    private String jenis;
    private int kuantitas;
    private double perawatanPerHektar, hargaPerKilo;

    public Perkebunan (String jenis, int kuantitas, double perawatanPerHektar, double hargaPerKilo) {
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.perawatanPerHektar = perawatanPerHektar;
        this.hargaPerKilo = hargaPerKilo;
    }

    public String getJenis() {
        return jenis;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public double getPerawatanPerHektar() {
        return perawatanPerHektar;
    }

    public double getHargaPerKilo() {
        return hargaPerKilo;
    }
    
    public abstract double pendapatan();

    public abstract double perawatan();
    
    public void display1() {
        System.out.println(getJenis() + ":\t\t Rp. " + pendapatan());
    }

    public void display2() {
        System.out.println(getJenis() + ":\t\t Rp. " + perawatan());
    }
}