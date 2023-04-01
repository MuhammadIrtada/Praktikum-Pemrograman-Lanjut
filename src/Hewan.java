public class Hewan {
    private String jenis;
    private String ras;
    private int jumlah;
    private int hasil;
    private int harga;
    private String satuan, barang;

    public Hewan(String inputJenis, String inputRas, int inputJumlah, int inputHasil, int inputHarga){
        jenis = inputJenis;
        ras = inputRas;
        jumlah = inputJumlah;
        hasil = inputHasil;
        harga = inputHarga;
        switch (inputJenis.toLowerCase()){
            case "bebek":
                satuan = "Butir";
                barang = "Telur";
                break;
            case "domba":
                satuan = "Kg";
                barang = "bulu";
                break;
            case "unta":
                satuan = "liter";
                barang = "susu";
                break;
            default:
                satuan = "satuan";
                barang = "hasil";
        }
    }

    public String getJenis() {
        return jenis;
    }

    public String getRas() {
        return ras;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHasil() {
        return hasil;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotal() {
        return jumlah*hasil;
    }

    public int getPemasukan(){
        return getTotal()*harga;
    }

    public int getHargaPajak(double pajak){
        return (int)(getPemasukan()+(getPemasukan()*pajak));
    }

    public void printInformasi(){
        System.out.printf("Jenis\t\t\t\t\t: %s\n" +
                        "Ras\t\t\t\t\t\t: %s\n" +
                        "Jumlah\t\t\t\t\t: %d ekor\n" +
                        "%s/ekor\t\t\t\t: %d %s\n" +
                        "Total %s/Hari  \t\t: %d %s\n" +
                        "Harga %-18s: %d\n" + "=".repeat(50) + "\n",
                jenis, ras, jumlah, barang, hasil, satuan, barang, getTotal(), satuan, String.format("%s/%s", barang, satuan), harga);
    }

    public void printPemasukan(){
        System.out.printf("Jenis\t\t\t: %s | %s\n" +
                        "Pemasukan\t\t: %d\n" + "-".repeat(50) + "\n",
                jenis, ras, getPemasukan());
    }

    public void printHargaPajak(double pajak){
        System.out.printf("Jenis\t\t\t: %s | %s\n" +
                        "Pemasukan\t\t: %d\n" + "-".repeat(50) + "\n",
                jenis, ras, getHargaPajak(pajak));
    }
}
