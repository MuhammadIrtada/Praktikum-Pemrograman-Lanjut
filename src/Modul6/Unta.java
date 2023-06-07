package Modul6;

public class Unta extends Hewan {
    public Unta(int jumlah) {
        super(jumlah, 5, 60000, 200000);
    }

    @Override
    public String getNama() {
        return "Unta";
    }
}
