package homework.zad2;

public class Test {
	public static void main(String[] args) {
		Okno okno1 = new Okno();
		Okno okno2 = new Okno(1800,1800,3);
		
		okno1.otworz();
		okno2.otworz(0);
		okno2.otworz(2);
		
		okno1.wypiszStan();
		okno2.wypiszStan();
		
		okno1.zamknij();
		okno2.setDlugosc(2100);
		okno2.zamknij(0);
		Klamka kl = new Klamka();
		kl.setCzyKluczyk(true);
		okno2.getSkrzydla()[1].setKlamka(kl);
		okno2.getSkrzydla()[2].setKlamka(null);
		
		okno1.wypiszStan();
		okno2.wypiszStan();
		
	}
}