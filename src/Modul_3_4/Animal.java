package Modul_3_4;

public class Animal {
    private String[][] array;
    private int[] total;

    protected Animal(String[][] array) {
        this.array = array;
        this.total = new int[array.length];
    }

    protected void printInfo(String jenis) {
        String breaker = ("-".repeat(50));
        System.out.printf("Jenis\t\t\t: %s\n%s\n", jenis, breaker);
    }

    protected void printInfo(String akrom, int A) {
        // Dapat diakses printInfo(jenis,0)
        // Dapat diakses printInfo(jenis,1)
        String breaker = ("-".repeat(50));
        String pembatas = ("=".repeat(52));
        if (A == 0) {
            System.out.printf("Jenis\t\t\t: %s\n%s\n", akrom, breaker);
        } else {
            System.out.println(pembatas);

        }
    }
    
    
        protected void printInfo(String jenis, int amount, int kedua) {
            String pembatas = ("=".repeat(52));
            String breaker = ("-".repeat(50));
            Jenis jenisObj;

            printInfo(jenis);
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    jenisObj = new Jenis(new String[] { Integer.toString(amount) });
    
                    System.out.printf("Ras\t\t\t: %s\n", array[i][0]);
                    System.out.printf("Jumlah\t\t\t: %s ekor\n", jenisObj.getJenisByIndex(0));
                    System.out.printf("Dosis obat/ekor\t\t: %s mL\n%s\n", array[i][1], breaker);
    
                    total[i] = Integer.parseInt(jenisObj.getJenisByIndex(0)) * Integer.parseInt(array[i][1]);
                } else {
                    jenisObj = new Jenis(new String[] { Integer.toString(kedua) });
    
                    System.out.printf("Ras\t\t\t: %s\n", array[i][0]);
                    System.out.printf("Jumlah\t\t\t: %s ekor\n", jenisObj.getJenisByIndex(0));
                    System.out.printf("Dosis obat/ekor\t\t: %s mL\n%s\n", array[i][1], breaker);
    
                    total[i] = Integer.parseInt(jenisObj.getJenisByIndex(0)) * Integer.parseInt(array[i][1]);
                }
            }
    
            int hasil = 0;
            for (int i = 0; i < total.length; i++) {
                System.out.printf("Jumlah dosis obat/hari\t: %d mL\n", total[i]);
                hasil += total[i];
            }
            System.out.printf("Total dosis obat/hari\t: %d mL\n%s\n\n", hasil, pembatas);
    
            // ! dapat juga bisa begini
            // System.out.println("Total dosis obat/hari\t: "+hasil);
            // printInfo(breaker, 1);
        }
}

