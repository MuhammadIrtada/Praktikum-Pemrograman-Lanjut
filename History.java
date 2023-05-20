import java.util.Locale;
import java.text.NumberFormat;

public class History {
    private String nama;
    private int jumlah;
    private float harga;

    public History(String nama,int jumlah,float harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama(){
        return this.nama;
    }

    public int getJumlah(){
        return this.jumlah;
    }

    public float getHarga(){
        return this.harga;
    }

    public String toString() {
        return "Item: " + nama + ", Jumlah: " + jumlah + ", Harga: " +  formatRupiah(harga);
    }

    private String formatRupiah(float harga) {
        Locale locale = new Locale("id", "ID");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

        return currencyFormat.format(harga);
    }
    
}
