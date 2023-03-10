public class Domba {
    public String jenis;
    public int kuantitas, buluPerEkor;

    public Domba(String jenis, int kuantitas, int buluPerEkor){
        this.jenis = jenis;
        this.kuantitas = kuantitas;
        this.buluPerEkor = buluPerEkor;
    }

    public int buluBooster(){
        double hasil = this.buluPerEkor * 1.5;
        return (int) hasil;
    }

    public int totalbulu(){
        return this.kuantitas * this.buluPerEkor;
    }

    public int totalbuluBooster(){
        return this.kuantitas * buluBooster();
    }

    public String toString(){
        return String.format("Jenis\t\t\t: %s\nJumlah\t\t\t: %d ekor\nBulu/Ekor\t\t: %d kg\nBulu/Ekor\t\t: %d kg (Setelah Booster)\nTotal Bulu/Hari\t\t: %d kg\nTotal Bulu/Hari\t\t: %d kg (Setelah Booster)", jenis, kuantitas, buluPerEkor, buluBooster(), totalbulu(), totalbuluBooster());
    }
}
