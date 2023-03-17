package Encapsulation2;

public class Main2 {
    public static void main(String[] args) {
   
        PersegiPanjang2 pp2 = new PersegiPanjang2();
            /*  PUBLIC */
            System.out.println("panjang = " + pp2.panjang1);
            System.out.println("lebar = " + pp2.lebar1);
            System.out.println("luas = " + pp2.luas1);
    
            // pp2.setPanjang1(10);
            // pp2.setLebar1(8);
            // pp2.setLuas1(10, 8);
            // System.out.println("Panjang = " + pp2.getPanjang1());
            // System.out.println("Lebar = " + pp2.getLebar1());
            // System.out.println("Luas = " + pp2.getLuas1());
    
            /*  PROTECTED */
            System.out.println("panjang = " + pp2.panjang2);
            System.out.println("lebar = " + pp2.lebar2);
            System.out.println("luas = " + pp2.luas2);
    
            // pp2.setPanjang2(10);
            // pp2.setLebar2(8);
            // pp2.setLuas2(10, 8);
            // System.out.println("Panjang = " + pp2.getPanjang2());
            // System.out.println("Lebar = " + pp2.getLebar2());
            // System.out.println("Luas = " + pp2.getLuas2());
    
            /*  PRIVATE */
            // System.out.println("panjang = " + pp2.panjang3);
            // System.out.println("lebar = " + pp2.lebar3);
            // System.out.println("luas = " + pp2.luas3);
    
            // pp2.setPanjang3(10);
            // pp2.setLebar3(8);
            // pp2.setLuas3(10, 8);
            // System.out.println("Panjang = " + pp2.getPanjang3());
            // System.out.println("Lebar = " + pp2.getLebar3());
            // System.out.println("Luas = " + pp2.getLuas3());
    }
}