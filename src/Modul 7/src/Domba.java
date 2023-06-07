class Domba extends Hewan {
    public Domba(int jumlah) {
        this.jumlah = jumlah;
        hasilPerHari = 4;
        hargaJual = 15000;
        biayaPerawatan = 45000;
    }

    public String getJenisHewan() {
        return "Domba";
    }
}
