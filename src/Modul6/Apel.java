package Modul6;

public class Apel extends Tanaman {
    public Apel(int luas) {
        super(luas, 40, 25000, 900000);
    }

    @Override
    public String getNama() {
        return "Apel";
    }
}
