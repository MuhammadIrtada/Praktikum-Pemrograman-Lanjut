
public class PeternakanV4 {
    private String jenisHewan;
    private String ras;
    private int jumlahHewan;
    private String hasilUnik;
    private int jumlahHasilUnik;
    private String satuan;
    private int harga;
    private static int jumlahObjek = 0;

    public PeternakanV4(String jenisHewan, String ras, int jumlahHewan, String hasilUnik, int jumlahHasilUnik, String satuan, int harga) {
        jumlahObjek++;
        this.jenisHewan = jenisHewan;
        this.ras = ras;
        this.jumlahHewan = jumlahHewan;
        this.hasilUnik = hasilUnik;
        this.jumlahHasilUnik = jumlahHasilUnik;
        this.satuan = satuan;
        this.harga = harga;
    }

    public int hasilUnikPerHari() {
        int hasilPerhari;
        hasilPerhari = this.getJumlahHewan() * this.getJumlahHasilUnik();
        return hasilPerhari;
    }

    public int totalPemasukan() {
        int totalPemasukan;
        totalPemasukan = this.hasilUnikPerHari() * getHarga();
        return totalPemasukan;
    }

    public double hargaSetelahPPN() {
        double hargaSetelahPPN;
        hargaSetelahPPN = this.totalPemasukan() * MainPeternakanV4.ppn;
        return hargaSetelahPPN;
    }

    public static void print1(PeternakanV4 peternak[]) {
        for (int i = 0; i < peternak.length; i++) {
            System.out.println("Jenis\t\t\t:" + peternak[i].getJenisHewan());
            System.out.println("Ras\t\t\t:" + peternak[i].getRas());
            System.out.println("Jumlah\t\t\t:" + peternak[i].getJumlahHewan() + " ekor");
            System.out.println(peternak[i].getHasilUnik() + "/Ekor\t\t:" + peternak[i].getJumlahHasilUnik() + " "
                    + peternak[i].getSatuan());
            System.out.println("Total " + peternak[i].getHasilUnik() + "/Hari \t:" + peternak[i].hasilUnikPerHari()
                    + " " + peternak[i].getSatuan());
            System.out.println("Harga " + peternak[i].getHasilUnik() + "/" + peternak[i].getSatuan() + "\t:"
                    + peternak[i].getHarga());
            System.out.println("=".repeat(52));
        }
    }

    public static void print2(PeternakanV4 peternak[]) {
        int totalPemasukan = 0;
        for (int i = 0; i < peternak.length; i++) {
            System.out.println("Jenis\t\t: " + peternak[i].getJenisHewan() + " | " + peternak[i].getRas());
            System.out.println("Pemasukan\t: " + peternak[i].totalPemasukan());
            System.out.println("-".repeat(52));
            totalPemasukan += peternak[i].totalPemasukan();
        }
        System.out.println("Total Pemasukan : " + totalPemasukan);
        System.out.println("=".repeat(52));
    }

    public static void print3(PeternakanV4 peternak[]) {
        double totalPemasukan = 0;
        for (int i = 0; i < peternak.length; i++) {
            System.out.println("Jenis\t\t: " + peternak[i].getJenisHewan() + " | " + peternak[i].getRas());
            System.out.println("Pemasukan\t: " + (int) peternak[i].hargaSetelahPPN());
            System.out.println("-".repeat(52));
            totalPemasukan += peternak[i].hargaSetelahPPN();
        }
        System.out.println("Total Pemasukan : " + (int) totalPemasukan);
        System.out.println("=".repeat(52));
    }

    public int getJumlahObjek() {
        return jumlahObjek;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public int getJumlahHewan() {
        return jumlahHewan;
    }

    public void setJumlahHewan(int jumlahHewan) {
        this.jumlahHewan = jumlahHewan;
    }

    public String getHasilUnik() {
        return hasilUnik;
    }

    public void setHasilUnik(String hasilUnik) {
        this.hasilUnik = hasilUnik;
    }

    public int getJumlahHasilUnik() {
        return jumlahHasilUnik;
    }

    public void setJumlahHasilUnik(int jumlahHasilUnik) {
        this.jumlahHasilUnik = jumlahHasilUnik;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
