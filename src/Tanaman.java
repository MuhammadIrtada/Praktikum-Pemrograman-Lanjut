import java.text.NumberFormat;
import java.util.Locale;

public class Tanaman {
    private String jenisTanaman;
    private int kuantitas;
    static NumberFormat lk = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public Tanaman(String jenisTanaman, int kuantitas) {
        this.jenisTanaman = jenisTanaman;
        this.kuantitas = kuantitas;
    }

    public String getJenis() {
        return this.jenisTanaman;
    }

    public int getKuantitas() {
        return this.kuantitas;
    }

    public void tambahkuantitas(int baru) {
        this.kuantitas += baru;
    }

    public String toString() {
        return String.format("Jenis\t\t\t: %s\nLuas\t\t\t: %d Hektar\n", this.getJenis(), this.getKuantitas());
    }
}
