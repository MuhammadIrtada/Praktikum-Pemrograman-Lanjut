public class Kas {
    private int jumlahKas;

    public Kas(int jumlahKas) {
        this.jumlahKas = jumlahKas;
    }
    public int getJumlahKas() {
        return jumlahKas;
    }
    public void kurangiKas(int jumlah) {
        jumlahKas -= jumlah;
    }
}