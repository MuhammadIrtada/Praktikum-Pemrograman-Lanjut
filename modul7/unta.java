class unta extends peternakan {
    private final int susuperHari;

    public unta(int kuantitas, double harga, double perawatan, int susuperHari) {
        super(kuantitas, harga, perawatan);
        this.susuperHari = susuperHari;
    }

    @Override
    public double pendapatan1() {
        return kuantitas * susuperHari * harga;
    }

    @Override
    public double perawatan1() {
        return kuantitas * perawatan;
    }
}
