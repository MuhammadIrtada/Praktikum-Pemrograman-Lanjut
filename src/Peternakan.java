public class Peternakan {
    private String jenisHewan;
	   private int jumlahHewan;
	   private int hasilPerEkor;
	   private int hasilPerHari;
	   
	   public Peternakan (String jenisHewan, int jumlahHewan, int hasilPerEkor, int hasilPerHari){
		   this.jenisHewan = jenisHewan;
		   this.jumlahHewan = jumlahHewan;
		   this.hasilPerEkor = hasilPerEkor;
		   this.hasilPerHari = hasilPerHari;
	   }
	   
	   public int getHasilTotBooster() {
		   return jumlahHewan * hasilPerEkor;
		   
	   }
	   public int getHasilperEkorSetelahBooster1() {
		   return hasilPerEkor *= 2.5;
	   }
	   public int  getHasilperEkorSetelahBooster2() {
		   return hasilPerEkor *= 1.5;
	   }
	   public int getHasilperEkorSetelahBooster3() {
		   return hasilPerEkor *= 2;
	   }
	   
	   public void display1() {
		    System.out.println("Jenis\t\t\t: " + jenisHewan );
	    	System.out.println("Jumlah\t\t\t: " + jumlahHewan +" ekor");
	    	System.out.println("Telur/Ekor\t\t: " + hasilPerEkor);
	    	System.out.println("Telur/Ekor\t\t: " + getHasilperEkorSetelahBooster1() + " Butir (Setelah Booster)");
	    	System.out.println("Total Telur/Hari\t: " +  hasilPerHari+ " Butir");
	    	System.out.println("Total Telur/Hari\t: " +  getHasilTotBooster() + " Butir (Setelah Booster)");
	    	System.out.println("=====================================================");
		   
	   }
	   
	   public void display2() {
		   System.out.println("Jenis\t\t\t: " + jenisHewan );
		   System.out.println("Jumlah\t\t\t: " + jumlahHewan + " ekor");
		   System.out.println("Bulu/Ekor\t\t: " + hasilPerEkor);
		   System.out.println("Bulu/Ekor\t\t: " +  getHasilperEkorSetelahBooster2() + " kg (Setelah Booster)" );
		   System.out.println("Total Bulu/Hari\t\t: " + + hasilPerHari + " kg");
		   System.out.println("Total Bulu/Hari\t\t: " +  getHasilTotBooster() + " kg (Setelah Booster)");
		   System.out.println("=====================================================");
	   }
	   
	   public void display3() {
		   System.out.println("Jenis\t\t\t: " + jenisHewan );
		   System.out.println("Jumlah\t\t\t: " + jumlahHewan + " ekor");
		   System.out.println("Susu/Ekor\t\t: " + hasilPerEkor);
		   System.out.println("Susu/Ekor\t\t: " + getHasilperEkorSetelahBooster3() + " liter (Setelah Booster)");
		   System.out.println("Total Susu/Hari\t\t: "  + hasilPerHari + " liter");
		   System.out.println("Total Susu/Hari\t\t: " +  getHasilTotBooster() + " liter (Setelah Booster)");
	       System.out.println("=====================================================");  
	   }

        
}
