package materi;

public class Lingkaran {
    //public double jariJari;
    public double jariJari = 7; // -> memberi nilai default

    public double getDiameter(){
        // double diameter = jariJari * 2;
        // return diameter;
        return jariJari * 2; // -> kalau mau cepetnya bisa gini
    }

    public double getKeliling(){
        // double keliling = 2 * jariJari * Math.PI;
        double keliling = getDiameter() * Math.PI; // -> banyak jalan ke roma
        return keliling;
    }

    public double getLuas(){
        // double luas = jariJari * jariJari * Math.PI;
        double luas = Math.pow(jariJari, 2) * Math.PI;
        // return luas;
        return Math.round(luas); // -> kalo diperlukan pembulatan
    }

    // public void setJariJari(double newJariJari) {
    //     jariJari = newJariJari;
    // }

    // // Menampilkan informasi lingkaran
    // // Ex :
    // // Jari-jari       : 7.0
    // // Diameter        : 14.0
    // // Keliling        : 44.0
    // // Luas            : 154.0
    // public String toString() {
    //     String tampilan = String.format("Jari-jari\t: %f\nDiameter\t: %f\nKeliling\t: %f\nLuas\t\t: %f", jariJari, getDiameter(), getKeliling(), getLuas());
    //     return tampilan;
    // }

    public String display() {
        String tampilan = String.format("Jari-jari\t: %f\nDiameter\t: %f\nKeliling\t: %f\nLuas\t\t: %f", jariJari, getDiameter(), getKeliling(), getLuas());
        return tampilan;
    }
}
