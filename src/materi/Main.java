package materi;

public class Main {
    public static void main(String[] args) {
        // Membuat 3 objek lingkaran dan menampilkan informasi lingkaran satu persatu
        Lingkaran lingkaranMerah = new Lingkaran("Lingkaran Merah", 1);
        System.out.println(lingkaranMerah);
        System.out.println();

        Lingkaran lingkaranKuning = new Lingkaran();
        System.out.println(lingkaranKuning);
        System.out.println();
        
        Lingkaran lingkaranHijau = new Lingkaran("Lingkaran Hijau", 10);
        System.out.println(lingkaranHijau);
        System.out.println();

        // Menampilkan semua informasi object lingkaran sekaligus
        Lingkaran.display();
    }
}
