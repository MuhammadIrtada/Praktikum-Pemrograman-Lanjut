class bebek extends peternakan {
    private final int TelurperHari;

    public bebek(int kuantitas, double harga, double perawatan, int TelurperHari) {
        super(kuantitas, harga, perawatan);
        this.TelurperHari = TelurperHari;
    }

    @Override
    public double pendapatan1() {
        return kuantitas * TelurperHari * harga;
    }

    @Override
    public double perawatan1() {
        return kuantitas * perawatan;
    }
}
