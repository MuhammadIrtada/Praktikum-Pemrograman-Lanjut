
public class Peternakan {
    // public class Peternakan {
    
        private static final int HARGA_TELUR = 2000;
        private static final int HARGA_SUSU = 60000;
        private static final int HARGA_BULU = 15000;
        
        private int jumlahBebek = 15;
        private int jumlahUnta = 3;
        private int jumlahDomba = 4;
        
        int totalTelur = jumlahBebek * 2;
        double totalSusu = jumlahUnta * 5;
        int totalBulu = jumlahDomba * 4;
        
        int totalHargaTelur = totalTelur * HARGA_TELUR;
        int totalHargaSusu = (int)totalSusu * HARGA_SUSU;
        int totalHargaBulu = totalBulu * HARGA_BULU;
        int totalHarga = totalHargaTelur + totalHargaSusu + totalHargaBulu;
        
        public void tampilkanInformasi() {
            
            System.out.println("===== INFORMASI PETERNAKAN =====");
            System.out.println("Jenis\t: "+ "Bebek");
            System.out.println("Jumlah\t: " + jumlahBebek);
            System.out.println("Total telur/hari\t: "+totalTelur + " butir");
            System.out.println("harga telur/hari\t: "+ HARGA_TELUR);
            System.out.println("================================");
            System.out.println("Jenis\t: "+ "Unta");
            System.out.println("Jumlah\t: " + jumlahUnta);
            System.out.println("Total telur/hari\t: "+totalSusu + " liter");
            System.out.println("harga telur/hari\t: "+ HARGA_SUSU);
            System.out.println("================================");
            System.out.println("Jenis\t: "+ "Bebek");
            System.out.println("Jumlah\t: " + jumlahDomba);
            System.out.println("Total telur/hari\t: "+totalBulu + " kg");
            System.out.println("harga telur/hari\t: "+ HARGA_BULU);
            System.out.println("================================");
           
           
        }
    
    
        public void tampilkanPemasukan() {
            
            System.out.println("===== PEMASUKAN HARIAN =====");
            System.out.println("Jenis\t: " + "Bebek" );
            System.out.println("Pemasukan : " + totalHargaTelur);
            System.out.println("=============================");
            System.out.println("Jenis\t: " + "Unta" );
            System.out.println("Pemasukan : " + totalHargaSusu);
            System.out.println("=============================");
            System.out.println("Jenis\t: " + "Domba" );
            System.out.println("Pemasukan : " + totalHargaBulu);
            System.out.println("=============================");
            System.out.println("Total pemasukan\t: "+totalHarga);
          
    
    }
        public void tampilkanPemasukanSetelahPPN() {
            
            double PPNTelur =totalHargaTelur*0.1;
            double PPNSusu =totalHargaSusu*0.1;
            double PPNBulu =totalHargaBulu*0.1;
            System.out.println("===== PEMASUKAN HARIAN SETELAH PPN =====");
            System.out.println("Jenis\t: " + " Bebek" );
            System.out.println("Pemasukan setelah PPN : " + (totalHargaTelur-PPNTelur));
            System.out.println("=============================");
            System.out.println("Jenis\t: " + " Unta" );
            System.out.println("Pemasukan setelah PPN : " + (totalHargaSusu-PPNSusu));
            System.out.println("=============================");
            System.out.println("Jenis\t: " + " Domba" );
            System.out.println("Pemasukan setelah PPN : " + (totalHargaBulu-PPNBulu));
            System.out.println("=============================");
    
    }
    
    
    }
    

