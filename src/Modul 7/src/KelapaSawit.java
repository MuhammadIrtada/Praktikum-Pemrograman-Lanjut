class KelapaSawit extends Tanaman {
    public KelapaSawit(int luasHektar) {
        this.luasHektar = luasHektar;
        hasilPerHari = 500;
        hargaJual = 18000;
        biayaPerawatan = 8500000;
    }

    public String getJenisTanaman() {
        return "Kelapa Sawit";
    }
}
