class VIP extends TiketKonser {
    private float hargaTiket = 5700000;

    @Override
    public void detailPesanan(String nama) {
        Main.detailPesanan(nama, "VIP", hargaTiket);
    }
}
