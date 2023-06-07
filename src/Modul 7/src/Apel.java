class Apel extends Tanaman {
    public Apel(int luasHektar) {
        this.luasHektar = luasHektar;
        hasilPerHari = 40;
        hargaJual = 25000;
        biayaPerawatan = 900000;
    }

    public String getJenisTanaman() {
        return "Apel";
    }
}
