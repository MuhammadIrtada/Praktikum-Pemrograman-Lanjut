public class Apel extends Tumbuhan {
        private int jumlahApel;
    
        public Apel (String jenis,float harga,int wilayah,float hargaPerKilo,float biayaPerawatan, int jumlahApel){
            super(jenis, harga, wilayah, hargaPerKilo,biayaPerawatan);
            this.jumlahApel = jumlahApel;
        }
    
        public int getJumlahApel() {
            return this.jumlahApel = this.jumlahApel * super.getWilayah();
        }
    
        public int getTotalApel(){
            return this.jumlahApel * super.getWilayah();
        }
    
        public float getTotalHargaApel(){
            float totalHarga = super.getHargaPerKilo() * this.getTotalApel() - super.getWilayah() * super.getBiayaPerawatan();
            return totalHarga;
        }
    
    
        public String showInformasi(){
            String fromParent = super.showInformasi();
            String fromChild = String.format(
                "Buah/Hektar\t\t: %d Kg\nTotal Buah/Hektar\t: %d Kg\nHarga Buah/Kg\t\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f",
                this.jumlahApel, this.getTotalApel(), super.getHargaPerKilo(), this.getTotalHargaApel());
            
            return fromParent + fromChild;
        }
}
    

