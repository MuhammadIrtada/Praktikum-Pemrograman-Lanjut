public class Main {
    public static void main(String[] args) {
        Peternakan bebek = new Peternakan("Bebek", "Telur Biasa", 15);
        bebek.setDosis(5);
        Peternakan bebek2 = new Peternakan("Bebek", "Telur Asin", 10);
        bebek2.setDosis(8);

        Peternakan unta = new Peternakan();
        unta.setBinatang("Unta");
        unta.setRas("Susu Putih");
        unta.setJumlah(3);
        unta.setDosis(10);
        
        Peternakan unta2 = new Peternakan();
        unta2.setBinatang("Unta");
        unta2.setRas("Susu Coklat");
        unta2.setJumlah(4);
        unta2.setDosis(15);

        Peternakan domba = new Peternakan("Domba", "Bulu Putih", 4);
        domba.setDosis(9);

        Peternakan domba2 = new Peternakan("Domba", "Bulu Hitam", 6);
        domba2.setDosis(14);
        

        Peternakan.display();
    }
}