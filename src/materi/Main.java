package materi;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaranMerah = new Lingkaran();
        
        // CARA 1
        lingkaranMerah.jariJari = 7;
        // lingkaranMerah.jariJari = 2; // -> penggunaan default value
        
        // Diameter -> diameter = 2 * jari-jari
        double diameter = 2 * lingkaranMerah.jariJari;

        // Keliling -> keliling = 2 * jari-jari * PI
        double keliling = 2 * lingkaranMerah.jariJari * Math.PI;

        // Mengubah nilai jari-jari
        // lingkaranMerah.jariJari = 1;

        // Luas -> luas = jari-jari * jari-jari * PI
        double luas = lingkaranMerah.jariJari * lingkaranMerah.jariJari * Math.PI;

        System.out.println("Jari-jari\t: " + lingkaranMerah.jariJari);
        System.out.println("Diameter\t: " + diameter);
        System.out.println("Keliling\t: " + keliling);
        System.out.println("Luas\t\t: " + luas);

        /*

        // CARA 2 | langsung menggunakan default value
        // Diameter -> diameter = 2 * jari-jari
        double diameter = lingkaranMerah.getDiameter();

        // Keliling -> keliling = 2 * jari-jari * PI
        double keliling = lingkaranMerah.getKeliling();

        // Mengubah nilai jari-jari
        // lingkaranMerah.setJariJari(1);

        // Luas -> luas = jari-jari * jari-jari * PI
        double luas = lingkaranMerah.getLuas();

        System.out.println("Jari-jari\t: " + lingkaranMerah.jariJari);
        System.out.println("Diameter\t: " + diameter);
        System.out.println("Keliling\t: " + keliling);
        System.out.println("Luas\t\t: " + luas);

        // CARA 3 | menampikan dengan toString()
        System.out.println(lingkaranMerah.toString());

        **/
    }
}
