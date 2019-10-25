package homework.zad2;

public class Okno {
	private int dlugosc;
	private int wysokosc;
	private int liczbaSkrzydel;
	private Skrzydlo[] skrzydla;
	
	public Okno(int d, int w, int lSkrzydel){
		dlugosc = d;
		wysokosc = w;
		liczbaSkrzydel = lSkrzydel;
		skrzydla = new Skrzydlo[lSkrzydel];
		for(int i=0;i<lSkrzydel;i++){
			skrzydla[i] = new Skrzydlo(d/lSkrzydel,w, new Klamka());
		}
	}
	public Okno(int d, int w, Skrzydlo[] sk){
		dlugosc = d;
		wysokosc = w;
		liczbaSkrzydel = sk.length;
		skrzydla = sk;
	}		
	public Okno(int d, int w){
		this(d,w,1);
	}	
	public Okno(){
		this(1200,1500,1);
	}
	
	public int getDlugosc() {
		return dlugosc;
	}
	public void setDlugosc(int dlugosc) {
		this.dlugosc = dlugosc;
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setDlugosc(dlugosc/liczbaSkrzydel);
		}
	}
	
	public int getWysokosc() {
		return wysokosc;
	}
	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setWysokosc(wysokosc);
		}
	}
	
	public int getLiczbaSkrzydel() {
		return liczbaSkrzydel;
	}
	public Skrzydlo[] getSkrzydla() {
		return skrzydla;
	}

	public void otworz(){
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setOtwarte(true);
		}
	}
	public void otworz(int nrSkrzydla){
		if(nrSkrzydla > skrzydla.length) return;
		
		skrzydla[nrSkrzydla].setOtwarte(true);
		
	}
	public void zamknij(){
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setOtwarte(false);
		}
	}
	public void zamknij(int nrSkrzydla){
		if(nrSkrzydla > skrzydla.length) return;
		
		skrzydla[nrSkrzydla].setOtwarte(false);
		
	}
	public void wypiszStan() {
		String tekst = "";
		for(int i=0;i<liczbaSkrzydel;i++){
			tekst += "["+skrzydla[i].stan()+"]";
		}
		System.out.println(tekst);
		
	}
	
}
