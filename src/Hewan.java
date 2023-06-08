public class Hewan implements KiwInterface{
    private int jml;
    private String nama;
    private String satuan;
    private float hargaEkor;


    public Hewan(int jml, String nama) {
        this.jml = jml;
        this.nama = nama;
        this.satuan = "ekor";
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

    public void tambah(int tambah) {
        this.jml += tambah;
    }

    @Override
    public void showJml() {
        System.out.println(getNama() + "\t: " + getJml() + " " + getSatuan());
    }

    public float getHargaEkor() {
        return hargaEkor;
    }
    public void setHargaEkor(float hargaEkor) {
        this.hargaEkor = hargaEkor;
    }


    @Override
    public void beli(int pilihan) {
        tambah(pilihan);
        System.out.println("=".repeat(40) + "\n\tNota Pembelian Hewan Ternak\n" + "=".repeat(40));
        System.out.printf("%s\t\tx(%d)\t Rp %,.0f\n\n", nama, pilihan, pilihan*hargaEkor);

    }
   
    
    
    
}
