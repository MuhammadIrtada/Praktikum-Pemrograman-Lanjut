public class Tanaman {
    private String jenis;
    private int kuantitas; // per tanaman (hektar)
    private float hargaPerHektar;
    private float perawatanPerHektar;

    public Tanaman(String jenis, int kuantitas, float hargaPerHektar, float perawatanPerHektar) {
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.hargaPerHektar = hargaPerHektar;
        this.perawatanPerHektar = perawatanPerHektar;
    }

    public String getJenis() {
        return this.jenis;
    }

    public int getKuantitas() {
        return this.kuantitas;
    }

    public float getHargaPerHektar() {
        return this.hargaPerHektar;
    }

    public float getPerawatanPerHektar() {
        return this.perawatanPerHektar;
    }

    public void addJumlah(int jumlahBaru){
        this.kuantitas = this.kuantitas + jumlahBaru;
    }

    public String showInformasi() {
        return String.format("Jenis\t\t\t: %s\nLuas\t\t\t: %d hektar\n", this.jenis, this.kuantitas);
    }
}


