package Encapsulation;

public class Main {
    public static void main(String [] args) {
        PersegiPanjang pp = new PersegiPanjang();

        /*  PUBLIC */
        System.out.println("Panjang = " + pp.panjang1);
        System.out.println("Lebar = " + pp.lebar1);
        System.out.println("Luas = " + pp.luas1);

        // pp.setPanjang1(10);
        // pp.setLebar1(8);
        // pp.setLuas1(10, 8);
        // System.out.println("Panjang = " + pp.getPanjang1());
        // System.out.println("Lebar = " + pp.getLebar1());
        // System.out.println("Luas = " + pp.getLuas1());

        System.out.println();

        /*  PROTECTED */
        System.out.println("Panjang = " + pp.panjang2);
        System.out.println("Lebar = " + pp.lebar2);
        System.out.println("Luas = " + pp.luas2);

        // pp.setPanjang2(10);
        // pp.setLebar2(8);
        // pp.setLuas2(10, 8);
        // System.out.println("Panjang = " + pp.getPanjang2());
        // System.out.println("Lebar = " + pp.getLebar2());
        // System.out.println("Luas = " + pp.getLuas2());

        System.out.println();

        /*  PRIVATE */
        // System.out.println("Panjang = " + pp.panjang3);
        // System.out.println("Lebar = " + pp.lebar3);
        // System.out.println("Luas = " + pp.luas3);

        // pp.setPanjang3(10);
        // pp.setLebar3(8);
        // pp.setLuas3(10, 8);
        // System.out.println("Panjang = " + pp.getPanjang3());
        // System.out.println("Lebar = " + pp.getLebar3());
        // System.out.println("Luas = " + pp.getLuas3());
    }   
}