public class Peternak {
    private String jenisHewan;
    private String ras;
    private int jumlahHewan;
    private int dosis;
    private int dosisPerHari;

    public Peternak(String jenisHewan, String ras, int jumlahHewan, int dosis) {
        this.jenisHewan = jenisHewan;
        this.ras = ras;
        this.jumlahHewan = jumlahHewan;
        this.dosis = dosis;
    }

    public String getjenisHewan() {
        return this.jenisHewan;
    }

    public String getras() {
        return this.ras;
    }

    public int getjumlahHewan() {
        return this.jumlahHewan;
    }

    public int getdosis() {
        return this.dosis;
    }

    public void sethitungDosisPerHari(int jumlahHewan, int dosis) {
        this.dosisPerHari = dosis * jumlahHewan;
    }

    public int gethitungDosisPerHari() {
        return dosisPerHari;
    }
}
