class VVIP extends TiketKonser {
    private float hargaTiket = 11000000;

    @Override
    public void detailPesanan(String nama) {
        Main.detailPesanan(nama, "UNLIMITED EXPERIENCE", hargaTiket);
    }
}
