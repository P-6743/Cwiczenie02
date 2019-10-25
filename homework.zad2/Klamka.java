package homework.zad2;

//deklaracja klasy: nazwa klasy jest taka sama jak nazwa pliku
public class Klamka {
	
	//pole prywatne typu boolean o nazwie czyKluczyk i przechowuj¹ce wartoœæ false
	private boolean czyKluczyk = false;

	//metoda publiczna isCzyKluczyk typu boolean
	public boolean isCzyKluczyk() {
		//zwracaj¹ca wartoœæ czyKluczyk (false)
		return czyKluczyk;
	}
	//metoda publiczna, nie zwracaj¹ca niczego (void)  ustalaj¹ca now¹ wartoœæ dla czyKluczyk na boolean czyKluczyk
	public void setCzyKluczyk(boolean czyKluczyk) {
		//nadanie wartoœci czyKluczyk zmiennej czyKluczyk
		this.czyKluczyk = czyKluczyk;
	}
	//deklaracja metody publicznej stan typu String
	public String stan() {
		//zwraca wartosc z kluczem/bez klucza dla czyKluczyk
		return czyKluczyk ? "z kluczem": "bez klucza";
	}
}

