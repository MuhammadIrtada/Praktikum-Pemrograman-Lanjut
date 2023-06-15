class apel extends pertanian {
    private final int apelperHektar;

    public apel(int luas, double harga, double perawatan, int apelperHektar) {
        super(luas, harga, perawatan);
        this.apelperHektar = apelperHektar;
    }

    @Override
    public double pendapatan1() {
        return luas * apelperHektar * harga;
    }

    @Override
    public double perawatan1() {
        return luas * perawatan;
    }
}