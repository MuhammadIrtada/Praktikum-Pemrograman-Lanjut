package Modul6;

public class Bebek extends Hewan {
    public Bebek(int jumlah) {
        super(jumlah, 2, 2000, 3000);
    }

    @Override
    public String getNama() {
        return "Bebek";
    }
}