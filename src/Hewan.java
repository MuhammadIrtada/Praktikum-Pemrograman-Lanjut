abstract class Hewan {
    private String ternak;
    private int kuantitas;
    private double perawatan;

    protected Hewan(String ternak, int kuantitas, double perawatan) {
        this.ternak = ternak;
        this.kuantitas = kuantitas;
        this.perawatan = perawatan;
    }

    public String getTernak() {
        return ternak;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public double getPerawatan() {
        return perawatan;
    }

    protected double getPerawatanTotal(){
        return kuantitas * perawatan;
    }

    abstract String showPendapatan();
    abstract String showPerawatan();
    abstract double getPendapatan();
    abstract double getBiayaPerawatan();


}
