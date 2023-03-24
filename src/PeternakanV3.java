
import java.util.*;

public class PeternakanV3 {
    private String jenisHewan;
    private String[] ras;
    private int[] jumlahHewan;
    private int[] jumlahDosis;

    public PeternakanV3() {
        Scanner elma = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan Jenis Hewan\t\t\t:");
        this.jenisHewan = elma.nextLine();
        System.out.print("Masukkan Jumlah Ras yang Diinginkan\t:");
        jumlah = elma.nextInt();
        elma.nextLine();

        ras = new String[jumlah];
        jumlahHewan = new int[jumlah];
        jumlahDosis = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Ras Hewan\t\t\t:");
            this.ras[i] = elma.nextLine();
            System.out.print("Masukkan Jumlah Hewan Ras " + this.ras[i] + "\t:");
            this.jumlahHewan[i] = elma.nextInt();
            System.out.print("Masukkan Jumlah Dosis obat/ekor/hari\t:");
            this.jumlahDosis[i] = elma.nextInt();
            elma.nextLine();
            System.out.println();
        }
    }

    public PeternakanV3(int i) {
        ras = new String[2];
        jumlahHewan = new int[2];
        jumlahDosis = new int[2];
        if (i == 1) {
            this.jenisHewan = "Bebek";
            this.ras[0] = "Telur biasa";
            this.jumlahHewan[0] = 15;
            this.jumlahDosis[0] = 5;
            this.ras[1] = "Telur asin";
            this.jumlahHewan[1] = 10;
            this.jumlahDosis[1] = 8;

        } else if (i == 2) {
            this.jenisHewan = "Unta";
            this.ras[0] = "Susu putih";
            this.jumlahHewan[0] = 3;
            this.jumlahDosis[0] = 10;
            this.ras[1] = "Susu coklat";
            this.jumlahHewan[1] = 4;
            this.jumlahDosis[1] = 15;

        } else if (i == 3) {
            this.jenisHewan = "Domba";
            this.ras[0] = "Bulu hitam";
            this.jumlahHewan[0] = 4;
            this.jumlahDosis[0] = 9;
            this.ras[1] = "Bulu putih";
            this.jumlahHewan[1] = 6;
            this.jumlahDosis[1] = 14;
        } else {
            System.out.println("parameter salah, isi 1-3 atau kosongkan");
        }
    }

    private int dosis(int i) {
        this.jumlahDosis[i] *= this.jumlahHewan[i];
        return this.jumlahDosis[i];
    }

    private int dosis() {
        int jumlah=0;
        for (int i = 0; i < jumlahDosis.length; i++) {
            
            jumlah=jumlah+this.jumlahDosis[i];
            
        }
        return jumlah;
    }

    public void print() {
        System.out.println("Jenis\t\t\t: " + getJenisHewan());
        System.out.println("-".repeat(37));
        for (int i = 0; i < jumlahDosis.length; i++) {
            System.out.println("Ras\t\t\t: " + getRas(i));
            System.out.println("Jumlah\t\t\t: " + getJumlahHewan(i) + " ekor");
            System.out.println("Dosis obat/ekor/hari\t: " + getJumlahDosis(i) + "mL");
            System.out.println("-".repeat(37));
        }
        for (int i = 0; i < jumlahDosis.length; i++) {
            System.out.println("Jumlah Dosis obat/hari\t: " + dosis(i) + "mL");
        }
        System.out.println("Total Dosis obat/hari\t: " + dosis() + "mL");
        System.out.println("=".repeat(37));
        System.out.println();
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getRas(int i) {
        return ras[i];
    }

    public String[] getRas() {
        return ras;
    }

    public void setRas(String[] ras) {
        this.ras = ras;
    }

    public int getJumlahHewan(int i) {
        return jumlahHewan[i];
    }

    public int[] getJumlahHewan() {
        return jumlahHewan;
    }

    public void setJumlahHewan(int[] jumlahHewan) {
        this.jumlahHewan = jumlahHewan;
    }

    public int getJumlahDosis(int i) {
        return jumlahDosis[i];
    }

    public int[] getJumlahDosis() {
        return jumlahDosis;
    }

    public void setJumlahDosis(int[] jumlahDosis) {
        this.jumlahDosis = jumlahDosis;
    }

}
