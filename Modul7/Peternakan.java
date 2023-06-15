public abstract class Peternakan {
    private String jenis;
    private int kuantitas;
    private double perawatanPerEkor, hargaPerEkor;

    public Peternakan(String jenis, int kuantitas, double perawatanPerEkor, double hargaPerEkor) {
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.perawatanPerEkor = perawatanPerEkor;
        this.hargaPerEkor = hargaPerEkor;
    }

    public String getJenis() {
        return jenis;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public double getPerawatanPerEkor() {
        return perawatanPerEkor;
    }

    public double getHargaPerEkor() {
        return hargaPerEkor;
    }

    public abstract double pendapatan();

    public abstract double perawatan();

    public void display1() {
        System.out.println(getJenis() + ":\t\t\t Rp. " + pendapatan());
    }

    public void display2() {
        System.out.println(getJenis() + ":\t\t\t Rp. " + perawatan());
    }
}