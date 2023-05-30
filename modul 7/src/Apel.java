class Apel extends Tanaman {
    public Apel(int luasTanaman, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        super(luasTanaman, hasilProduksi, hargaProduksi, biayaPerawatan);
    }

    @Override
    public String getJenisTanaman() {
        return "Apel";
    }
}