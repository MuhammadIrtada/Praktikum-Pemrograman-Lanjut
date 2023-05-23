public class Hewan {
    private String jenis;
    private int kuantitas;
    private double perawatanPerEkor, hargaPerEkor;

    public Hewan (String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor) {
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.perawatanPerEkor = perawatanPerEkor;
        this.hargaPerEkor = hargaPerEkor;
    }
    public String getJenis() {
        return this.jenis;
    }
    public int getKuantitas() {
        return this.kuantitas;
    }
    public double getPerawatanPerEkor() {
        return this.perawatanPerEkor;
    }
    public double getHargaPerEkor() {
        return this.hargaPerEkor;
    }
    public void tambahan (int unitTambahan) {
        this.kuantitas += unitTambahan;
    }

    public void showInformasi() {
        System.out.println("Jenis\t\t\t: " + this.jenis);
        System.out.println("Jumlah\t\t\t: " + this.kuantitas + " ekor");
    }
}
