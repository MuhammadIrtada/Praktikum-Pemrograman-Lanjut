package peternakan_34;
public class BukaTernak_34 {

    public static void main(String[] args) {
        Peternakan_34 bebek = new Peternakan_34("bebek", "telur biasa", 15, "telur asin", 10, 5, 8);
        bebek.display();
        Peternakan_34 unta = new Peternakan_34("unta", "susu putih");
        Peternakan_34 unta2 = new Peternakan_34("unta", "susu putih", 3, "susu coklat", 4, 10, 15);
        unta.display();
        unta2.display();
        Peternakan_34 domba = new Peternakan_34("domba", "bulu hitam", 4, "bulu putih", 6, 9, 14);
        domba.display(2.1);
        
    }
    

        

    
}