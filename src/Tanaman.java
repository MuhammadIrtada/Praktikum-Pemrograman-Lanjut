import java.util.ArrayList;

public class Tanaman {
    private String jenis;
    private int luas;
    public static ArrayList<Tanaman> list = new ArrayList<Tanaman>();

    Tanaman(String jenis, int luas){
        this.jenis = jenis;
        this.luas = luas;
        list.add(this);

    }

    Tanaman(){
    }

    public void tambahKuantitas(int pilihan){
        this.luas += pilihan;
    }
    public int getLuas(){
        return this.luas;
    }

    public String cetakInfo(){
        return String.format("Jenis\t\t\t: %s\nLuas\t\t\t: %d hektar\n", this.jenis, this.luas);
    }

    public static void cetakAll(){
        for(Tanaman num : list){
            System.out.println(num.cetakInfo());
            System.out.println("=".repeat(40));
        }
    }
}