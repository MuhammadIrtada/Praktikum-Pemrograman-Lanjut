public class Tanaman {
    private int JumlahTan;
    private String jenisTan;

    public Tanaman(int jumlah, String phon) {
        this.JumlahTan = jumlah;
        this.jenisTan = phon;
    }

    public int getJumlahTan() {
        return JumlahTan;
    }

    public void setJumlahTan(int jumlahTan) {
        JumlahTan = jumlahTan;
    }

    public String getJenisTan() {
        return jenisTan;
    }

    public void setJenisTan(String jenisTan) {
        this.jenisTan = jenisTan;
    }

}
