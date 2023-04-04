public class Bebek extends Hewanternak {
    int hargaTelur = 2000;

    public Bebek(String ras, int jumlah, String satuan) {
        super("Bebek", ras, jumlah, satuan);
    }

    public int hitungBasilTernak() {
        return jumlah * 2;
    }

  
    public int hitungHargaHasilTernak() {
        return hitungBasilTernak() * hargaTelur;
    }

   
    public int hitungPemasukan() {
        return hitungHargaHasilTernak();
    }

   
    public int hitungPemasukanSetelahPPN() {
        int pemasukan = hitungPemasukan();
        return (int)hitungTotalPemasukanSetelahPPN(pemasukan);
    }
}


