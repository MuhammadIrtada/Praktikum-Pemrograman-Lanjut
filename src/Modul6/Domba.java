package Modul6;

public class Domba extends Hewan {
    public Domba(int jumlah) {
        super(jumlah, 4, 15000, 45000);
    }

    @Override
    public String getNama() {
        return "Domba";
    }
}