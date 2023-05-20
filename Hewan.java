public class Hewan {
    private String jenis;
    private int kuantitas;
    private float hargaPerEkor;

    public Hewan (String jenis,int kuantitas,float hargaPerEkor){
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.hargaPerEkor = hargaPerEkor;
    }

    public String getJenis(){
        return this.jenis;
    }
    public int getKuantitas(){
        return this.kuantitas;
    }
    public float getHarga(){
        return this.hargaPerEkor;
    }

    public void addJumlah(int jumlahBaru){
        this.kuantitas = this.kuantitas + jumlahBaru;
    }

    public void pembelian(String namaHewan,int jumlah,float hargaTotal){
        
    } 

    public String showInformasi(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.jenis, this.kuantitas);
    }
}
