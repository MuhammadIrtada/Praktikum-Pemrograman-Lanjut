public class Main {
    public static void main(String[] args) throws Exception {
        
        Peternakan peternakan = new Peternakan(25, 10, 7);
        peternakan.Hewan1("Bebek");
        peternakan.display1();
        
        peternakan.Hewan2("Domba");
        peternakan.display2();
        
        peternakan.Hewan3("Unta");
        peternakan.display3();
        
        peternakan.boostTernak();
        System.out.println("\nHasil Ternak/Hari setelah Booster.");
        System.out.println("1.) Bebek - Total Telur/Hari\t: " + peternakan.getJumlahTelur() + " Butir ");
        System.out.println("2.) Domba - Total Bulu/Hari\t: " + peternakan.getJumlahBulu() + " kg ");
        System.out.println("3.) Unta  - Total Susu/Hari\t: " + peternakan.getJumlahSusu() + " liter ");
    }
}
