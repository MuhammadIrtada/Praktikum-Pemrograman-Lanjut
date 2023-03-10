public class Unta {
    public String jenis;
    public int kuantitas, susuPerEkor;

    public Unta(String jenis, int kuantitas, int susuPerEkor){
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.susuPerEkor = susuPerEkor;
    }

    public int susuBooster(){
        double hasil = this.susuPerEkor * 2;
        return (int) hasil;
    }

    public int totalsusu(){
        return this.kuantitas * this.susuPerEkor;
    }

    public int totalsusuBooster(){
        return this.kuantitas * susuBooster();
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nSusu/Ekor\t\t: %d liter\nSusu/Ekor\t\t: %d liter (Setelah Booster)\nTotal Susu/Hari\t\t: %d liter\nTotal Susu/Hari\t\t: %d liter (Setelah Booster)", jenis, kuantitas, susuPerEkor, susuBooster(), totalsusu(), totalsusuBooster());
    }
}
