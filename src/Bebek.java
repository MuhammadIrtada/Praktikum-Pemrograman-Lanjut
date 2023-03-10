public class Bebek {
    public String jenis;
    public int kuantitas, telurPerEkor;

    public Bebek(String jenis, int kuantitas, int telurPerEkor){
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.telurPerEkor = telurPerEkor;
    }

    public int telurBooster(){
        double hasil = this.telurPerEkor * 2.5;
        return (int) hasil;
    }

    public int totalTelur(){
        return this.kuantitas * this.telurPerEkor;
    }

    public int totalTelurBooster(){
        return this.kuantitas * telurBooster();
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nTelur/Ekor\t\t: %d Butir\nTelur/Ekor\t\t: %d Butir (Setelah Booster)\nTotal Telur/Hari\t: %d Butir\nTotal Telur/Hari\t: %d Butir (Setelah Booster)", jenis, kuantitas, telurPerEkor, telurBooster(), totalTelur(), totalTelurBooster());
    }
}
