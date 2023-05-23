import java.util.ArrayList;

public class Hewan {
    private String jenis;
    private int kuantitas;
    public static ArrayList<Hewan> list = new ArrayList<Hewan>();

    Hewan(String jenis, int kuantitas){
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        list.add(this);

    }

    Hewan(){
    }

    public void tambahKuantitas(int pilihan){
        this.kuantitas += pilihan;
    }
    public int getKuantitas(){
        return this.kuantitas;
    }

    public String cetakInfo(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\n", this.jenis, this.kuantitas);
    }

    public static void cetakAll(){
        for(Hewan num : list){
            System.out.println(num.cetakInfo());
            System.out.println("=".repeat(40));
        }
    }
}
