public class KelapaSawit extends Tumbuhan{
    private int jumlahKelapa;
    
        public KelapaSawit (String jenis,float harga,int wilayah,float hargaPerKilo,float biayaPerawatan, int jumlahKelapa){
            super(jenis, harga, wilayah, hargaPerKilo,biayaPerawatan);
            this.jumlahKelapa = jumlahKelapa;
        }
    
        public int getJumlahKelapa() {
            return this.jumlahKelapa = this.jumlahKelapa * super.getWilayah();
        }
    
        public int getTotalKelapa(){
            return this.jumlahKelapa * super.getWilayah();
        }
    
        public float getTotalHargaKelapa(){
            float totalHarga = super.getHargaPerKilo() * this.getTotalKelapa() - super.getWilayah() * super.getBiayaPerawatan();
            return totalHarga;
        }
    
    
        public String showInformasi(){
            String fromParent = super.showInformasi();
            String fromChild = String.format(
                "Minyak/Hektar\t\t: %d Kg\nTotal Minyak/Hektar\t: %d Kg\nHarga Minyak/Kg\t\t: Rp. %,.0f\nProfit/Hari\t\t: Rp. %,.0f",
                this.jumlahKelapa, this.getTotalKelapa(), super.getHargaPerKilo(), this.getTotalHargaKelapa());
            
            return fromParent + fromChild;
        }
}

