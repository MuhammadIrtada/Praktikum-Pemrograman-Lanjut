package materi;

public class Lingkaran {
    public double jariJari;
    // public double jariJari = 7; // -> memberi nilai default
    public String nama;

    // Jika constructor tidak melakukan apa-apa atau kosong boleh untuk tidak ditulis
    // Bisa juga digunakan untuk memberi nilai default
    public Lingkaran(){
        jariJari = 7;
        nama = "Lingkaran belum memiliki nama";
        System.out.println("Lingkaran baru berhasil dibuat");
    }

    // // Constructor dapat dibuat lebih dari satu 
    // // Asalkan tipe atau jumlah parameter berbeda
    public Lingkaran(double newJariJari){
        jariJari = newJariJari;
    }

    // // Meskipun nama variabel berbeda tapi tipedata sama maka akan terjadi error
    // public Lingkaran(double jariJariBaru){
    //     jariJari = jariJariBaru;
    // }

    // // Tidak error karena tipa data berbeda
    public Lingkaran(String newJariJari){
        jariJari = Double.parseDouble(newJariJari);
    }

    // // Tidak error karena jumlah parameter berbeda
    public Lingkaran(double newJariJari, String newNama){
        jariJari = newJariJari;
        nama = newNama;
    }

    // // Tidak error karena jumlah parameter dan tipe data ada yang berbeda
    public Lingkaran(String newJariJari, String newNama){
        jariJari = Double.parseDouble(newJariJari);
        nama = newNama;
    }

    public double getDiameter(){
        double diameter = jariJari * 2;
        return diameter;
        // return jariJari * 2; // -> kalau mau cepetnya bisa gini
    }

    public double getKeliling(){
        double keliling = 2 * jariJari * Math.PI;
        // double keliling = getDiameter() * Math.PI; // -> banyak jalan ke roma
        return keliling;
    }

    public double getLuas(){
        // double luas = jariJari * jariJari * Math.PI;
        double luas = Math.pow(jariJari, 2) * Math.PI;
        return luas;
        // return Math.round(luas); // -> kalo diperlukan pembulatan
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
}
