public class Tanaman {
    protected String jenis;
    protected int kuantitas;
    private double perawatanPerHektar, hargaPerKilo;

    public Tanaman (String jenis, int kuantitas, double perawatanPerHektar, double hargaPerKilo) {
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.perawatanPerHektar = perawatanPerHektar;
        this.hargaPerKilo = hargaPerKilo;
    }
    public String getJenis() {
        return this.jenis;
    }
    public int getKuantitas() {
        return this.kuantitas;
    }
    public double getPerawatanPerHektar() {
        return this.perawatanPerHektar;
    }
    public double getHargaPerKilo() {
        return this.hargaPerKilo;
    }
    public void tambahan (int unitTambahan) {
        this.kuantitas += unitTambahan;
    }

    public void showInformasi() {
        System.out.println("Jenis\t\t\t: " + this.jenis);
        System.out.println("Luas\t\t\t: " + this.kuantitas + " Hektar");
    }
}