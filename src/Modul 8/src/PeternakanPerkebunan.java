public class PeternakanPerkebunan {
    private int jumlahBebek;
    private int jumlahDomba;
    private int jumlahUnta;
    private int luasApel;
    private int luasKelapaSawit;

    public PeternakanPerkebunan(int jumlahBebek, int jumlahDomba, int jumlahUnta, int luasApel, int luasKelapaSawit) {
        this.jumlahBebek = jumlahBebek;
        this.jumlahDomba = jumlahDomba;
        this.jumlahUnta = jumlahUnta;
        this.luasApel = luasApel;
        this.luasKelapaSawit = luasKelapaSawit;
    }

    public void informasiPeternakanPerkebunan() {
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("        Informasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(50));
        System.out.println("Bebek       : " + jumlahBebek + " ekor");
        System.out.println("Domba       : " + jumlahDomba + " ekor");
        System.out.println("Unta        : " + jumlahUnta + " ekor");
        System.out.println("Apel        : " + luasApel + " hektar");
        System.out.println("Kelapa sawit: " + luasKelapaSawit + " hektar");
        System.out.println();
    }
    public void informasiPeternakan() {
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("           Informasi Peternakan Sekarang");
        System.out.println( "=".repeat(50));
        System.out.println("Bebek: " + jumlahBebek + " ekor");
        System.out.println("Domba: " + jumlahDomba + " ekor");
        System.out.println("Unta : " + jumlahUnta + " ekor");
        System.out.println();
    }
    public void informasiPerkebunan() {
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("           Informasi Perkebunan Sekarang");
        System.out.println( "=".repeat(50));
        System.out.println("Apel        : " + luasApel + " hektar");
        System.out.println("Kelapa sawit: " + luasKelapaSawit + " hektar");
        System.out.println();
    }

    public void beliHewanTernak(HewanInterface hewanTernak, int jumlah) {
        int totalBiaya = hewanTernak.getHarga() * jumlah;
        if (hewanTernak.getNama().equals("Bebek")) {
            jumlahBebek += jumlah;
        } else if (hewanTernak.getNama().equals("Domba")) {
            jumlahDomba += jumlah;
        } else if (hewanTernak.getNama().equals("Unta")) {
            jumlahUnta += jumlah;
        }
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("          Nota Pembelian Hewan Ternak");
        System.out.println( "=".repeat(50));
        System.out.println(hewanTernak.getNama() + "\tx(" + jumlah + "): Rp " + totalBiaya);
        informasiPeternakan();
    }

    public void beliTanahPerkebunan(TanamanInterface tanamanPerkebunan, int luas) {
        int totalBiaya = tanamanPerkebunan.getHarga() * luas;
        if (tanamanPerkebunan.getNama().equals("Apel")) {
            luasApel += luas;
        } else if (tanamanPerkebunan.getNama().equals("Kelapa Sawit")) {
            luasKelapaSawit += luas;
        }
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("          Nota Pembelian Tanah Perkebunan");
        System.out.println( "=".repeat(50));
        System.out.println(tanamanPerkebunan.getNama() + "\tx(" + luas + "): Rp " + totalBiaya);
        informasiPerkebunan();
    }
}
