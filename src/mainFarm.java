public class mainFarm {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bebek
		Farm Bebek1 = new Farm ("Bebek","Telur biasa", 15, 5);
		Bebek1.display1();
		Farm Bebek2 = new Farm ("Telur asin", 10, 8 );
		Bebek2.display2();
		Farm BebekJenis1 = new Farm ("Telur biasa",15,5);
		BebekJenis1.display3();
		Farm BebekJenis2 = new Farm ("Telur asin", 10,8);
		BebekJenis2.display4();
		Farm TotDosisBebek = new Farm (75,80);
		TotDosisBebek.display5();
		
		// Unta
		Farm Unta1 = new Farm ("Unta", "Susu putih", 3, 10);
		Unta1.display1();
		Farm Unta2 = new Farm ("Susu coklat", 4, 15);
		Unta2.display2();
		Farm UntaJenis1 = new Farm ("Susu putih", 3,10);
		UntaJenis1.display3();
		Farm UntaJenis2 = new Farm ("Susu coklat", 4,15);
		UntaJenis2.display4();
		Farm TotDosisUnta = new Farm (30, 60);
		TotDosisUnta.display5();
		
		// Domba
		Farm Domba1 = new Farm ("Domba", "Bulu hitam", 4, 9);
		Domba1.display1();
		Farm Domba2 = new Farm ("Bulu putih", 6, 14);
		Domba2.display2();
		Farm DombaJenis1 = new Farm ("Bulu hitam", 4,9);
		DombaJenis1.display3();
		Farm DombaJenis2 = new Farm ("Bulu putih", 6, 14);
		DombaJenis2.display4();
		Farm TotDosisDomba = new Farm (36, 84);
		TotDosisDomba.display5();
		
	}
}
