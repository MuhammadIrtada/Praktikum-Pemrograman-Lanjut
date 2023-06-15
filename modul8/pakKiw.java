import java.util.Scanner;

public class pakKiw implements pengelola {
    private int jumlahBebek;
    private int jumlahDomba;
    private int jumlahUnta;
    private int lahanApel;
    private int lahanPalm;

    public pakKiw(int jumlahBebek, int jumlahDomba, int jumlahUnta, int lahanApel, int lahanPalm){
        this.jumlahBebek = jumlahBebek;
        this.jumlahDomba = jumlahDomba;
        this.jumlahUnta = jumlahUnta;
        this.lahanApel = lahanApel;
        this.lahanPalm = lahanPalm;
    }
    public void tampilkanStatus(){
        System.out.println("=".repeat(40));
        System.out.println("Informasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("Bebek\t: "+jumlahBebek);
        System.out.println("Domba\t: "+jumlahDomba);
        System.out.println("Unta\t: "+jumlahUnta);
        System.out.println("Apel\t: "+lahanApel+" hektar");
        System.out.println("Kelapa Sawit : "+lahanPalm+" hektar");
    }
    public void beliStok(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("Pembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihn hewan (nomor): ");
        int pilihan = scan.nextInt();
        hewan Hewan;
        int quantity;
        switch (pilihan) {
            case 1:
                Hewan = new duck();
                System.out.print("Masukkan banyak hewan: ");
                quantity = scan.nextInt();
                jumlahBebek += quantity;
                break;
            case 2:
                Hewan = new ship();
                System.out.print("Masukkan banyak hewan: ");
                quantity = scan.nextInt();
                jumlahDomba += quantity;
                break;
            case 3:
                Hewan = new camel();
                System.out.print("Masukkan banyak hewan: ");
                quantity = scan.nextInt();
                jumlahUnta += quantity;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        int totalHarga=Hewan.getHarga() * quantity;
        System.out.println("=".repeat(40));
        System.out.println("Nota Pembelian");
        System.out.println("=".repeat(40));
        System.out.println(Hewan.getNama()+"\tx("+quantity+")  ="+totalHarga);
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("Informasi Peternakan Sekarang");
        System.out.println("=".repeat(40));
        System.out.println("Bebek\t: "+jumlahBebek);
        System.out.println("Domba\t: "+jumlahDomba);
        System.out.println("Unta\t: "+jumlahUnta);
    }

    public void beliLahan(){
        Scanner scan=new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihn hewan (nomor): ");
        int pilihan = scan.nextInt();
        tumbuhan Tumbuhan;
        int quantity;
        switch (pilihan) {
            case 1:
                Tumbuhan = new apple();
                System.out.print("Masukkan luas tanah: ");
                quantity = scan.nextInt();
                lahanApel += quantity;
                break;
            case 2:
                Tumbuhan = new palmtree();
                System.out.print("Masukkan luas tanah: ");
                quantity = scan.nextInt();
                lahanPalm += quantity;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        int totalHarga=Tumbuhan.getHarga() * quantity;
        System.out.println("=".repeat(40));
        System.out.println("Nota Pembelian");
        System.out.println("=".repeat(40));
        System.out.println(Tumbuhan.getNama()+"\tx("+quantity+")  ="+totalHarga);
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("Informasi Perkebunan Sekarang");
        System.out.println("=".repeat(40));
        System.out.println("Apel\t: "+lahanApel+" hektar");
        System.out.println("Kelapa Sawit : "+lahanPalm+" hektar");
    }
    // private int getCount(hewan Hewan){
    //     if(Hewan instanceof duck){
    //         return jumlahBebek;
    //     }else if (Hewan instanceof ship){
    //         return jumlahDomba;
    //     }else if (Hewan instanceof camel){
    //         return jumlahUnta;
    //     }
    // }
}
