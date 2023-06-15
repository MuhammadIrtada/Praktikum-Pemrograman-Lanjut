public interface PembelianInterface {
    String getJenis();

    double getHarga();

    int getKuantitas();

    double getBiaya();

    void beliHewan(int jumlah);

    void hitungBiaya(int jumlah);

    void beliTanaman(int luas);
}
