class domba extends peternakan {
    private final int buluperHari;

    public domba(int kuantitas, double harga, double perawatan, int buluperHari) {
        super(kuantitas, harga, perawatan);
        this.buluperHari = buluperHari;
    }

    @Override
    public double pendapatan1() {
        return kuantitas * buluperHari * harga;
    }

    @Override
    public double perawatan1() {
        return kuantitas * perawatan;
    }
}