class KelapaSawit extends pertanian {
    private final int minyakperHektar;

    public KelapaSawit(int luas, double harga, double perawatan, int minyakperHektar) {
        super(luas, harga, perawatan);
        this.minyakperHektar = minyakperHektar;
    }

    @Override
    public double pendapatan1() {
        return luas * minyakperHektar * harga;
    }

    @Override
    public double perawatan1() {
        return luas * perawatan;
    }
}