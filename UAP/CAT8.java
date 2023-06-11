class CAT8 extends TiketKonser {
    private float hargaTiket = 8000000;

    @Override
    public void detailPesanan(String nama) {
        Main.detailPesanan(nama, "CAT 8", hargaTiket);
    }
}
