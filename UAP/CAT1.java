class CAT1 extends TiketKonser {
    private float hargaTiket = 5000000;

    @Override
    public void detailPesanan(String nama) {
        Main.detailPesanan(nama, "CAT 1", hargaTiket);
    }
}
