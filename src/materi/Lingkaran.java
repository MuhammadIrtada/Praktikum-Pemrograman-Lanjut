package materi;

public class Lingkaran {
    private String nama;
    private double jariJari;
    
    // Final, digunakan untuk menetapkan suatu konstanta
    // Jika memberikan nilai pada variabel yang final maka nantinya variabel tersebut nilainya tidak dapat dirubah-rubah lagi
    private final double PI = 22d/7; // -> jika tidak diberikan d maka output berupa integer
    private final String namaLingkaran = "Lingkaran";

    // Static, digunakan untuk menggunakan variabel atau method tanpa harus melakukan instansiasi object
    // Jika suatu variabel atau method menggunakan static maka tidak bisa memanfaatkan variabel atau method yang tidak static

    // private int jumlahLingkaran; // -> error karena digunakan di method static
    private static int jumlahLingkaran;
    private static Lingkaran[] objectLingkaran = new Lingkaran[10];

    public Lingkaran(){
        objectLingkaran[jumlahLingkaran] = this;
        jumlahLingkaran++;

        jariJari = 7;
        nama = namaLingkaran + " " + jumlahLingkaran;
    }

    public Lingkaran(String newNama, double newJariJari){
        objectLingkaran[jumlahLingkaran] = this;
        jumlahLingkaran++;

        nama = newNama;
        jariJari = newJariJari;
    }

    public String getNama(){
        return nama; 
    }

    public double getJariJari(){
        return jariJari; 
    }

    public double getDiameter(){
        return jariJari * 2; 
    }

    public double getKeliling(){
        return getDiameter() * PI;
    }

    public double getLuas(){
        return Math.pow(jariJari, 2) * PI;
    }

    public int getJumlahLingkaran(){
        return jumlahLingkaran;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setJariJari(double newJariJari) {
        jariJari = newJariJari;
    }

    // Menampilkan informasi lingkaran
    // Ex :
    // Nama            : Lingkaran Merah
    // Jari-jari       : 7.0
    // Diameter        : 14.0
    // Keliling        : 44.0
    // Luas            : 154.0
    public String toString() {
        String tampilan = String.format("Nama\t\t: %s\nJari-jari\t: %f\nDiameter\t: %f\nKeliling\t: %f\nLuas\t\t: %f", nama, jariJari, getDiameter(), getKeliling(), getLuas());
        return tampilan;
    }

    // Untuk menampilkan semua object lingkaran yang telah dibuat
    public static void display(){
        for (int i = 0; i < jumlahLingkaran; i++) {
            System.out.println("Lingkaran ke-" + (i+1));
            System.out.println("-".repeat(40));

            String tampilan = String.format("Nama\t\t: %s\nJari-jari\t: %f\nDiameter\t: %f\nKeliling\t: %f\nLuas\t\t: %f", objectLingkaran[i].nama, objectLingkaran[i].jariJari, objectLingkaran[i].getDiameter(), objectLingkaran[i].getKeliling(), objectLingkaran[i].getLuas());
            System.out.println(tampilan);

            System.out.println("=".repeat(40));
            System.out.println();
        }
    }
}
