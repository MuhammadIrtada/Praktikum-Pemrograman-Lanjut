package Modul_3_4;

public class Jenis {
    protected String[] jenis;
    protected String[][] hitung;

    protected Jenis(String[] jenis) {
        this.jenis = jenis;
    }

    protected String[] getJenis() {
        return jenis;
    }

    protected String getJenisByIndex(int index) {
        return jenis[index];
    }

    protected void kaliJenis(double d) {
        for (int i = 0; i < jenis.length; i++) {
            int jumlah = Integer.parseInt(jenis[i]);
            jumlah *= d;
            jenis[i] = String.valueOf(jumlah);
        }
    }
}
