public class Domba extends Hewanternak {
    int hargaBulu = 15000;

    public Domba(String ras, int jumlah, String satuan) {
        super("Domba", ras, jumlah, satuan);
    }

    
    public int hitungBasilTernak() {
        return jumlah * 4;
    }

  
    public int hitungHargaHasilTernak() {
        return hitungBasilTernak() * hargaBulu;
    }

    public int hitungPemasukan() {
        return hitungHargaHasilTernak();
    }

    public int hitungPemasukanSetelahPPN() {
        int pemasukan = hitungPemasukan();
        return (int)hitungTotalPemasukanSetelahPPN(pemasukan);
    }
}
