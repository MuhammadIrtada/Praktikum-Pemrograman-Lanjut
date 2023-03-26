package ternak;

public class Peternakan {
    
    private String jenisHewan;
    private int jumlahHewan;
    private String jenisRas;
    private double dosisObat;
    
    // Overloading Construc tor
    public Peternakan(String jenisHewan, int jumlahHewan, String jenisRas) {
        this.jenisHewan = jenisHewan;
        this.jumlahHewan = jumlahHewan;
        this.jenisRas = jenisRas;
    }
    
    // Overloading Method
    public double hitungDosisObat() {
        if(jenisRas.equalsIgnoreCase("bebek ras telur biasa")) {
            dosisObat = jumlahHewan * 5;
        } else if(jenisRas.equalsIgnoreCase("bebek ras telur asin")) {
            dosisObat = jumlahHewan * 8;
        } else if(jenisRas.equalsIgnoreCase("unta ras susu putih")) {
            dosisObat = jumlahHewan * 10;
        } else if(jenisRas.equalsIgnoreCase("unta ras susu coklat")) {
            dosisObat = jumlahHewan * 15;
        } else if(jenisRas.equalsIgnoreCase("domba ras bulu hitam")) {
            dosisObat = jumlahHewan * 9;
        } else if(jenisRas.equalsIgnoreCase("domba ras bulu putih")) {
            dosisObat = jumlahHewan * 14;
        }
        
        return dosisObat;
    }
    
    // Encapsulation
    public String getJenisHewan() {
        return jenisHewan;
    }
    
    public int getJumlahHewan() {
        return jumlahHewan;
    }
    
    public String getJenisRas() {
        return jenisRas;
    }
    
    public double getDosisObat() {
        return dosisObat;
    }
    
}
