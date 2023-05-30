class Unta extends Hewan {
    public Unta(int jumlahHewan, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        super(jumlahHewan, hasilProduksi, hargaProduksi, biayaPerawatan);
    }

    @Override
    public String getJenisHewan() {
        return "Unta";
    }
}
