public class Peternakan {

    // Variabel instance
    private int jumlahBebek;
    private int jumlahTelurBebek;
    private int jumlahUnta;
    private int jumlahSusuUnta;
    private int jumlahDomba;
    private int jumlahBuluDomba;

    // Constructor
    public Peternakan(int jumlahBebek, int jumlahTelurBebek, int jumlahUnta,int jumlahSusuUnta, int jumlahDomba, int jumlahBuluDomba) {
        this.jumlahBebek        = jumlahBebek;
        this.jumlahTelurBebek   = jumlahTelurBebek;
        this.jumlahUnta         = jumlahUnta;
        this.jumlahSusuUnta     = jumlahSusuUnta;
        this.jumlahDomba        = jumlahDomba;
        this.jumlahBuluDomba    = jumlahBuluDomba;
    }

    public int jumlahTelurBebek() {
        return jumlahTelurBebek; 
    }
    public int jumlahTelurBebekBooster (){
        return (int) (jumlahTelurBebek * 2.5);
    }
    // Method untuk menghitung hasil telur bebek sebelum dan sesudah diberikan obat
    public int hitungHasilTelurBebek() {
        return jumlahBebek * 2;
    }

    public int hitungHasilTelurBebekObat() {
        return (int) (jumlahBebek * 2.5) * 2;
    }
    public int jumlahSusuUnta () {
        return jumlahSusuUnta;
    }
    public int jumlahSusuUntaBooster () {
        return jumlahSusuUnta * 2;
    }
    // Method untuk menghitung hasil susu unta sebelum dan sesudah diberikan obat
    public int hitungHasilSusuUnta() {
        return jumlahUnta * 5;
    }

    public int hitungHasilSusuUntaObat() {
        return (int) (jumlahUnta * 2) * 5;
    }

    public int jumlahBuluDomba () {
        return jumlahBuluDomba;
    }
    public int jumlahBuluDombaBooster () {
        return (int) (jumlahBuluDomba * 1.5);
    }
    // Method untuk menghitung hasil bulu domba sebelum dan sesudah diberikan obat
    public int hitungHasilBuluDomba() {
        return jumlahDomba * 4;
    }

    public int hitungHasilBuluDombaObat() {
        return (int) (jumlahDomba * 1.5) * 4;
    }

    // Method untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("Jenis\t\t\t\t: Bebek" );
        System.out.println("Jumlah \t\t\t\t: " + jumlahBebek + " ekor");
        System.out.println("Telur/Ekor\t\t\t: " + jumlahTelurBebek + " butir");
        System.out.println("Telur/Ekor\t\t\t: " + jumlahTelurBebekBooster() + " butir" + " (Setelah Booster)");
        System.out.println("Total Telur/Hari\t\t: " + hitungHasilTelurBebek() + " butir");
        System.out.println("Total Telur/Hari\t\t: " + hitungHasilTelurBebekObat() + " butir" +" (Setelah Booster)");
        System.out.println("==========================================================================");

        System.out.println("Jenis\t\t\t\t: Domba" );
        System.out.println("Jumlah\t\t\t\t: " + jumlahDomba + " ekor");
        System.out.println("Bulu/ Ekor\t\t\t: " + jumlahBuluDomba + " kg");
        System.out.println("Bulu/Ekor\t\t\t: " + jumlahBuluDombaBooster() +" kg" + " (Setelah Booster)");
        System.out.println("Total Bulu/Hari\t\t\t: " + hitungHasilBuluDomba() +" kg");
        System.out.println("Total Bulu/Hari\t\t\t: " + hitungHasilBuluDombaObat()+" kg"+ " (Setelah Booster)");
        System.out.println("==========================================================================");

        System.out.println("Jenis\t\t\t\t: Unta" );
        System.out.println("Jumlah\t\t\t\t: " + jumlahUnta + " ekor");
        System.out.println("Susu/Ekor\t\t\t: "+jumlahSusuUnta+ " liter");
        System.out.println("Susu/Ekor\t\t\t: "+ jumlahSusuUntaBooster() + " liter" + " (Setelah Booster)");
        System.out.println("Total Susu/Hari\t\t\t: " + hitungHasilSusuUnta() + " liter");
        System.out.println("Total Susu/Hari\t\t\t: " + hitungHasilSusuUntaObat() + " liter" + " (Setelah Booster)");
        System.out.println("==========================================================================");


    }

}

