public class Tanaman implements KiwInterface{
    private int jml;
    private String nama;
    private String satuan;
    private float hargaHektar;

    
    public Tanaman(int jml, String nama) {
        this.jml = jml;
        this.nama = nama;
        this.satuan = "hektar";
    }
    public int getJml() {
        return jml;
    }
    public void setJml(int jml) {
        this.jml = jml;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSatuan(String satuan){
        this.satuan = satuan;
    }

    public String getSatuan(){
        return satuan;
    }

    public float getHargaHektar() {
        return hargaHektar;
    }
    public void setHargaHektar(float hargaHektar) {
        this.hargaHektar = hargaHektar;
    }

    public void tambah(int tambah) {
        this.jml += tambah;
    }

    @Override
    public void showJml() {
        System.out.println(getNama() + "\t: " + getJml() + " " + getSatuan());
    }
    @Override
    public void beli(int pilihan) {
        tambah(pilihan);
        System.out.println("=".repeat(40) + "\n\tNota Pembelian Tanah Perkebunan\n" + "=".repeat(40));
        System.out.printf("%s\t\tx(%d)\t Rp %,.0f\n\n", nama, pilihan, pilihan*hargaHektar);

    }
   
}