package Modul5;

public class Jenis {
    private String[] jenis;

    protected Jenis(String[] jenis) {
        this.jenis = jenis;
    }

    protected String[] getJenis() {
        return jenis;
    }

    protected String getJenisByIndex(int index) {
        return jenis[index];
    }
}

