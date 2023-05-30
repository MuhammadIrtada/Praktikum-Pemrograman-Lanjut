class Domba extends Hewan {
    public Domba(int jumlahHewan, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        super(jumlahHewan, hasilProduksi, hargaProduksi, biayaPerawatan);
    }

    @Override
    public String getJenisHewan() {
        return "Domba";
    }
}