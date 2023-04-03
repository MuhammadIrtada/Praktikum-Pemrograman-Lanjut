package MODUL_5;

public class Animal {
    public String Name;
    public String Jenis;
    protected int kuantitas;
    protected int outputPerHari;
    private int totalOutput;
    public final int hargaperunit;

    Animal(String Name, String Jenis, int kuantitas, int outputPerHari, int hargaperunit) {
        this.Name = Name;
        this.Jenis = Jenis;
        this.kuantitas = kuantitas;
        this.outputPerHari = outputPerHari;
        this.hargaperunit = hargaperunit;
    }

    String getName() {
        return Name;
    }

    String getJenis() {
        return Jenis;
    }

    int getTotalOutput() {
        return totalOutput;
    }

    int getTotalHarga() {
        return totalOutput * hargaperunit;
    }

    int getPendapatanHarian() {
        return outputPerHari * kuantitas * hargaperunit;
    }

    int getPendapatansetelahpajak(double PPN) {
        double getPendapatansetelahpajak = getPendapatanHarian() * (1 + PPN);
        int Pendapatansetelahpajakint = (int) getPendapatansetelahpajak;
        return Pendapatansetelahpajakint;
    }

    static class Bebek extends Animal {
        Bebek(String getName, String getJenis, int kuantitas, int outputPerHari, int hargaperunit) {
            super(getName, getJenis, kuantitas, outputPerHari, 2000);
        }

        public String getName() {
            return "Bebek";
        }

        public String getJenis() {
            return "Telur Biasa";
        }

        @Override
        int getTotalOutput() {
            return outputPerHari * kuantitas;

        }

        int getHargaPerUnit() {
            return 2000;
        }

        void showData1() {
            System.out.println("=".repeat(50));
            System.out.println("Jenis hewan\t\t: " + getName());
            System.out.println("Ras\t\t\t: " + getJenis());
            System.out.println("Jumlah\t\t\t: " + kuantitas + " ekor");
            System.out.println("Telur/Ekor\t\t: " + outputPerHari + " Butir");

        }
    }

    static class Domba extends Animal {
        Domba(String getName, String getJenis, int kuantitas, int outputPerHari, int hargaperunit) {
            super(getName, getJenis, kuantitas, outputPerHari, 15000);
        }

        public String getName() {
            return "Domba";
        }

        public String getJenis() {
            return "Bulu Hitam";
        }

        @Override
        int getTotalOutput() {
            return outputPerHari * kuantitas;
        }

        int getHargaPerUnit() {
            return 15000;
        }

        void showData2() {
            System.out.println("=".repeat(50));
            System.out.println("Jenis hewan\t\t: " + getName());
            System.out.println("Ras\t\t\t: " + getJenis());
            System.out.println("Jumlah\t\t\t: " + kuantitas + " ekor");
            System.out.println("Telur/Ekor\t\t: " + outputPerHari + " Kg");

        }
    }

    static class Unta extends Animal {
        Unta(String getName, String getJenis, int kuantitas, int outputPerHari, int hargaperunit) {
            super(getName, getJenis, kuantitas, outputPerHari, 60000);
        }

        public String getName() {
            return "Unta";
        }

        public String getJenis() {
            return "Susu Putih";
        }

        int getTotalOutput() {
            return outputPerHari * kuantitas;
        }

        int getHargaPerUnit() {
            return 60000;
        }

        void showData3() {
            System.out.println("=".repeat(50));
            System.out.println("Jenis hewan\t\t: " + getName());
            System.out.println("Ras\t\t\t: " + getJenis());
            System.out.println("Jumlah\t\t\t: " + kuantitas + " ekor");
            System.out.println("Bulu/Ekor\t\t: " + outputPerHari + " liter");

        }
    }
}
