public class Main {
    public static void main(String[] args) throws Exception {
        Bebek bebek = new Bebek("Bebek", 25, 2);
        System.out.println(bebek);

        System.out.println("=".repeat(53));
        
        Domba domba = new Domba("Domba", 10, 4);
        System.out.println(domba);

        System.out.println("=".repeat(53));
        
        Unta unta = new Unta("Unta", 7, 5);
        System.out.println(unta);
        
        System.out.println("=".repeat(53));
    }
}
