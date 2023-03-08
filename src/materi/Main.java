package materi;

public class Main {
    public static void main(String[] args) {
        // Memanggil constructor
        new Lingkaran();

        // // Membuat object dengan constructor tanpa di simpan ke suatu object
        new Lingkaran(1);

        // // Cara Sebelumnya
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 1;
        System.out.println(lingkaran.toString());
        System.out.println();

        // // Memasukkan nilai menggunakan constructor
        Lingkaran lingkaranMerah = new Lingkaran(1);
        System.out.println(lingkaranMerah);
        System.out.println();

        Lingkaran lingkaranKuning = new Lingkaran();
        System.out.println(lingkaranKuning);
        System.out.println();
        
        Lingkaran lingkaranHijau = new Lingkaran(10, "Lingkaran Hijau");
        System.out.println(lingkaranHijau);
        System.out.println();

        // // Constructor langsung menyesuaikan jumlah parameter dan tipa data yang ada
        Lingkaran lingkaranUngu = new Lingkaran("sepuluh", "Lingkaran Ungu");
        System.out.println(lingkaranUngu);
    }
}
