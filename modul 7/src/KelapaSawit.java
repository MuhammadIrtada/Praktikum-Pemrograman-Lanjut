class KelapaSawit extends Tanaman {
    public KelapaSawit(int luasTanaman, int hasilProduksi, int hargaProduksi, int biayaPerawatan) {
        super(luasTanaman, hasilProduksi, hargaProduksi, biayaPerawatan);
    }

    @Override
    public String getJenisTanaman() {
        return "Sawit";
    }
}