public class apel extends Tanaman {
    private int apelperPohon;
    private int totalApel;
    private int hargaApel;
    private int biayaPemeliharaan;
    private int keutunganApel = 0;

    public apel(int jumlah, String jenis, int apelperPohon, int hargaApel, int biayaPemeliharaan) {
        super(jumlah, jenis);
        this.apelperPohon = apelperPohon;
        this.hargaApel = hargaApel;
        this.biayaPemeliharaan = biayaPemeliharaan;
        this.totalApel = this.apelperPohon * this.getJumlahTan();
        this.keutunganApel = this.totalApel * this.hargaApel / 10;
    }

    public int getApelperPohon() {
        return apelperPohon;
    }

    public void setApelperPohon(int apelperPohon) {
        this.apelperPohon = apelperPohon;
        this.totalApel = this.apelperPohon * super.getJumlahTan();
        this.keutunganApel = this.totalApel * hargaApel - super.getJumlahTan() * this.biayaPemeliharaan;
    }

    public int getHargaApel() {
        return hargaApel;
    }

    public void setHargaApel(int hargaApel) {
        this.hargaApel = hargaApel;
    }

    public int getBiayaPemeliharaan() {
        return biayaPemeliharaan;
    }

    public void setBiayaPemeliharaan(int biayaPemeliharaan) {
        this.biayaPemeliharaan = biayaPemeliharaan;
    }

    public int getTotalApel() {
        return this.totalApel;
    }

    public int getKeuntunganApel() {
        return keutunganApel;
    }

    public String toString() {
        return "Jenis\t\t\t\t : " + getJenisTan() + "\n" + "Jumlah\t\t\t\t : " + getJumlahTan() + "\n"
                + "Apel per pohon\t\t : "
                + getApelperPohon() + "\n" + "Total apel\t\t\t : " + getTotalApel() + "\n" + "Harga apel\t\t\t : "
                + getHargaApel() + "\n" + "Profit\t\t\t\t : " + getKeuntunganApel();
    }

}
