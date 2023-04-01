import java.util.ArrayList;

public class Peternakan {
    private String binatang = "Binatang";
    private String ras = "Ras";
    private double jml = 0;
    private double hasil = 0;
    private double harga = 0;
    private String namaHasil = "Nama Hasil";
    private String satuan = "Satuan";
    public static ArrayList<Peternakan> list = new ArrayList<Peternakan>();

    Peternakan(String binatang, String ras, double jml, String namaHasil, double hasil, double harga, String satuan) {
        list.add(this);
        this.binatang = binatang;
        this.ras = ras;
        this.jml = jml;
        this.hasil = hasil;
        this.harga = harga;
        this.namaHasil = namaHasil;
        this.satuan = satuan;

    }

    public String buatPPN() {
        return String.format("Jenis\t\t : %s | %s\nPemasukkan\t : %.0f", binatang, ras, hitungPPN());
    }

    public double hitungPPN() {
        return hitungPemasukkan() + (hitungPemasukkan() * Main.ppn);
    }

    public static void cetakPPN() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).buatPPN());
            System.out.println("-".repeat(50));
        }
    }

    public double hitungPemasukkan() {
        return hasil * harga * jml;
    }

    public String buatPemasukkan() {
        return String.format("Jenis\t\t : %s | %s\nPemasukkan\t : %.0f", binatang, ras, hitungPemasukkan());
    }

    public static void cetakPemasukkan() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).buatPemasukkan());
            System.out.println("-".repeat(50));
        }
    }

    public String buatInfo() {
        return String.format(
                "Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %.0f ekor\n%s\t\t: %.0f %s\nTotal %s\t\t: %.0f %s / Hari\nHarga %s\t\t: %.0f / %s",
                binatang, ras, jml, namaHasil + "/Ekor", hasil, satuan, namaHasil, jml * hasil, satuan, namaHasil,
                harga, satuan);
    }

    public static void cetakInfo() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("=".repeat(50));
            System.out.println(list.get(i).buatInfo());
        }
    }
}
