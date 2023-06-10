// public class Peternakan {
    class Peternakan implements HewanPeternakan {
        private int jumlahBebek;
        private int jumlahDomba;
        private int jumlahUnta;
    
         Peternakan(int jumlahBebek, int jumlahDomba, int jumlahUnta) {
            this.jumlahBebek = jumlahBebek;
            this.jumlahDomba = jumlahDomba;
            this.jumlahUnta = jumlahUnta;
        }
    
    //    Peternakan(int i, int i0, int i1) {
    //        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //    }
    
        public int getJumlahBebek() {
            return jumlahBebek;
        }
        public int getJumlahDomba() {
            return jumlahDomba;
        }
    
        public int getJumlahUnta() {
            return jumlahUnta;
        }
    
        public double getHarga() {
            double totalHarga = (jumlahBebek * 110000) + (jumlahDomba * 2450000) + (jumlahUnta * 12000000);
            return totalHarga;
        }
        public void beliHewan(int jumlah) {
            jumlahBebek += jumlah;
        }
    }
    
// }
