public class Unta extends Hewanternak {
    int hargaSusu = 60000;

    public Unta(String ras, int jumlah, String satuan) {
        super("Unta", ras, jumlah, satuan);
    }

    public int hitungBasilTernak() {
        return jumlah * 5;
    }

    public int hitungHargaHasilTernak() {
        return hitungBasilTernak() * hargaSusu;
    }

    public int hitungPemasukan() {
        return hitungHargaHasilTernak();
    }

    public int hitungPemasukanSetelahPPN() {
        int pemasukan = hitungPemasukan();
        return (int)hitungTotalPemasukanSetelahPPN(pemasukan);
    }
}