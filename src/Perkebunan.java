// public class Perkebunan {
    // import java.util.Scanner;

class Perkebunan implements TanahPerkebunan {
    private double luasApel;
    private double luasKelapaSawit;

    public Perkebunan(double luasApel, double luasKelapaSawit) {
        this.luasApel = luasApel;
        this.luasKelapaSawit = luasKelapaSawit;
    }

    public double getLuasApel() {
        return luasApel;
    }

    public double getLuasKelapaSawit() {
        return luasKelapaSawit;
    }
     public double getHarga() {
        double totalHarga = (luasApel * 7500000) + (luasKelapaSawit * 18000000);
        return totalHarga;
    }

    public void beliTanah(double luas) {
        luasApel += luas;
    }
}

// }
