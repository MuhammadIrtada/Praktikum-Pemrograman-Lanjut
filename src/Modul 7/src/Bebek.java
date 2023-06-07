class Bebek extends Hewan {
    public Bebek(int jumlah) {
        this.jumlah = jumlah;
        hasilPerHari = 2;
        hargaJual = 2000;
        biayaPerawatan = 3000;
    }

    public String getJenisHewan() {
        return "Bebek";
    }
}
