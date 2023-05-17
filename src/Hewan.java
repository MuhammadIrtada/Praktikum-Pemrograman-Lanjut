import java.text.NumberFormat;
import java.util.Locale;
public class Hewan {
    private String jenisHewan;
    private int kuantitas;
    static NumberFormat lk = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public Hewan(String jenisHewan, int kuantitas) {
        this.jenisHewan = jenisHewan;
        this.kuantitas = kuantitas;
    }

    public String getJenis() {
        return this.jenisHewan;
    }

    public int getKuantitas() {
        return this.kuantitas;
    }

    public void tambahkuantitas(int baru) {
        this.kuantitas += baru;
    }

    public String toString() {
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.getJenis(), this.getKuantitas());
    }
}
