class FESTIVAL extends TiketKonser {
    private float hargaTiket = 3500000;

    @Override
    public void detailPesanan(String nama) {
        Main.detailPesanan(nama, "FESTIVAL", hargaTiket);
    }
}
