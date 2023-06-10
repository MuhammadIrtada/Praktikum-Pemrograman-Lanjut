package MODUL_7;

abstract class Hewan {
    protected int jumlah;
    protected int hargaJual;
    protected int hasil;
    protected int biayaPerawatan;

    public Hewan(int jumlah, int hargaJual, int hasil, int biayaPerawatan) {
        this.jumlah = jumlah;
        this.hargaJual = hargaJual;
        this.hasil = hasil;
        this.biayaPerawatan = biayaPerawatan;
    }

    public abstract int hitungPendapatan();

    public int hitungBiayaPerawatan() {
        return jumlah * biayaPerawatan * 30;
    }
}

class Bebek extends Hewan {
    public Bebek(int jumlah) {
        super(jumlah, 2000, 2, 3000);
    }

    @Override
    public int hitungPendapatan() {
        return jumlah * hasil * hargaJual * 30;
    }
}

class Unta extends Hewan {
    public Unta(int jumlah) {
        super(jumlah, 60000, 5, 200000);
    }

    @Override
    public int hitungPendapatan() {
        return jumlah * hasil * hargaJual * 30;
    }
}

class Domba extends Hewan {
    public Domba(int jumlah) {
        super(jumlah, 15000, 4, 45000);
    }

    @Override
    public int hitungPendapatan() {
        return jumlah * hasil * hargaJual * 30;
    }
}

class Peternakan {
    private Hewan[] hewan;

    public Peternakan() {
        hewan = new Hewan[3];
        hewan[0] = new Bebek(15);
        hewan[1] = new Unta(3);
        hewan[2] = new Domba(4);
    }

    public void hitungPendapatan() {
        int totalPendapatan = 0;
        for (Hewan h : hewan) {
            int pendapatan = h.hitungPendapatan();
            totalPendapatan += pendapatan;
            System.out.println(h.getClass().getSimpleName() + ": Rp " + pendapatan);
        }
        System.out.println("Total: Rp " + totalPendapatan);
    }

    public void hitungBiayaPerawatan() {
        int totalBiayaPerawatan = 0;
        for (Hewan h : hewan) {
            int biayaPerawatan = h.hitungBiayaPerawatan();
            totalBiayaPerawatan += biayaPerawatan;
            System.out.println(h.getClass().getSimpleName() + ": Rp " + biayaPerawatan);
        }
        System.out.println("Total Biaya Perawatan: Rp " + totalBiayaPerawatan);
    }
}
