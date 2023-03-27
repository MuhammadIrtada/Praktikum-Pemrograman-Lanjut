public class rocaaa {
    private String name;
    private int quantity;
    private String type;
    private double dose;

    public rocaaa(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        setDose();
    }

    public rocaaa(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    private void setDose() {
        switch (type) {
            case "Bebek Telur Biasa":
                dose = 5;
                break;
            case "Bebek Telur Asin":
                dose = 8;
                break;
            case "Unta Susu Putih":
                dose = 10;
                break;
            case "Unta Susu Coklat":
                dose = 15;
                break;
            case "Domba Bulu Hitam":
                dose = 9;
                break;
            case "Domba Bulu Putih":
                dose = 14;
                break;
        }
    }

    public void showInfo() {
        System.out.println("Jenis hewan ternak: " + name);
        System.out.println("Jumlah hewan: " + quantity);
        System.out.println("Dosis obat yang dibutuhkan setiap hari: " + dose + " mL/ekor/hari");
        System.out.println("Dosis obat yang dibutuhkan setiap hari untuk semua hewan: " + getTotalDose() + " mL/hari");
        System.out.println();
    }

    public double getTotalDose() {
        return quantity * dose;
    }

    public static void main(String[] args) {
        rocaaa bebekTelurBiasa = new rocaaa("Bebek Telur Biasa", 15, "Bebek Telur Biasa");
        rocaaa bebekTelurAsin = new rocaaa("Bebek Telur Asin", 10, "Bebek Telur Asin");
        rocaaa untaSusuPutih = new rocaaa("Unta Susu Putih", 3, "Unta Susu Putih");
        rocaaa untaSusuCoklat = new rocaaa("Unta Susu Coklat", 4, "Unta Susu Coklat");
        rocaaa dombaBuluHitam = new rocaaa("Domba Bulu Hitam", 4, "Domba Bulu Hitam");
        rocaaa dombaBuluPutih = new rocaaa("Domba Bulu Putih", 6, "Domba Bulu Putih");

        bebekTelurBiasa.showInfo();
        bebekTelurAsin.showInfo();
        untaSusuPutih.showInfo();
        untaSusuCoklat.showInfo();
        dombaBuluHitam.showInfo();
        dombaBuluPutih.showInfo();

        double totalDose = bebekTelurBiasa.getTotalDose() + bebekTelurAsin.getTotalDose()
                + untaSusuPutih.getTotalDose() + untaSusuCoklat.getTotalDose()
                + dombaBuluHitam.getTotalDose() + dombaBuluPutih.getTotalDose();
        System.out.println("Dosis obat total yang dibutuhkan setiap hari untuk semua hewan: " + totalDose + " mL/hari");
    }
}
