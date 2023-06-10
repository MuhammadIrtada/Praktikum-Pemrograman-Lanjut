public class KelapaSawit extends Kebun{
    public KelapaSawit(String nama, int jumlahSkrg, int hargaBeli) {
        super(nama, jumlahSkrg, hargaBeli);
    }

    @Override
    public void saatIni() {
        System.out.println(super.getNama() + "\t: " + super.getJumlahskrg() + " Hektar");
        System.out.println("-".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println();
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
