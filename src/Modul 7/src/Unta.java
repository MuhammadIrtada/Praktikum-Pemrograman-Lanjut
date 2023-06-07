class Unta extends Hewan {
    public Unta(int jumlah) {
        this.jumlah = jumlah;
        hasilPerHari = 5;
        hargaJual = 60000;
        biayaPerawatan = 200000;
    }

    public String getJenisHewan() {
        return "Unta";
    }
}
