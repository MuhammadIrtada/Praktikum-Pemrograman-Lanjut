package Modul5;

public class Animal {
    private int[] kk;
    private String[][] array;
    private int[] total;

    protected Animal(String[][] array) {
        this.array = array;
        this.total = new int[array.length];
    }

    public Animal(int[] kk) {
        this.kk = kk;
    }

    protected void pertambahan(int satu, int dua, int tiga) {
        int a = (satu * kk[0]) + (dua * kk[1]) + (tiga * kk[2]);
        System.out.printf("Total Pemasukan\t\t: %d\n", a);
    }

    protected void pertambahanPPN(int satu, int dua, int tiga, Double PPN) {
        int a = ((satu * kk[0]) + (dua * kk[1]) + (tiga * kk[2])) / 10;
        int b = (satu * kk[0]) + (dua * kk[1]) + (tiga * kk[2]);
        System.out.printf("Total Pemasukan\t\t: %d\n", a + b);
    }

    protected void printInfo(String jenis, int pilihan) {
        String pembatas = ("=".repeat(50));
        String breaker = ("-".repeat(50));
        if (pilihan == 1) {
            System.out.printf("%s\nJenis\t\t\t: %s\n", pembatas, jenis);
        } else if (pilihan == 2) {
            System.out.printf("%s\nJenis\t\t\t: %s  |  %s\n", breaker, jenis, array[0][0]);
        } else {
            System.out.printf("%s\nJenis\t\t\t: %s  |  %s\n", breaker, jenis, array[0][0]);
        }
    }

    protected void printInfo(String jenis, int amount, int pilihan) {
        Jenis jenisObj;
        int hasil;
        printInfo(jenis, pilihan);
        jenisObj = new Jenis(new String[] { Integer.toString(amount) });
        total[0] = Integer.parseInt(jenisObj.getJenisByIndex(0)) * Integer.parseInt(array[0][1]);
        hasil = (Integer.parseInt(array[0][3]) * total[0]);

        switch (pilihan) {
            case 1:
                System.out.printf("Ras\t\t\t: %s\n", array[0][0]);
                System.out.printf("Jumlah\t\t\t: %s ekor\n", jenisObj.getJenisByIndex(0));
                System.out.printf("%s/ekor\t\t: %s %s\n", array[0][4], array[0][1], array[0][2]);

                total[0] = Integer.parseInt(jenisObj.getJenisByIndex(0)) * Integer.parseInt(array[0][1]);

                if (jenis == "Bebek") {
                    System.out.printf("Total %s/hari\t: %d %s\n", array[0][4], total[0], array[0][2]);
                    System.out.printf("Harga %s/%s\t: %s\n", array[0][4], array[0][2], array[0][3]);
                } else if (jenis == "Domba") {
                    System.out.printf("Total %s/hari\t\t: %d %s\n", array[0][4], total[0], array[0][2]);
                    System.out.printf("Harga %s/%s\t\t: %s\n", array[0][4], array[0][2], array[0][3]);
                } else if (jenis == "Unta") {
                    System.out.printf("Total %s/hari\t\t: %d %s\n", array[0][4], total[0], array[0][2]);
                    System.out.printf("Harga %s/%s\t: %s\n", array[0][4], array[0][2], array[0][3]);
                }
                break;
            case 2:
                System.out.printf("Pemasukan\t\t: %d\n", hasil);
                break;
            case 3:
                int PPN = hasil / 10;
                System.out.printf("Pemasukan\t\t: %s\n", hasil + PPN);
        }

    }
}

