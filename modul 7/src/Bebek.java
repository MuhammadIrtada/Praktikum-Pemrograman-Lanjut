class Bebek extends Hewan {
    public Bebek(int jumlahHewan, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        super(jumlahHewan, hasilProduksi, hargaProduksi, biayaPerawatan);
    }

    @Override
    public String getJenisHewan() {
        return "Bebek";
    }
}