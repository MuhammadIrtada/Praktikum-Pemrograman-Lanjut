abstract class Tanaman {
    private String kebun;
    private int luas;
    private double perawatan;

    protected Tanaman(String kebun, int luas, double perawatan) {
        this.kebun = kebun;
        this.luas = luas;
        this.perawatan = perawatan;
    }

    public String getKebun() {
        return kebun;
    }

    public int getLuas() {
        return luas;
    }

    public double getPerawatan() {
        return perawatan;
    }

    protected double getPerawatanTotal(){
        return luas * perawatan;
    }

    abstract String showPendapatan();
    abstract String showPerawatan();
    abstract double getPendapatan();
    abstract double getBiayaPerawatan();


}
