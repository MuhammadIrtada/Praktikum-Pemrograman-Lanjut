public abstract class Ternak {
    private String jenis;
    static private float totalPendapatan;
    static private float totalPerawatan;

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public abstract float pendapatan();

    public abstract float perawatan();

    public void setTotalPendapatan(float totalPendapatan) {
        totalPendapatan += totalPendapatan;
    }

    public float getTotalPendapatan() {
        return totalPendapatan;
    }

    public void setTotalPerawatan(float totalPerawatan) {
        totalPerawatan += totalPerawatan;
    }

    public float getTotalPerawatan() {
        return totalPerawatan;
    }
}
