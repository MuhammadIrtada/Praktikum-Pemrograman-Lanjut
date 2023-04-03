import java.util.*;

public class Tugas5 {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] a = new String[3];
        int[] b = new int[3];
        int[] c = new int[3];
        int[] d = new int[3];
        int z = 3;
        while (true) {
            int k = 1;
            for (int j = 0; j < z; j++) {
                System.out.println("Hewan " + k);
                k++;
                System.out.print("Hewan :");
                String Hewan = scan.nextLine();
                System.out.print("Jumlah : ");
                int Jumlah = scan.nextInt();
                System.out.print("Hasil : ");
                int Hasil = scan.nextInt();
                System.out.print("Harga : ");
                int Harga = scan.nextInt();
                scan.nextLine();
                System.out.println();
                a[j] = Hewan;
                b[j] = Jumlah;
                c[j] = Hasil;
                d[j] = Harga;
            }
            Tugas5A Obyek1 = new Tugas5A(a[0], b[0], c[0], d[0]);
            Tugas5A Obyek2 = new Tugas5A(a[1], b[1], c[1], d[1]);
            Tugas5A Obyek3 = new Tugas5A(a[2], b[2], c[2], d[2]);
            System.out.println("Menu :");
            System.out.println("1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3.Menampilkan "
                    + "harga setelah PPN\n4. EXIT");
            while (true) {
                System.out.println();
                System.out.print("Menu : ");
                int e = scan.nextInt();
                if (e == 1) {
                    Obyek1.Output();
                    Obyek2.Output();
                    Obyek3.Output();
                    continue;
                } else if (e == 2) {
                    Obyek1.Output2();
                    Obyek2.Output2();
                    Obyek3.Output2();
                    continue;
                } else if (e == 3) {
                    Obyek1.Output3();
                    Obyek2.Output3();
                    Obyek3.Output3();
                    continue;
                } else if (e == 4){
                    break;
                }
                break;
            }
        }
    }
}
