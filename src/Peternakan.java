public class Peternakan {
    private int jumlahBebek;
	 	private int jumlahDomba;
	    private int jumlahUnta;
	    
	    private String jenisHewan;
	    
	    public Peternakan(int jumlahBebek, int jumlahDomba, int jumlahUnta) {
	        this.jumlahBebek = jumlahBebek;
	        this.jumlahUnta = jumlahUnta;
	        this.jumlahDomba = jumlahDomba;
	    }
	    
	    public void Hewan1(String jenisHewan) {
	    	this.jenisHewan = jenisHewan;
	    }
	    
	    public void Hewan2(String jenisHewan) {
	    	this.jenisHewan = jenisHewan;
	    }
	    
	    public void Hewan3(String jenisHewan) {
	    	this.jenisHewan = jenisHewan;
	    }
	    public void boostTernak() {
	    	// Mempercepat hasil ternak masing-masing hewan
	        this.jumlahBebek *= 2.5;
	        this.jumlahDomba *= 1.5;
	        this.jumlahUnta *= 2;
	    }
	    
	    public int getJumlahTelur() {
	        // Menghitung jumlah telur yang dihasilkan semua bebek
	        return jumlahBebek * 2;
	    }
	    
	    public int getJumlahBulu() {
	        // Menghitung jumlah bulu yang dihasilkan semua domba
	        return jumlahDomba * 4;
	    }
	    
	    public int getJumlahSusu() {
	        // Menghitung jumlah susu yang dihasilkan semua unta
	        return jumlahUnta * 5;
	    }
	    
	    public void display1() {
	    	System.out.println("Jenis\t\t\t: " + jenisHewan );
	    	System.out.println("Jumlah\t\t\t: " + jumlahBebek +" ekor");
	    	System.out.println("Telur/Ekor\t\t: " + "2 Butir");
	    	System.out.println("Telur/Ekor\t\t: " + "5 Butir\t(Setelah Booster)");
	    	System.out.println("Total Telur/Hari\t: " + getJumlahTelur() + " Butir");
	    	System.out.println("=====================================================");
	    }
	    
	    public void display2() {
	    	System.out.println("Jenis\t\t\t: " + jenisHewan );
	    	System.out.println("Jumlah\t\t\t: " + jumlahDomba + " ekor");
	    	System.out.println("Bulu/Ekor\t\t: " + "4 kg");
	    	System.out.println("Bulu/Ekor\t\t: " + "6 kg\t\t(Setelah Booster)");
	    	System.out.println("Total Bulu/Hari\t\t: " + getJumlahBulu() + " kg");
	    	System.out.println("=====================================================");  
	    }
	    
	    public void display3() {
	    	System.out.println("Jenis\t\t\t: " + jenisHewan );
	    	System.out.println("Jumlah\t\t\t: " + jumlahUnta + " ekor");
	    	System.out.println("Bulu/Ekor\t\t: " + "5 liter");
	    	System.out.println("Bulu/Ekor\t\t: " + "10 liter\t(Setelah Booster)");
	    	System.out.println("Total Susu/Hari\t\t: " + getJumlahSusu() + " liter");
	    	System.out.println("=====================================================");  
	    }
        
}
