public class Hewan {
    private String jenis;
    private int kuantitas;
    private float hargaPerEkor;
    private float perawatanPerEkor;

    public Hewan(String jenis, int kuantitas, float hargaPerEkor, float perawatanPerEkor){
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.hargaPerEkor = hargaPerEkor;
        this.perawatanPerEkor = perawatanPerEkor;
    }

    public String getJenis(){
        return this.jenis;
    }

    public int getKuantitas(){
        return this.kuantitas;
    }

    public float getHargaPerEkor(){
        return this.hargaPerEkor;
    }

    public float getPerawatanPerEkor(){
        return this.perawatanPerEkor;
    }

    public void addJumlah(int jumlahBaru){
        this.kuantitas = this.kuantitas + jumlahBaru;
    }

    public String showInformasi(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.jenis, this.kuantitas);
    }

}

