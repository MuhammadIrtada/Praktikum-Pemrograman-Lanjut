public class Ayam extends Hewan {
    public Ayam (String nama, int jumlahSkrg, int hargaBeli){
        super(nama, jumlahSkrg, hargaBeli);
    }

    @Override
    public void saatIni() {
        System.out.println(super.getNama() + "\t\t: " + super.getJumlahskrg() + " Ekor");
    }

    @Override
    public void beli2(int jumlahBeli) {
        super.setJumlahBeli(jumlahBeli);
        super.setTotalBeli(jumlahBeli * super.getHargaBeli());
        System.out.println("=".repeat(50));
        System.out.println("Nota Pembelian");
        System.out.println("=".repeat(50));
        System.out.println(super.getNama() + "\tX(" + jumlahBeli + ")\t" + ": Rp " + super.getTotalBeli());
        jumlahBeli = super.getJumlahskrg() + jumlahBeli;
        super.setJumlahskrg(jumlahBeli);
        saatIni();
        System.out.println();
    }
}
