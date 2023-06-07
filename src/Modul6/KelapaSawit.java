package Modul6;

public class KelapaSawit extends Tanaman {
    public KelapaSawit(int luas) {
        super(luas, 500, 18000, 8500000);
    }

    @Override
    public String getNama() {
        return "Kelapa Sawit";
    }
}